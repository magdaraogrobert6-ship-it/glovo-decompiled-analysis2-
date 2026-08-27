package o;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WindowInfoImpl {
    public static ArrayList IconCompatParcelizer(ArrayList arrayList) {
        int i;
        int[] iArr = {arrayList.size(), ((float[]) arrayList.get(0)).length};
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            System.arraycopy(arrayList.get(i2), 0, fArr[i2], 0, ((float[]) arrayList.get(i2)).length);
        }
        if (fArr.length == 0) {
            return arrayList;
        }
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) cls, androidx.compose.ui.graphics.Fields.RotationX, fArr[0].length);
        double dDoubleValue = new BigDecimal(fArr.length / 256.0f).setScale(2, 4).doubleValue();
        int i3 = 0;
        for (int i4 = 0; i3 < fArr[i4].length; i4 = 0) {
            int iRound = i4;
            int i5 = iRound;
            while (iRound < fArr.length) {
                if (i5 == 255) {
                    fArr2[i5][i3] = fArr[fArr.length - 1][i3];
                    break;
                }
                if (iRound == 0) {
                    fArr2[i5][i3] = fArr[iRound][i3];
                    i5++;
                    iRound += (int) Math.round(dDoubleValue);
                } else {
                    double dRound = (((double) ((int) Math.round(dDoubleValue))) * dDoubleValue) / 2.0d;
                    if (Math.abs(dRound) >= 1.0E-6d) {
                        i = i3;
                        fArr2[i5][i] = (float) ((((double) (fArr[iRound][i3] - fArr[iRound - ((int) Math.round(dDoubleValue))][i])) / dRound) + ((double) fArr[iRound - ((int) Math.round(dDoubleValue))][i3]));
                    } else {
                        i = i3;
                        fArr2[i5][i] = 0.0f;
                    }
                    i5++;
                    iRound += (int) Math.round(dDoubleValue);
                    i3 = i;
                }
            }
            i3++;
        }
        ArrayList arrayList2 = new ArrayList(androidx.compose.ui.graphics.Fields.RotationX);
        for (float[] fArr3 : fArr2) {
            arrayList2.add(fArr3);
        }
        return arrayList2;
    }
}
