package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.nio.ByteBuffer;
import o.RegistryMissingComponentException;

/* JADX INFO: loaded from: classes5.dex */
public final class ResponseReadStream implements ReadStream {
    private boolean exhausted;
    private final RegistryMissingComponentException okioBuffer;
    private long readBytes;

    public final boolean getExhausted() {
        return this.exhausted;
    }

    public final RegistryMissingComponentException getOkioBuffer() {
        return this.okioBuffer;
    }

    public final long getReadBytes() {
        return this.readBytes;
    }

    @Override // com.mapbox.common.ReadStream
    public boolean isExhausted() {
        return this.exhausted;
    }

    @Override // com.mapbox.common.ReadStream
    public long readBytes() {
        return this.readBytes;
    }

    public final void setExhausted(boolean z) {
        this.exhausted = z;
    }

    public final void setReadBytes(long j) {
        this.readBytes = j;
    }

    @Override // com.mapbox.common.ReadStream
    public boolean isReadable() {
        return this.okioBuffer.size > 0;
    }

    public ResponseReadStream(RegistryMissingComponentException registryMissingComponentException) {
        registryMissingComponentException.getClass();
        this.okioBuffer = registryMissingComponentException;
    }

    @Override // com.mapbox.common.ReadStream
    public Expected<String, Long> read(Buffer buffer) {
        buffer.getClass();
        try {
            ByteBuffer buffer2 = buffer.getData().getBuffer();
            buffer2.getClass();
            long j = 0;
            while (isReadable() && buffer2.hasRemaining()) {
                int i = this.okioBuffer.read(buffer2);
                if (i == -1) {
                    this.exhausted = true;
                    Expected<String, Long> expectedCreateValue = ExpectedFactory.createValue(Long.valueOf(j));
                    expectedCreateValue.getClass();
                    return expectedCreateValue;
                }
                long j2 = i;
                j += j2;
                this.readBytes += j2;
            }
            Expected<String, Long> expectedCreateValue2 = ExpectedFactory.createValue(Long.valueOf(j));
            expectedCreateValue2.getClass();
            return expectedCreateValue2;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown stream error";
            }
            Expected<String, Long> expectedCreateError = ExpectedFactory.createError(message);
            expectedCreateError.getClass();
            return expectedCreateError;
        }
    }
}
