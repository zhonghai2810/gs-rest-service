package Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@ApiModel("风控分析结果")
public class AnalysisInfo {

    @ApiModelProperty(value = "量化风险水平")
    private float riskLevel;

    @ApiModelProperty(value = "分析结果")
    private String result;

    @ApiModelProperty(value = "信用评分")
    private float score;

    @ApiModelProperty(value = "历史逾期次数")
    private int overdueCount;

    @ApiModelProperty(value = "平均还清周期")
    private int averagePayOffPeriod;

    @ApiModelProperty(value = "平均借款周期")
    private int averageLoanPeriod;

    @ApiModelProperty(value = "贷款总金额")
    private double totalLoanAmount;

    @ApiModelProperty(value = "贷款订单数")
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
