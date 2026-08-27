package o;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class DrawContextKt extends MediaDataSource {
    public final /* synthetic */ ByteBuffer serializer;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public DrawContextKt(ByteBuffer byteBuffer) {
        this.serializer = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.serializer.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.serializer;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
