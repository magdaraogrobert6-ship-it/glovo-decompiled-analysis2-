package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes4.dex */
public final class isActivityRegisteredInManifestlambda0 {
    public IOException IconCompatParcelizer;
    public final getQueryParameterslambda2 MediaBrowserCompatMediaItem;
    public final UriUtilsExternalSyntheticLambda0 MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ MediaSessionCompatQueueItem;
    public long MediaSessionCompatResultReceiverWrapper;
    public long ParcelableVolumeInfo;
    public final getQueryParameterslambda0 PlaybackStateCompatCustomAction;
    public final getQueryParameterslambda0 RatingCompat;
    public final createHorizontalAnimation RemoteActionCompatParcelizer;
    public final ArrayDeque read;
    public InAppMessageSlideupView serializer;
    public boolean write;

    public final boolean read() {
        synchronized (this) {
            if (serializer() != null) {
                return false;
            }
            getQueryParameterslambda2 getqueryparameterslambda2 = this.MediaBrowserCompatMediaItem;
            if (getqueryparameterslambda2.read || getqueryparameterslambda2.write) {
                UriUtilsExternalSyntheticLambda0 uriUtilsExternalSyntheticLambda0 = this.MediaDescriptionCompat;
                if ((uriUtilsExternalSyntheticLambda0.read || uriUtilsExternalSyntheticLambda0.serializer) && this.write) {
                    return false;
                }
            }
            return true;
        }
    }

    public final InAppMessageSlideupView serializer() {
        InAppMessageSlideupView inAppMessageSlideupView;
        synchronized (this) {
            inAppMessageSlideupView = this.serializer;
        }
        return inAppMessageSlideupView;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void RemoteActionCompatParcelizer() {
        boolean z;
        boolean z2;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        synchronized (this) {
            getQueryParameterslambda2 getqueryparameterslambda2 = this.MediaBrowserCompatMediaItem;
            if (getqueryparameterslambda2.read || !getqueryparameterslambda2.write) {
                z = false;
            } else {
                UriUtilsExternalSyntheticLambda0 uriUtilsExternalSyntheticLambda0 = this.MediaDescriptionCompat;
                if (uriUtilsExternalSyntheticLambda0.read || uriUtilsExternalSyntheticLambda0.serializer) {
                    z = true;
                } else {
                    z = false;
                }
            }
            z2 = read();
        }
        if (z) {
            write(InAppMessageSlideupView.CANCEL, null);
        } else {
            if (z2) {
                return;
            }
            this.RemoteActionCompatParcelizer.serializer(this.MediaMetadataCompat);
        }
    }

    public final boolean read(InAppMessageSlideupView inAppMessageSlideupView, IOException iOException) {
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        synchronized (this) {
            if (serializer() != null) {
                return false;
            }
            this.serializer = inAppMessageSlideupView;
            this.IconCompatParcelizer = iOException;
            notifyAll();
            if (this.MediaBrowserCompatMediaItem.read && this.MediaDescriptionCompat.read) {
                return false;
            }
            this.RemoteActionCompatParcelizer.serializer(this.MediaMetadataCompat);
            return true;
        }
    }

    public final void write() throws IOException {
        UriUtilsExternalSyntheticLambda0 uriUtilsExternalSyntheticLambda0 = this.MediaDescriptionCompat;
        if (uriUtilsExternalSyntheticLambda0.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("stream closed");
            return;
        }
        if (uriUtilsExternalSyntheticLambda0.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("stream finished");
            return;
        }
        if (serializer() != null) {
            IOException iOException = this.IconCompatParcelizer;
            if (iOException != null) {
                throw iOException;
            }
            InAppMessageSlideupView inAppMessageSlideupViewSerializer = serializer();
            inAppMessageSlideupViewSerializer.getClass();
            throw new StreamResetException(inAppMessageSlideupViewSerializer);
        }
    }

    public isActivityRegisteredInManifestlambda0(int i, createHorizontalAnimation createhorizontalanimation, boolean z, boolean z2, resetMessageMarginslambda00 resetmessagemarginslambda00) {
        createhorizontalanimation.getClass();
        this.MediaMetadataCompat = i;
        this.RemoteActionCompatParcelizer = createhorizontalanimation;
        this.MediaSessionCompatQueueItem = new r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ(i);
        this.ParcelableVolumeInfo = createhorizontalanimation.peerSettings.serializer();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.read = arrayDeque;
        this.MediaBrowserCompatMediaItem = new getQueryParameterslambda2(this, createhorizontalanimation.okHttpSettings.serializer(), z2);
        this.MediaDescriptionCompat = new UriUtilsExternalSyntheticLambda0(this, z);
        this.RatingCompat = new getQueryParameterslambda0(this);
        this.PlaybackStateCompatCustomAction = new getQueryParameterslambda0(this);
        if (resetmessagemarginslambda00 == null) {
            if (IconCompatParcelizer()) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("remotely-initiated streams should have headers");
            throw null;
        }
        if (IconCompatParcelizer()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(resetmessagemarginslambda00);
    }

    public final void IconCompatParcelizer(resetMessageMarginslambda00 resetmessagemarginslambda00, boolean z) {
        boolean z2;
        resetmessagemarginslambda00.getClass();
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        synchronized (this) {
            if (this.write && resetmessagemarginslambda00.write(":status") == null && resetmessagemarginslambda00.write(":method") == null) {
                this.MediaBrowserCompatMediaItem.getClass();
            } else {
                this.write = true;
                this.read.add(resetmessagemarginslambda00);
            }
            if (z) {
                this.MediaBrowserCompatMediaItem.read = true;
            }
            z2 = read();
            notifyAll();
        }
        if (z2) {
            return;
        }
        this.RemoteActionCompatParcelizer.serializer(this.MediaMetadataCompat);
    }

    public final void write(InAppMessageSlideupView inAppMessageSlideupView, IOException iOException) {
        inAppMessageSlideupView.getClass();
        if (read(inAppMessageSlideupView, iOException)) {
            createHorizontalAnimation createhorizontalanimation = this.RemoteActionCompatParcelizer;
            createhorizontalanimation.getClass();
            createhorizontalanimation.writer.RemoteActionCompatParcelizer(this.MediaMetadataCompat, inAppMessageSlideupView);
        }
    }

    public final void IconCompatParcelizer(InAppMessageSlideupView inAppMessageSlideupView) {
        inAppMessageSlideupView.getClass();
        if (read(inAppMessageSlideupView, null)) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.MediaMetadataCompat, inAppMessageSlideupView);
        }
    }

    public final boolean IconCompatParcelizer() {
        boolean z = (this.MediaMetadataCompat & 1) == 1;
        this.RemoteActionCompatParcelizer.getClass();
        return true == z;
    }
}
