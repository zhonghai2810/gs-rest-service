package result;

import Entity.TradeInfo;
import Entity.UpstreamInfo;

import java.util.List;
import java.util.Map;

public class UpstreamResult extends Result{

    private List<Map<String, List<TradeInfo>>> upstreamInfos;

    public UpstreamResult(String code, String msg, List<Map<String, List<TradeInfo>>> upstreamInfos) {
        super(code, msg);
        this.upstreamInfos = upstreamInfos;
    }

    public UpstreamResult(String code, List<Map<String, List<TradeInfo>>> upstreamInfos) {
        super(code);
        this.upstreamInfos = upstreamInfos;
    }

    public UpstreamResult(List<Map<String, List<TradeInfo>>> upstreamInfos) {
        this.upstreamInfos = upstreamInfos;
    }

    public UpstreamResult() {
    }

    public List<Map<String, List<TradeInfo>>> getUpstreamInfos() {
        return upstreamInfos;
    }

    public void setUpstreamInfos(List<Map<String, List<TradeInfo>>> upstreamInfos) {
        this.upstreamInfos = upstreamInfos;
    }
}
