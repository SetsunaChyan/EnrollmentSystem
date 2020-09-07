package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="enrollment_office", schema="enroll_system_DB")
public class Enrollment_office
{
    @EmbeddedId
    private Enrollment_officeKey id;

    @Basic
    @Column(name="Password")
    private String password;

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }

    public Enrollment_office()
    {
    }

    public Enrollment_officeKey getId()
    {
        return id;
    }

    public void setId(Enrollment_officeKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id,password);
    }
}
