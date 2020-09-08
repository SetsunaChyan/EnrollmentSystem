package servingwebcontent.com.sys.service;

import org.springframework.stereotype.Service;
import servingwebcontent.com.sys.entity.*;
import servingwebcontent.com.sys.repository.*;

import java.util.*;

@Service
public class Enrollment_officeService
{
    private final StudentRepository studentRepository;
    private final SchoolRepository schoolRepository;
    private final Enrollment_officeRepository enrollment_officeRepository;
    private final Student_admittedRepository student_admittedRepository;
    private final Passing_enrollmentRepository passing_enrollmentRepository;
    private final School_enrollmentRepository school_enrollmentRepository;
    private final Science_gradeRepository science_gradeRepository;
    private final Student_volunteerRepository student_volunteerRepository;

    public Enrollment_officeService(StudentRepository studentRepository,SchoolRepository schoolRepository,
                                    Enrollment_officeRepository enrollment_officeRepository,
                                    Student_admittedRepository student_admittedRepository,
                                    Passing_enrollmentRepository passing_enrollmentRepository,
                                    School_enrollmentRepository school_enrollmentRepository,
                                    Science_gradeRepository science_gradeRepository,
                                    Student_volunteerRepository student_volunteerRepository)
    {
        this.studentRepository=studentRepository;
        this.schoolRepository=schoolRepository;
        this.enrollment_officeRepository=enrollment_officeRepository;
        this.student_admittedRepository=student_admittedRepository;
        this.passing_enrollmentRepository=passing_enrollmentRepository;
        this.school_enrollmentRepository=school_enrollmentRepository;
        this.science_gradeRepository=science_gradeRepository;
        this.student_volunteerRepository=student_volunteerRepository;
    }

    public boolean login(String Account_number,String password)
    {
        //登录函数，返回false则登录失败即数据库中无该数据，返回true则登录成功
        Enrollment_office enrollment_office=enrollment_officeRepository.findByAccountNumberAndPassword(Account_number,password);
        if(enrollment_office==null) return false;
        return true;
    }

    public boolean Officechange(String Account_number,String old_pass,String new_pass)
    {
        //修改密码，返回false即密码错误，返回true则说明密码修改成功
        Enrollment_office enrollment_office=enrollment_officeRepository.findByAccountNumberAndPassword(Account_number,old_pass);
        if(enrollment_office==null) return false;
        enrollment_office.setPassword(new_pass);
        enrollment_officeRepository.save(enrollment_office);
        return true;
    }

    public void SchoolModify(SchoolKey schoolKey,School sc)
    {
        schoolRepository.deleteById(schoolKey);
        sc.setId(schoolKey);
        schoolRepository.save(sc);
    }

    public void deleteEnrollment_office(String Account_number)
    {
        Enrollment_officeKey key=new Enrollment_officeKey();
        key.setAccount_number(Account_number);
        enrollment_officeRepository.deleteById(key);
    }

    public void deleteSchool(String School_ID)
    {
        SchoolKey key=new SchoolKey();
        key.setSchool_ID(School_ID);
        schoolRepository.deleteById(key);
    }

    public boolean changeStudent(String account,String old_pass,String new_pass)
    {
        Student student=studentRepository.findByAccountNumberAndPassword(account,old_pass);
        if(student==null) return false;
        student.setPassword(new_pass);
        studentRepository.save(student);
        return true;
    }

    public void approveEnrollment(Passing_enrollment pe)
    {
        passing_enrollmentRepository.save(pe);
        deleteSchoolEnrollment(pe);
    }

    public void deleteSchoolEnrollment(Passing_enrollment pe)
    {
        School_enrollmentKey key=new School_enrollmentKey();
        key.setBatch(pe.getId().getBatch());
        key.setMajor(pe.getId().getMajor());
        key.setProvince(pe.getId().getProvince());
        key.setSchool_ID(pe.getId().getSchool_ID());
        key.setSchool_name(pe.getId().getSchool_name());
        school_enrollmentRepository.deleteById(key);
    }

    public void disapproveEnrollment(Passing_enrollment pe)
    {
        deleteSchoolEnrollment(pe);
    }

    public void admitStudent(Student_volunteer sv)
    {
        Student_admittedKey key=new Student_admittedKey();
        Student_admitted sa=new Student_admitted();
        key.setBatch(sv.getId().getBatch());
        key.setExaminationNumber(sv.getId().getExaminationNumber());
        key.setIdentificationNumber(sv.getId().getIdentificationNumber());
        key.setMajor(sv.getId().getMajor());
        key.setSerial_number(sv.getId().getSerial_number());
        key.setName(sv.getId().getName());
        key.setProvince(sv.getId().getProvince());
        key.setSchool_ID(sv.getId().getSchool_ID());
        key.setSchool_name(sv.getId().getSchool_name());
        sa.setId(key);
        student_admittedRepository.save(sa);
    }

    public void begin()
    {
        List<Science_grade> sg=science_gradeRepository.findAll();
        List<Student_volunteer> vol=student_volunteerRepository.findAll();
        List<Passing_enrollment> pe=passing_enrollmentRepository.findAll();

        Collections.sort(sg,(o1,o2)->
        {
            if(o1.getTotal_points()==o2.getTotal_points())
            {
                return 0;
            }
            else
            {
                if(o1.getTotal_points()<o2.getTotal_points())
                    return 1;
                else
                    return -1;
            }
        });

        for(Science_grade it:sg)
        {
            List<Student_volunteer> tmp=student_volunteerRepository.findAllByIdentificationNumber(it.getId().getIdentificationNumber());
            Collections.sort(tmp,(o1,o2)->
            {
                if(o1.getId().getSerial_number()==o2.getId().getSerial_number())
                {
                    return 0;
                }
                else
                {
                    if(o1.getId().getSerial_number()>o2.getId().getSerial_number())
                        return 1;
                    else
                        return -1;
                }
            });
            for(Student_volunteer sv:tmp)
            {
                boolean ok=false;
                for(Passing_enrollment peit:pe)
                {
                    if(peit.getId().getSchool_ID().equals(sv.getId().getSchool_ID())&&
                    peit.getId().getMajor().equals(sv.getId().getMajor()))
                    {
                        if(peit.getEnrollment_number()>0)
                        {
                            peit.setEnrollment_number(peit.getEnrollment_number()-1);
                            ok=true;
                            admitStudent(sv);
                        }
                        break;
                    }
                }
                if(ok) break;
            }
        }
    }
}