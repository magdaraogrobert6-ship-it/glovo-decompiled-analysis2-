package com.huawei.hms.api;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class UserRecoverableException extends Exception {
    private final Intent mIntent;

    public Intent getIntent() {
        return new Intent(this.mIntent);
    }

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.mIntent = intent;
    }
}
