package com.deliveryhero.fwf_evaluator.util;

/* JADX INFO: loaded from: classes2.dex */
public final class SHA256Kt {
    public static final int readU8(byte[] bArr, int i) {
        bArr.getClass();
        return bArr[i] & 255;
    }

    public static final Hash sha256(byte[] bArr) {
        bArr.getClass();
        return CommonHashKt.hash(bArr, SHA256.Companion);
    }

    public static final int readS32_be(byte[] bArr, int i) {
        bArr.getClass();
        return (readU8(bArr, i) << 24) | (readU8(bArr, i + 2) << 8) | readU8(bArr, i + 3) | (readU8(bArr, i + 1) << 16);
    }
}
