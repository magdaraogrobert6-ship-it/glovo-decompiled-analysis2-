package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HQq {
    public static final void BGx(int[] iArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 16;
        while (i3 > 0) {
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            byte b3 = bArr[i + 2];
            int i4 = i + 4;
            iArr[i2] = (bArr[i + 3] & 255) | (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
            i2++;
            i3--;
            i = i4;
        }
    }
}
