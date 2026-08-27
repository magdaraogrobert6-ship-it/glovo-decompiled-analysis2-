package com.incognia.internal;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Yx3 {
    public final BigInteger BGx;
    public final SecureRandom HQ = new SecureRandom();
    public final BigInteger mbG;

    public final byte[] BGx(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        int iBitLength = (this.BGx.bitLength() + 7) >>> 3;
        if (bArr.length > iBitLength - 66) {
            throw new SecurityException();
        }
        Lql lql = new Lql();
        lql.BGx(0, bArr2);
        byte[] bArrBGx = lql.BGx();
        lql.mbG();
        byte[] bArr3 = new byte[32];
        int i = iBitLength - 33;
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArrBGx, 0, bArr4, 0, 32);
        bArr4[(i - bArr.length) - 1] = 1;
        System.arraycopy(bArr, 0, bArr4, i - bArr.length, bArr.length);
        int i2 = 0;
        int i3 = 32;
        while (i3 > 0) {
            int i4 = i3 + 4;
            byte[] bArr5 = new byte[i4];
            this.HQ.nextBytes(bArr5);
            for (int i5 = 0; i5 < i4 && i3 > 0; i5++) {
                byte b = bArr5[i5];
                if (b != 0) {
                    bArr3[i2] = b;
                    i3--;
                    i2++;
                }
            }
        }
        BGx(bArr4, lql, bArr3);
        BGx(bArr3, lql, bArr4);
        byte[] bArr6 = new byte[iBitLength];
        System.arraycopy(bArr3, 0, bArr6, 1, 32);
        System.arraycopy(bArr4, 0, bArr6, 33, i);
        return BGx(new BigInteger(1, bArr6).modPow(this.mbG, this.BGx), (this.BGx.bitLength() + 7) >>> 3);
    }

    public Yx3(BigInteger bigInteger, BigInteger bigInteger2) {
        this.BGx = bigInteger;
        this.mbG = bigInteger2;
    }

    public static byte[] BGx(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        if (length == i + 1 && byteArray[0] == 0) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 1, bArr, 0, i);
            Arrays.fill(byteArray, (byte) 0);
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(byteArray, 0, bArr2, i - length, length);
        Arrays.fill(byteArray, (byte) 0);
        return bArr2;
    }

    public static void BGx(byte[] bArr, Lql lql, byte[] bArr2) {
        byte[] bArr3 = new byte[4];
        int i = 0;
        while (i < bArr.length) {
            lql.BGx(bArr2);
            lql.BGx(4, bArr3);
            byte[] bArrBGx = lql.BGx();
            lql.mbG();
            for (int i2 = 0; i2 < 32 && i < bArr.length; i2++) {
                bArr[i] = (byte) (bArr[i] ^ bArrBGx[i2]);
                i++;
            }
            byte b = (byte) (bArr3[3] + 1);
            bArr3[3] = b;
            if (b == 0) {
                byte b2 = (byte) (bArr3[2] + 1);
                bArr3[2] = b2;
                if (b2 == 0) {
                    byte b3 = (byte) (bArr3[1] + 1);
                    bArr3[1] = b3;
                    if (b3 == 0) {
                        bArr3[0] = (byte) (bArr3[0] + 1);
                    }
                }
            }
        }
    }
}
