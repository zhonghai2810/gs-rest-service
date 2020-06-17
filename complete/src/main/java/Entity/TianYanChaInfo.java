package Entity;

/**
 * 天眼查信息
 */
public class TianYanChaInfo {
    public TianYanChaInfo(String companyName, String telephone, String website, String email, String address, CommercialInfo commercialInfo) {
        this.companyName = companyName;
        this.telephone = telephone;
        this.website = website;
        this.email = email;
        this.address = address;
        this.commercialInfo = commercialInfo;
    }

    private String companyName;

    private String telephone;

    private String website;

    private String email;

    private String address;

    private CommercialInfo commercialInfo;

    public TianYanChaInfo() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CommercialInfo getCommercialInfo() {
        return commercialInfo;
    }

    public void setCommercialInfo(CommercialInfo commercialInfo) {
        this.commercialInfo = commercialInfo;
    }
}
