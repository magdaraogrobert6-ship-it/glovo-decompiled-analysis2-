package o;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class transformToAncestorEL8BTi8 {
    public static int serializer(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.UP;
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (calculateMinimumTouchTargetOffsetC6jSQ5I.RemoteActionCompatParcelizer[roundingMode.ordinal()]) {
            case 1:
            case 2:
                return i3;
            case 3:
                break;
            case 4:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 5:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
                return 0;
        }
        return i3 + i5;
    }
}
