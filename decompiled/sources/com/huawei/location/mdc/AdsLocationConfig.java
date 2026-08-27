package com.huawei.location.mdc;

import com.google.gson.annotations.SerializedName;
import com.huawei.location.lite.common.config.ConfigBaseResponse;

/* JADX INFO: loaded from: classes2.dex */
public class AdsLocationConfig extends ConfigBaseResponse {

    @SerializedName("MdcEnable")
    private boolean mdcEnable = true;

    public boolean isMdcEnable() {
        return this.mdcEnable;
    }

    public void setMdcEnable(boolean z) {
        this.mdcEnable = z;
    }
}
