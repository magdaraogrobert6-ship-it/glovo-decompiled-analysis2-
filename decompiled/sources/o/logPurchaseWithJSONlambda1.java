package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.Socket;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class logPurchaseWithJSONlambda1 implements DateTimeConverter {
    public final parsePropertiesFromQueryBundle MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public RecyclableBufferedInputStreamInvalidMarkException MediaSessionCompatQueueItem;
    public Socket MediaSessionCompatResultReceiverWrapper;
    public final r8lambda1DLeNeBWPKsDsvf_XikspXtDEU MediaSessionCompatToken;
    public boolean read;
    public int serializer;
    public final Object RatingCompat = new Object();
    public final RegistryMissingComponentException RemoteActionCompatParcelizer = new RegistryMissingComponentException();
    public boolean PlaybackStateCompatCustomAction = false;
    public boolean IconCompatParcelizer = false;
    public boolean write = false;

    @Override // o.DateTimeConverter
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return ApiErrorResponseCompanion.PlaybackStateCompat;
    }

    @Override // o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        TextStreamsKt.serializer(registryMissingComponentException, "source");
        if (!this.write) {
            executelambda2.serializer();
            try {
                synchronized (this.RatingCompat) {
                    this.RemoteActionCompatParcelizer.write(registryMissingComponentException, j);
                    int i = this.MediaDescriptionCompat + this.serializer;
                    this.MediaDescriptionCompat = i;
                    boolean z = false;
                    this.serializer = 0;
                    if (!this.read && i > this.MediaMetadataCompat) {
                        this.read = true;
                        z = true;
                    } else {
                        if (!this.PlaybackStateCompatCustomAction && !this.IconCompatParcelizer && this.RemoteActionCompatParcelizer.IconCompatParcelizer() > 0) {
                            this.PlaybackStateCompatCustomAction = true;
                        }
                        executelambda2.serializer.getClass();
                        return;
                    }
                    if (z) {
                        try {
                            this.MediaSessionCompatResultReceiverWrapper.close();
                        } catch (IOException e) {
                            this.MediaSessionCompatToken.IconCompatParcelizer(e);
                        }
                        executelambda2.serializer.getClass();
                        return;
                    }
                    this.MediaBrowserCompatMediaItem.execute(new Rattr(this));
                    executelambda2.serializer.getClass();
                    return;
                }
            } catch (Throwable th) {
                try {
                    executelambda2.serializer.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
    }

    @Override // o.DateTimeConverter, java.io.Flushable
    public final void flush() throws IOException {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
            return;
        }
        executelambda2.serializer();
        try {
            synchronized (this.RatingCompat) {
                if (this.IconCompatParcelizer) {
                    executelambda2.serializer.getClass();
                    return;
                }
                this.IconCompatParcelizer = true;
                this.MediaBrowserCompatMediaItem.execute(new logPurchaseWithJSON(this));
                executelambda2.serializer.getClass();
            }
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public logPurchaseWithJSONlambda1(parsePropertiesFromQueryBundle parsepropertiesfromquerybundle, r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu) {
        TextStreamsKt.serializer(parsepropertiesfromquerybundle, "executor");
        this.MediaBrowserCompatMediaItem = parsepropertiesfromquerybundle;
        this.MediaSessionCompatToken = r8lambda1dlenebwpksdsvf_xikspxtdeu;
        this.MediaMetadataCompat = 10000;
    }

    @Override // o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.write) {
            return;
        }
        this.write = true;
        this.MediaBrowserCompatMediaItem.execute(new isAutomaticGeofenceRequestsEnabled(19, this));
    }

    public final void read(RecyclableBufferedInputStreamInvalidMarkException recyclableBufferedInputStreamInvalidMarkException, Socket socket) {
        TextStreamsKt.RemoteActionCompatParcelizer("AsyncSink's becomeConnected should only be called once.", this.MediaSessionCompatQueueItem == null);
        this.MediaSessionCompatQueueItem = recyclableBufferedInputStreamInvalidMarkException;
        this.MediaSessionCompatResultReceiverWrapper = socket;
    }
}
