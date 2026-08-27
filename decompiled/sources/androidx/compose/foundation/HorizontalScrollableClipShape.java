package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalScrollableClipShape implements Shape {
    public static final HorizontalScrollableClipShape serializer = new HorizontalScrollableClipShape();

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public final Outline mo24createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float fMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(ClipScrollableContainerKt.read);
        return new Outline.Rectangle(new Rect(0.0f, -fMo42roundToPx0680j_4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo42roundToPx0680j_4));
    }
}
