package servingwebcontent.com.sys.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Student_admittedKey implements Serializable
{
    private String identificationNumber;
    private String examinationNumber;
    private String School_ID;
    private String School_name;
    private String Name;
    private String Province;
    private String Major;
    private int Serial_number;
    private int Batch;

    public String getIdentificationNumber()
    {
        return identificationNumber;
    }
    public void setIdentificationNumber(String identificationNumber)
    {
        this.identificationNumber=identificationNumber;
    }

    public String getExaminationNumber()
    {
        return examinationNumber;
    }
    public void setExaminationNumber(String examinationNumber)
    {
        this.examinationNumber=examinationNumber;
    }

    public String getSchool_ID()
    {
        return School_ID;
    }
    public void setSchool_ID(String School_ID) { this.School_ID=School_ID; }

    public String getSchool_name()
    {
        return School_name;
    }
    public void setSchool_name(String School_name)
    {
        this.School_name=School_name;
    }

    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }

    public String getProvince()
    {
        return Province;
    }
    public void setProvince(String Province)
    {
        this.Province=Province;
    }

    public String getMajor()
    {
        return Major;
    }
    public void setMajor(String Major)
    {
        this.Major=Major;
    }

    public int getSerial_number()
    {
        return Serial_number;
    }
    public void setMajor(int Serial_number)
    {
        this.Serial_number=Serial_number;
    }

    public int getBatch()
    {
        return Batch;
    }
    public void setBatch(int Batch)
    {
        this.Batch=Batch;
    }
}
