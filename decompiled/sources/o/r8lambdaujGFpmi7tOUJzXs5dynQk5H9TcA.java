package o;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaujGFpmi7tOUJzXs5dynQk5H9TcA extends OutputStream {
    private final OutputStream serializer;
    private long write = 0;

    public final long RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.serializer.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.serializer.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.serializer.write(i);
        this.write++;
    }

    public r8lambdaujGFpmi7tOUJzXs5dynQk5H9TcA(OutputStream outputStream) {
        this.serializer = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.serializer.write(bArr);
        this.write += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.serializer.write(bArr, i, i2);
        this.write += (long) i2;
    }
}
