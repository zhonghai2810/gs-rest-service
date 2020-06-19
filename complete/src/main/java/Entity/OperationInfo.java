package Entity;

import lombok.Data;

@Data
public class OperationInfo {

    private double saleAmount; // 销售金额

    private int saleOrderCount; // 销售订单数

    private double averageAmountOfOrders; // 平均每笔订单金额

    private double purchaseAmount; // 采购金额

    private int purchaseOrderCount; // 采购订单数

    private double averageAmountOfPurchases; // 平均每笔采购金额

    private double rateOfGrossProfit; // 毛利率

}
