package DTO;

import Entity.TradeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class StreamInfoDTO {

    @ApiModelProperty("上游供应商或下游平台名称")
    private String upstreamCompanyName;

    @ApiModelProperty("法定代表人")
    private String legalRepresentative; // 法定代表人

    @ApiModelProperty("注册资本")
    private String registeredCapital; // 注册资本



    @ApiModelProperty("交易信息")
    private List<TradeInfo> tradeInfos;

}
