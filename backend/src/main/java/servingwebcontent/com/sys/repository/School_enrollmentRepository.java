package servingwebcontent.com.sys.repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface School_enrollmentRepository extends JpaRepository<School_enrollment,School_enrollmentKey>
{
    List<School_enrollment> findAll();     //查找所有
    School_enrollment findOne(School_enrollmentKey school_enrollmentKey); //查找某一个
    List<School_enrollment> findAllBySchool_ID(String school_ID);     //按学校查找所有
    List<School_enrollment> findAllByProvince(String province);     //按省份查找所有
    List<School_enrollment> findAllByProvinceAndSchool_ID(String province,String school_ID); //按省份和学校查找所有
    String  save(School_enrollment school_enrollment);//修改和添加
    String  deleteByIdIs(School_enrollmentKey school_enrollmentKey);//删除

}