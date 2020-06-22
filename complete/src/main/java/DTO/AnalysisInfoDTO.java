package DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("风控分析数据")
public class AnalysisInfoDTO {

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
}
