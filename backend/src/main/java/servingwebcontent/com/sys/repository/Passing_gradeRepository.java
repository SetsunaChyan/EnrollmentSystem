package servingwebcontent.com.sys.repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Passing_gradeRepository extends JpaRepository<Passing_grade,Passing_gradeKey>
{
    List<Passing_grade> findAll();     //查找所有
    Passing_grade findOne(Passing_gradeKey passing_gradeKey); //查找某一个
    List<Passing_grade> findAllBySchool_ID(String school_ID);     //按学校查找所有
    List<Passing_grade> findAllByProvince(String province);     //按省份查找所有
    List<Passing_grade> findAllByProvinceAndSchool_ID(String province,String school_ID); //按省份和学校查找所有
    String  save(Arts_grade arts_grade);//修改和添加
    String  deleteByIdIs(Passing_enrollmentKey passing_enrollmentKey);//删除

}