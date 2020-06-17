package result;


import enums.ResponseEnum;

public class Result {

    private String code;

    private String msg;

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(String code) {
        this.code = code;
        ResponseEnum responseEnum = ResponseEnum.getEnum(code);
        this.msg = responseEnum.getMsg();
    }

    public Result() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
