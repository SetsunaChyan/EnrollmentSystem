package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="school", schema="enroll_system_DB")
public class School
{
    @EmbeddedId
    private SchoolKey id;
    @Basic
    @Column(name="School_name")
    private String School_name;
    @Basic
    @Column(name="School_address")
    private String School_address;
    @Basic
    @Column(name="Telephone_number")
    private String Telephone_number;
    @Basic
    @Column(name="Account_Number")
    private String Account_Number;
    @Basic
    @Column(name="Password")
    private String Password;

    public String getSchool_name()
    {
        return School_name;
    }

    public void setSchool_name(String School_name) { this.School_name=School_name; }

    public String getSchool_address()
    {
        return School_address;
    }

    public void setSchool_address(String School_address)
    {
        this.School_address=School_address;
    }

    public String getTelephone_number()
    {
        return Telephone_number;
    }

    public void setTelephone_number(String Telephone_number)
    {
        this.Telephone_number=Telephone_number;
    }

    public String getAccountNumber()
    {
        return Account_Number;
    }

    public void setAccountNumber(String Account_Number)
    {
        this.Account_Number=Account_Number;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String Password)
    {
        this.Password=Password;
    }

    public School()
    {
    }

    public SchoolKey getId()
    {
        return id;
    }

    public void setId(SchoolKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id,School_name,School_address,Telephone_number,Account_Number,Password);
    }
}
