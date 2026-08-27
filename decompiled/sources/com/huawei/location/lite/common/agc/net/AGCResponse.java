package com.huawei.location.lite.common.agc.net;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.location.lite.common.http.response.BaseResponse;

/* JADX INFO: loaded from: classes2.dex */
public class AGCResponse extends BaseResponse {

    @SerializedName("expireTime")
    private long expireTime;

    @SerializedName("token")
    private String token;

    public long getExpireTime() {
        return this.expireTime;
    }

    public String getToken() {
        return this.token;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setToken(String str) {
        this.token = str;
    }

    @Override // com.huawei.location.lite.common.http.response.BaseResponse
    public String getApiCode() {
        return String.valueOf(this.code);
    }

    @Override // com.huawei.location.lite.common.http.response.BaseResponse
    public boolean isSuccess() {
        return TextUtils.equals(this.code, "0");
    }
}
