package com.huawei.location.lite.common.config;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.location.lite.common.http.response.BaseResponse;
import java.util.ArrayList;
import o.accessgetAddedToLifecyclep;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigResponseData extends BaseResponse {

    @SerializedName(RemoteMessageConst.DATA)
    private ArrayList<accessgetAddedToLifecyclep> data;

    public ArrayList<accessgetAddedToLifecyclep> getData() {
        return this.data;
    }

    @Override // com.huawei.location.lite.common.http.response.BaseResponse
    public String getApiCode() {
        return String.valueOf(this.code);
    }

    @Override // com.huawei.location.lite.common.http.response.BaseResponse
    public boolean isSuccess() {
        return TextUtils.equals(this.code, "0") || TextUtils.isEmpty(this.code);
    }
}
