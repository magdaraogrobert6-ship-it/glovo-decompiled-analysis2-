package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: classes.dex */
public final class IntSizeKt {
    /* JADX INFO: renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m3851getCenterozmzZPI$annotations(long j) {
    }

    /* JADX INFO: renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m3853timesO0kMr_c(int i, long j) {
        return IntSize.m3846timesYEO4UFw(j, i);
    }

    /* JADX INFO: renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m3854toIntRectozmzZPI(long j) {
        return IntRectKt.m3834IntRectVbeCjmY(IntOffset.Companion.m3812getZeronOccac(), j);
    }

    /* JADX INFO: renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m3852roundToIntSizeuvyYCjk(long j) {
        return IntSize.m3839constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }

    /* JADX INFO: renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m3855toIntSizeuvyYCjk(long j) {
        return IntSize.m3839constructorimpl((((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }

    public static final long IntSize(int i, int i2) {
        return IntSize.m3839constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* JADX INFO: renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m3856toSizeozmzZPI(long j) {
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
    }

    /* JADX INFO: renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m3850getCenterozmzZPI(long j) {
        return IntOffset.m3795constructorimpl(((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L));
    }
}
