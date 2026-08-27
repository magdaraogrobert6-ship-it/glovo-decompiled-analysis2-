package com.mapbox.common.module.okhttp;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.common.SizedReadStream;
import com.mapbox.common.module.StreamingDataReader;
import java.io.IOException;
import o.InAppMessageHtmlBaseView;
import o.RegistryNoImageHeaderParserException;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes5.dex */
public final class StreamingRequestBody extends RequestBody {
    private final InAppMessageHtmlBaseView contentType;
    private final StreamingDataReader reader;

    @Override // okhttp3.RequestBody
    public InAppMessageHtmlBaseView contentType() {
        return this.contentType;
    }

    public final InAppMessageHtmlBaseView getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.reader.getSize();
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return !this.reader.isSingleChunk();
    }

    public StreamingRequestBody(SizedReadStream sizedReadStream, InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        sizedReadStream.getClass();
        this.contentType = inAppMessageHtmlBaseView;
        this.reader = new StreamingDataReader(sizedReadStream, Fields.Clip);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) throws IOException {
        registryNoImageHeaderParserException.getClass();
        while (this.reader.isDataAvailable()) {
            this.reader.writeTo(registryNoImageHeaderParserException);
        }
        if (isOneShot()) {
            return;
        }
        this.reader.rewind();
    }
}
