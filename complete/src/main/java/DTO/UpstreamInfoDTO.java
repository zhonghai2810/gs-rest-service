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
@ApiModel("上游供应商采购订单")
public class UpstreamInfoDTO {

    @ApiModelProperty("上游供应商名称")
    private String upstreamCompanyName;

    @ApiModelProperty("法定代表人")
    private String legalRepresentative; // 法定代表人

    @ApiModelProperty("注册资本")
    private String registeredCapital; // 注册资本

    @ApiModelProperty("账期")
    private int paymentPeriod;

    @ApiModelProperty("发货平均时效")
    private int averageDeliveryTime;

    @ApiModelProperty("采购总金额")
    private double purchaseAmount;

    @ApiModelProperty("交易信息")
    private List<TradeInfo> tradeInfos;

}
