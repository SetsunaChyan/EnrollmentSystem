package servingwebcontent.com.sys.response;

public class responseBuilder {
    public static <T> responseBase<T> success(){
        responseBase<T> res=new responseBase<>();
        res.setStatus(responseCode.SUCCESS.getCode());
        res.setMsg(responseCode.SUCCESS.getMsg());
        return res;
    }

    public static <T> responseBase<T> success(responseCode code){
        responseBase<T> res=new responseBase<>();
        res.setStatus(code.getCode());
        res.setMsg(code.getMsg());
        return res;
    }

    public static <T> responseBase<T> success(T data){
        responseBase<T> res=success();
        res.setData(data);
        return res;
    }

    public static <T> responseBase<T> success(responseCode code,T data){
        responseBase<T> res=success(code);
        res.setData(data);
        return res;
    }

    public static <T> responseBase<T> fail(responseCode code){
        responseBase<T> res=new responseBase<>();
        res.setStatus(code.getCode());
        res.setMsg(code.getMsg());
        return res;
    }
}
