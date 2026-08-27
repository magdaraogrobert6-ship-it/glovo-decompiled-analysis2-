package com.incognia.internal;

import com.incognia.Incognia$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fFk {
    public static final void BGx(UsU usU, Runnable runnable) {
        if (runnable != null) {
            usU.BGx(new Incognia$$ExternalSyntheticLambda0(7, runnable));
        }
    }

    public static Executor BGx(UsU usU) {
        return new fFk$$ExternalSyntheticLambda0(0, usU);
    }

    public static final void BGx(Runnable runnable) {
        runnable.run();
    }
}
