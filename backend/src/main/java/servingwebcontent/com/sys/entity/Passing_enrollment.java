package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="passing_enrollment", schema="enroll_system_DB")
public class Passing_enrollment
{
    @EmbeddedId
    private Passing_enrollmentKey id;
    @Basic
    @Column(name="Enrollment_number")
    private int Enrollment_number;

    public int getEnrollment_number()
    {
        return Enrollment_number;
    }
    public void setEnrollment_number(int Enrollment_number) { this.Enrollment_number=Enrollment_number;}

    public Passing_enrollment()
    {
    }

    public Passing_enrollmentKey getId()
    {
        return id;
    }

    public void setId(Passing_enrollmentKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id,Enrollment_number);
    }
}
