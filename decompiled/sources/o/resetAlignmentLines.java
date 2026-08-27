package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class resetAlignmentLines {
    public static final Charset write = Charset.forName(com.adjust.sdk.Constants.ENCODING);

    public static byte[] read(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int i5 = i2 + 3;
            bArr2 = setChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer;
            if (i5 > length) {
                break;
            }
            int i6 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i4] = bArr2[(i6 >> 18) & 63];
            bArr3[i4 + 1] = bArr2[(i6 >> 12) & 63];
            bArr3[i4 + 2] = bArr2[(i6 >> 6) & 63];
            bArr3[i4 + 3] = bArr2[i6 & 63];
            int i7 = i4 + 4;
            i3--;
            if (i3 == 0) {
                i4 += 5;
                bArr3[i7] = 10;
                i3 = 19;
            } else {
                i4 = i7;
            }
            i2 = i5;
        }
        if (i2 == length - 1) {
            int i8 = (bArr[i2] & 255) << 4;
            bArr3[i4] = bArr2[(i8 >> 6) & 63];
            bArr3[i4 + 1] = bArr2[i8 & 63];
            bArr3[i4 + 2] = 61;
            bArr3[i4 + 3] = 61;
            return bArr3;
        }
        if (i2 == length - 2) {
            int i9 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            bArr3[i4] = bArr2[(i9 >> 12) & 63];
            bArr3[i4 + 1] = bArr2[(i9 >> 6) & 63];
            bArr3[i4 + 2] = bArr2[i9 & 63];
            bArr3[i4 + 3] = 61;
        }
        return bArr3;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        if (r9 != 4) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] serializer(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resetAlignmentLines.serializer(java.lang.String):byte[]");
    }
}
