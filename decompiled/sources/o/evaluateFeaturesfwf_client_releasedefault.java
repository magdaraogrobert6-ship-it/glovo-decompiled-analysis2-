package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes5.dex */
public final class evaluateFeaturesfwf_client_releasedefault extends UploadDataProvider {
    public final ByteBuffer RemoteActionCompatParcelizer;

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.RemoteActionCompatParcelizer.limit();
    }

    public evaluateFeaturesfwf_client_releasedefault(ByteBuffer byteBuffer) {
        this.RemoteActionCompatParcelizer = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindSucceeded();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cronet passed a buffer with no bytes remaining");
            return;
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.RemoteActionCompatParcelizer;
        if (iRemaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int iLimit = byteBuffer2.limit();
            byteBuffer.put(byteBuffer2);
        }
        uploadDataSink.onReadSucceeded(false);
    }
}
