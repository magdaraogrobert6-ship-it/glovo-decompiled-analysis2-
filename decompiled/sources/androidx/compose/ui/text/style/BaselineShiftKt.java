package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class BaselineShiftKt {
    /* JADX INFO: renamed from: isSpecified-4Dl_Bck, reason: not valid java name */
    public static final boolean m3388isSpecified4Dl_Bck(float f) {
        return !Float.isNaN(f);
    }

    /* JADX INFO: renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m3389lerpjWV1Mfo(float f, float f2, float f3) {
        return BaselineShift.m3374constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* JADX INFO: renamed from: takeOrElse-JpAxnlU, reason: not valid java name */
    public static final float m3390takeOrElseJpAxnlU(float f, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return Float.isNaN(f) ? ((BaselineShift) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m3379unboximpl() : f;
    }
}
