package androidx.compose.foundation.text.modifiers;

/* JADX INFO: loaded from: classes.dex */
public abstract class InlineDensity {
    public static final long read = m104constructorimpl(Float.NaN, Float.NaN);
    public static final /* synthetic */ int write = 0;

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m105toStringimpl(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m104constructorimpl(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }
}
