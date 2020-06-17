package Entity;

import java.util.Date;

/**
 * 天眼查-工商信息板块
 */
public class CommercialInfo {

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

    public CommercialInfo(String legalRepresentative, String registeredCapital, String  paidUpCapital, String fundDate, String operationStatus, String USCC, String businessRegistrationNo, String taxRegistrationNo, String organizationNo, String companyType, String businessIndustry, String auditDate, String registrationDepartment, String businessTerm, String taxPayerQualification, String employeeSize, int insuredEmployeeSize, String oldCompanyName, String englishName, String businessScope) {
        this.legalRepresentative = legalRepresentative;
        this.registeredCapital = registeredCapital;
        this.paidUpCapital = paidUpCapital;
        this.fundDate = fundDate;
        this.operationStatus = operationStatus;
        this.USCC = USCC;
        this.businessRegistrationNo = businessRegistrationNo;
        this.taxRegistrationNo = taxRegistrationNo;
        this.organizationNo = organizationNo;
        this.companyType = companyType;
        this.businessIndustry = businessIndustry;
        this.auditDate = auditDate;
        this.registrationDepartment = registrationDepartment;
        this.businessTerm = businessTerm;
        this.taxPayerQualification = taxPayerQualification;
        this.employeeSize = employeeSize;
        this.insuredEmployeeSize = insuredEmployeeSize;
        this.oldCompanyName = oldCompanyName;
        this.englishName = englishName;
        this.businessScope = businessScope;
    }


    public CommercialInfo() {
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String  getPaidUpCapital() {
        return paidUpCapital;
    }

    public void setPaidUpCapital(String paidUpCapital) {
        this.paidUpCapital = paidUpCapital;
    }

    public String getFundDate() {
        return fundDate;
    }

    public void setFundDate(String fundDate) {
        this.fundDate = fundDate;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getUSCC() {
        return USCC;
    }

    public void setUSCC(String USCC) {
        this.USCC = USCC;
    }

    public String getBusinessRegistrationNo() {
        return businessRegistrationNo;
    }

    public void setBusinessRegistrationNo(String businessRegistrationNo) {
        this.businessRegistrationNo = businessRegistrationNo;
    }

    public String getTaxRegistrationNo() {
        return taxRegistrationNo;
    }

    public void setTaxRegistrationNo(String taxRegistrationNo) {
        this.taxRegistrationNo = taxRegistrationNo;
    }

    public String getOrganizationNo() {
        return organizationNo;
    }

    public void setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getBusinessIndustry() {
        return businessIndustry;
    }

    public void setBusinessIndustry(String businessIndustry) {
        this.businessIndustry = businessIndustry;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }

    public String getRegistrationDepartment() {
        return registrationDepartment;
    }

    public void setRegistrationDepartment(String registrationDepartment) {
        this.registrationDepartment = registrationDepartment;
    }

    public String getBusinessTerm() {
        return businessTerm;
    }

    public void setBusinessTerm(String businessTerm) {
        this.businessTerm = businessTerm;
    }

    public String getTaxPayerQualification() {
        return taxPayerQualification;
    }

    public void setTaxPayerQualification(String taxPayerQualification) {
        this.taxPayerQualification = taxPayerQualification;
    }

    public String getEmployeeSize() {
        return employeeSize;
    }

    public void setEmployeeSize(String employeeSize) {
        this.employeeSize = employeeSize;
    }

    public int getInsuredEmployeeSize() {
        return insuredEmployeeSize;
    }

    public void setInsuredEmployeeSize(int insuredEmployeeSize) {
        this.insuredEmployeeSize = insuredEmployeeSize;
    }

    public String getOldCompanyName() {
        return oldCompanyName;
    }

    public void setOldCompanyName(String oldCompanyName) {
        this.oldCompanyName = oldCompanyName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }
}
