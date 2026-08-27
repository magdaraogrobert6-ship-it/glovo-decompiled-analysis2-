package com.incognia.internal;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class yZI {
    public static final String N = (String) W4i.s.MediaSessionCompatResultReceiverWrapper();
    public final AtomicReference BGx = new AtomicReference(Ay.BGx.mbG(N));
    public final CopyOnWriteArraySet HQ = new CopyOnWriteArraySet();
    public final boolean mbG;

    public final boolean BGx() {
        Boolean bool = (Boolean) this.BGx.get();
        return bool != null ? bool.booleanValue() : this.mbG;
    }

    public yZI(VOk vOk) {
        this.mbG = vOk.HQ;
    }
}
