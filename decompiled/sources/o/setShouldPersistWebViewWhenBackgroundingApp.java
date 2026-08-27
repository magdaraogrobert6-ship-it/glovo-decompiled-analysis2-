package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.Protocol;
import com.sentiance.okhttp3.u$a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class setShouldPersistWebViewWhenBackgroundingApp implements Closeable {
    public final isFallbackFirebaseMessagingServiceEnabled IconCompatParcelizer;
    public final setSmallNotificationIconNameandroid_sdk_base_release MediaBrowserCompatMediaItem;
    public final setShouldPersistWebViewWhenBackgroundingApp MediaDescriptionCompat;
    public final setShouldPersistWebViewWhenBackgroundingApp MediaMetadataCompat;
    public final setShouldPersistWebViewWhenBackgroundingApp MediaSessionCompatQueueItem;
    public final long PlaybackStateCompat;
    public final long PlaybackStateCompatCustomAction;
    public final isEphemeralEventsEnabled RatingCompat;
    public final Protocol RemoteActionCompatParcelizer;
    public final String read;
    public final int serializer;
    public final setSessionTimeout write;

    public final setShouldUseWindowFlagSecureInActivities RemoteActionCompatParcelizer() {
        setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivities = new setShouldUseWindowFlagSecureInActivities(0);
        setshouldusewindowflagsecureinactivities.RemoteActionCompatParcelizer = this.write;
        setshouldusewindowflagsecureinactivities.read = this.RemoteActionCompatParcelizer;
        setshouldusewindowflagsecureinactivities.write = this.serializer;
        setshouldusewindowflagsecureinactivities.IconCompatParcelizer = this.read;
        setshouldusewindowflagsecureinactivities.serializer = this.IconCompatParcelizer;
        setshouldusewindowflagsecureinactivities.MediaDescriptionCompat = this.RatingCompat.read();
        setshouldusewindowflagsecureinactivities.MediaSessionCompatQueueItem = this.MediaBrowserCompatMediaItem;
        setshouldusewindowflagsecureinactivities.MediaBrowserCompatMediaItem = this.MediaMetadataCompat;
        setshouldusewindowflagsecureinactivities.RatingCompat = this.MediaSessionCompatQueueItem;
        setshouldusewindowflagsecureinactivities.MediaMetadataCompat = this.MediaDescriptionCompat;
        setshouldusewindowflagsecureinactivities.PlaybackStateCompat = this.PlaybackStateCompat;
        setshouldusewindowflagsecureinactivities.MediaSessionCompatToken = this.PlaybackStateCompatCustomAction;
        return setshouldusewindowflagsecureinactivities;
    }

    public final String read(String str, String str2) {
        String strRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer(str);
        return strRemoteActionCompatParcelizer != null ? strRemoteActionCompatParcelizer : str2;
    }

    public final boolean write() {
        int i = this.serializer;
        return i >= 200 && i < 300;
    }

    public setShouldPersistWebViewWhenBackgroundingApp(setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivities) {
        this.write = setshouldusewindowflagsecureinactivities.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = setshouldusewindowflagsecureinactivities.read;
        this.serializer = setshouldusewindowflagsecureinactivities.write;
        this.read = setshouldusewindowflagsecureinactivities.IconCompatParcelizer;
        this.IconCompatParcelizer = setshouldusewindowflagsecureinactivities.serializer;
        u$a u_a = setshouldusewindowflagsecureinactivities.MediaDescriptionCompat;
        u_a.getClass();
        this.RatingCompat = new isEphemeralEventsEnabled(u_a);
        this.MediaBrowserCompatMediaItem = setshouldusewindowflagsecureinactivities.MediaSessionCompatQueueItem;
        this.MediaMetadataCompat = setshouldusewindowflagsecureinactivities.MediaBrowserCompatMediaItem;
        this.MediaSessionCompatQueueItem = setshouldusewindowflagsecureinactivities.RatingCompat;
        this.MediaDescriptionCompat = setshouldusewindowflagsecureinactivities.MediaMetadataCompat;
        this.PlaybackStateCompat = setshouldusewindowflagsecureinactivities.PlaybackStateCompat;
        this.PlaybackStateCompatCustomAction = setshouldusewindowflagsecureinactivities.MediaSessionCompatToken;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release = this.MediaBrowserCompatMediaItem;
        if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
            setsmallnotificationiconnameandroid_sdk_base_release.close();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("response is not eligible for a body and must not be closed");
        }
    }

    public final String toString() {
        return "Response{protocol=" + this.RemoteActionCompatParcelizer + ", code=" + this.serializer + ", message=" + this.read + ", url=" + this.write.write + '}';
    }
}
