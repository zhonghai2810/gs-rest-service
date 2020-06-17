package Entity;


public class UpstreamInfo {

    private TianYanChaInfo upstreamSupplierInfo;

    private int paymentPeriod;

    private int averageDeliveryTime;

    private double purchaseAmount;

    public UpstreamInfo(TianYanChaInfo upstreamSupplierInfo, int paymentPeriod, int averageDeliveryTime, double purchaseAmount) {
        this.upstreamSupplierInfo = upstreamSupplierInfo;
        this.paymentPeriod = paymentPeriod;
        this.averageDeliveryTime = averageDeliveryTime;
        this.purchaseAmount = purchaseAmount;
    }

    public UpstreamInfo() {
    }

    public TianYanChaInfo getUpstreamSupplierInfo() {
        return upstreamSupplierInfo;
    }

    public void setUpstreamSupplierInfo(TianYanChaInfo upstreamSupplierInfo) {
        this.upstreamSupplierInfo = upstreamSupplierInfo;
    }

    public int getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(int paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public int getAverageDeliveryTime() {
        return averageDeliveryTime;
    }

    public void setAverageDeliveryTime(int averageDeliveryTime) {
        this.averageDeliveryTime = averageDeliveryTime;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
