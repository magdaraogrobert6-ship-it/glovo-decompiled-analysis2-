package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class resetMessageMarginslambda0 implements DateTimeConverter {
    public final GlideException IconCompatParcelizer;
    public boolean read;
    public final /* synthetic */ getInAppMessageImageView write;

    @Override // o.DateTimeConverter
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.read) {
                return;
            }
            this.read = true;
            this.write.write.read("0\r\n\r\n");
            GlideException glideException = this.IconCompatParcelizer;
            ApiErrorResponseCompanion apiErrorResponseCompanion = glideException.IconCompatParcelizer;
            glideException.IconCompatParcelizer = ApiErrorResponseCompanion.PlaybackStateCompat;
            apiErrorResponseCompanion.N_();
            apiErrorResponseCompanion.O_();
            this.write.MediaBrowserCompatMediaItem = 3;
        }
    }

    @Override // o.DateTimeConverter, java.io.Flushable
    public final void flush() {
        synchronized (this) {
            if (this.read) {
                return;
            }
            this.write.write.flush();
        }
    }

    @Override // o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) {
        RegistryNoImageHeaderParserException registryNoImageHeaderParserException = this.write.write;
        registryMissingComponentException.getClass();
        if (this.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        } else {
            if (j == 0) {
                return;
            }
            registryNoImageHeaderParserException.MediaSessionCompatQueueItem(j);
            registryNoImageHeaderParserException.read("\r\n");
            registryNoImageHeaderParserException.write(registryMissingComponentException, j);
            registryNoImageHeaderParserException.read("\r\n");
        }
    }

    public resetMessageMarginslambda0(getInAppMessageImageView getinappmessageimageview) {
        this.write = getinappmessageimageview;
        this.IconCompatParcelizer = new GlideException(getinappmessageimageview.write.RemoteActionCompatParcelizer());
    }
}
