package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class ColorMatrix {
    private final float[] values;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m778constructorimpl(float[] fArr) {
        return fArr;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m783equalsimpl0(float[] fArr, float[] fArr2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{fArr, fArr2}, iWrite3)).booleanValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m785hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public final float[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m797unboximpl() {
        return this.values;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m777boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* JADX INFO: renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m795timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[5];
        float f5 = fArr[2];
        float f6 = fArr2[10];
        float f7 = fArr[3];
        float f8 = fArr2[15];
        float f9 = fArr2[1];
        float f10 = fArr2[6];
        float f11 = fArr2[11];
        float f12 = fArr2[16];
        float f13 = fArr2[2];
        float f14 = fArr2[7];
        float f15 = fArr2[12];
        float f16 = fArr2[17];
        float f17 = fArr2[3];
        float f18 = fArr2[8];
        float f19 = fArr2[13];
        float f20 = fArr2[18];
        float f21 = fArr2[4];
        float f22 = fArr2[9];
        float f23 = fArr2[14];
        float f24 = fArr2[19];
        float f25 = fArr[4];
        float f26 = fArr[5];
        float f27 = fArr[6];
        float f28 = fArr[7];
        float f29 = fArr[8];
        float f30 = fArr[9];
        float f31 = fArr[10];
        float f32 = fArr[11];
        float f33 = fArr[12];
        float f34 = fArr[13];
        float f35 = fArr[14];
        float f36 = fArr[15];
        float f37 = fArr[16];
        float f38 = fArr[17];
        float f39 = fArr[18];
        float f40 = fArr[19];
        fArr[0] = (f7 * f8) + (f5 * f6) + (f3 * f4) + (f * f2);
        fArr[1] = (f7 * f12) + (f5 * f11) + (f3 * f10) + (f * f9);
        fArr[2] = (f7 * f16) + (f5 * f15) + (f3 * f14) + (f * f13);
        fArr[3] = (f7 * f20) + (f5 * f19) + (f3 * f18) + (f * f17);
        fArr[4] = (f7 * f24) + (f5 * f23) + (f3 * f22) + (f * f21) + f25;
        fArr[5] = (f29 * f8) + (f28 * f6) + (f27 * f4) + (f26 * f2);
        fArr[6] = (f29 * f12) + (f28 * f11) + (f27 * f10) + (f26 * f9);
        fArr[7] = (f29 * f16) + (f28 * f15) + (f27 * f14) + (f26 * f13);
        fArr[8] = (f29 * f20) + (f28 * f19) + (f27 * f18) + (f26 * f17);
        fArr[9] = (f29 * f24) + (f28 * f23) + (f27 * f22) + (f26 * f21) + f30;
        fArr[10] = (f34 * f8) + (f33 * f6) + (f32 * f4) + (f31 * f2);
        fArr[11] = (f34 * f12) + (f33 * f11) + (f32 * f10) + (f31 * f9);
        fArr[12] = (f34 * f16) + (f33 * f15) + (f32 * f14) + (f31 * f13);
        fArr[13] = (f34 * f20) + (f33 * f19) + (f32 * f18) + (f31 * f17);
        fArr[14] = (f34 * f24) + (f33 * f23) + (f32 * f22) + (f31 * f21) + f35;
        fArr[15] = (f8 * f39) + (f6 * f38) + (f4 * f37) + (f2 * f36);
        fArr[16] = (f12 * f39) + (f11 * f38) + (f10 * f37) + (f9 * f36);
        fArr[17] = (f16 * f39) + (f15 * f38) + (f14 * f37) + (f13 * f36);
        fArr[18] = (f20 * f39) + (f19 * f38) + (f18 * f37) + (f17 * f36);
        fArr[19] = (f39 * f24) + (f38 * f23) + (f37 * f22) + (f36 * f21) + f40;
    }

    public boolean equals(Object obj) {
        return m782equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m785hashCodeimpl(this.values);
    }

    public String toString() {
        return m796toStringimpl(this.values);
    }

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m784getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m786resetimpl(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
    }

    /* JADX INFO: renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m787rotateInternalimpl(float[] fArr, float f, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float f3 = 0.25f + f2;
        float fFloor = f3 - ((float) Math.floor(f3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f4 = 1.0f - fAbs;
        float fFloor2 = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f5 = 1.0f - fAbs2;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Float.valueOf(((fFloor * 8.0f) * f4) / (1.25f - (fAbs * f4))), Float.valueOf(((fFloor2 * 8.0f) * f5) / (1.25f - (fAbs2 * f5))));
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m788setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m796toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m782equalsimpl(float[] fArr, Object obj) {
        if (!(obj instanceof ColorMatrix)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fArr, ((ColorMatrix) obj).m797unboximpl()}, getCieXyz.write())).booleanValue();
    }

    /* JADX INFO: renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m789setjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 20 && fArr2.length >= 20) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
            fArr[16] = fArr2[16];
            fArr[17] = fArr2[17];
            fArr[18] = fArr2[18];
            fArr[19] = fArr2[19];
        }
    }

    /* JADX INFO: renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m780convertRgbToYuvimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* JADX INFO: renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m781convertYuvToRgbimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* JADX INFO: renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m790setToRotateBlueimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float f3 = 0.25f + f2;
        float fFloor = f3 - ((float) Math.floor(f3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f4 = 1.0f - fAbs;
        float f5 = ((fFloor * 8.0f) * f4) / (1.25f - (fAbs * f4));
        float fFloor2 = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f6 = 1.0f - fAbs2;
        float f7 = ((fFloor2 * 8.0f) * f6) / (1.25f - (fAbs2 * f6));
        fArr[0] = f5;
        fArr[1] = f7;
        fArr[5] = -f7;
        fArr[6] = f5;
    }

    /* JADX INFO: renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m791setToRotateGreenimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float f3 = 0.25f + f2;
        float fFloor = f3 - ((float) Math.floor(f3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f4 = 1.0f - fAbs;
        float f5 = ((fFloor * 8.0f) * f4) / (1.25f - (fAbs * f4));
        float fFloor2 = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f6 = 1.0f - fAbs2;
        float f7 = ((fFloor2 * 8.0f) * f6) / (1.25f - (fAbs2 * f6));
        fArr[0] = f5;
        fArr[2] = -f7;
        fArr[10] = f7;
        fArr[12] = f5;
    }

    /* JADX INFO: renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m792setToRotateRedimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float f3 = 0.25f + f2;
        float fFloor = f3 - ((float) Math.floor(f3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f4 = 1.0f - fAbs;
        float f5 = ((fFloor * 8.0f) * f4) / (1.25f - (fAbs * f4));
        float fFloor2 = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f6 = 1.0f - fAbs2;
        float f7 = ((fFloor2 * 8.0f) * f6) / (1.25f - (fAbs2 * f6));
        fArr[6] = f5;
        fArr[7] = f7;
        fArr[11] = -f7;
        fArr[12] = f5;
    }

    /* JADX INFO: renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m793setToSaturationimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = 1.0f - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* JADX INFO: renamed from: setToScale-impl, reason: not valid java name */
    public static final void m794setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m779constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m778constructorimpl(fArr);
    }
}
