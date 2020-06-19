package result;

import Entity.TianYanChaInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TianYanChaResult extends Result{

    private TianYanChaInfo tianYanChaInfo;

    public TianYanChaResult(String code, TianYanChaInfo tianYanChaInfo) {
        super(code);
        this.tianYanChaInfo = tianYanChaInfo;
    }

    /**
     * 返回天眼查信息
     * @return 天眼查信息
     */
//    public TianYanChaInfo getTianYanChaInfo() {
//        return tianYanChaInfo;
//    }

}
