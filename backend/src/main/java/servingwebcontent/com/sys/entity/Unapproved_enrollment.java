package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="unapproved_enrollment", schema="enroll_system_DB")
public class Unapproved_enrollment
{
    @EmbeddedId
    private Unapproved_enrollmentKey id;
    @Basic
    @Column(name="Enrollment_number")
    private int Enrollment_number;

    public int getEnrollment_number()
    {
        return Enrollment_number;
    }
    public void setEnrollment_number(int Enrollment_number) { this.Enrollment_number=Enrollment_number;}

    public Unapproved_enrollment()
    {
    }

    public Unapproved_enrollmentKey getId()
    {
        return id;
    }

    public void setId(Unapproved_enrollmentKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id,Enrollment_number);
    }
}
