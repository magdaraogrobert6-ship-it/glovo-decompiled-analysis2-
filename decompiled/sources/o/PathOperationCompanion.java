package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class PathOperationCompanion extends InputStream {
    public final Object read;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public int IconCompatParcelizer = 1073741824;

    public PathOperationCompanion(InputStream inputStream) {
        this.read = inputStream;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            return ((InputStream) obj).skip(j);
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i3 == 0) {
            int i4 = ((InputStream) obj).read(bArr, i, i2);
            if (i4 == -1) {
                this.IconCompatParcelizer = 0;
            }
            return i4;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.RemoteActionCompatParcelizer != 0 ? ((ByteBuffer) this.read).remaining() : this.IconCompatParcelizer;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.RemoteActionCompatParcelizer != 0) {
            super.close();
        } else {
            ((InputStream) this.read).close();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        if (this.RemoteActionCompatParcelizer != 1) {
            super.mark(i);
        } else {
            synchronized (this) {
                this.IconCompatParcelizer = ((ByteBuffer) this.read).position();
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        if (this.RemoteActionCompatParcelizer != 1) {
            return super.markSupported();
        }
        return true;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.RemoteActionCompatParcelizer != 1) {
            super.reset();
            return;
        }
        synchronized (this) {
            int i = this.IconCompatParcelizer;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            ((ByteBuffer) this.read).position(i);
        }
    }

    public PathOperationCompanion(ByteBuffer byteBuffer) {
        this.read = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }
        int i2 = ((InputStream) obj).read();
        if (i2 == -1) {
            this.IconCompatParcelizer = 0;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (this.RemoteActionCompatParcelizer != 0) {
            return super.read(bArr);
        }
        int i = ((InputStream) this.read).read(bArr);
        if (i == -1) {
            this.IconCompatParcelizer = 0;
        }
        return i;
    }
}
