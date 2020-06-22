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
@ApiModel("下游平台交易订单")
public class DownstreamInfoDTO {

    @ApiModelProperty("平台名称")
    private String downstreamChannelName;

    @ApiModelProperty("商品SKU数量")
    private int skuCount;

    @ApiModelProperty("销售产品总数量")
    private int productSoldTotal;

    @ApiModelProperty("销售总金额")
    private double amountSoldTotal;

    @ApiModelProperty("交易信息")
    private List<TradeInfo> tradeInfos;
}
