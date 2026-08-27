package com.mapbox.common.experimental.wss_backend;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
public class Data {
    private Type type;
    private Object value;

    public enum Type {
        BYTE_ARRAY,
        STRING
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static Data valueOf(byte[] bArr) {
        return new Data(bArr);
    }

    public boolean isByteArray() {
        return this.type == Type.BYTE_ARRAY;
    }

    public boolean isString() {
        return this.type == Type.STRING;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public Data(byte[] bArr) {
        this.type = Type.BYTE_ARRAY;
        this.value = bArr;
    }

    public static Data valueOf(String str) {
        return new Data(str);
    }

    public byte[] getByteArray() {
        if (isByteArray()) {
            return (byte[]) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (byte[])");
        return null;
    }

    public String getString() {
        if (isString()) {
            return (String) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (String)");
        return null;
    }

    public Data(String str) {
        this.type = Type.STRING;
        this.value = str;
    }
}
