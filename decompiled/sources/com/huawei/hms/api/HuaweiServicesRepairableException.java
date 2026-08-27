package com.huawei.hms.api;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class HuaweiServicesRepairableException extends UserRecoverableException {
    private final int statusCode;

    public int getConnectionStatusCode() {
        return this.statusCode;
    }

    public HuaweiServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.statusCode = i;
    }
}
