package Entity;

import lombok.Data;

@Data
public class DownstreamInfo {

    private ChannelInfo downstreamChannelInfo;

    private int skuCount;

    private int productSoldTotal;

    private double amountSoldTotal;

}
