package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="student_admitted", schema="enroll_system_DB")
public class Student_admitted
{
    @EmbeddedId
    private Student_admittedKey id;

    public Student_admitted()
    {
    }

    public Student_admittedKey getId()
    {
        return id;
    }
    public void setId(Student_admittedKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}