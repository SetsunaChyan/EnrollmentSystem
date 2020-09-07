package servingwebcontent.com.sys.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Scope(value="session",proxyMode= ScopedProxyMode.TARGET_CLASS)
public class UserSession implements Serializable {
    private static final long serialVersionUID = 1L;

    private String account;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
