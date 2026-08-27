package com.mapbox.navigator;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes5.dex */
public enum ConstellationType {
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN),
    GPS("GPS"),
    SBAS("SBAS"),
    GLONASS("GLONASS"),
    QZSS("QZSS"),
    BEIDOU("BEIDOU"),
    GALILEO("GALILEO"),
    IRNSS("IRNSS");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ConstellationType(String str) {
        this.str = str;
    }
}
