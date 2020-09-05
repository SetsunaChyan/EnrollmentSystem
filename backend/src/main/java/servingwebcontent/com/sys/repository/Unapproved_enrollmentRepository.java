package servingwebcontent.com.sys.repository;

import entity.Unapproved_enrollment;
import entity.Unapproved_enrollmentKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Unapproved_enrollmentRepository extends JpaRepository<Unapproved_enrollment,Unapproved_enrollmentKey>
{
    List<Unapproved_enrollment> findAll();     //查找所有
    Unapproved_enrollment findOne(Unapproved_enrollmentKey unapproved_enrollmentKey); //查找某一个
    List<Unapproved_enrollment> findAllBySchool_ID(String school_ID);     //按学校查找所有
    String  save(Unapproved_enrollment unapproved_enrollment);//修改和添加
    String  deleteByIdIs(Unapproved_enrollmentKey unapproved_enrollmentKey);//删除
}