package servingwebcontent.com.sys.repository;

import entity.Student;
import entity.StudentKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, StudentKey>
{
    Student findByAccountNumberAndPassword(String accountNumber,String password);
    String  deleteByIdIs(StudentKey studentKey);
    String  save(Student student);  //通过重新保存对象实现修改，主要用于修改密码
    Student findOne(StudentKey studentKey); //查找某一个学生
    List<Student> findAll();     //查找所有学生
}