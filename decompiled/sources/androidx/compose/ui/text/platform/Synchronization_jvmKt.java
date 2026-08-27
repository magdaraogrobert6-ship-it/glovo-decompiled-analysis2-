package androidx.compose.ui.text.platform;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class Synchronization_jvmKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m3351synchronized(SynchronizedObject synchronizedObject, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        R r;
        synchronized (synchronizedObject) {
            r = (R) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        return r;
    }

    public static final SynchronizedObject makeSynchronizedObject(Object obj) {
        return new SynchronizedObject();
    }

    public static /* synthetic */ SynchronizedObject makeSynchronizedObject$default(Object obj, int i, Object obj2) {
        return new SynchronizedObject();
    }
}
