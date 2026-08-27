package com.mapbox.common.module;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.Buffer;
import com.mapbox.common.SizedReadStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamingDataReader {
    private final ByteBuffer chunkBuffer;
    private int chunkBufferReadPosition;
    private long chunksRead;
    private final SizedReadStream commonReadStream;
    private final boolean isSingleChunk;
    private final long size;

    public final long getSize() {
        return this.size;
    }

    public final boolean isSingleChunk() {
        return this.isSingleChunk;
    }

    private final int bytesInBuffer() {
        return this.chunkBuffer.position() - this.chunkBufferReadPosition;
    }

    public StreamingDataReader(SizedReadStream sizedReadStream, int i) {
        sizedReadStream.getClass();
        this.commonReadStream = sizedReadStream;
        this.chunkBuffer = ByteBuffer.allocateDirect(i);
        Long totalSize = sizedReadStream.getTotalSize();
        long jLongValue = (totalSize == null ? -1L : totalSize).longValue();
        this.size = jLongValue;
        this.isSingleChunk = 1 <= jLongValue && jLongValue <= ((long) i);
    }

    private final <T> void writeTo(T t, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        fillChunkBuffer();
        ByteBuffer byteBufferDuplicate = this.chunkBuffer.duplicate();
        byteBufferDuplicate.flip().position(this.chunkBufferReadPosition);
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(byteBufferDuplicate, t);
        this.chunkBufferReadPosition = byteBufferDuplicate.position();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + iMin);
            byteBuffer2.put(byteBuffer);
            return iMin;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private final void fillChunkBuffer() {
        int i = 0;
        if (bytesInBuffer() < this.chunkBuffer.capacity() / 4) {
            ByteBuffer byteBuffer = this.chunkBuffer;
            byteBuffer.flip().position(this.chunkBufferReadPosition);
            byteBuffer.compact();
            this.chunkBufferReadPosition = 0;
        }
        while (this.chunkBuffer.hasRemaining() && !this.commonReadStream.isExhausted()) {
            Long value = this.commonReadStream.read(new Buffer(new DataRef(this.chunkBuffer.slice()))).onError(new r8lambdayUqGVEpC1kg8ua3jc9a113shNIE(11)).getValue();
            value.getClass();
            long jLongValue = value.longValue();
            ByteBuffer byteBuffer2 = this.chunkBuffer;
            int i2 = (int) jLongValue;
            byteBuffer2.position(byteBuffer2.position() + i2);
            i += i2;
        }
        if (i > 0) {
            this.chunksRead++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fillChunkBuffer$lambda$2(String str) throws IOException {
        str.getClass();
        throw new IOException(str);
    }

    public final boolean isDataAvailable() {
        return bytesInBuffer() > 0 || !this.commonReadStream.isExhausted();
    }

    public final void rewind() throws IOException {
        if (this.chunksRead <= 1) {
            this.chunkBufferReadPosition = 0;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Rewind is only supported if we have read at most one chunk");
        }
    }

    public final void writeTo(WritableByteChannel writableByteChannel) {
        writableByteChannel.getClass();
        writeTo(writableByteChannel, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.mapbox.common.module.StreamingDataReader.writeTo.2
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                invoke((ByteBuffer) obj, (WritableByteChannel) obj2);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(ByteBuffer byteBuffer, WritableByteChannel writableByteChannel2) throws IOException {
                byteBuffer.getClass();
                writableByteChannel2.getClass();
                writableByteChannel2.write(byteBuffer);
            }
        });
    }

    public final void writeTo(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        writeTo(byteBuffer, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.mapbox.common.module.StreamingDataReader.writeTo.1
            {
                super(2);
            }

            public final void invoke(ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
                byteBuffer2.getClass();
                byteBuffer3.getClass();
                StreamingDataReader.this.copyBytes(byteBuffer2, byteBuffer3);
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ByteBuffer) obj, (ByteBuffer) obj2);
                return createFromParcel.INSTANCE;
            }
        });
    }
}
