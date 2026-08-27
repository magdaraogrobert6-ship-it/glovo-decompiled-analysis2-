package com.huawei.hms.location.api.request;

import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes4.dex */
public class RemoveActivityConversionReq extends BaseLocationReq {

    @Packed
    private String moduleName;

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String str) {
        this.moduleName = str;
    }
}
