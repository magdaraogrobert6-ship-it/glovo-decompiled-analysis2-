package com.huawei.location.lite.common.http.response;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseResponse {

    @SerializedName(alternate = {"code", "returnCode"}, value = "errorCode")
    public String code;

    @SerializedName(alternate = {"message", "returnDesc"}, value = "errorMsg")
    public String msg;

    public abstract String getApiCode();

    public String getMsg() {
        return this.msg;
    }

    public boolean isSuccess() {
        return "0".equals(this.code);
    }
}
