package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="student_volunteer", schema="enroll_system_DB")
public class Student_volunteer
{
    @EmbeddedId
    private Student_volunteerKey id;

    public Student_volunteer()
    {
    }

    public Student_volunteerKey getId()
    {
        return id;
    }

    public void setId(Student_volunteerKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
