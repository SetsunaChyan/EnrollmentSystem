package servingwebcontent.com.sys.repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Student_not_admittedRepository extends JpaRepository<Student_not_admitted,Student_not_admittedKey>
{
    List<Student_not_admitted> findAll();     //查找所有
    Student_not_admitted findOne(Student_not_admittedKey student_not_admittedKey); //查找某一个
    String  save(Student_not_admitted student_not_admitted);//修改和添加
    String  deleteByIdIs(Student_not_admittedKey student_not_admittedKey);
    Student_not_admitted findAllByIdentificationNumber(String identificationNumber);//按身份证号查找
}