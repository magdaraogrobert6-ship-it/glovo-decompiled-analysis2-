package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class MatrixKt {
    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m993dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        float f = fArr[i3];
        float f2 = fArr2[i2];
        float f3 = fArr[i3 + 1];
        float f4 = fArr2[i2 + 4];
        return (fArr[i3 + 3] * fArr2[i2 + 12]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (f3 * f4) + (f * f2);
    }

    /* JADX INFO: renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m994isIdentity58bKbWc(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }
}
