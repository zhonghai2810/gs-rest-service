package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnalysisInfo {

    private float riskLevel;
    private String result;
    private float score;
    private int overdueCount;
    private int averagePayOffPeriod;
    private int averageLoanPeriod;
    private double totalLoanAmount;
    private int loanOrders;

    public AnalysisInfo(float riskLevel, String result, float score, int overdueCount, int averagePayOffPeriod, int averageLoanPeriod, double totalLoanAmount, int loanOrders) {
        this.riskLevel = riskLevel;
        this.result = result;
        this.score = score;
        this.overdueCount = overdueCount;
        this.averagePayOffPeriod = averagePayOffPeriod;
        this.averageLoanPeriod = averageLoanPeriod;
        this.totalLoanAmount = totalLoanAmount;
        this.loanOrders = loanOrders;
    }

    public AnalysisInfo(float riskLevel, String result) {
        this.riskLevel = riskLevel;
        this.result = result;
    }

    public enum Result{
        ACCEPT,
        REFUSE
    }
}
