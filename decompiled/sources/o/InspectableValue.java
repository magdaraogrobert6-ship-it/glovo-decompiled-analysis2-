package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InspectableValue {
    public static int read(int i) {
        char c;
        char[] cArr = InspectableValueKt.MediaSessionCompatResultReceiverWrapper;
        if (i < cArr.length && (c = cArr[i]) != 0) {
            return c;
        }
        int lowerCase = Character.toLowerCase(i);
        return lowerCase != i ? lowerCase : Character.toUpperCase(i);
    }

    public static boolean read(int[][] iArr, int i) {
        if (i <= 255) {
            for (int[] iArr2 : iArr) {
                if (i <= iArr2[1]) {
                    int i2 = iArr2[0];
                    if (i < i2) {
                        return false;
                    }
                    if ((i - i2) % iArr2[2] == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (iArr.length > 0 && i >= iArr[0][0]) {
            int length = iArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = ((length - i3) / 2) + i3;
                int[] iArr3 = iArr[i4];
                int i5 = iArr3[0];
                if (i5 <= i && i <= iArr3[1]) {
                    if ((i - i5) % iArr3[2] == 0) {
                        return true;
                    }
                } else if (i < i5) {
                    length = i4;
                } else {
                    i3 = i4 + 1;
                }
            }
        }
        return false;
    }
}
