package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;

/* JADX INFO: loaded from: classes.dex */
public final class IntRectKt {
    /* JADX INFO: renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m3833IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m3801getXimpl(j), IntOffset.m3802getYimpl(j), IntOffset.m3801getXimpl(j2), IntOffset.m3802getYimpl(j2));
    }

    /* JADX INFO: renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m3834IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m3801getXimpl(j), IntOffset.m3802getYimpl(j), IntOffset.m3801getXimpl(j) + ((int) (j2 >> 32)), IntOffset.m3802getYimpl(j) + ((int) (j2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m3835IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m3801getXimpl(j) - i, IntOffset.m3802getYimpl(j) - i, IntOffset.m3801getXimpl(j) + i, IntOffset.m3802getYimpl(j) + i);
    }

    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
