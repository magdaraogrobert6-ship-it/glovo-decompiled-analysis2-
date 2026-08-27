package o;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WindowInfo {
    public static ArrayList IconCompatParcelizer(ArrayList arrayList, ArrayList arrayList2, int i) {
        int[] iArr = {arrayList.size(), ((float[]) arrayList.get(0)).length};
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            System.arraycopy(arrayList.get(i2), 0, fArr[i2], 0, ((float[]) arrayList.get(i2)).length);
        }
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) cls, arrayList2.size(), ((float[]) arrayList2.get(0)).length);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            System.arraycopy(arrayList2.get(i3), 0, fArr2[i3], 0, ((float[]) arrayList2.get(i3)).length);
        }
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, i, i);
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                fArr3[i4][i5] = 0.0f;
                for (int i6 = 0; i6 < i; i6++) {
                    float[] fArr4 = fArr3[i4];
                    fArr4[i5] = (fArr[i4][i6] * fArr2[i6][i5]) + fArr4[i5];
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(i);
        for (float[] fArr5 : fArr3) {
            arrayList3.add(fArr5);
        }
        return arrayList3;
    }
}
