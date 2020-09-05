package servingwebcontent.com.sys.service;

import servingwebcontent.com.sys.entity.Student;
import org.springframework.stereotype.Service;
import servingwebcontent.com.sys.repository.StudentRepository;

@Service
public class StudentService
{
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
}
