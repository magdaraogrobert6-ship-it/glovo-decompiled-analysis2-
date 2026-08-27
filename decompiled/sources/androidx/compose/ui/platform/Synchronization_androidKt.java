package androidx.compose.ui.platform;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class Synchronization_androidKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m2785synchronized(Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        R r;
        synchronized (obj) {
            r = (R) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        return r;
    }

    public static final Object makeSynchronizedObject(Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object makeSynchronizedObject$default(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }
}
