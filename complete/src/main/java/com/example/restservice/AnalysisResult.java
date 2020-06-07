package com.example.restservice;

public class AnalysisResult {
    private float riskLevel;
    private String result;

    public AnalysisResult(float riskLevel, String result){
        this.riskLevel = riskLevel;
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public float getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(float riskLevel) {
        this.riskLevel = riskLevel;
    }

    enum Result{
        ACCEPT,
        REFUSE
    }



}
