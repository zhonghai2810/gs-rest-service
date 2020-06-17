package Entity;

public class TradeInfo {

    private String productName;

    private String gvtCode;

    private int productCount;

    private double averagePurchaseOrSalePrice; // 平均采购（从供应商）或销售（在平台）价格

    private double amount;

    private String notice;

    public TradeInfo(String productName, String gvtCode, int productCount, double averagePurchaseOrSalePrice, double amount, String notice) {
        this.productName = productName;
        this.gvtCode = gvtCode;
        this.productCount = productCount;
        this.averagePurchaseOrSalePrice = averagePurchaseOrSalePrice;
        this.amount = amount;
        this.notice = notice;
    }

    public TradeInfo() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getGvtCode() {
        return gvtCode;
    }

    public void setGvtCode(String gvtCode) {
        this.gvtCode = gvtCode;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public double getAveragePurchaseOrSalePrice() {
        return averagePurchaseOrSalePrice;
    }

    public void setAveragePurchaseOrSalePrice(double averagePurchaseOrSalePrice) {
        this.averagePurchaseOrSalePrice = averagePurchaseOrSalePrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
