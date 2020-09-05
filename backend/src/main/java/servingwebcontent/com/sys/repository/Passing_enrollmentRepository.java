package servingwebcontent.com.sys.repository;

import entity.Passing_enrollment;
import entity.Passing_enrollmentKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Passing_enrollmentRepository extends JpaRepository<Passing_enrollment,Passing_enrollmentKey>
{

    List<Passing_enrollment> findAll();     //查找所有
    Passing_enrollment findOne(Passing_enrollmentKey passing_enrollmentKey); //查找某一个
    List<Passing_enrollment> findAllBySchool_ID(String school_ID);     //按学校查找所有
    String  save(Passing_enrollment passing_enrollment);//修改和添加
    String  deleteByIdIs(Passing_enrollmentKey passing_enrollmentKey);//删除
}