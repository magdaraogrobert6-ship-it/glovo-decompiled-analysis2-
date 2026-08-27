package com.deliveryhero.fwf_evaluator.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Hash {
    private final byte[] bytes;

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final String getHex() {
        return Hex.INSTANCE.encode(this.bytes);
    }

    public Hash(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }
}
