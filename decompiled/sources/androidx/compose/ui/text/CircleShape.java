package androidx.compose.ui.text;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
final class CircleShape implements Shape {
    public static final CircleShape INSTANCE = new CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public Outline mo24createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float fM545getMinDimensionimpl = Size.m545getMinDimensionimpl(j) / 2.0f;
        long jM431constructorimpl = CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fM545getMinDimensionimpl)) & 4294967295L) | (Float.floatToRawIntBits(fM545getMinDimensionimpl) << 32));
        return new Outline.Rounded(RoundRectKt.m529RoundRectZAM2FJo(SizeKt.m567toRectuvyYCjk(j), jM431constructorimpl, jM431constructorimpl, jM431constructorimpl, jM431constructorimpl));
    }
}
