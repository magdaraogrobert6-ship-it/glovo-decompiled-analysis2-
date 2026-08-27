package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class E2e {
    public static final byte[] HQ = new byte[64];
    public static final byte[] N = new byte[64];
    public final byte[] BGx;
    public final Lql mbG;

    static {
        for (int i = 0; i < 64; i++) {
            HQ[i] = 54;
            N[i] = 92;
        }
    }

    public static byte[] BGx(byte[] bArr) {
        byte[] bArrBGx;
        byte[] bArr2 = new byte[64];
        if (bArr.length > 64) {
            Lql lql = new Lql();
            lql.BGx(bArr.length, bArr);
            bArrBGx = lql.BGx();
        } else {
            bArrBGx = bArr;
        }
        if (bArrBGx.length < 64) {
            int length = 64 - bArrBGx.length;
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = 0;
            }
            int length2 = bArrBGx.length;
            byte[] bArr4 = new byte[length2 + length];
            System.arraycopy(bArrBGx, 0, bArr4, 0, length2);
            System.arraycopy(bArr3, 0, bArr4, length2, length);
            bArr2 = bArr4;
        }
        return bArrBGx.length == 64 ? bArr : bArr2;
    }

    public E2e(byte[] bArr) {
        this.BGx = bArr;
        Lql lql = new Lql();
        this.mbG = lql;
        byte[] bArrBGx = nQ.BGx(HQ, BGx(bArr));
        lql.BGx(bArrBGx.length, bArrBGx);
    }
}
