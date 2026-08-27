package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.UnsupportedEncodingException;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yEy {
    public static final /* synthetic */ boolean BGx = true;

    public static String HQ(int i, byte[] bArr) {
        try {
            return new String(mbG(i, bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e1, code lost:
    
        if (r10 != 4) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] BGx(int r17, byte[] r18) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incognia.internal.yEy.BGx(int, byte[]):byte[]");
    }

    public static byte[] mbG(int i, byte[] bArr) {
        int length = bArr.length;
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        byte[] bArr2 = (i & 8) == 0 ? Gs1.BGx : Gs1.mbG;
        int i2 = z2 ? 19 : -1;
        int i3 = (length / 3) * 4;
        if (!z) {
            int i4 = length % 3;
            if (i4 == 1) {
                i3 += 2;
            } else if (i4 == 2) {
                i3 += 3;
            }
        } else if (length % 3 > 0) {
            i3 += 4;
        }
        if (z2 && length > 0) {
            i3 += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i3];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i5 + 3;
            if (i7 > length) {
                break;
            }
            int i8 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16) | (bArr[i5 + 2] & 255);
            bArr3[i6] = bArr2[(i8 >> 18) & 63];
            bArr3[i6 + 1] = bArr2[(i8 >> 12) & 63];
            bArr3[i6 + 2] = bArr2[(i8 >> 6) & 63];
            bArr3[i6 + 3] = bArr2[i8 & 63];
            int i9 = i6 + 4;
            i2--;
            if (i2 == 0) {
                i6 += 5;
                bArr3[i9] = 10;
                i2 = 19;
            } else {
                i6 = i9;
            }
            i5 = i7;
        }
        if (i5 == length - 1) {
            int i10 = (bArr[i5] & 255) << 4;
            bArr3[i6] = bArr2[(i10 >> 6) & 63];
            int i11 = i6 + 2;
            bArr3[i6 + 1] = bArr2[i10 & 63];
            if (z) {
                bArr3[i11] = 61;
                i11 = i6 + 4;
                bArr3[i6 + 3] = 61;
            }
            if (z2) {
                bArr3[i11] = 10;
                i11++;
            }
            i6 = i11;
            i5++;
        } else if (i5 == length - 2) {
            int i12 = i5 + 2;
            int i13 = ((bArr[i5 + 1] & 255) << 2) | ((bArr[i5] & 255) << 10);
            bArr3[i6] = bArr2[(i13 >> 12) & 63];
            bArr3[i6 + 1] = bArr2[(i13 >> 6) & 63];
            int i14 = i6 + 3;
            bArr3[i6 + 2] = bArr2[i13 & 63];
            if (z) {
                i6 += 4;
                bArr3[i14] = 61;
            } else {
                i6 = i14;
            }
            if (z2) {
                bArr3[i6] = 10;
                i6++;
            }
            i5 = i12;
        } else if (z2 && i6 > 0 && i2 != 19) {
            bArr3[i6] = 10;
            i6++;
        }
        if (!Gs1.HQ && i5 != length) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
            return null;
        }
        if (BGx || i6 == i3) {
            return bArr3;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
        return null;
    }
}
