package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowKt {
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f) {
        return new Shadow(ColorKt.m773lerpjxsXWHM(shadow.m1069getColor0d7_KjU(), shadow2.m1069getColor0d7_KjU(), f), OffsetKt.m500lerpWko1d7g(shadow.m1070getOffsetF1C5BW0(), shadow2.m1070getOffsetF1C5BW0(), f), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f), null);
    }
}
