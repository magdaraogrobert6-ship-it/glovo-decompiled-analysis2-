package com.incognia.internal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JY {
    public static final AtomicReference BGx = new AtomicReference(Qv.BGx);
    public static final CopyOnWriteArraySet mbG = new CopyOnWriteArraySet();

    public static void BGx(SjD sjD) {
        BGx.set(sjD);
        Iterator it = mbG.iterator();
        while (it.hasNext()) {
            ((AKA) it.next()).BGx(sjD);
        }
    }
}
