package servingwebcontent.com.sys.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SchoolKey implements Serializable
{
    private String School_ID;

    public String getSchool_ID()
    {
        return School_ID;
    }

    public void setSchool_ID(String School_ID)
    {
        this.School_ID=School_ID;
    }

}