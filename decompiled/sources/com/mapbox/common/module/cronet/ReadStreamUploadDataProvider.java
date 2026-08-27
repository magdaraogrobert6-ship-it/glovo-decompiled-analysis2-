package com.mapbox.common.module.cronet;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.SizedReadStream;
import com.mapbox.common.module.StreamingDataReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes5.dex */
public final class ReadStreamUploadDataProvider extends UploadDataProvider {
    private final StreamingDataReader reader;

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
        return this.reader.getSize();
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.reader.rewind();
    }

    public ReadStreamUploadDataProvider(SizedReadStream sizedReadStream, int i) {
        sizedReadStream.getClass();
        this.reader = new StreamingDataReader(sizedReadStream, i);
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (uploadDataSink == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("UploadDataSink is null");
            return;
        }
        if (byteBuffer == null) {
            uploadDataSink.onReadError(new IllegalArgumentException("ByteBuffer is null"));
            return;
        }
        while (byteBuffer.hasRemaining() && this.reader.isDataAvailable()) {
            this.reader.writeTo(byteBuffer);
        }
        uploadDataSink.onReadSucceeded(this.reader.getSize() == -1 && !this.reader.isDataAvailable());
    }
}
