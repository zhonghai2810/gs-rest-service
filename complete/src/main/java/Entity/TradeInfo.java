package Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel("交易数据")
public class TradeInfo {

    @ApiModelProperty("商品名称")
    private String productName;

    @ApiModelProperty("商品条码")
    private String gvtCode;

    @ApiModelProperty("商品数量")
    private int productCount;

    @ApiModelProperty("平均采购（从供应商）或销售（在平台）价格")
    private double averagePurchaseOrSalePrice; // 平均采购（从供应商）或销售（在平台）价格

    @ApiModelProperty("金额")
    private double amount;

    @ApiModelProperty("备注")
    private String notice;

}
