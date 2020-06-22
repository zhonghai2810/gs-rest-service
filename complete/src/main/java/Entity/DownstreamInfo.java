package Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("下游平台数据")
public class DownstreamInfo {

    @ApiModelProperty("平台信息")
    private ChannelInfo downstreamChannelInfo;

    @ApiModelProperty("商品SKU数量")
    private int skuCount;

    @ApiModelProperty("销售产品总数量")
    private int productSoldTotal;

    @ApiModelProperty("销售总金额")
    private double amountSoldTotal;

}
