package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class EnableConsentReq implements IMessageEntity {

    @Packed
    private boolean enable;

    @Packed
    private String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConsentReq{packageName:");
        sb.append(this.packageName);
        sb.append(", enable:");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.enable, '}');
    }
}
