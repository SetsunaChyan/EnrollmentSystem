package servingwebcontent.com.sys.service;

import servingwebcontent.com.sys.entity.*;
import org.springframework.stereotype.Service;
import servingwebcontent.com.sys.repository.*;

import java.util.List;

@Service
public class StudentService
{
    private final StudentRepository studentRepository;
    private final Student_admittedRepository student_admittedRepository;
    private final Student_volunteerRepository student_volunteerRepository;
    private final Arts_gradeRepository arts_gradeRepository;
    private final Science_gradeRepository science_gradeRepository;

    public StudentService(StudentRepository studentRepository,Student_admittedRepository student_admittedRepository,Student_volunteerRepository student_volunteerRepository,Arts_gradeRepository arts_gradeRepository,Science_gradeRepository science_gradeRepository) {
        this.studentRepository=studentRepository;
        this.student_admittedRepository=student_admittedRepository;
        this.student_volunteerRepository=student_volunteerRepository;
        this.arts_gradeRepository=arts_gradeRepository;
        this.science_gradeRepository=science_gradeRepository;
    }


    public boolean login(String account,String password){
        //登录函数，返回false则登录失败即数据库中无该数据，返回true则登录成功
        //参数:account用户名，password密码
        Student student=studentRepository.findByAccountNumberAndPassword(account,password);
        if(student==null)    return false;
        return true;
    }


    public boolean changePassword(String account,String old_pass,String new_pass){
        //修改密码，返回false即密码错误，返回true则说明密码修改成功
        //参数:account用户名，由于已经登录，可以调用session中的用户名，old_pass当前密码，new_pass更新后的密码
        Student student=studentRepository.findByAccountNumberAndPassword(account,old_pass);
        if(student==null)   return false;
        student.setPassword(new_pass);
        studentRepository.save(student);
        return true;
    }

    public void choose_school(List<Student_volunteer> student_volunteers){
        //投志愿
        //参数:student_volunteers用户在前端勾选的志愿
        for(int i=0;i<student_volunteers.size();i++)
            student_volunteerRepository.save(student_volunteers.get(i));
    }

    public Object check_grade(String id_num){
        //查询成绩，返回值要强制类型转换，文科生转为Arts_grade，理科生转为Science_grade
        //参数:id_num用户的身份证号
        Arts_grade arts_grade=arts_gradeRepository.findById(new Arts_gradeKey(id_num)).get();
        Science_grade science_grade=science_gradeRepository.findById(new Science_gradeKey(id_num)).get();
        if(arts_grade==null&&science_grade==null)   return null;
        else if(arts_grade==null)   return science_grade;
        else return arts_grade;
    }

    public Student_admitted check_enrollment(String id_num){
        //查询录取情况，若返回值为null，则说明没有被录取或没有结果，若返回值不为null则说明已被录取，具体录取情况参考返回值中的数据
        //参数:id_num用户的身份证号
        Student_admitted student_admitted=student_admittedRepository.findAllByIdentificationNumber(id_num);
        return student_admitted;
    }
}
