package com.huawei.hms.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class HEX {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private HEX() {
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return a(bArr, z ? b : a);
    }

    public static String encodeHexString(byte[] bArr, boolean z) {
        return new String(encodeHex(bArr, z));
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        int i = 0;
        if (bArr == null) {
            return new char[0];
        }
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            cArr2[i] = cArr[(b2 & 240) >>> 4];
            cArr2[i + 1] = cArr[b2 & 15];
            i2++;
            i += 2;
        }
        return cArr2;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, false);
    }
}
