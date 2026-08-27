package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class PathSvgKt implements ItemSingleChoiceBinding {
    public final int IconCompatParcelizer;
    public final ByteBuffer read;

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return ApiErrorResponseCompanion.PlaybackStateCompat;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        ByteBuffer byteBuffer = this.read;
        int iPosition = byteBuffer.position();
        int i = this.IconCompatParcelizer;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return registryMissingComponentException.write(byteBuffer);
    }

    public PathSvgKt(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.read = byteBufferSlice;
        this.IconCompatParcelizer = byteBufferSlice.capacity();
    }
}
