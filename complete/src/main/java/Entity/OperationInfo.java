package Entity;

public class OperationInfo {

    private double saleAmount; // 销售金额

    private int saleOrderCount; // 销售订单数

    private double averageAmountOfOrders; // 平均每笔订单金额

    private double purchaseAmount; // 采购金额

    private int purchaseOrderCount; // 采购订单数

    private double averageAmountOfPurchases; // 平均每笔采购金额

    private double rateOfGrossProfit; // 毛利率

    public OperationInfo(double saleAmount, int saleOrderCount, double averageAmountOfOrders, double purchaseAmount, int purchaseOrderCount, double averageAmountOfPurchases, double rateOfGrossProfit) {
        this.saleAmount = saleAmount;
        this.saleOrderCount = saleOrderCount;
        this.averageAmountOfOrders = averageAmountOfOrders;
        this.purchaseAmount = purchaseAmount;
        this.purchaseOrderCount = purchaseOrderCount;
        this.averageAmountOfPurchases = averageAmountOfPurchases;
        this.rateOfGrossProfit = rateOfGrossProfit;
    }

    public OperationInfo() {
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public double getAverageAmountOfOrders() {
        return averageAmountOfOrders;
    }

    public void setAverageAmountOfOrders(double averageAmountOfOrders) {
        this.averageAmountOfOrders = averageAmountOfOrders;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public int getPurchaseOrderCount() {
        return purchaseOrderCount;
    }

    public void setPurchaseOrderCount(int purchaseOrderCount) {
        this.purchaseOrderCount = purchaseOrderCount;
    }

    public double getAverageAmountOfPurchases() {
        return averageAmountOfPurchases;
    }

    public void setAverageAmountOfPurchases(double averageAmountOfPurchases) {
        this.averageAmountOfPurchases = averageAmountOfPurchases;
    }

    public double getRateOfGrossProfit() {
        return rateOfGrossProfit;
    }

    public void setRateOfGrossProfit(double rateOfGrossProfit) {
        this.rateOfGrossProfit = rateOfGrossProfit;
    }
}
