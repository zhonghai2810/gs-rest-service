package result;

import Entity.TianYanChaInfo;

public class TianYanChaResult extends Result{

    private TianYanChaInfo tianYanChaInfo;

    public TianYanChaResult(String code, TianYanChaInfo tianYanChaInfo) {
        super(code);
        this.tianYanChaInfo = tianYanChaInfo;
    }

    public TianYanChaResult(TianYanChaInfo tianYanChaInfo) {
        this.tianYanChaInfo = tianYanChaInfo;
    }

    public TianYanChaResult() {
    }

    /**
     * 返回天眼查信息
     * @return 天眼查信息
     */
    public TianYanChaInfo getTianYanChaInfo() {
        return tianYanChaInfo;
    }

    public void setTianYanChaInfo(TianYanChaInfo tianYanChaInfo) {
        this.tianYanChaInfo = tianYanChaInfo;
    }
}
