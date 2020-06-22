package Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel("平台渠道信息")
public class ChannelInfo extends TianYanChaInfo {

    /**
     * 电商平台
     */
    @ApiModelProperty("电商平台")
    private String platformName;
}
