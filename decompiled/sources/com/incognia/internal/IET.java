package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IET {
    public static final boolean BGx(Gbn gbn, Ms ms) {
        double d = gbn.BGx;
        if (-90.0d > d || d > 90.0d) {
            return false;
        }
        double d2 = gbn.mbG;
        return -180.0d <= d2 && d2 <= 180.0d && ((Boolean) ms.mbG.invoke(gbn)).booleanValue() && ((Boolean) ms.BGx.invoke(gbn)).booleanValue() && ((Boolean) ms.HQ.invoke(gbn)).booleanValue();
    }
}
