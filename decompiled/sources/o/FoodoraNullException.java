package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class FoodoraNullException extends InputStream {
    public final ByteBuffer IconCompatParcelizer;
    public final SeekableByteChannel RemoteActionCompatParcelizer;
    public long read;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public FoodoraNullException(SeekableByteChannel seekableByteChannel, long j) {
        this.RemoteActionCompatParcelizer = seekableByteChannel;
        this.read = j;
        if (j >= 8192 || j <= 0) {
            this.IconCompatParcelizer = ByteBuffer.allocate(8192);
        } else {
            this.IconCompatParcelizer = ByteBuffer.allocate((int) j);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        long j = this.read;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        ByteBuffer byteBufferAllocate = this.IconCompatParcelizer;
        int iCapacity = byteBufferAllocate.capacity();
        SeekableByteChannel seekableByteChannel = this.RemoteActionCompatParcelizer;
        if (i2 <= iCapacity) {
            byteBufferAllocate.rewind().limit(i2);
            i3 = seekableByteChannel.read(byteBufferAllocate);
            byteBufferAllocate.flip();
        } else {
            byteBufferAllocate = ByteBuffer.allocate(i2);
            i3 = seekableByteChannel.read(byteBufferAllocate);
            byteBufferAllocate.flip();
        }
        if (i3 >= 0) {
            byteBufferAllocate.get(bArr, i, i3);
            this.read -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.read;
        if (j <= 0) {
            return -1;
        }
        this.read = j - 1;
        ByteBuffer byteBuffer = this.IconCompatParcelizer;
        byteBuffer.rewind().limit(1);
        int i = this.RemoteActionCompatParcelizer.read(byteBuffer);
        byteBuffer.flip();
        return i < 0 ? i : byteBuffer.get() & 255;
    }
}
