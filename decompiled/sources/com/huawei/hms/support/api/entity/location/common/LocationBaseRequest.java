package com.huawei.hms.support.api.entity.location.common;

import android.content.Context;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class LocationBaseRequest implements IMessageEntity {

    @Packed
    private String locTransactionId;

    @Packed
    private String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    public String getTid() {
        return this.locTransactionId;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setTid(String str) {
        this.locTransactionId = str;
    }

    public LocationBaseRequest(Context context) {
        this.locTransactionId = UUID.randomUUID().toString();
        this.packageName = context.getPackageName();
    }

    public LocationBaseRequest() {
    }
}
