package servingwebcontent.com.sys.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Arts_gradeKey implements Serializable
{
    private String identificationNumber;

    public Arts_gradeKey()
    {}

    public Arts_gradeKey(String id_num)
    {
        identificationNumber=id_num;
    }

    public String getIdentificationNumber()
    {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber)
    {
        this.identificationNumber=identificationNumber;
    }

}