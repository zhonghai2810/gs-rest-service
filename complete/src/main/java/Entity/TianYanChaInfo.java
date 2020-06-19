package Entity;

import lombok.Data;

/**
 * 天眼查信息
 */
@Data
public class TianYanChaInfo {

    private String companyName;

    private String telephone;

    private String website;

    private String email;

    private String address;

    private CommercialInfo commercialInfo;
}
