package o;

import android.content.Context;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.services.ServiceForegroundMode;
import com.sentiance.sdk.util.Optional;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "StationaryAssistant")
public class r8lambdaJAzuAI86BqHAUWuq3a942DKIySE implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda1<addNotificationAction> MediaBrowserCompatMediaItem;
    private final getCooldownEnterSeconds MediaDescriptionCompat;
    private final r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE MediaMetadataCompat;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatResultReceiverWrapper;
    private long ParcelableVolumeInfo;
    private final ZM$$ExternalSyntheticLambda2 PlaybackStateCompatCustomAction = new ZM$$ExternalSyntheticLambda2(28, this);
    private final getVerticalAccuracy RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private final parseLonglambda0 serializer;
    private final readandroid_sdk_base_release write;

    private void write() {
        this.serializer.IconCompatParcelizer("cancelLocationFixes", new Object[0]);
        this.write.IconCompatParcelizer(this.PlaybackStateCompatCustomAction);
        this.MediaSessionCompatQueueItem.IconCompatParcelizer();
        ControlMessage controlMessage = ControlMessage.LOCATION_FIX_STOP;
        getDismissalTimeMsannotations getdismissaltimemsannotations = new getDismissalTimeMsannotations("StationaryAssistant");
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        getanalyticsenabledenterannotations.IconCompatParcelizer(controlMessage, getdismissaltimemsannotations);
        ControlMessage controlMessage2 = ControlMessage.ALARM_CANCEL;
        getanalyticsenabledenterannotations.IconCompatParcelizer(controlMessage2, serializer());
        getanalyticsenabledenterannotations.IconCompatParcelizer(controlMessage2, read());
    }

    public static void write(r8lambdaJAzuAI86BqHAUWuq3a942DKIySE r8lambdajazuai86bqhauwuq3a942dkiyse, handleInAppMessageTestPush handleinappmessagetestpush) {
        boolean z;
        synchronized (r8lambdajazuai86bqhauwuq3a942dkiyse) {
            r8lambdajazuai86bqhauwuq3a942dkiyse.serializer.IconCompatParcelizer("onNewActivityTransitionEvent", new Object[0]);
            r8lambdajazuai86bqhauwuq3a942dkiyse.read.IconCompatParcelizer(ControlMessage.ALARM_CANCEL, r8lambdajazuai86bqhauwuq3a942dkiyse.read());
            addNotificationAction addnotificationaction = r8lambdajazuai86bqhauwuq3a942dkiyse.MediaBrowserCompatMediaItem.read();
            if (addnotificationaction.read == null) {
                r8lambdajazuai86bqhauwuq3a942dkiyse.serializer.IconCompatParcelizer("mCurrentMovingState null", new Object[0]);
                r8lambdajazuai86bqhauwuq3a942dkiyse.RemoteActionCompatParcelizer();
                r8lambdajazuai86bqhauwuq3a942dkiyse.write();
            } else {
                if (addnotificationaction.read == wipeDatalambda0.class) {
                    z = handleinappmessagetestpush.write.byteValue() == 5;
                    parseLonglambda0 parselonglambda0 = r8lambdajazuai86bqhauwuq3a942dkiyse.serializer;
                    if (z) {
                        parselonglambda0.IconCompatParcelizer("transition is idle", new Object[0]);
                        r8lambdajazuai86bqhauwuq3a942dkiyse.IconCompatParcelizer((Boolean) null);
                    } else {
                        parselonglambda0.IconCompatParcelizer("transition is not idle", new Object[0]);
                        r8lambdajazuai86bqhauwuq3a942dkiyse.RemoteActionCompatParcelizer(null, null);
                        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = r8lambdajazuai86bqhauwuq3a942dkiyse.read;
                        ControlMessage controlMessage = ControlMessage.ALARM_SCHEDULE;
                        getanalyticsenabledenterannotations.IconCompatParcelizer(controlMessage, r8lambdajazuai86bqhauwuq3a942dkiyse.read());
                        if (handleinappmessagetestpush.write.byteValue() != 8) {
                            r8lambdajazuai86bqhauwuq3a942dkiyse.read.IconCompatParcelizer(controlMessage, r8lambdajazuai86bqhauwuq3a942dkiyse.serializer());
                        }
                    }
                } else if (addnotificationaction.read == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
                    if (handleinappmessagetestpush.write.byteValue() == 8) {
                        r8lambdajazuai86bqhauwuq3a942dkiyse.serializer.IconCompatParcelizer("transition is walking", new Object[0]);
                        r8lambdajazuai86bqhauwuq3a942dkiyse.IconCompatParcelizer(Boolean.FALSE);
                        r8lambdajazuai86bqhauwuq3a942dkiyse.read.IconCompatParcelizer(ControlMessage.ALARM_SCHEDULE, r8lambdajazuai86bqhauwuq3a942dkiyse.read());
                    } else {
                        z = handleinappmessagetestpush.write.byteValue() == 5;
                        parseLonglambda0 parselonglambda1 = r8lambdajazuai86bqhauwuq3a942dkiyse.serializer;
                        if (z) {
                            parselonglambda1.IconCompatParcelizer("transition is idle", new Object[0]);
                            r8lambdajazuai86bqhauwuq3a942dkiyse.write();
                        } else {
                            parselonglambda1.IconCompatParcelizer("transition is a movement of type non-walking", new Object[0]);
                            r8lambdajazuai86bqhauwuq3a942dkiyse.RemoteActionCompatParcelizer(Boolean.FALSE, Boolean.TRUE);
                            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations2 = r8lambdajazuai86bqhauwuq3a942dkiyse.read;
                            ControlMessage controlMessage2 = ControlMessage.ALARM_SCHEDULE;
                            getanalyticsenabledenterannotations2.IconCompatParcelizer(controlMessage2, r8lambdajazuai86bqhauwuq3a942dkiyse.serializer());
                            r8lambdajazuai86bqhauwuq3a942dkiyse.read.IconCompatParcelizer(controlMessage2, r8lambdajazuai86bqhauwuq3a942dkiyse.read());
                        }
                    }
                }
            }
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            write();
            this.MediaSessionCompatQueueItem.IconCompatParcelizer();
            this.MediaBrowserCompatMediaItem.read(new addNotificationAction(0L, null));
            this.ParcelableVolumeInfo = 0L;
            this.MediaSessionCompatResultReceiverWrapper = false;
        }
    }

    public static void MediaMetadataCompat(r8lambdaJAzuAI86BqHAUWuq3a942DKIySE r8lambdajazuai86bqhauwuq3a942dkiyse) {
        r8lambdaFGxRyuGCIXCDByzs1zykYAoet44 r8lambdafgxryugcixcdbyzs1zykyaoet44 = new r8lambdaFGxRyuGCIXCDByzs1zykYAoet44(r8lambdajazuai86bqhauwuq3a942dkiyse, r8lambdajazuai86bqhauwuq3a942dkiyse.write);
        HashMap map = new HashMap();
        Iterator<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> it = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            map.put(it.next(), r8lambdafgxryugcixcdbyzs1zykyaoet44);
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = r8lambdajazuai86bqhauwuq3a942dkiyse.read;
        long jCurrentTimeMillis = r8lambdajazuai86bqhauwuq3a942dkiyse.ParcelableVolumeInfo;
        if (jCurrentTimeMillis <= 0) {
            r8lambdajazuai86bqhauwuq3a942dkiyse.IconCompatParcelizer.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        getanalyticsenabledenterannotations.IconCompatParcelizer(map, jCurrentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaSessionCompatQueueItem() {
        synchronized (this) {
            write();
            RemoteActionCompatParcelizer();
            Class cls = this.MediaBrowserCompatMediaItem.read().read;
            if (cls != null) {
                this.serializer.IconCompatParcelizer("CurrentMovingState: ".concat(cls.getName()), new Object[0]);
            }
            if (cls == wipeDatalambda0.class) {
                this.serializer.IconCompatParcelizer("Moving state is Geofenceless Stationary", new Object[0]);
                if (this.MediaMetadataCompat.IconCompatParcelizer()) {
                    this.serializer.IconCompatParcelizer("startActivityTransitionUpdates", new Object[0]);
                    this.read.IconCompatParcelizer(ControlMessage.ACTIVITY_TRANSITION_START, "StationaryAssistant");
                    IconCompatParcelizer((Boolean) null);
                } else {
                    RemoteActionCompatParcelizer(null, null);
                }
            } else if (cls == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class && this.MediaMetadataCompat.IconCompatParcelizer()) {
                this.serializer.IconCompatParcelizer("startActivityTransitionUpdates", new Object[0]);
                this.read.IconCompatParcelizer(ControlMessage.ACTIVITY_TRANSITION_START, "StationaryAssistant");
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        if (this.MediaMetadataCompat.IconCompatParcelizer()) {
            this.serializer.IconCompatParcelizer("cancelActivityTransitionUpdates", new Object[0]);
            this.read.IconCompatParcelizer(ControlMessage.ACTIVITY_TRANSITION_STOP, "StationaryAssistant");
        }
    }

    private getGeofenceTransitionPendingIntent serializer() {
        getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("StationaryAssistantDelayedSingleFixRequestReceiver", this.RemoteActionCompatParcelizer);
        remoteActionCompatParcelizer.read(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(true);
        remoteActionCompatParcelizer.serializer(null, r8lambdaAWqeVQ6wV2yQLfCPB4VVQBNb7W4.class);
        return remoteActionCompatParcelizer.write();
    }

    public final void IconCompatParcelizer() {
        addNotificationAction addnotificationaction = this.MediaBrowserCompatMediaItem.read();
        if (addnotificationaction.read == wipeDatalambda0.class) {
            IconCompatParcelizer((Boolean) null);
        } else if (addnotificationaction.read == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
            write();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = this.MediaDescriptionCompat;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, (Long) null, false);
        boolean zIconCompatParcelizer = optionalRemoteActionCompatParcelizer.IconCompatParcelizer();
        getVerticalAccuracy getverticalaccuracy = this.RatingCompat;
        if (zIconCompatParcelizer) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), getverticalaccuracy));
        }
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(Arrays.asList(requestGeofenceRefresh.class, unsubscribeFromBannersDismissedEvent.class), (Long) null, false);
        if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer2.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer2.write(), getverticalaccuracy));
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalIconCompatParcelizer.write(), getverticalaccuracy));
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.IconCompatParcelizer.getClass();
        this.ParcelableVolumeInfo = System.currentTimeMillis();
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.write;
        BrazeNotificationFactoryCompanion brazeNotificationFactoryCompanion = new BrazeNotificationFactoryCompanion(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, brazeNotificationFactoryCompanion);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(requestGeofenceRefresh.class, new populateNotificationBuilder(this, readandroid_sdk_base_releaseVar, this.MediaDescriptionCompat));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(handleInAppMessageTestPush.class, new logNotificationActionClicked(this, readandroid_sdk_base_releaseVar));
    }

    public r8lambdaJAzuAI86BqHAUWuq3a942DKIySE(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE r8lambdatiezsvb60pafqh0pucdjruvm2qe) {
        this.RemoteActionCompatParcelizer = context;
        this.read = getanalyticsenabledenterannotations;
        this.serializer = parselonglambda0;
        this.write = readandroid_sdk_base_releaseVar;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = getcooldownenterseconds;
        this.RatingCompat = getverticalaccuracy;
        this.MediaSessionCompatQueueItem = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.MediaMetadataCompat = r8lambdatiezsvb60pafqh0pucdjruvm2qe;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.MediaBrowserCompatMediaItem = new BrazeNotificationFactory(this, System.currentTimeMillis());
    }

    public static void MediaDescriptionCompat(r8lambdaJAzuAI86BqHAUWuq3a942DKIySE r8lambdajazuai86bqhauwuq3a942dkiyse) {
        if (r8lambdajazuai86bqhauwuq3a942dkiyse.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        r8lambdajazuai86bqhauwuq3a942dkiyse.MediaSessionCompatResultReceiverWrapper = true;
        r8lambdajazuai86bqhauwuq3a942dkiyse.MediaSessionCompatQueueItem();
    }

    private getGeofenceTransitionPendingIntent read() {
        getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("ActivityBasedLocationRequestsTimeout", this.RemoteActionCompatParcelizer);
        remoteActionCompatParcelizer.read(600000L);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(true);
        remoteActionCompatParcelizer.serializer(null, handleBrazeRemoteMessage.class);
        return remoteActionCompatParcelizer.write();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    private void RemoteActionCompatParcelizer(Boolean bool, Boolean bool2) {
        boolean zBooleanValue;
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.IconCompatParcelizer;
        boolean zBooleanValue2 = false;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
            if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                if (System.currentTimeMillis() - optionalIconCompatParcelizer.write().serializer() >= 120000) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
        }
        parseLonglambda0 parselonglambda0 = this.serializer;
        parselonglambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("startNonIdleStateLocationFixes - immediate? ", zBooleanValue), new Object[0]);
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.MediaBrowserCompatMediaItem.read().RemoteActionCompatParcelizer;
        if (bool != null) {
            zBooleanValue2 = bool.booleanValue();
        } else if (jCurrentTimeMillis < 1200000) {
            zBooleanValue2 = true;
        }
        if (zBooleanValue2) {
            this.write.IconCompatParcelizer("StationaryAssistant", 1200000 - jCurrentTimeMillis, this.PlaybackStateCompatCustomAction);
            this.MediaSessionCompatQueueItem.read();
        }
        parselonglambda0.IconCompatParcelizer("In a stationary state for %d mins", Long.valueOf(jCurrentTimeMillis / 60000));
        this.read.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read("StationaryAssistant", 120000L, ServiceForegroundMode.O_ONLY, zBooleanValue, zBooleanValue2, StartLocationFixRequest$Purpose.DETECTIONS));
    }

    private void IconCompatParcelizer(Boolean bool) {
        boolean z;
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
            if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
                this.IconCompatParcelizer.getClass();
                if (System.currentTimeMillis() - optionalIconCompatParcelizer.write().serializer() >= 300000) {
                    zBooleanValue = true;
                }
                this.serializer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("startIdleStateLocationFixes - immediate? ", z), new Object[0]);
                this.read.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read("StationaryAssistant", 300000L, ServiceForegroundMode.O_ONLY, z, false, StartLocationFixRequest$Purpose.DETECTIONS));
            }
            z = false;
            this.serializer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("startIdleStateLocationFixes - immediate? ", z), new Object[0]);
            this.read.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read("StationaryAssistant", 300000L, ServiceForegroundMode.O_ONLY, z, false, StartLocationFixRequest$Purpose.DETECTIONS));
        }
        z = zBooleanValue;
        this.serializer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("startIdleStateLocationFixes - immediate? ", z), new Object[0]);
        this.read.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read("StationaryAssistant", 300000L, ServiceForegroundMode.O_ONLY, z, false, StartLocationFixRequest$Purpose.DETECTIONS));
    }
}
