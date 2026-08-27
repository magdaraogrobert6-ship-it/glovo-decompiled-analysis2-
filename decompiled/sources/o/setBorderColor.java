package o;

import android.annotation.SuppressLint;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setBorderColor {
    public static final float[][] read(List list) throws AssertionError {
        if (list.size() > 18) {
            list = list.subList(list.size() - 18, list.size());
        }
        float[][] fArr = new float[18][];
        int i = 0;
        for (int i2 = 0; i2 < 18; i2++) {
            fArr[i2] = RemoteActionCompatParcelizer(null);
        }
        if (!list.isEmpty()) {
            DataStoreProvidera dataStoreProvidera = (DataStoreProvidera) onContentCardDismissed.read(0, list);
            int size = 18 - list.size();
            while (i < 18) {
                fArr[i] = RemoteActionCompatParcelizer(i < size ? dataStoreProvidera : (DataStoreProvidera) list.get(i - size));
                i++;
            }
        }
        return fArr;
    }

    @SuppressLint
    public static final float[] RemoteActionCompatParcelizer(DataStoreProvidera dataStoreProvidera) {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = -1.0f;
        }
        if (dataStoreProvidera == null) {
            return fArr;
        }
        float[] fArr2 = new float[8];
        int i2 = 0;
        while (true) {
            if (i2 >= 8) {
                break;
            }
            fArr2[i2] = 0.0f;
            i2++;
        }
        fArr2[0] = dataStoreProvidera.IconCompatParcelizer() ? 1.0f : 0.0f;
        fArr2[1] = dataStoreProvidera.serializer() ? 1.0f : 0.0f;
        fArr2[2] = dataStoreProvidera.write() ? 1.0f : 0.0f;
        return fArr2;
    }
}
