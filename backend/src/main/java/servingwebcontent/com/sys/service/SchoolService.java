package servingwebcontent.com.sys.service;

import servingwebcontent.com.sys.entity.*;
import servingwebcontent.com.sys.repository.*;

import java.util.ArrayList;
import java.util.List;

public class SchoolService
{
    private final SchoolRepository schoolRepository;
    private final School_enrollmentRepository school_enrollmentRepository;
    private final Student_admittedRepository student_admittedRepository;

    public SchoolService(SchoolRepository schoolRepository,
                         School_enrollmentRepository school_enrollmentRepository,
                         Student_admittedRepository student_admittedRepository)
    {
        this.schoolRepository=schoolRepository;
        this.school_enrollmentRepository=school_enrollmentRepository;
        this.student_admittedRepository=student_admittedRepository;
    }

    public boolean login(String account,String password)
    {
        //登录函数，返回false则登录失败即数据库中无该数据，返回true则登录成功
        //参数:account用户名，password密码
        School school=schoolRepository.findByAccountNumberAndPassword(account,password);
        if(school==null) return false;
        return true;
    }

    public void addEnrollment(School_enrollmentKey key,int num)
    {
        //添加招生计划
        //参数:key招生计划，num该计划招生人数
        School_enrollment school_enrollment=new School_enrollment();
        school_enrollment.setId(key);
        school_enrollment.setEnrollment_number(num);
        school_enrollmentRepository.save(school_enrollment);
    }

    public List<Student_admitted> showStudentAdmitted(String School_ID,int Batch)
    {
        //查询某批次招生情况
        //参数:School_ID招生学校，Batch批次
        List<Student_admitted> ret=new ArrayList<>();
        List<Student_admitted> tmp=student_admittedRepository.findAllBySchool_ID(School_ID);
        for(Student_admitted it:tmp)
            if(it.getId().getBatch()==Batch) ret.add(it);
        return ret;
    }
}
