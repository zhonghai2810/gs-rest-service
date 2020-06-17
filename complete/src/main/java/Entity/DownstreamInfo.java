package Entity;

public class DownstreamInfo {

    private ChannelInfo downstreamChannelInfo;

    private int skuCount;

    private int productSoldTotal;

    private double amountSoldTotal;

    public DownstreamInfo(int skuCount, int productSoldTotal, double amountSoldTotal, ChannelInfo downstreamChannelInfo) {
        this.skuCount = skuCount;
        this.productSoldTotal = productSoldTotal;
        this.amountSoldTotal = amountSoldTotal;
        this.downstreamChannelInfo = downstreamChannelInfo;
    }

    public DownstreamInfo() {
    }

    public int getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(int skuCount) {
        this.skuCount = skuCount;
    }

    public int getProductSoldTotal() {
        return productSoldTotal;
    }

    public void setProductSoldTotal(int productSoldTotal) {
        this.productSoldTotal = productSoldTotal;
    }

    public double getAmountSoldTotal() {
        return amountSoldTotal;
    }

    public void setAmountSoldTotal(double amountSoldTotal) {
        this.amountSoldTotal = amountSoldTotal;
    }

    public ChannelInfo getDownstreamChannelInfo() {
        return downstreamChannelInfo;
    }

    public void setDownstreamChannelInfo(ChannelInfo downstreamChannelInfo) {
        this.downstreamChannelInfo = downstreamChannelInfo;
    }
}
