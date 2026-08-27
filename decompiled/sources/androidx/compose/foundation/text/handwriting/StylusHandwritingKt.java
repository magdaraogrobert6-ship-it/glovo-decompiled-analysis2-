package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.TouchBoundsExpansionKt;
import androidx.compose.ui.unit.Dp;
import o.BiasAbsoluteAlignmentHorizontal;
import o.FrameRateCategoryCompanion;
import o.FrameRateKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class StylusHandwritingKt {
    public static final DpTouchBoundsExpansion RemoteActionCompatParcelizer;

    static {
        float fM3673constructorimpl = Dp.m3673constructorimpl(40.0f);
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(10.0f);
        RemoteActionCompatParcelizer = TouchBoundsExpansionKt.m2653DpTouchBoundsExpansiona9UjIt4(fM3673constructorimpl2, fM3673constructorimpl, fM3673constructorimpl2, fM3673constructorimpl);
    }

    public static final Modifier read(Modifier.Companion companion, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Modifier modifierStylusHoverIcon;
        if (!z) {
            return companion;
        }
        if (!FrameRateKt.RemoteActionCompatParcelizer) {
            modifierStylusHoverIcon = companion;
            return companion;
        }
        if (z2) {
            modifierStylusHoverIcon = PointerIconKt.stylusHoverIcon(companion, BiasAbsoluteAlignmentHorizontal.write, false, RemoteActionCompatParcelizer);
        }
        return modifierStylusHoverIcon.then(new FrameRateCategoryCompanion(r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }
}
