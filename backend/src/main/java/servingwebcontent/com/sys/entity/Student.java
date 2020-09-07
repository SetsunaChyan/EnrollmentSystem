package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="student",schema="enroll_system_DB")
public class Student
{
    @EmbeddedId
    private StudentKey id;
    @Basic
    @Column(name="Examination_number")
    private String Examination_number;
    @Basic
    @Column(name="Name")
    private String name;
    @Basic
    @Column(name="Sex")
    private String sex;
    @Basic
    @Column(name="Phone_Number")
    private String phoneNumber;
    @Basic
    @Column(name="Native_Place")
    private String nativePlace;
    @Basic
    @Column(name="Account_Number")
    private String accountNumber;
    @Basic
    @Column(name="Password")
    private String password;
    @Basic
    @Column(name="Age")
    private int age;
    @Basic
    @Column(name="subject")
    private String subject;

    public String getExaminationNumber()
    {
        return Examination_number;
    }

    public void setExamination_number(String Examination_number)
    {
        this.Examination_number=Examination_number;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex=sex;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public String getNativePlace()
    {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace)
    {
        this.nativePlace=nativePlace;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public Student()
    {
    }
    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject=subject;
    }
    

    public StudentKey getId()
    {
        return id;
    }

    public void setId(StudentKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(Examination_number,id,name,age,sex,phoneNumber,nativePlace,accountNumber,password,subject);
    }
}
