package o;

import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class setCustomUserAttributeJSONlambda0 implements ItemSingleChoiceBinding {
    public short IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int RemoteActionCompatParcelizer;
    public int read;
    public final GifDrawableTransformation serializer;
    public byte write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        int i;
        int iMediaSessionCompatResultReceiverWrapper;
        do {
            int i2 = this.read;
            GifDrawableTransformation gifDrawableTransformation = this.serializer;
            if (i2 == 0) {
                gifDrawableTransformation.RatingCompat(this.IconCompatParcelizer);
                this.IconCompatParcelizer = (short) 0;
                if ((this.write & 4) == 0) {
                    i = this.MediaBrowserCompatMediaItem;
                    int i3 = setCustomLocationAttributelambda2.read(gifDrawableTransformation);
                    this.read = i3;
                    this.RemoteActionCompatParcelizer = i3;
                    byte bMediaBrowserCompatMediaItem = (byte) (gifDrawableTransformation.MediaBrowserCompatMediaItem() & 255);
                    this.write = (byte) (gifDrawableTransformation.MediaBrowserCompatMediaItem() & 255);
                    java.util.logging.Logger logger = setCustomLocationAttributelambda2.write;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(setDateOfBirthlambda1.read(true, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, bMediaBrowserCompatMediaItem, this.write));
                    }
                    iMediaSessionCompatResultReceiverWrapper = gifDrawableTransformation.MediaSessionCompatResultReceiverWrapper() & Integer.MAX_VALUE;
                    this.MediaBrowserCompatMediaItem = iMediaSessionCompatResultReceiverWrapper;
                    if (bMediaBrowserCompatMediaItem != 9) {
                        setCustomLocationAttributelambda2.serializer("%s != TYPE_CONTINUATION", Byte.valueOf(bMediaBrowserCompatMediaItem));
                        throw null;
                    }
                }
            } else {
                long jRemoteActionCompatParcelizer = gifDrawableTransformation.RemoteActionCompatParcelizer(registryMissingComponentException, Math.min(j, i2));
                if (jRemoteActionCompatParcelizer != -1) {
                    this.read -= (int) jRemoteActionCompatParcelizer;
                    return jRemoteActionCompatParcelizer;
                }
            }
            return -1L;
        } while (iMediaSessionCompatResultReceiverWrapper == i);
        setCustomLocationAttributelambda2.serializer("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.serializer.source.RemoteActionCompatParcelizer();
    }

    public setCustomUserAttributeJSONlambda0(GifDrawableTransformation gifDrawableTransformation) {
        this.serializer = gifDrawableTransformation;
    }
}
