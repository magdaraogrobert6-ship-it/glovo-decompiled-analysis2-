package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.Protocol;
import com.sentiance.okhttp3.u$a;

/* JADX INFO: loaded from: classes3.dex */
public final class setShouldUseWindowFlagSecureInActivities {
    public String IconCompatParcelizer;
    public setShouldPersistWebViewWhenBackgroundingApp MediaBrowserCompatMediaItem;
    public u$a MediaDescriptionCompat;
    public setShouldPersistWebViewWhenBackgroundingApp MediaMetadataCompat;
    public setSmallNotificationIconNameandroid_sdk_base_release MediaSessionCompatQueueItem;
    public long MediaSessionCompatToken;
    public long PlaybackStateCompat;
    public setShouldPersistWebViewWhenBackgroundingApp RatingCompat;
    public setSessionTimeout RemoteActionCompatParcelizer;
    public Protocol read;
    public isFallbackFirebaseMessagingServiceEnabled serializer;
    public int write;

    public setShouldUseWindowFlagSecureInActivities() {
        this.write = -1;
        this.MediaDescriptionCompat = new u$a(0);
    }

    public static void read(String str, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp) {
        if (setshouldpersistwebviewwhenbackgroundingapp.MediaBrowserCompatMediaItem != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(".body != null"));
            return;
        }
        if (setshouldpersistwebviewwhenbackgroundingapp.MediaMetadataCompat != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(".networkResponse != null"));
        } else if (setshouldpersistwebviewwhenbackgroundingapp.MediaSessionCompatQueueItem != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(".cacheResponse != null"));
        } else {
            if (setshouldpersistwebviewwhenbackgroundingapp.MediaDescriptionCompat == null) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(".priorResponse != null"));
        }
    }

    public final setShouldPersistWebViewWhenBackgroundingApp RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer != null) {
            if (this.read != null) {
                int i = this.write;
                if (i >= 0) {
                    if (this.IconCompatParcelizer != null) {
                        return new setShouldPersistWebViewWhenBackgroundingApp(this);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("message == null");
                    return null;
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i, "code < 0: ");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("protocol == null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("request == null");
        return null;
    }

    public setShouldUseWindowFlagSecureInActivities(int i) {
    }
}
