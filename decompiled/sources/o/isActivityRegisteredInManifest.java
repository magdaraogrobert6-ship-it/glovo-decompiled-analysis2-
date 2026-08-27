package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class isActivityRegisteredInManifest implements ItemSingleChoiceBinding {
    public int flags;
    public int left;
    public int length;
    public int padding;
    public final RegistryNoSourceEncoderAvailableException source;
    public int streamId;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.source.RemoteActionCompatParcelizer();
    }

    public isActivityRegisteredInManifest(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        registryNoSourceEncoderAvailableException.getClass();
        this.source = registryNoSourceEncoderAvailableException;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        int i;
        int iMediaSessionCompatResultReceiverWrapper;
        registryMissingComponentException.getClass();
        do {
            int i2 = this.left;
            RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.source;
            if (i2 == 0) {
                registryNoSourceEncoderAvailableException.RatingCompat(this.padding);
                this.padding = 0;
                if ((this.flags & 4) == 0) {
                    i = this.streamId;
                    int iWrite = InAppMessageHtmlBaseViewCompanion.write(registryNoSourceEncoderAvailableException);
                    this.left = iWrite;
                    this.length = iWrite;
                    int iMediaBrowserCompatMediaItem = registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem() & 255;
                    this.flags = registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem() & 255;
                    java.util.logging.Logger logger = getMainActivityIntentdefault.logger;
                    if (logger.isLoggable(Level.FINE)) {
                        RequestBuilder requestBuilder = r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.RemoteActionCompatParcelizer;
                        logger.fine(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.write(this.streamId, this.length, iMediaBrowserCompatMediaItem, this.flags, true));
                    }
                    iMediaSessionCompatResultReceiverWrapper = registryNoSourceEncoderAvailableException.MediaSessionCompatResultReceiverWrapper() & Integer.MAX_VALUE;
                    this.streamId = iMediaSessionCompatResultReceiverWrapper;
                    if (iMediaBrowserCompatMediaItem != 9) {
                        throw new IOException(iMediaBrowserCompatMediaItem + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jRemoteActionCompatParcelizer = registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer(registryMissingComponentException, Math.min(j, i2));
                if (jRemoteActionCompatParcelizer != -1) {
                    this.left -= (int) jRemoteActionCompatParcelizer;
                    return jRemoteActionCompatParcelizer;
                }
            }
            return -1L;
        } while (iMediaSessionCompatResultReceiverWrapper == i);
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("TYPE_CONTINUATION streamId changed");
        return 0L;
    }
}
