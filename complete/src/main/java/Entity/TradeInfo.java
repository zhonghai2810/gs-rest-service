package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TradeInfo {

    private String productName;

    private String gvtCode;

    private int productCount;

    private double averagePurchaseOrSalePrice; // 平均采购（从供应商）或销售（在平台）价格

    private double amount;

    private String notice;

}
