package servingwebcontent.com.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import servingwebcontent.com.sys.entity.Passing_enrollment;
import servingwebcontent.com.sys.entity.Passing_enrollmentKey;
import servingwebcontent.com.sys.entity.School;
import servingwebcontent.com.sys.entity.SchoolKey;
import servingwebcontent.com.sys.response.responseBase;
import servingwebcontent.com.sys.response.responseBuilder;
import servingwebcontent.com.sys.response.responseCode;
import servingwebcontent.com.sys.service.*;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController
{
    private final Enrollment_officeService enrollmentService;

    public EnrollmentController(Enrollment_officeService enrollmentService)
    {
        this.enrollmentService=enrollmentService;
    }

    @RequestMapping("/login")
    public <T> responseBase<T> login(@RequestParam("username") String username,
                                     @RequestParam("password") String password,
                                     @RequestParam("character") String character)
    {
        if(enrollmentService.login(username,password)) return responseBuilder.success();
        else return responseBuilder.fail(responseCode.LOGIN_FAIL);
    }

    @RequestMapping("/begin")
    public <T> responseBase<T> begin()
    {
        enrollmentService.begin();
        return responseBuilder.success();
    }

    @RequestMapping("/ApproveSch")
    public <T> responseBase<T> ApproveSch(@RequestParam("id") String id,//学校id
                                          @RequestParam("province") String province,//前端没有
                                          @RequestParam("name") String name,
                                          @RequestParam("major") String major,
                                          @RequestParam("number") int number,
                                          @RequestParam("batch") int batch)       //前端没有
    {
        Passing_enrollmentKey key=new Passing_enrollmentKey();
        key.setSchool_ID(id);
        key.setBatch(batch);
        key.setMajor(major);
        key.setProvince(province);
        key.setSchool_name(name);
        Passing_enrollment pe=new Passing_enrollment();
        pe.setId(key);
        pe.setEnrollment_number(number);
        enrollmentService.approveEnrollment(pe);
        return responseBuilder.success();
    }

    @RequestMapping("/unApproveSch")
    public <T> responseBase<T> unApproveSch(@RequestParam("id") String id,//学校id
                                            @RequestParam("province") String province,//前端没有
                                            @RequestParam("name") String name,
                                            @RequestParam("major") String major,
                                            @RequestParam("number") int number,
                                            @RequestParam("batch") int batch)       //前端没有
    {
        Passing_enrollmentKey key=new Passing_enrollmentKey();
        key.setSchool_ID(id);
        key.setBatch(batch);
        key.setMajor(major);
        key.setProvince(province);
        key.setSchool_name(name);
        Passing_enrollment pe=new Passing_enrollment();
        pe.setId(key);
        pe.setEnrollment_number(number);
        enrollmentService.disapproveEnrollment(pe);
        return responseBuilder.success();
    }

    @RequestMapping("/delete_school")
    public <T> responseBase<T> delete_school(@RequestParam("school_ID") String school_ID)
    {
        enrollmentService.deleteSchool(school_ID);
        return responseBuilder.success();
    }

    @RequestMapping("/save_school")
    public <T> responseBase<T> delete_school(@RequestParam("id") String id,
                                             @RequestParam("name") String school_name,
                                             @RequestParam("address") String school_address,
                                            // @RequestParam("telephone_number") String telephone_number,//前端没有
                                             @RequestParam("admin") String admin,//账号
                                             @RequestParam("pass") String pass)  //密码
    {
        SchoolKey key=new SchoolKey();
        key.setSchool_ID(id);
        School school=new School();
        school.setId(key);
        school.setTelephone_number("114514");
        school.setSchool_address(school_address);
        school.setAccountNumber(admin);
        school.setPassword(pass);
        school.setSchool_name(school_name);
        enrollmentService.SchoolModify(key,school);
        return responseBuilder.success();
    }

    /*
    @RequestMapping("/delete_student")
    public <T> responseBase<T> delete_student(@RequestParam("identificationNumber") String identificationNumber)
    {
        return enrollmentService.;
    }

    @RequestMapping("/save_student")
    public <T> responseBase<T> delete_school(@RequestParam("name") String name,
                                             @RequestParam("sex") String sex,
                                             @RequestParam("age") String age,
                                             @RequestParam("id") String id,
                                             @RequestParam("cardId") String cardId,
                                             @RequestParam("phone") String phone,
                                             @RequestParam("address") String address)
    {
        return enrollmentService.;
    }
    */
}
