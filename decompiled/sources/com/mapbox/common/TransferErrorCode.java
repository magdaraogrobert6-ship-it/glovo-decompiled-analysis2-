package com.mapbox.common;

/* JADX INFO: loaded from: classes5.dex */
public enum TransferErrorCode {
    FILE_SYSTEM_ERROR("FileSystemError"),
    NETWORK_ERROR("NetworkError");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    TransferErrorCode(String str) {
        this.str = str;
    }
}
