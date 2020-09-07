package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="student_not_admitted", schema="enroll_system_DB")
public class Student_not_admitted
{
    @EmbeddedId
    private Student_not_admittedKey id;
    @Basic
    @Column(name="Examination_number")
    private String Examination_number;
    @Basic
    @Column(name="Name")
    private String name;
    public String getExamination_number()
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

    public Student_not_admitted()
    {
    }

    public Student_not_admittedKey getId()
    {
        return id;
    }
    public void setId(Student_not_admittedKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id,Examination_number,name);
    }
}