package com.huawei.hms.location.api.request;

import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes4.dex */
public class BaseLocationReq {

    @Packed
    private String locTransactionId;

    @Packed
    private String packageName;

    public String getLocTransactionId() {
        return this.locTransactionId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setLocTransactionId(String str) {
        this.locTransactionId = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
