package io.sentry.android.core;

import com.huawei.location.ut;
import com.mapbox.core.exceptions.ServicesException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class ensureViewModelStore extends InputStream {
    public final BufferedInputStream read;
    public long write;

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.read.available(), (int) this.write);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ut.IconCompatParcelizer(ServicesException.RemoteActionCompatParcelizer(), new Object[]{this.read, Long.valueOf(this.write)}, -720376203, ServicesException.RemoteActionCompatParcelizer(), 720376203, ServicesException.RemoteActionCompatParcelizer(), ServicesException.RemoteActionCompatParcelizer());
        this.write = 0L;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.read.skip(Math.min(j, this.write));
        this.write -= jSkip;
        return jSkip;
    }

    public ensureViewModelStore(BufferedInputStream bufferedInputStream, int i) {
        this.read = bufferedInputStream;
        this.write = i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.write;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.read.read(bArr, i, Math.min(i2, (int) j));
        if (i3 > 0) {
            this.write -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.write <= 0) {
            return -1;
        }
        int i = this.read.read();
        if (i != -1) {
            this.write--;
        }
        return i;
    }
}
