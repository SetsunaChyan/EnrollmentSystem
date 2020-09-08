package servingwebcontent.com.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import servingwebcontent.com.sys.entity.*;
import servingwebcontent.com.sys.response.responseBase;
import servingwebcontent.com.sys.response.responseBuilder;
import servingwebcontent.com.sys.response.responseCode;
import servingwebcontent.com.sys.service.Enrollment_officeService;
import servingwebcontent.com.sys.service.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController
{
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService)
    {
        this.schoolService=schoolService;
    }

    @RequestMapping("/login")
    public <T> responseBase<T> login(@RequestParam("username") String username,
                                     @RequestParam("password") String password,
                                     @RequestParam("character") String character)
    {
        if(schoolService.login(username,password)) return responseBuilder.success();
        else return responseBuilder.fail(responseCode.LOGIN_FAIL);
    }

    @RequestMapping("/addEnrollment")
    public <T> responseBase<T> login(@RequestParam("id") String id,//学校id
                                     @RequestParam("province") String province,//前端没有
                                     @RequestParam("name") String name,
                                     @RequestParam("major") String major,
                                     @RequestParam("number") int number,
                                     @RequestParam("batch") int batch)
    {
        School_enrollmentKey key=new School_enrollmentKey();
        key.setSchool_ID(id);
        key.setBatch(batch);
        key.setMajor(major);
        key.setProvince(province);
        key.setSchool_name(name);
        School_enrollment se=new School_enrollment();
        se.setId(key);
        se.setEnrollment_number(number);
        schoolService.addEnrollment(key,se);
        return responseBuilder.success();
    }

    @RequestMapping("/showAdmitted1")
    public <T> responseBase<T> showAdmitted1()
    {
        List<Student_admitted> tmp=schoolService.showStudentAdmitted("10000",1);
        return (responseBase<T>)responseBuilder.success(tmp);
    }

    @RequestMapping("/showAdmitted2")
    public <T> responseBase<T> showAdmitted2()
    {
        List<Student_admitted> tmp=schoolService.showStudentAdmitted("10000",2);
        return (responseBase<T>)responseBuilder.success(tmp);
    }
}
