package com.incognia.internal;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class pcn {
    public static int read;
    public static int serializer;
    public final YZr BGx;

    public pcn(YZr yZr, KWh kWh) {
        this.BGx = yZr;
    }

    public static int serializer() {
        int i = serializer;
        int i2 = i % 8603870;
        serializer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMyUid = Process.myUid();
        read = iMyUid;
        return iMyUid;
    }
}
