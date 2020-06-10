package com.gvt.riskservice;

public class AnalysisResult {
    private float riskLevel;
    private String result;
    private String code;
    private String msg;

    public AnalysisResult(String resultCode, float riskLevel, String result){
        ResponseEnum responseEnum = ResponseEnum.getEnum(resultCode);
        this.riskLevel = riskLevel;
        this.result = result;
        this.code = responseEnum.getCode();
        this.msg = responseEnum.getMsg();
    }

    public AnalysisResult(String resultCode){
        ResponseEnum responseEnum = ResponseEnum.getEnum(resultCode);
        this.riskLevel = 0;
        this.result = null;
        this.code = responseEnum.getCode();
        this.msg = responseEnum.getMsg();
    }

    public float getRiskLevel() {
        return riskLevel;
    }

    public String getResult() {
        return result;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    enum Result{
        ACCEPT,
        REFUSE
    }
}
