package androidx.compose.ui.graphics;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void requirePrecondition(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (z) {
            return;
        }
        throwIllegalArgumentException((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }
}
