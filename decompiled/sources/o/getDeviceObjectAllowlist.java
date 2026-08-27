package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.internal.http2.ErrorCode;
import com.sentiance.okhttp3.internal.http2.StreamResetException;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceObjectAllowlist {
    public final getGenericEnumSetFromStringSet IconCompatParcelizer;
    public final getConfigurationCache MediaBrowserCompatMediaItem;
    public final getConfigurationCache MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final getDefaultNotificationChannelDescription MediaSessionCompatQueueItem;
    public ErrorCode ParcelableVolumeInfo;
    public final getDelayedInitializationAnalyticsBehavior RatingCompat;
    public long RemoteActionCompatParcelizer = 0;
    public final int read;
    public final ArrayDeque serializer;
    public long write;

    public final getDelayedInitializationAnalyticsBehavior IconCompatParcelizer() {
        synchronized (this) {
            if (!this.MediaMetadataCompat && !RemoteActionCompatParcelizer()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.RatingCompat;
    }

    public final void MediaBrowserCompatMediaItem() {
        boolean zWrite;
        synchronized (this) {
            this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer = true;
            zWrite = write();
            notifyAll();
        }
        if (zWrite) {
            return;
        }
        this.IconCompatParcelizer.serializer(this.read);
    }

    public final boolean RemoteActionCompatParcelizer(ErrorCode errorCode) {
        synchronized (this) {
            if (this.ParcelableVolumeInfo != null) {
                return false;
            }
            if (this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer && this.RatingCompat.IconCompatParcelizer) {
                return false;
            }
            this.ParcelableVolumeInfo = errorCode;
            notifyAll();
            this.IconCompatParcelizer.serializer(this.read);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    public final void serializer() {
        boolean z;
        boolean zWrite;
        synchronized (this) {
            getDefaultNotificationChannelDescription getdefaultnotificationchanneldescription = this.MediaSessionCompatQueueItem;
            if (getdefaultnotificationchanneldescription.RemoteActionCompatParcelizer || !getdefaultnotificationchanneldescription.write) {
                z = false;
            } else {
                getDelayedInitializationAnalyticsBehavior getdelayedinitializationanalyticsbehavior = this.RatingCompat;
                if (getdelayedinitializationanalyticsbehavior.IconCompatParcelizer || getdelayedinitializationanalyticsbehavior.write) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zWrite = write();
        }
        if (z) {
            write(ErrorCode.CANCEL);
        } else {
            if (zWrite) {
                return;
            }
            this.IconCompatParcelizer.serializer(this.read);
        }
    }

    public final boolean write() {
        synchronized (this) {
            if (this.ParcelableVolumeInfo != null) {
                return false;
            }
            getDefaultNotificationChannelDescription getdefaultnotificationchanneldescription = this.MediaSessionCompatQueueItem;
            if (getdefaultnotificationchanneldescription.RemoteActionCompatParcelizer || getdefaultnotificationchanneldescription.write) {
                getDelayedInitializationAnalyticsBehavior getdelayedinitializationanalyticsbehavior = this.RatingCompat;
                if ((getdelayedinitializationanalyticsbehavior.IconCompatParcelizer || getdelayedinitializationanalyticsbehavior.write) && this.MediaMetadataCompat) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void read() throws IOException {
        getDelayedInitializationAnalyticsBehavior getdelayedinitializationanalyticsbehavior = this.RatingCompat;
        if (getdelayedinitializationanalyticsbehavior.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("stream closed");
        } else {
            if (getdelayedinitializationanalyticsbehavior.IconCompatParcelizer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("stream finished");
                return;
            }
            ErrorCode errorCode = this.ParcelableVolumeInfo;
            if (errorCode != null) {
                throw new StreamResetException(errorCode);
            }
        }
    }

    public getDeviceObjectAllowlist(int i, getGenericEnumSetFromStringSet getgenericenumsetfromstringset, boolean z, boolean z2, isEphemeralEventsEnabled isephemeraleventsenabled) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.serializer = arrayDeque;
        int i2 = 2;
        this.MediaBrowserCompatMediaItem = new getConfigurationCache(i2, this);
        this.MediaDescriptionCompat = new getConfigurationCache(i2, this);
        this.ParcelableVolumeInfo = null;
        if (getgenericenumsetfromstringset == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("connection == null");
            throw null;
        }
        this.read = i;
        this.IconCompatParcelizer = getgenericenumsetfromstringset;
        this.write = getgenericenumsetfromstringset.serializer.IconCompatParcelizer();
        getDefaultNotificationChannelDescription getdefaultnotificationchanneldescription = new getDefaultNotificationChannelDescription(this, getgenericenumsetfromstringset.RemoteActionCompatParcelizer.IconCompatParcelizer());
        this.MediaSessionCompatQueueItem = getdefaultnotificationchanneldescription;
        getDelayedInitializationAnalyticsBehavior getdelayedinitializationanalyticsbehavior = new getDelayedInitializationAnalyticsBehavior(this);
        this.RatingCompat = getdelayedinitializationanalyticsbehavior;
        getdefaultnotificationchanneldescription.RemoteActionCompatParcelizer = z2;
        getdelayedinitializationanalyticsbehavior.IconCompatParcelizer = z;
        if (isephemeraleventsenabled != null) {
            arrayDeque.add(isephemeraleventsenabled);
        }
        if (RemoteActionCompatParcelizer() && isephemeraleventsenabled != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        if (RemoteActionCompatParcelizer() || isephemeraleventsenabled != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("remotely-initiated streams should have headers");
        throw null;
    }

    public final void write(ErrorCode errorCode) {
        if (RemoteActionCompatParcelizer(errorCode)) {
            this.IconCompatParcelizer.write.read(this.read, errorCode);
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem == ((this.read & 1) == 1);
    }
}
