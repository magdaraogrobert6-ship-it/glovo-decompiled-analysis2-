package com.deliveryhero.fwf_evaluator.util;

/* JADX INFO: loaded from: classes2.dex */
public final class SHA1Kt {
    public static final Hash sha1(byte[] bArr) {
        bArr.getClass();
        return CommonHashKt.hash(bArr, SHA1.Companion);
    }
}
