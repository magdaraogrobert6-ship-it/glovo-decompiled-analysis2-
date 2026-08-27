package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oV {
    public static final AtomicReference BGx = new AtomicReference();

    public static YV mbG() {
        YV yv = (YV) BGx.get();
        if (yv != null) {
            return yv;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("No Dependency Container found");
        return null;
    }

    public static Hwl BGx() {
        return ((Jz) mbG()).e;
    }
}
