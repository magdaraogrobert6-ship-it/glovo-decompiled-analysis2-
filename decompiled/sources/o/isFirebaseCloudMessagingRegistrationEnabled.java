package o;

import com.sentiance.okhttp3.Protocol;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class isFirebaseCloudMessagingRegistrationEnabled implements Cloneable {
    public static final List read = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List write = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(getTriggerActionMinimumTimeIntervalInSeconds.write, getTriggerActionMinimumTimeIntervalInSeconds.RemoteActionCompatParcelizer);
    public final setTriggerActionMinimumTimeIntervalSeconds ComponentActivity;
    public final isContentCardsUnreadVisualIndicatorEnabled IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final List MediaMetadataCompat;
    public final setTriggerActionMinimumTimeIntervalSeconds MediaSessionCompatQueueItem;
    public final SSLSocketFactory MediaSessionCompatResultReceiverWrapper;
    public final SocketFactory MediaSessionCompatToken;
    public final getShouldUseWindowFlagSecureInActivities ParcelableVolumeInfo;
    public final getShouldAddStatusBarPaddingToInAppMessages PlaybackStateCompat;
    public final setTriggerActionMinimumTimeIntervalSeconds PlaybackStateCompatCustomAction;
    public final ProxySelector RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final setTriggerActionMinimumTimeIntervalSeconds ResultReceiver;
    public final getVersionCode r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final com.sentiance.okhttp3.g r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final setTriggerActionMinimumTimeIntervalSeconds r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final List serializer;

    static {
        setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer = new setTriggerActionMinimumTimeIntervalSeconds();
    }

    public isFirebaseCloudMessagingRegistrationEnabled(isPushWakeScreenForNotificationEnabled ispushwakescreenfornotificationenabled) {
        boolean z;
        this.IconCompatParcelizer = ispushwakescreenfornotificationenabled.read;
        this.serializer = ispushwakescreenfornotificationenabled.write;
        List list = ispushwakescreenfornotificationenabled.RemoteActionCompatParcelizer;
        this.MediaMetadataCompat = list;
        this.MediaBrowserCompatMediaItem = Collections.unmodifiableList(new ArrayList(ispushwakescreenfornotificationenabled.IconCompatParcelizer));
        this.MediaDescriptionCompat = Collections.unmodifiableList(new ArrayList(ispushwakescreenfornotificationenabled.RatingCompat));
        this.MediaSessionCompatQueueItem = ispushwakescreenfornotificationenabled.MediaMetadataCompat;
        this.RatingCompat = ispushwakescreenfornotificationenabled.MediaDescriptionCompat;
        this.PlaybackStateCompatCustomAction = ispushwakescreenfornotificationenabled.MediaBrowserCompatMediaItem;
        this.MediaSessionCompatToken = ispushwakescreenfornotificationenabled.MediaSessionCompatQueueItem;
        Iterator it = list.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = (z || ((getTriggerActionMinimumTimeIntervalInSeconds) it.next()).IconCompatParcelizer) ? true : z;
                }
            }
        }
        if (z) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            getLoggerInitialLogLevel getloggerinitialloglevel = getLoggerInitialLogLevel.RatingCompat;
                            SSLContext sSLContextSerializer = getloggerinitialloglevel.serializer();
                            sSLContextSerializer.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.MediaSessionCompatResultReceiverWrapper = sSLContextSerializer.getSocketFactory();
                            this.PlaybackStateCompat = getloggerinitialloglevel.serializer(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("No System TLS", e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("No System TLS", e2);
            }
        }
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.PlaybackStateCompat = null;
        SSLSocketFactory sSLSocketFactory = this.MediaSessionCompatResultReceiverWrapper;
        if (sSLSocketFactory != null) {
            getLoggerInitialLogLevel.RatingCompat.RemoteActionCompatParcelizer(sSLSocketFactory);
        }
        this.ParcelableVolumeInfo = ispushwakescreenfornotificationenabled.MediaSessionCompatResultReceiverWrapper;
        com.sentiance.okhttp3.g gVar = ispushwakescreenfornotificationenabled.PlaybackStateCompat;
        getShouldAddStatusBarPaddingToInAppMessages getshouldaddstatusbarpaddingtoinappmessages = this.PlaybackStateCompat;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(gVar.write, getshouldaddstatusbarpaddingtoinappmessages) ? gVar : new com.sentiance.okhttp3.g(gVar.read, getshouldaddstatusbarpaddingtoinappmessages);
        this.ResultReceiver = ispushwakescreenfornotificationenabled.PlaybackStateCompatCustomAction;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = ispushwakescreenfornotificationenabled.ParcelableVolumeInfo;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = ispushwakescreenfornotificationenabled.MediaSessionCompatToken;
        this.ComponentActivity = ispushwakescreenfornotificationenabled.ComponentActivity;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = ispushwakescreenfornotificationenabled.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = ispushwakescreenfornotificationenabled.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = ispushwakescreenfornotificationenabled.ResultReceiver;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = ispushwakescreenfornotificationenabled.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = ispushwakescreenfornotificationenabled.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        this.RemoteActionCompatParcelizer = ispushwakescreenfornotificationenabled.serializer;
        if (this.MediaBrowserCompatMediaItem.contains(null)) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.MediaBrowserCompatMediaItem, "Null interceptor: ");
            throw null;
        }
        if (this.MediaDescriptionCompat.contains(null)) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.MediaDescriptionCompat, "Null network interceptor: ");
            throw null;
        }
    }
}
