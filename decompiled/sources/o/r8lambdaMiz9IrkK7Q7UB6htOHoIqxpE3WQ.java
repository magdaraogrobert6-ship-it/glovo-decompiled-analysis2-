package o;

import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import io.sentry.util.network.NetworkBody;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "AppForegroundSessionManager", componentName = "AppForegroundSessionManager")
public class r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private static final List<Byte> serializer = Arrays.asList((byte) 2, (byte) 3, (byte) 13);
    private final com.sentiance.sdk.util.c IconCompatParcelizer;
    private final populateNotificationBuilderlambda1 MediaBrowserCompatMediaItem;
    private final onLocationRequestCompletelambda1 MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private final readandroid_sdk_base_release MediaSessionCompatQueueItem;
    private final ConfigurationManager MediaSessionCompatResultReceiverWrapper;
    private boolean MediaSessionCompatToken;
    private final migrateTriggersReeligibilityToJsonlambda1<Boolean> ParcelableVolumeInfo;
    private final migrateTriggersReeligibilityToJsonlambda1<Boolean> PlaybackStateCompat;
    private r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 PlaybackStateCompatCustomAction;
    private final getCooldownEnterSeconds RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private BannerExternalSyntheticLambda0 ResultReceiver;
    private final getVerticalAccuracy read;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.PlaybackStateCompatCustomAction = null;
        this.ResultReceiver = null;
        this.MediaSessionCompatToken = false;
        this.PlaybackStateCompat.write();
        this.write.IconCompatParcelizer();
        this.IconCompatParcelizer.read();
        this.ParcelableVolumeInfo.write();
    }

    private byte IconCompatParcelizer() {
        int i = r8lambdaLO7BTouWWM3AKC8uHzRiEgpEDYk.read[this.MediaDescriptionCompat.write().ordinal()];
        if (i != 1) {
            return i != 2 ? (byte) 3 : (byte) 4;
        }
        return (byte) 5;
    }

    private void IconCompatParcelizer(long j, boolean z) {
        String strWrite;
        com.sentiance.sdk.util.c cVar = this.IconCompatParcelizer;
        if (z) {
            strWrite = UUID.randomUUID().toString();
            cVar.RemoteActionCompatParcelizer("ongoing_session_id", strWrite);
        } else {
            strWrite = cVar.write("ongoing_session_id", (String) null);
        }
        if (strWrite == null) {
            return;
        }
        this.ParcelableVolumeInfo.read(Boolean.valueOf(z));
        this.read.getClass();
        NetworkBody networkBody = new NetworkBody(14);
        networkBody.RemoteActionCompatParcelizer = Byte.valueOf(z ? (byte) 1 : (byte) 2);
        networkBody.IconCompatParcelizer = strWrite;
        reenqueueInAppMessage reenqueueinappmessage = networkBody.read();
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = reenqueueinappmessage;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(j);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer;
        this.RemoteActionCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }

    public static void read(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ r8lambdamiz9irkk7q7ub6htohoiqxpe3wq) {
        r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.MediaMetadataCompat.getClass();
        r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(System.currentTimeMillis(), r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(System.currentTimeMillis()).IconCompatParcelizer());
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.PlaybackStateCompat.read().booleanValue();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        getCooldownEnterSeconds getcooldownenterseconds = this.RatingCompat;
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(reenqueueInAppMessage.class, (Long) null).RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(readVarRemoteActionCompatParcelizer, map, reenqueueInAppMessage.class);
        }
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer2 = getcooldownenterseconds.IconCompatParcelizer(r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class, (Long) null).RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer2 != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(readVarRemoteActionCompatParcelizer2, map, r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class);
        }
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer3 = getcooldownenterseconds.IconCompatParcelizer(subscribeToBannersDismissedEvent.class, (Long) null).RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer3 != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(readVarRemoteActionCompatParcelizer3, map, subscribeToBannersDismissedEvent.class);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.MediaSessionCompatQueueItem;
        r8lambdaQas8BY90k4E_z5u1zlP_eSaUi9U r8lambdaqas8by90k4e_z5u1zlp_esaui9u = new r8lambdaQas8BY90k4E_z5u1zlP_eSaUi9U(this, readandroid_sdk_base_releaseVar);
        r8lambdaPr_fxgVK1V4_958K5Zjep55Ttmg r8lambdapr_fxgvk1v4_958k5zjep55ttmg = new r8lambdaPr_fxgVK1V4_958K5Zjep55Ttmg(this, readandroid_sdk_base_releaseVar);
        r8lambdaR9PZguiXIZBAzgCzPqX412sMxUE r8lambdar9pzguixizbazgczpqx412smxue = new r8lambdaR9PZguiXIZBAzgCzPqX412sMxUE(this, readandroid_sdk_base_releaseVar);
        r8lambdaZMiU5RUBssnpB0OQ9CTzoBfcKz8 r8lambdazmiu5rubssnpb0oq9ctzobfckz8 = new r8lambdaZMiU5RUBssnpB0OQ9CTzoBfcKz8(this, readandroid_sdk_base_releaseVar);
        r8lambda_HiqU0ULETnzoxiKaKxnkvnYAw r8lambda_hiqu0uletnzoxikakxnkvnyaw = new r8lambda_HiqU0ULETnzoxiKaKxnkvnYAw(this, readandroid_sdk_base_releaseVar);
        r8lambdabgCO6Ohxx72INl06Rno2SNqcs7U r8lambdabgco6ohxx72inl06rno2snqcs7u = new r8lambdabgCO6Ohxx72INl06Rno2SNqcs7U(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class, r8lambdapr_fxgvk1v4_958k5zjep55ttmg);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(subscribeToBannersDismissedEvent.class, r8lambdar9pzguixizbazgczpqx412smxue);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, r8lambdazmiu5rubssnpb0oq9ctzobfckz8);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, r8lambdabgco6ohxx72inl06rno2snqcs7u);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.class, r8lambda_hiqu0uletnzoxikakxnkvnyaw);
        getanalyticsenabledenterannotations.read(ControlMessage.CONFIGURATION_UPDATED, r8lambdaqas8by90k4e_z5u1zlp_esaui9u);
    }

    public r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, ConfigurationManager configurationManager, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, com.sentiance.sdk.util.c cVar, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg) {
        this.IconCompatParcelizer = cVar;
        this.write = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.MediaSessionCompatQueueItem = readandroid_sdk_base_releaseVar;
        this.RatingCompat = getcooldownenterseconds;
        this.read = getverticalaccuracy;
        this.MediaDescriptionCompat = onlocationrequestcompletelambda1;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = populatenotificationbuilderlambda1;
        this.MediaSessionCompatResultReceiverWrapper = configurationManager;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.ParcelableVolumeInfo = new r8lambdaOOlih4mJrp7NXsKFQkjEW4_nQ_o(getcooldownenterseconds, component4android_sdk_base_releaseVar, System.currentTimeMillis());
        this.PlaybackStateCompat = new r8lambdaJkvFb0LWnjq1VekDkmyolQjqG9c(r8lambda7zcvodb3ypljdzjmgkbnvobyklg);
    }

    private r8lambdaO2GbCdoQS7Bq2A4A9o6DHzpD59Y read(long j) {
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer(Arrays.asList(r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class, subscribeToBannersDismissedEvent.class), Long.valueOf(j), false).RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer != null) {
            return new r8lambdaO2GbCdoQS7Bq2A4A9o6DHzpD59Y(r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class == getBitmapFromCache.IconCompatParcelizer(readVarRemoteActionCompatParcelizer, this.read), readVarRemoteActionCompatParcelizer.serializer());
        }
        return new r8lambdaO2GbCdoQS7Bq2A4A9o6DHzpD59Y(false, j);
    }

    private void read(long j, boolean z) {
        Byte next;
        byte bIconCompatParcelizer = IconCompatParcelizer();
        ConfigurationManager configurationManager = this.MediaSessionCompatResultReceiverWrapper;
        boolean zRatingCompat = configurationManager.RatingCompat(bIconCompatParcelizer);
        migrateTriggersReeligibilityToJsonlambda1<Boolean> migratetriggersreeligibilitytojsonlambda1 = this.ParcelableVolumeInfo;
        if (zRatingCompat) {
            HashSet hashSet = this.MediaBrowserCompatMediaItem.read();
            Iterator<Byte> it = serializer.iterator();
            do {
                if (!it.hasNext()) {
                    if (!this.PlaybackStateCompat.read().booleanValue()) {
                        break;
                    }
                    if (migratetriggersreeligibilitytojsonlambda1.read().booleanValue() != z) {
                        IconCompatParcelizer(j, z);
                        read(z);
                        return;
                    } else {
                        if (z) {
                            r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Serializer = configurationManager.serializer(IconCompatParcelizer());
                            BannerExternalSyntheticLambda0 bannerExternalSyntheticLambda0 = configurationManager.read("AppForegroundSessionManager", IconCompatParcelizer());
                            if (Objects.equals(r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Serializer, this.PlaybackStateCompatCustomAction) && Objects.equals(bannerExternalSyntheticLambda0, this.ResultReceiver)) {
                                return;
                            }
                            read(true);
                            return;
                        }
                        return;
                    }
                }
                next = it.next();
                next.getClass();
            } while (!hashSet.contains(next));
        }
        if (migratetriggersreeligibilitytojsonlambda1.read().booleanValue()) {
            IconCompatParcelizer(j, false);
            read(false);
        }
    }

    private void read(boolean z) {
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4 = this.write;
        if (!z) {
            this.PlaybackStateCompatCustomAction = null;
            this.ResultReceiver = null;
            r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.IconCompatParcelizer();
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_STOP, new getDismissalTimeMsannotations("AppForegroundSessionManager"));
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.SENSORS_STOP, new getBannerId("AppForegroundSessionManager"));
            return;
        }
        byte bIconCompatParcelizer = IconCompatParcelizer();
        ConfigurationManager configurationManager = this.MediaSessionCompatResultReceiverWrapper;
        r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Serializer = configurationManager.serializer(bIconCompatParcelizer);
        if (!Objects.equals(r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Serializer, this.PlaybackStateCompatCustomAction)) {
            if (r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Serializer != null) {
                this.PlaybackStateCompatCustomAction = r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Serializer;
                getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Serializer);
            } else {
                this.PlaybackStateCompatCustomAction = null;
                getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_STOP, new getDismissalTimeMsannotations("AppForegroundSessionManager"));
            }
        }
        BannerExternalSyntheticLambda0 bannerExternalSyntheticLambda0 = configurationManager.read("AppForegroundSessionManager", IconCompatParcelizer());
        if (!Objects.equals(bannerExternalSyntheticLambda0, this.ResultReceiver)) {
            if (bannerExternalSyntheticLambda0 != null) {
                this.ResultReceiver = bannerExternalSyntheticLambda0;
                getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.SENSORS_START, bannerExternalSyntheticLambda0);
            } else if (this.ResultReceiver != null) {
                this.ResultReceiver = null;
                getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.SENSORS_STOP, new getBannerId("AppForegroundSessionManager"));
            }
        }
        if (this.PlaybackStateCompatCustomAction == null && this.ResultReceiver == null) {
            r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.IconCompatParcelizer();
        } else {
            r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.read();
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.PlaybackStateCompat.read(Boolean.valueOf(z));
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(18, this));
    }

    public static void serializer(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ r8lambdamiz9irkk7q7ub6htohoiqxpe3wq) {
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.MediaMetadataCompat;
        if (r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.MediaSessionCompatToken) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(System.currentTimeMillis(), r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(System.currentTimeMillis()).IconCompatParcelizer());
        }
    }

    public static void RemoteActionCompatParcelizer(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ r8lambdamiz9irkk7q7ub6htohoiqxpe3wq, long j) {
        r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.MediaSessionCompatToken = true;
        r8lambdaO2GbCdoQS7Bq2A4A9o6DHzpD59Y r8lambdao2gbcdoqs7bq2a4a9o6dhzpd59y = r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(j);
        r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(r8lambdao2gbcdoqs7bq2a4a9o6dhzpd59y.RemoteActionCompatParcelizer(), r8lambdao2gbcdoqs7bq2a4a9o6dhzpd59y.IconCompatParcelizer());
    }

    public static void IconCompatParcelizer(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ r8lambdamiz9irkk7q7ub6htohoiqxpe3wq, boolean z, long j) {
        r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(j, z);
    }

    public static void write(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ r8lambdamiz9irkk7q7ub6htohoiqxpe3wq, long j) {
        r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(j, r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(j).IconCompatParcelizer());
    }

    public static void write(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ r8lambdamiz9irkk7q7ub6htohoiqxpe3wq) {
        r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.MediaMetadataCompat.getClass();
        r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(System.currentTimeMillis(), r8lambdamiz9irkk7q7ub6htohoiqxpe3wq.read(System.currentTimeMillis()).IconCompatParcelizer());
    }
}
