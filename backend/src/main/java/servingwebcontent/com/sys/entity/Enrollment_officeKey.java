package servingwebcontent.com.sys.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Enrollment_officeKey implements Serializable
{
    private String Account_number;

    public String getAccount_number()
    {
        return Account_number;
    }
    public void setAccount_number(String Account_number)
    {
        this.Account_number=Account_number;
    }
}
