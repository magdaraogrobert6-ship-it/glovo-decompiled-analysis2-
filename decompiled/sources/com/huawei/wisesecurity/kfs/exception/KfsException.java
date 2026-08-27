package com.huawei.wisesecurity.kfs.exception;

import o.accessgetSwitchcp;

/* JADX INFO: loaded from: classes2.dex */
public class KfsException extends Exception {
    public final int IconCompatParcelizer;

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("[errorCode:");
        sbIconCompatParcelizer.append(this.IconCompatParcelizer);
        sbIconCompatParcelizer.append(" message:");
        sbIconCompatParcelizer.append(getMessage());
        sbIconCompatParcelizer.append("]");
        return sbIconCompatParcelizer.toString();
    }

    public KfsException(String str) {
        super(str);
        this.IconCompatParcelizer = 100001;
    }
}
