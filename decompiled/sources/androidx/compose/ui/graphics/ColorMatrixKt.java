package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorMatrixKt {
    /* JADX INFO: renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m802dotMe4OoYI(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 5;
        float f = fArr[i3];
        float f2 = fArr2[i2];
        float f3 = fArr[i3 + 1];
        float f4 = fArr2[i2 + 5];
        return (fArr[i3 + 3] * fArr2[i2 + 15]) + (fArr[i3 + 2] * fArr2[i2 + 10]) + (f3 * f4) + (f * f2);
    }
}
