package DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("天眼查工商信息")
public class TianYanChaInfoDTO {

    @ApiModelProperty("公司名称")
    private String companyName;

    @ApiModelProperty("法定代表人")
    private String legalRepresentative; // 法定代表人

    @ApiModelProperty("成立日期")
    private String fundDate; // 成立日期
}
