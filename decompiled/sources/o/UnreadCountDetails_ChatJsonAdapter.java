package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class UnreadCountDetails_ChatJsonAdapter extends FilterInputStream {
    public long IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public long serializer;
    public final long write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            ((FilterInputStream) this).in.mark(i);
            this.serializer = this.IconCompatParcelizer;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        synchronized (this) {
            ((FilterInputStream) this).in.reset();
            this.IconCompatParcelizer = this.serializer;
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        long j = this.write;
        return j >= 0 && this.IconCompatParcelizer >= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.RemoteActionCompatParcelizer) {
            ((FilterInputStream) this).in.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        long j = this.write;
        if (zRemoteActionCompatParcelizer) {
            return -1;
        }
        int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - this.IconCompatParcelizer) : i2));
        if (i3 == -1) {
            return -1;
        }
        this.IconCompatParcelizer += (long) i3;
        return i3;
    }

    public UnreadCountDetails_ChatJsonAdapter(InputStream inputStream, long j) {
        super(inputStream);
        this.serializer = -1L;
        this.RemoteActionCompatParcelizer = true;
        this.write = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (RemoteActionCompatParcelizer()) {
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.write;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.IconCompatParcelizer);
        }
        long jSkip = ((FilterInputStream) this).in.skip(j);
        this.IconCompatParcelizer += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (RemoteActionCompatParcelizer()) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        this.IconCompatParcelizer++;
        return i;
    }
}
