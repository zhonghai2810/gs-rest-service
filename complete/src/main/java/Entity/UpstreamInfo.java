package Entity;

import lombok.Data;

@Data
public class UpstreamInfo {

    private TianYanChaInfo upstreamSupplierInfo;

    private int paymentPeriod;

    private int averageDeliveryTime;

    private double purchaseAmount;

}
