package servingwebcontent.com.sys.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StudentKey implements Serializable
{
    private String identificationNumber;
    private String examinationNumber;

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
}