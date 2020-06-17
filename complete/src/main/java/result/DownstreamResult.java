package result;

import Entity.TradeInfo;

import java.util.List;
import java.util.Map;

public class DownstreamResult extends Result{

    private List<Map<String, List<TradeInfo>>> downstreamInfos;

    public DownstreamResult(String code, String msg, List<Map<String, List<TradeInfo>>> downstreamInfos) {
        super(code, msg);
        this.downstreamInfos = downstreamInfos;
    }

    public DownstreamResult(String code, List<Map<String, List<TradeInfo>>> downstreamInfos) {
        super(code);
        this.downstreamInfos = downstreamInfos;
    }

    public DownstreamResult(List<Map<String, List<TradeInfo>>> downstreamInfos) {
        this.downstreamInfos = downstreamInfos;
    }

    public DownstreamResult() {
    }

    public List<Map<String, List<TradeInfo>>> getDownstreamInfos() {
        return downstreamInfos;
    }

    public void setDownstreamInfos(List<Map<String, List<TradeInfo>>> downstreamInfos) {
        this.downstreamInfos = downstreamInfos;
    }
}
