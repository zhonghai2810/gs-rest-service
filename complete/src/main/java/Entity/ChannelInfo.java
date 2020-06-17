package Entity;

public class ChannelInfo extends TianYanChaInfo {

    /**
     * 电商平台
     */
    private String platformName;

    public ChannelInfo(String companyName, String telephone, String website, String email, String address, CommercialInfo commercialInfo, String platformName) {
        super(companyName, telephone, website, email, address, commercialInfo);
        this.platformName = platformName;
    }

    public ChannelInfo(String platformName) {
        this.platformName = platformName;
    }

    public ChannelInfo() {
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}
