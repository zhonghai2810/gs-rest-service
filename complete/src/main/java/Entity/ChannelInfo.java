package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChannelInfo extends TianYanChaInfo {

    /**
     * 电商平台
     */
    private String platformName;
}
