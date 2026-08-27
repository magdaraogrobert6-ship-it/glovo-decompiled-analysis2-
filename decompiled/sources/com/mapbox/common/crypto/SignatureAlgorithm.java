package com.mapbox.common.crypto;

/* JADX INFO: loaded from: classes4.dex */
public enum SignatureAlgorithm {
    ECDSA("ECDSA");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SignatureAlgorithm(String str) {
        this.str = str;
    }
}
