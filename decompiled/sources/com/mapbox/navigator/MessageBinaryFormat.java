package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum MessageBinaryFormat {
    ADASISV2_BE("ADASISv2BE"),
    ADASISV2_LE("ADASISv2LE"),
    FLAT_BUFFERS("FlatBuffers"),
    MAPBOX_INTERNAL("MapboxInternal");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    MessageBinaryFormat(String str) {
        this.str = str;
    }
}
