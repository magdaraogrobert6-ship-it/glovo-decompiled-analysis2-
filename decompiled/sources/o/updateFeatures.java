package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes5.dex */
public final class updateFeatures extends UploadDataProvider {
    public final Object read = new Object();
    public volatile FileChannel serializer;
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release write;

    public final FileChannel IconCompatParcelizer() {
        if (this.serializer == null) {
            synchronized (this.read) {
                if (this.serializer == null) {
                    this.serializer = this.write.RemoteActionCompatParcelizer();
                }
            }
        }
        return this.serializer;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.serializer;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return IconCompatParcelizer().size();
    }

    public updateFeatures(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
        this.write = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cronet passed a buffer with no bytes remaining");
            return;
        }
        FileChannel fileChannelIconCompatParcelizer = IconCompatParcelizer();
        int i = 0;
        while (i == 0) {
            int i2 = fileChannelIconCompatParcelizer.read(byteBuffer);
            if (i2 == -1) {
                break;
            } else {
                i += i2;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        IconCompatParcelizer().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
