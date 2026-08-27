package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidColor_androidKt {
    /* JADX INFO: renamed from: toColorLong-8_81llA, reason: not valid java name */
    public static final long m585toColorLong8_81llA(long j) {
        long j2 = 63 & j;
        return Long.compareUnsigned(j2, 16L) < 0 ? j : (j & (-64)) | (j2 - 1);
    }

    public static final long fromColorLong(Color.Companion companion, long j) {
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        return Color.m718constructorimpl(j);
    }
}
