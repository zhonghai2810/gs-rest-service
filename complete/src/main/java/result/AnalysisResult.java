package result;

import Entity.AnalysisInfo;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnalysisResult extends Result {

    private AnalysisInfo analysisInfo;

    public AnalysisResult(String code, String msg, AnalysisInfo analysisInfo) {
        super(code, msg);
        this.analysisInfo = analysisInfo;
    }

    public AnalysisResult(String code, AnalysisInfo analysisInfo) {
        super(code);
        this.analysisInfo = analysisInfo;
    }

}
