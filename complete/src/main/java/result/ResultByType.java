package result;

import enums.ResponseEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ResultByType<T> {

    @ApiModelProperty(value = "返回码")
    private String code;

    @ApiModelProperty(value = "返回信息")
    private String msg;

    @ApiModelProperty(value = "数据")
    private T data = null;

    public ResultByType(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultByType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultByType(String code, T data) {
        this.code = code;
        ResponseEnum responseEnum = ResponseEnum.getEnum(code);
        this.msg = responseEnum.getMsg();
        this.data = data;
    }

    public ResultByType(String code) {
        this.code = code;
        ResponseEnum responseEnum = ResponseEnum.getEnum(code);
        this.msg = responseEnum.getMsg();
    }

    public ResultByType() {
    }

}
