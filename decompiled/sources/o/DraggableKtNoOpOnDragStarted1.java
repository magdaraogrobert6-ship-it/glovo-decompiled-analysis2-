package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class DraggableKtNoOpOnDragStarted1 {
    public static final float[] IconCompatParcelizer;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float[] fArr = new float[101];
        IconCompatParcelizer = fArr;
        float[] fArr2 = new float[101];
        float f10 = 0.0f;
        int i = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f13 = i / 100.0f;
            float f14 = 1.0f;
            while (true) {
                f = 2.0f;
                f2 = ((f14 - f10) / 2.0f) + f10;
                f3 = f12 - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float fWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(f2, 0.35000002f, f3 * 0.175f, f4) + f5;
                float f15 = f14;
                if (Math.abs(fWrite - f13) < 1.0E-5d) {
                    break;
                }
                if (fWrite > f13) {
                    f14 = f2;
                } else {
                    f10 = f2;
                    f14 = f15;
                }
                f12 = 1.0f;
            }
            float f16 = 0.5f;
            fArr[i] = (((f3 * 0.5f) + f2) * f4) + f5;
            float f17 = 1.0f;
            while (true) {
                f6 = ((f17 - f11) / f) + f11;
                f7 = 1.0f - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float fWrite2 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(f7, f16, f6, f8) + f9;
                if (Math.abs(fWrite2 - f13) >= 1.0E-5d) {
                    if (fWrite2 > f13) {
                        f17 = f6;
                    } else {
                        f11 = f6;
                    }
                    f16 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
            i++;
        }
    }

    public static double read(float f, float f2) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) f2));
    }

    public static awaitAllPointersUp read(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fWrite = RangesKt.write(f, 0.0f, 1.0f);
        int i = (int) (fWrite * 100.0f);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = IconCompatParcelizer;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float fM = c8$$ExternalSyntheticOutline0.m(fWrite, f4, f6, f5);
            f2 = f6;
            f3 = fM;
        }
        return new awaitAllPointersUp(f3, f2);
    }
}
