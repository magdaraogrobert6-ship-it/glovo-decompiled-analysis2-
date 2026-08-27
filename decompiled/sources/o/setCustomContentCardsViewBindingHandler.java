package o;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setCustomContentCardsViewBindingHandler {
    public static byte[] read(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        if (length > 0) {
            i += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = 0;
        int i4 = 19;
        while (true) {
            int i5 = i2 + 3;
            bArr2 = setContentCardsViewBindingHandler.IconCompatParcelizer;
            if (i5 > length) {
                break;
            }
            int i6 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i3] = bArr2[(i6 >> 18) & 63];
            bArr3[i3 + 1] = bArr2[(i6 >> 12) & 63];
            bArr3[i3 + 2] = bArr2[(i6 >> 6) & 63];
            bArr3[i3 + 3] = bArr2[i6 & 63];
            int i7 = i3 + 4;
            i4--;
            if (i4 == 0) {
                i3 += 5;
                bArr3[i7] = 10;
                i4 = 19;
            } else {
                i3 = i7;
            }
            i2 = i5;
        }
        if (i2 == length - 1) {
            int i8 = (bArr[i2] & 255) << 4;
            bArr3[i3] = bArr2[(i8 >> 6) & 63];
            bArr3[i3 + 1] = bArr2[i8 & 63];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
            bArr3[i3 + 4] = 10;
            return bArr3;
        }
        if (i2 != length - 2) {
            if (i3 > 0 && i4 != 19) {
                bArr3[i3] = 10;
            }
            return bArr3;
        }
        int i9 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
        bArr3[i3] = bArr2[(i9 >> 12) & 63];
        bArr3[i3 + 1] = bArr2[(i9 >> 6) & 63];
        bArr3[i3 + 2] = bArr2[i9 & 63];
        bArr3[i3 + 3] = 61;
        bArr3[i3 + 4] = 10;
        return bArr3;
    }

    public static int IconCompatParcelizer(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            switch (i) {
                case 21:
                case 23:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (i2 >= 30) {
            return i;
        }
        if (i != 12) {
            if (i == 13) {
                return 6;
            }
            if (i != 16) {
                if (i != 17) {
                    return i;
                }
                return 0;
            }
        }
        return 1;
    }
}
