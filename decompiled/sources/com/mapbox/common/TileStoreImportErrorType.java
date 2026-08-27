package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public enum TileStoreImportErrorType {
    CANCELED("Canceled"),
    DOES_NOT_EXIST("DoesNotExist"),
    DISK_FULL("DiskFull"),
    OTHER("Other"),
    INTEGRITY_CHECK_ERROR("IntegrityCheckError");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    TileStoreImportErrorType(String str) {
        this.str = str;
    }
}
