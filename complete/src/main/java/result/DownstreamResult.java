package result;

import Entity.TradeInfo;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
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

}
