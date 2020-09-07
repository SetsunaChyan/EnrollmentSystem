package servingwebcontent.com.sys.service;

import org.springframework.stereotype.Service;
import servingwebcontent.com.sys.entity.*;
import servingwebcontent.com.sys.repository.*;

@Service
public class Enrollment_officeService
{
    private final StudentRepository studentRepository;
    private final SchoolRepository schoolRepository;
    private final Enrollment_officeRepository enrollment_officeRepository;
    private final Student_admittedRepository student_admittedRepository;


    public Enrollment_officeService (StudentRepository studentRepository,SchoolRepository schoolRepository,Enrollment_officeRepository enrollment_officeRepository,Student_admittedRepository student_admittedRepository) {
        this.studentRepository=studentRepository;
        this.schoolRepository=schoolRepository;
        this.enrollment_officeRepository=enrollment_officeRepository;
        this.student_admittedRepository=student_admittedRepository;

    }


    public boolean Officelogin(String Account_number,String password){
        //登录函数，返回false则登录失败即数据库中无该数据，返回true则登录成功
        Enrollment_office  enrollment_office=Enrollment_office.findByAccountNumberAndPassword(String accountNumber,String password);
        if(enrollment_office==null)    return false;
        return true;
    }

    public boolean Officechange(String Account_number,String old_pass,String new_pass){
        //修改密码，返回false即密码错误，返回true则说明密码修改成功
        Enrollment_office  enrollment_office=Enrollment_office.findByAccountNumberAndPassword(Account_number,old_pass);
        if(enrollment_office==null)   return false;
        enrollment_office.setPassword(new_pass);
        enrollment_officeRepository.save(enrollment_office);
        return true;
    }

    public boolean Schoolchange(String Account_number,String old_pass,String new_pass){
        School school=School.findByAccountNumberAndPassword(String accountNumber, String oldpass);
        if(school==null)   return false;
        school.setPassword(new_pass);
        schoolRepository.save(school);
        return true;
    }



        public void deleteEnrollment_office(string Account_number)
        {

            Enrollment_officeRepository.deleteById(Account_number);
        }


        public void deleteSchool(String School_ID)
    {
            SchoolRepository.deleteById(School_ID);
        }



    public boolean changeStudent(String account,String old_pass,String new_pass){
        Student student=studentRepository.findByAccountNumberAndPassword(account,old_pass);
        if(student==null)   return false;
        student.setPassword(new_pass);
        studentRepository.save(student);
        return true;
    }



    public check_studeng_enrollment(String id_num){
        Student_admitted student_admitted=student_admittedRepository.findAllByIdentificationNumber(id_num);
        return student_admitted;
    }

}
