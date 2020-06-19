package result;


import enums.ResponseEnum;
import lombok.Data;

@Data
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

}
