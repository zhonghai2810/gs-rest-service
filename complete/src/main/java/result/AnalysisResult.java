package result;

import Entity.AnalysisInfo;

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

    public AnalysisResult(AnalysisInfo analysisInfo) {
        this.analysisInfo = analysisInfo;
    }



    public AnalysisResult() {
    }

    public AnalysisInfo getAnalysisInfo() {
        return analysisInfo;
    }

    public void setAnalysisInfo(AnalysisInfo analysisInfo) {
        this.analysisInfo = analysisInfo;
    }
}
