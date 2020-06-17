package enums;

import com.gvt.riskservice.Constant;

public enum ResponseEnum implements Constant {

    SUCCESS ("200", "成功"),
    AUTH_FAILED ("201", "没有访问权限"),
    ;

    private String code;
    private String msg;

    ResponseEnum(String code, String value) {
        this.code = code;
        this.msg = value;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    public static ResponseEnum getEnum(String code){
        for(ResponseEnum responseEnum : values()){
            if(responseEnum.getCode().equals(code)){
                return responseEnum;
            }
        }
        return null;
    }
}
