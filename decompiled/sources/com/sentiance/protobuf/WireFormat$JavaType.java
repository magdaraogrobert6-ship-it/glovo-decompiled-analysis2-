package com.sentiance.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(ByteString.RemoteActionCompatParcelizer),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    WireFormat$JavaType(Object obj) {
        this.defaultDefault = obj;
    }
}
