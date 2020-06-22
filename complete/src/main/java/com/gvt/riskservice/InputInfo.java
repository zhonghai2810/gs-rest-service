package com.gvt.riskservice;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class InputInfo {

    @ApiModelProperty(value = "授权令牌")
    private String token;

    public InputInfo(String token) {
        this.token = token;
    }

    public InputInfo() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
