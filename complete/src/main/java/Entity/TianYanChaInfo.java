package Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 天眼查信息
 */
@Data
@ApiModel("天眼查信息")
public class TianYanChaInfo {

    @ApiModelProperty("公司名称")
    private String companyName;

    @ApiModelProperty("联系电话")
    private String telephone;

    @ApiModelProperty("公司网址")
    private String website;

    @ApiModelProperty("联系邮箱")
    private String email;

    @ApiModelProperty("公司地址")
    private String address;

    @ApiModelProperty("工商信息")
    private CommercialInfo commercialInfo;
}
