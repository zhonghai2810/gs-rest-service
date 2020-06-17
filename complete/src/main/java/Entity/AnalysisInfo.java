package Entity;

public class AnalysisInfo {

    private float riskLevel;
    private String result;

    public AnalysisInfo(float riskLevel, String result) {
        this.riskLevel = riskLevel;
        this.result = result;
    }

    public AnalysisInfo() {
    }

    public float getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(float riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public enum Result{
        ACCEPT,
        REFUSE
    }
}
