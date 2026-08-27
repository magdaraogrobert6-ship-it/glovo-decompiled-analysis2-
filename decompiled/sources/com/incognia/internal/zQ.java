package com.incognia.internal;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zQ extends FilterOutputStream {
    public final AtomicLong BGx;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        super.write(i);
        this.BGx.incrementAndGet();
    }

    public zQ(FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.BGx = new AtomicLong(0L);
    }
}
