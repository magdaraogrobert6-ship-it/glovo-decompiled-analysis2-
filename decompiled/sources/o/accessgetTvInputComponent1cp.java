package o;

import com.google.android.gms.common.Feature;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetTvInputComponent1cp {
    public static boolean IconCompatParcelizer(Object[] objArr, Feature feature) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (TuplesKt.write(objArr[i], feature)) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean IconCompatParcelizer(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
