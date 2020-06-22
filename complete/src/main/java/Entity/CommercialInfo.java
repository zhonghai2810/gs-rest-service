package Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 天眼查-工商信息板块
 */
@Data
@ApiModel("工商信息")
public class CommercialInfo {

    @ApiModelProperty("公司名称")
    private String companyName;

    @ApiModelProperty("法定代表人")
    private String legalRepresentative; // 法定代表人

    @ApiModelProperty("注册资本")
    private String registeredCapital; // 注册资本

    @ApiModelProperty("实缴资本")
    private String paidUpCapital; // 实缴资本

    @ApiModelProperty("成立日期")
    private String fundDate; // 成立日期

    @ApiModelProperty("经营状态")
    private String operationStatus; // 经营状态

    @ApiModelProperty("统一社会信用代码")
    private String USCC; // 统一社会信用代码

    @ApiModelProperty("工商注册号")
    private String businessRegistrationNo; // 工商注册号

    @ApiModelProperty("纳税人识别号")
    private String taxRegistrationNo; // 纳税人识别号

    @ApiModelProperty("组织机构代码")
    private String organizationNo; // 组织机构代码

    @ApiModelProperty("公司类型")
    private String companyType; // 公司类型

    @ApiModelProperty("行业")
    private String businessIndustry; // 行业

    @ApiModelProperty("核准日期")
    private String auditDate; // 核准日期

    @ApiModelProperty("登记机关")
    private String registrationDepartment; //登记机关

    @ApiModelProperty("营业期限")
    private String businessTerm; // 营业期限

    @ApiModelProperty("纳税人资质")
    private String taxPayerQualification; // 纳税人资质

    @ApiModelProperty("人员规模")
    private String employeeSize; // 人员规模

    @ApiModelProperty("参保人数")
    private int insuredEmployeeSize; // 参保人数

    @ApiModelProperty("曾用名")
    private String oldCompanyName; // 曾用名

    @ApiModelProperty("英文名称")
    private String englishName; // 英文名称

    @ApiModelProperty("经营范围")
    private String businessScope; // 经营范围

}
