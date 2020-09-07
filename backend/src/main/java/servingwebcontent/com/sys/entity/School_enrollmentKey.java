package servingwebcontent.com.sys.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class School_enrollmentKey implements Serializable
{
    private String School_ID;
    private String School_name;
    private String Province;
    private String Major;
    private int Batch;

    public String getSchool_ID()
    {
        return School_ID;
    }
    public void setSchool_ID(String School_ID)
    {
        this.School_ID=School_ID;
    }

    public String getSchool_name()
    {
        return School_name;
    }
    public void setSchool_name(String School_name)
    {
        this.School_name=School_name;
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

    public int getBatch()
    {
        return Batch;
    }
    public void setBatch(int Batch)
    {
        this.Batch=Batch;
    }

}