package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class isNotEmpty {
    public static Object[] IconCompatParcelizer(int i, int i2, Object[] objArr, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static Object[] write(int i, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }
}
