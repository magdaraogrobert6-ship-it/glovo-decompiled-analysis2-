package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import o.copyWithScrollDeltaWithoutRemeasure;

/* JADX INFO: loaded from: classes.dex */
public abstract class BorderKt {
    public static final Modifier write(Modifier modifier, float f, SolidColor solidColor, Shape shape) {
        return modifier.then(new copyWithScrollDeltaWithoutRemeasure(f, solidColor, shape));
    }

    public static final Modifier write(Modifier modifier, float f, long j, Shape shape) {
        return write(modifier, f, new SolidColor(j, null), shape);
    }

    /* JADX INFO: renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m21shrinkKibmq7A(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L));
    }
}
