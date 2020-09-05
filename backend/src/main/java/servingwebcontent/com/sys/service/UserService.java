package servingwebcontent.com.sys.service;

import org.springframework.stereotype.Service;
import servingwebcontent.com.sys.entity.Student;
import servingwebcontent.com.sys.repository.StudentRepository;
import servingwebcontent.com.sys.response.responseBase;
import servingwebcontent.com.sys.response.responseBuilder;
import servingwebcontent.com.sys.response.responseCode;

import java.util.Objects;

@Service
public class UserService
{
    private final StudentRepository studentRepository;

    public UserService(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }

    public <T> responseBase<T> UserLogin(String username,String password,String character)
    {
        if(Objects.equals(character,"student"))
        {
            Student s=studentRepository.findByAccountNumberAndPassword(username,password);
            if(s!=null&&Objects.equals(username,s.getAccountNumber())&&Objects.equals(password,s.getPassword()))
                return responseBuilder.success();
            else
                return responseBuilder.fail(responseCode.LOGIN_FAIL);
        }
        else if(Objects.equals(character,"school"))
        {
            // ...
            return responseBuilder.success();
        }
        else if(Objects.equals(character,"admin"))
        {
            // ...
            return responseBuilder.success();
        }
        else return responseBuilder.fail(responseCode.FAIL);
    }
}
