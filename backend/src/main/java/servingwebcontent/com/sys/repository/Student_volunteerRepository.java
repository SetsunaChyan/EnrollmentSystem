package servingwebcontent.com.sys.repository;

import entity.Student_volunteer;
import entity.Student_volunteerKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Student_volunteerRepository extends JpaRepository<Student_volunteer,Student_volunteerKey>
{
    List<Student_volunteer> findAll();     //查找所有
    Student_volunteer findOne(Student_volunteerKey student_volunteerKey); //查找某一个
    String  save(Student_volunteer student_volunteer);//修改和添加
    String  deleteByIdIs(Student_volunteerKey student_volunteerKey);
    String  deleteByIdentificationNumber(String identificationNumber);//按身份证号删除
    List<Student_volunteer> findAllBySchool_ID(String school_ID);     //按学校查找所有
    Student_volunteer findAllByIdentificationNumber(String identificationNumber);//按身份证号查找
    List<Student_volunteer> findAllBySerial_number(String serial_number);     //按志愿序号查找所有
    List<Student_volunteer> findAllByBatch(String batch);     //按批次查找所有
    List<Student_volunteer> findAllByProvince(String province);     //按批次查找所有
    List<Student_volunteer> findAllByProvinceAndSchool_ID(String province,String school_ID);     //按批次查找所有
}