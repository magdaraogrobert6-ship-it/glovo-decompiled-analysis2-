package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpAuthInterceptor extends FilterInputStream {
    public final /* synthetic */ int serializer;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return super.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            ((FilterInputStream) this).in.mark(i);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        synchronized (this) {
            try {
                ((FilterInputStream) this).in.reset();
            } catch (IOException e) {
                throw e;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HttpAuthInterceptor(int i, InputStream inputStream) {
        super(inputStream);
        this.serializer = i;
    }

    public final long IconCompatParcelizer(long j) {
        return ((FilterInputStream) this).in.skip(j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        read(i != -1 ? 1 : -1);
        return i;
    }

    public final void serializer() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        ThreadLocal threadLocal = UnreadCountDetailsJsonAdapter.RemoteActionCompatParcelizer;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public static HttpAuthInterceptor read(InputStream inputStream) {
        return new HttpAuthInterceptor(1, inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.serializer != 1) {
            serializer();
        } else {
            ((FilterInputStream) this).in = HelpCenterHttpAuthInterceptor.IconCompatParcelizer;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long jSkip;
        if (this.serializer != 0) {
            return IconCompatParcelizer(j);
        }
        synchronized (this) {
            jSkip = ((FilterInputStream) this).in.skip(j);
        }
        return jSkip;
    }

    public void read(int i) {
        if (this.serializer != 0) {
            return;
        }
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        ThreadLocal threadLocal = UnreadCountDetailsJsonAdapter.RemoteActionCompatParcelizer;
        int i = ((FilterInputStream) this).in.read(bArr);
        read(i);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        read(i3);
        return i3;
    }
}
