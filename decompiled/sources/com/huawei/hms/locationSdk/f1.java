package com.huawei.hms.locationSdk;

/* JADX INFO: loaded from: classes2.dex */
public class f1 extends v1 {
    private static volatile f1 b;
    private static final byte[] c = new byte[0];

    public static f1 b() {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    b = new f1();
                }
            }
        }
        return b;
    }
}
