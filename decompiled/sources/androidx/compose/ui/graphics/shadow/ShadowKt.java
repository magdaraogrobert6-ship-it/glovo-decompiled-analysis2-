package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Interpolatable;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ShadowKt {
    public static final Shadow lerpNonNull(Shadow shadow, Shadow shadow2, float f) {
        float fM3716lerpMdfbLM = DpKt.m3716lerpMdfbLM(shadow.m1450getRadiusD9Ej5fM(), shadow2.m1450getRadiusD9Ej5fM(), f);
        float fM3716lerpMdfbLM2 = DpKt.m3716lerpMdfbLM(shadow.m1451getSpreadD9Ej5fM(), shadow2.m1451getSpreadD9Ej5fM(), f);
        long jM3717lerpxhh869w = DpKt.m3717lerpxhh869w(shadow.m1449getOffsetRKDOV3M(), shadow2.m1449getOffsetRKDOV3M(), f);
        long jM773lerpjxsXWHM = ColorKt.m773lerpjxsXWHM(shadow.m1448getColor0d7_KjU(), shadow2.m1448getColor0d7_KjU(), f);
        Object objLerp = Interpolatable.Companion.lerp(shadow.getBrush(), shadow2.getBrush(), f);
        return new Shadow(fM3716lerpMdfbLM, fM3716lerpMdfbLM2, jM3717lerpxhh869w, jM773lerpjxsXWHM, objLerp instanceof Brush ? (Brush) objLerp : null, MathHelpersKt.lerp(shadow.getAlpha(), shadow2.getAlpha(), f), f < 0.5f ? shadow.m1447getBlendMode0nO6VwU() : shadow2.m1447getBlendMode0nO6VwU(), (DefaultConstructorMarker) null);
    }

    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f) {
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow == null) {
            shadow2.getClass();
            return lerpNonNull(shadow2.transparentCopy$ui_graphics(), shadow2, f);
        }
        if (shadow2 == null) {
            return lerpNonNull(shadow, shadow.transparentCopy$ui_graphics(), f);
        }
        return lerpNonNull(shadow, shadow2, f);
    }
}
