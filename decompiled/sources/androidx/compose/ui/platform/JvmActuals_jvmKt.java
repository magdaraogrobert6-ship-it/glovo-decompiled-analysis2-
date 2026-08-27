package androidx.compose.ui.platform;

import java.util.Arrays;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class JvmActuals_jvmKt {
    public static final Object nativeClass(Object obj) {
        return obj.getClass();
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m2747synchronized(Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        R r;
        synchronized (obj) {
            r = (R) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        return r;
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        return str + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }
}
