package Entity;
import lombok.Data;


/**
 * 天眼查-工商信息板块
 */
@Data
public class CommercialInfo {

    private String companyName;

    private String legalRepresentative; // 法定代表人

    private String registeredCapital; // 注册资本

    private String paidUpCapital; // 实缴资本

    private String fundDate; // 成立日期

    private String operationStatus; // 经营状态

    private String USCC; // 统一社会信用代码

    private String businessRegistrationNo; // 工商注册号

    private String taxRegistrationNo; // 纳税人识别号

    private String organizationNo; // 组织机构代码

    private String companyType; // 公司类型

    private String businessIndustry; // 行业

    private String auditDate; // 核准日期

    private String registrationDepartment; //登记机关

    private String businessTerm; // 营业期限

    private String taxPayerQualification; // 纳税人资质

    private String employeeSize; // 人员规模

    private int insuredEmployeeSize; // 参保人数

    private String oldCompanyName; // 曾用名

    private String englishName; // 英文名称

    private String businessScope; // 经营范围

}
