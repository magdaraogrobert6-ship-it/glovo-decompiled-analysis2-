package o;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getCacheFileSuffixlambda1 implements Closeable {
    public abstract int IconCompatParcelizer();

    public abstract void IconCompatParcelizer(OutputStream outputStream, int i);

    public boolean RemoteActionCompatParcelizer() {
        return this instanceof BrazeWebViewClient;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void read() {
    }

    public abstract void read(byte[] bArr, int i, int i2);

    public abstract getCacheFileSuffixlambda1 serializer(int i);

    public abstract void serializer(ByteBuffer byteBuffer);

    public abstract int write();

    public abstract void write(int i);

    public void serializer() {
        throw new UnsupportedOperationException();
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (write() < i) {
            throw new IndexOutOfBoundsException();
        }
    }
}
