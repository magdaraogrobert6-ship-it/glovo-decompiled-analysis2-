package com.mapbox.search.common.metadata;

/* JADX INFO: loaded from: classes3.dex */
public enum WeekDay {
    MONDAY(1, (byte) 0),
    TUESDAY(2, (byte) 1),
    WEDNESDAY(3, (byte) 2),
    THURSDAY(4, (byte) 3),
    FRIDAY(5, (byte) 4),
    SATURDAY(6, (byte) 5),
    SUNDAY(7, (byte) 6);

    private final byte internalRawCode;
    private final int isoCode;

    public final byte getInternalRawCode() {
        return this.internalRawCode;
    }

    public final int getIsoCode() {
        return this.isoCode;
    }

    WeekDay(int i, byte b) {
        this.isoCode = i;
        this.internalRawCode = b;
    }
}
