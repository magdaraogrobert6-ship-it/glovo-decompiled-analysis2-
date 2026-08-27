package com.huawei.hms.locationSdk;

/* JADX INFO: loaded from: classes2.dex */
public class c1 extends v1 {
    private static volatile c1 b;
    private static final byte[] c = new byte[0];

    public static c1 b() {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    b = new c1();
                }
            }
        }
        return b;
    }
}
