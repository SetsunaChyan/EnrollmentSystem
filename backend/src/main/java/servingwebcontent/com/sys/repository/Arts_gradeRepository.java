package servingwebcontent.com.sys.repository;

import entity.Arts_grade;
import entity.Arts_gradeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Arts_gradeRepository extends JpaRepository<Arts_grade,Arts_gradeKey>
{
    List<Arts_grade> findAll();     //查找所有
    Arts_grade findOne(Arts_gradeKey arts_gradeKey); //查找某一个
    Arts_grade findByIdentificationNumber(String identificationNumber); //按学生身份证号查找
    String  save(Arts_grade arts_grade);//修改
    String  deleteByIdIs(Arts_gradeKey arts_gradeKey);
}
