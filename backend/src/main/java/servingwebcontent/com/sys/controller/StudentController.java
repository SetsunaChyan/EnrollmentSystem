package servingwebcontent.com.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import servingwebcontent.com.sys.response.responseBase;
import servingwebcontent.com.sys.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController
{
    private final StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }
}
