package Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("公司运营数据")
public class OperationInfo {

    @ApiModelProperty("销售金额")
    private double saleAmount; // 销售金额

    @ApiModelProperty("销售订单数")
    private int saleOrderCount; // 销售订单数

    @ApiModelProperty("平均每笔订单金额")
    private double averageAmountOfOrders; // 平均每笔订单金额

    @ApiModelProperty("采购金额")
    private double purchaseAmount; // 采购金额

    @ApiModelProperty("采购订单数")
    private int purchaseOrderCount; // 采购订单数

    @ApiModelProperty("平均每笔采购金额")
    private double averageAmountOfPurchases; // 平均每笔采购金额

    @ApiModelProperty("毛利率")
    private double rateOfGrossProfit; // 毛利率

}
