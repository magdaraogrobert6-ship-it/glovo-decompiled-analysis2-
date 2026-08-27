package androidx.compose.ui.geometry;

/* JADX INFO: loaded from: classes.dex */
public final class MutableRectKt {
    public static final Rect toRect(MutableRect mutableRect) {
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }

    /* JADX INFO: renamed from: MutableRect-0a9Yr6o, reason: not valid java name */
    public static final MutableRect m463MutableRect0a9Yr6o(long j, long j2) {
        return new MutableRect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: MutableRect-3MmeM6k, reason: not valid java name */
    public static final MutableRect m464MutableRect3MmeM6k(long j, float f) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new MutableRect(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    /* JADX INFO: renamed from: MutableRect-tz77jQw, reason: not valid java name */
    public static final MutableRect m465MutableRecttz77jQw(long j, long j2) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        return new MutableRect(fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (j2 >> 32)) + fIntBitsToFloat3, Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }
}
