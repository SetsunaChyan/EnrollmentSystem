package servingwebcontent.com.sys.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Student_not_admittedKey implements Serializable
{
    private String identificationNumber;

    public String getIdentificationNumber()
    {
        return identificationNumber;
    }
    public void setIdentificationNumber(String identificationNumber)
    {
        this.identificationNumber=identificationNumber;
    }

}
