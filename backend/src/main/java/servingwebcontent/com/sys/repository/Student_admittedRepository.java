package servingwebcontent.com.sys.repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Student_admittedRepository extends JpaRepository<Student_admitted,Student_admittedKey>
{
    List<Student_admitted> findAll();     //查找所有
    Student_admitted findOne(Student_admittedKey student_admittedKey); //查找某一个
    String  save(Student_admitted student_admitted);//修改和添加
    String  deleteByIdIs(Student_admittedKey student_admittedKey);
    List<Student_admitted> findAllBySchool_ID(String school_ID);     //按学校查找所有
    Student_admitted findAllByIdentificationNumber(String identificationNumber);//按身份证号查找

}