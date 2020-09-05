package servingwebcontent.com.sys.repository;


import entity.Science_grade;
import entity.Science_gradeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Science_gradeRepository extends JpaRepository<Science_grade,Science_gradeKey>
{
    List<Science_grade> findAll();     //查找所有
    Science_grade findOne(Science_gradeKey science_gradeKey); //查找某一个
    Science_grade findByIdentificationNumber(String identificationNumber); //按学生身份证号查找
    String  save(Science_grade science_grade);//修改
    String  deleteByIdIs(Science_gradeKey science_gradeKey);//删除
}
