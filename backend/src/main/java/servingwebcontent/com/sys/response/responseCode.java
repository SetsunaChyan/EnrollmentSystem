package servingwebcontent.com.sys.response;

public enum responseCode
{
    SUCCESS(0,"成功"),
    FAIL(1,"失败"),
    FORBIDDEN(403,"权限不足"),
    USERNAME_INVALID(10001,"用户名不合法"),
    USERNAME_EXISTS(10002,"用户名已存在"),
    PASSWORD_INVALID(10003,"密码不合法"),
    EMAIL_INVALID(10004,"邮箱格式不合法"),
    EMAIL_EXISTS(10004,"该邮箱已注册"),
    USER_BLOCKED(10005,"该账户已被封禁,有疑问请联系管理员"),
    LOGIN_FAIL(10006,"用户名或密码错误"),
    USER_NOT_EXIST(10007,"用户不存在");

    private int code;
    private String msg;

    responseCode()
    {
    }

    responseCode(int code,String msg)
    {

        this.code=code;
        this.msg=msg;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code=code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg=msg;
    }
}
