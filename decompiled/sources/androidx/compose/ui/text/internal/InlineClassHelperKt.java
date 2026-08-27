package androidx.compose.ui.text.internal;

import o.DrawableTransformation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void checkPrecondition(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (z) {
            return;
        }
        throwIllegalStateException((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
    }

    public static final void requirePrecondition(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (z) {
            return;
        }
        throwIllegalArgumentException((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Void throwIllegalArgumentExceptionForNullCheck(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }

    public static final <T> T checkPreconditionNotNull(T t, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
        DrawableTransformation.read();
        return null;
    }

    public static final <T> T requirePreconditionNotNull(T t, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (t != null) {
            return t;
        }
        throwIllegalArgumentExceptionForNullCheck((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
        DrawableTransformation.read();
        return null;
    }
}
