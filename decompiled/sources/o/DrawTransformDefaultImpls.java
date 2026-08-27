package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class DrawTransformDefaultImpls extends InputStream {
    public static final ArrayDeque IconCompatParcelizer = new ArrayDeque(0);
    public com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream RemoteActionCompatParcelizer;
    public IOException serializer;

    @Override // java.io.InputStream
    public final void reset() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.reset();
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.RemoteActionCompatParcelizer.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.RemoteActionCompatParcelizer.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.RemoteActionCompatParcelizer.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.RemoteActionCompatParcelizer.read();
        } catch (IOException e) {
            this.serializer = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.RemoteActionCompatParcelizer.skip(j);
        } catch (IOException e) {
            this.serializer = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.RemoteActionCompatParcelizer.read(bArr);
        } catch (IOException e) {
            this.serializer = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.RemoteActionCompatParcelizer.read(bArr, i, i2);
        } catch (IOException e) {
            this.serializer = e;
            throw e;
        }
    }
}
