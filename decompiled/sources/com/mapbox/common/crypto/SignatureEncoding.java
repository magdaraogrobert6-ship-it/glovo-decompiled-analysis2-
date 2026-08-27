package com.mapbox.common.crypto;

/* JADX INFO: loaded from: classes4.dex */
public enum SignatureEncoding {
    DER("DER"),
    RAW("Raw");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SignatureEncoding(String str) {
        this.str = str;
    }
}
