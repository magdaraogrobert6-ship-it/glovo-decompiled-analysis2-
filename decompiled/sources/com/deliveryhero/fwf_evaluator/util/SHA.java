package com.deliveryhero.fwf_evaluator.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SHA extends Hasher {
    public SHA(int i, int i2) {
        super(i, i2);
    }

    @Override // com.deliveryhero.fwf_evaluator.util.Hasher
    public byte[] corePadding(long j) {
        long j2 = j % 64;
        long j3 = 64 - j2;
        if (j3 < 9) {
            j3 = 128 - j2;
        }
        int i = (int) j3;
        byte[] bArr = new byte[i];
        bArr[0] = -128;
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[(i - 1) - i2] = (byte) (((8 * j) >>> (i2 * 8)) & 255);
        }
        return bArr;
    }
}
