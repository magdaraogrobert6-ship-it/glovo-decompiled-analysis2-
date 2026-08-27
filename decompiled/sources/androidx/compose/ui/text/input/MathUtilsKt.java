package androidx.compose.ui.text.input;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? ((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).intValue() : i3;
    }

    public static final int subtractExactOrElse(int i, int i2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i3 = i - i2;
        return ((i ^ i2) & (i ^ i3)) < 0 ? ((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).intValue() : i3;
    }
}
