package servingwebcontent.com.sys.repository;

import entity.School;
import entity.SchoolKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School,SchoolKey>
{
    School findByAccountNumberAndPassword(String accountNumber, String password); //用于登录
    List<School> findAll();     //查找所有
    School findOne(SchoolKey schoolKey); //查找某一个
    String  save(School school);//修改和添加
    String  deleteByIdIs(SchoolKey schoolKey);

}