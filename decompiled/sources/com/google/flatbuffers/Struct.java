package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Struct {
    public ByteBuffer read;
    public int serializer;

    public void __reset(int i, ByteBuffer byteBuffer) {
        this.read = byteBuffer;
        if (byteBuffer != null) {
            this.serializer = i;
        } else {
            this.serializer = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
