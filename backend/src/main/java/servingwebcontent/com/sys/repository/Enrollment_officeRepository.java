package servingwebcontent.com.sys.repository;

import entity.Enrollment_office;
import entity.Enrollment_officeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Enrollment_officeRepository extends JpaRepository<Enrollment_office,Enrollment_officeKey>
{
    Enrollment_office findByAccountNumberAndPassword(String accountNumber,String password); //用于登录
    List<Enrollment_office> findAll();     //查找所有
    Enrollment_office findOne(Enrollment_officeKey enrollment_officeKey); //查找某一个
    String  save(Enrollment_office enrollment_office);//修改
    String  deleteByIdIs(Enrollment_officeKey enrollment_officeKey);
}