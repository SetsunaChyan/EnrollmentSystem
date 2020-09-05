package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="passing_grade", schema="enroll_system_DB")
public class Passing_grade
{
    @EmbeddedId
    private Passing_gradeKey id;
    @Basic
    @Column(name="Enrollment_number")
    private int Enrollment_number;

    public int getEnrollment_number()
    {
        return Enrollment_number;
    }
    public void setEnrollment_number(int Enrollment_number) { this.Enrollment_number=Enrollment_number;}

    public Passing_grade()
    {
    }

    public Passing_gradeKey getId()
    {
        return id;
    }

    public void setId(Passing_gradeKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id,Enrollment_number);
    }
}
