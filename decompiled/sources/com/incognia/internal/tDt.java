package com.incognia.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tDt {
    public static final String BGx;
    public static final AtomicLong HQ;
    public static final PVI mbG;

    static {
        String str = (String) W4i.E.MediaSessionCompatResultReceiverWrapper();
        BGx = str;
        mbG = new PVI();
        Long lN = Ay.HQ.N(str);
        HQ = new AtomicLong(lN != null ? lN.longValue() : 0L);
    }
}
