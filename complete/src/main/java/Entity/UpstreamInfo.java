package Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("上游采购信息")
public class UpstreamInfo {

    @ApiModelProperty("上游采购商信息")
    private TianYanChaInfo upstreamSupplierInfo;

    @ApiModelProperty("账期")
    private int paymentPeriod;

    @ApiModelProperty("发货平均时效")
    private int averageDeliveryTime;

    @ApiModelProperty("采购总金额")
    private double purchaseAmount;

}
