package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import com.sentiance.core.model.events.N$b;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "PowerInfoProvider")
public class r8lambdaI90we4_tg_9aaM1nBxPMKmLPck extends createOrGetDataStorelambda00 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs> MediaBrowserCompatMediaItem;
    private final PowerManager MediaDescriptionCompat;
    private final ActivityManager MediaMetadataCompat;
    private final component4android_sdk_base_release MediaSessionCompatQueueItem;
    private final ServerConfigDataStoreProviderCompanion MediaSessionCompatResultReceiverWrapper;
    private boolean MediaSessionCompatToken;
    private final readandroid_sdk_base_release ParcelableVolumeInfo;
    private r8lambdaRnojXNNDF2P_Mdhz2GGZemHOBXg PlaybackStateCompatCustomAction;
    private final r8lambdaf7Z7O5nX5rZyS3bCDffDPvu2mtI RatingCompat;
    private final getCooldownEnterSeconds RemoteActionCompatParcelizer;
    private final Context read;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final getVerticalAccuracy write;

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaDescriptionCompat() {
        synchronized (this) {
            BrazeInternal brazeInternalIconCompatParcelizer = IconCompatParcelizer();
            this.IconCompatParcelizer.getClass();
            read(new r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs(brazeInternalIconCompatParcelizer, Long.valueOf(System.currentTimeMillis())));
        }
    }

    private void read(r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs r8lambdauuleoqxagydlh8nvmkyksad9hls) {
        synchronized (this) {
            r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs r8lambdauuleoqxagydlh8nvmkyksad9hls2 = this.MediaBrowserCompatMediaItem.read();
            if (r8lambdauuleoqxagydlh8nvmkyksad9hls2 != null) {
                this.IconCompatParcelizer.getClass();
                if (System.currentTimeMillis() - r8lambdauuleoqxagydlh8nvmkyksad9hls2.IconCompatParcelizer.longValue() > 2592000000L) {
                    RemoteActionCompatParcelizer(r8lambdauuleoqxagydlh8nvmkyksad9hls);
                }
            }
            synchronized (this) {
                r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs r8lambdauuleoqxagydlh8nvmkyksad9hls3 = this.MediaBrowserCompatMediaItem.read();
                if (r8lambdauuleoqxagydlh8nvmkyksad9hls3 == null || !r8lambdauuleoqxagydlh8nvmkyksad9hls.serializer.equals(r8lambdauuleoqxagydlh8nvmkyksad9hls3.serializer)) {
                    RemoteActionCompatParcelizer(r8lambdauuleoqxagydlh8nvmkyksad9hls);
                }
            }
        }
    }

    public final void read() {
        MediaDescriptionCompat();
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    private BrazeInternal IconCompatParcelizer() {
        N$b n$b = new N$b();
        n$b.IconCompatParcelizer = this.RatingCompat.write();
        PowerManager powerManager = this.MediaDescriptionCompat;
        n$b.write = Boolean.valueOf(powerManager.isPowerSaveMode());
        n$b.read = Boolean.valueOf(!powerManager.isIgnoringBatteryOptimizations(this.read.getPackageName()));
        n$b.serializer = Boolean.valueOf(this.MediaMetadataCompat.isBackgroundRestricted());
        return new BrazeInternal(n$b);
    }

    public static void write(r8lambdaI90we4_tg_9aaM1nBxPMKmLPck r8lambdai90we4_tg_9aam1nbxpmkmlpck, long j) {
        getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("PowerInfoUpdateAlarm", r8lambdai90we4_tg_9aam1nbxpmkmlpck.read);
        remoteActionCompatParcelizer.read(j);
        remoteActionCompatParcelizer.serializer(null, r8lambdaL0wABdg1w7ncGmnjQmv9JKCiVJ0.class);
        remoteActionCompatParcelizer.write(true);
        r8lambdai90we4_tg_9aam1nbxpmkmlpck.serializer.IconCompatParcelizer(ControlMessage.ALARM_SCHEDULE, remoteActionCompatParcelizer.write());
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("PowerInfoProvider");
        publishexceptionlambda0.read(28800000L);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(BrazeInternal.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, BrazeInternal.class);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.MediaSessionCompatToken = false;
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(null);
            synchronized (this) {
                r8lambdaRnojXNNDF2P_Mdhz2GGZemHOBXg r8lambdarnojxnndf2p_mdhz2ggzemhobxg = this.PlaybackStateCompatCustomAction;
                if (r8lambdarnojxnndf2p_mdhz2ggzemhobxg != null) {
                    this.MediaSessionCompatResultReceiverWrapper.serializer(r8lambdarnojxnndf2p_mdhz2ggzemhobxg);
                }
            }
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.ParcelableVolumeInfo;
        r8lambdaWUOUChACX35Dx2VgGy3q7nPLQ0 r8lambdawuouchacx35dx2vggy3q7nplq0 = new r8lambdaWUOUChACX35Dx2VgGy3q7nPLQ0(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.serializer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, r8lambdawuouchacx35dx2vggy3q7nplq0);
        getanalyticsenabledenterannotations.read(ControlMessage.CHECK_POWER_INFO, new r8lambda_fN3vn6WiWBEr_iiapAqQ9e0Huo(this, readandroid_sdk_base_releaseVar));
    }

    public r8lambdaI90we4_tg_9aaM1nBxPMKmLPck(Context context, getVerticalAccuracy getverticalaccuracy, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, PowerManager powerManager, r8lambdaf7Z7O5nX5rZyS3bCDffDPvu2mtI r8lambdaf7z7o5nx5rzys3bcdffdpvu2mti, ActivityManager activityManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion) {
        this.read = context;
        this.write = getverticalaccuracy;
        this.serializer = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RemoteActionCompatParcelizer = getcooldownenterseconds;
        this.MediaSessionCompatQueueItem = component4android_sdk_base_releaseVar;
        this.MediaDescriptionCompat = powerManager;
        this.MediaMetadataCompat = activityManager;
        this.RatingCompat = r8lambdaf7z7o5nx5rzys3bcdffdpvu2mti;
        this.ParcelableVolumeInfo = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatResultReceiverWrapper = serverConfigDataStoreProviderCompanion;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.MediaBrowserCompatMediaItem = new r8lambda_ahuNAEFIlpJTVkMM4BK9m592bs(this, System.currentTimeMillis());
    }

    public final BrazeInternal write() {
        BrazeInternal brazeInternalIconCompatParcelizer = IconCompatParcelizer();
        if (this.MediaSessionCompatToken) {
            this.IconCompatParcelizer.getClass();
            read(new r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs(brazeInternalIconCompatParcelizer, Long.valueOf(System.currentTimeMillis())));
        }
        return brazeInternalIconCompatParcelizer;
    }

    public static r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs RemoteActionCompatParcelizer(r8lambdaI90we4_tg_9aaM1nBxPMKmLPck r8lambdai90we4_tg_9aam1nbxpmkmlpck, long j) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        BrazeInternal brazeInternal;
        Optional optional = r8lambdai90we4_tg_9aam1nbxpmkmlpck.RemoteActionCompatParcelizer.read(BrazeInternal.class, Long.valueOf(j));
        if (optional.read() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer(r8lambdai90we4_tg_9aam1nbxpmkmlpck.MediaSessionCompatQueueItem)) == null || (brazeInternal = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.MediaMetadataCompat) == null) {
            return null;
        }
        return new r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs(brazeInternal, r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
    }

    public static void write(r8lambdaI90we4_tg_9aaM1nBxPMKmLPck r8lambdai90we4_tg_9aam1nbxpmkmlpck) {
        synchronized (r8lambdai90we4_tg_9aam1nbxpmkmlpck) {
            r8lambdaRnojXNNDF2P_Mdhz2GGZemHOBXg r8lambdarnojxnndf2p_mdhz2ggzemhobxg = new r8lambdaRnojXNNDF2P_Mdhz2GGZemHOBXg();
            r8lambdai90we4_tg_9aam1nbxpmkmlpck.PlaybackStateCompatCustomAction = r8lambdarnojxnndf2p_mdhz2ggzemhobxg;
            r8lambdai90we4_tg_9aam1nbxpmkmlpck.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(r8lambdarnojxnndf2p_mdhz2ggzemhobxg, r8lambdaRnojXNNDF2P_Mdhz2GGZemHOBXg.IconCompatParcelizer);
        }
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        synchronized (this) {
            MediaDescriptionCompat();
        }
        return false;
    }

    private void RemoteActionCompatParcelizer(r8lambdaUuLeoQxAgydLh8nvMKyKSAd9hLs r8lambdauuleoqxagydlh8nvmkyksad9hls) {
        synchronized (this) {
            this.serializer.serializer(this.write.IconCompatParcelizer(r8lambdauuleoqxagydlh8nvmkyksad9hls.serializer, r8lambdauuleoqxagydlh8nvmkyksad9hls.IconCompatParcelizer.longValue()));
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(r8lambdauuleoqxagydlh8nvmkyksad9hls);
        }
    }
}
