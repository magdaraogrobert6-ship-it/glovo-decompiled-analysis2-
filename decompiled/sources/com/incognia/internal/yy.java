package com.incognia.internal;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class yy extends FilterInputStream {
    public final AtomicLong BGx;

    public yy(FileInputStream fileInputStream) {
        super(fileInputStream);
        this.BGx = new AtomicLong(0L);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.BGx.incrementAndGet();
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.BGx.addAndGet(jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 > 0) {
            this.BGx.addAndGet(i3);
        }
        return i3;
    }
}
