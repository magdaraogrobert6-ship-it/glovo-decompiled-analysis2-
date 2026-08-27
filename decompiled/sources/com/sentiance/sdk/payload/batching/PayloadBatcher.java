package com.sentiance.sdk.payload.batching;

import android.content.Context;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.c;
import com.sentiance.sdk.util.database.WhereClause;
import com.sentiance.sdk.util.x;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.BrazeBootReceiver;
import o.BrazeNotificationUtilsExternalSyntheticLambda0;
import o.addBannerViewMonitor;
import o.cancelNotificationlambda1;
import o.getActiveNotificationFactory;
import o.getAnalyticsEnabledEnterannotations;
import o.getBitmapFromCache;
import o.getCooldownEnterSeconds;
import o.getGeofenceTransitionPendingIntent;
import o.getNotificationIdlambda3;
import o.getNotificationPriority;
import o.getNotificationPrioritylambda00;
import o.getNotificationReceiverClass;
import o.getOrCreateNotificationChannelId;
import o.getOrCreateNotificationChannelIdlambda0;
import o.getOrCreateNotificationChannelIdlambda1;
import o.getOrCreateNotificationChannelIdlambda2;
import o.getPushActionPendingIntent;
import o.getValidNotificationChannel;
import o.getValidNotificationChannellambda1;
import o.getVerticalAccuracy;
import o.handleCancelNotificationAction;
import o.invokeFallbackFirebaseServicelambda2;
import o.parseLonglambda0;
import o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q;
import o.r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;
import o.r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I;
import o.r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg;
import o.readandroid_sdk_base_release;
import o.removeGeofencesRegisteredWithGeofencingClientlambda2;
import o.requestBannersRefreshdefault;
import o.setShouldPersistWebView;
import o.wakeScreenIfAppropriatelambda3;
import o.wipeDatalambda0;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "PayloadBatcher", componentName = "PayloadBatcher")
public class PayloadBatcher implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private final parseLonglambda0 MediaBrowserCompatMediaItem;
    private final c MediaDescriptionCompat;
    private final Context MediaMetadataCompat;
    private final handleCancelNotificationAction MediaSessionCompatQueueItem;
    private final wakeScreenIfAppropriatelambda3 ParcelableVolumeInfo;
    private final BrazeNotificationUtilsExternalSyntheticLambda0 PlaybackStateCompatCustomAction;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RatingCompat;
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private final getCooldownEnterSeconds serializer;
    private final getVerticalAccuracy write;
    private final getNotificationReceiverClass MediaSessionCompatToken = new getNotificationReceiverClass(this);
    private boolean PlaybackStateCompat = false;
    private Long MediaSessionCompatResultReceiverWrapper = -1L;
    private TripState ComponentActivity = TripState.STOPPED;

    public enum TripState {
        MOVING,
        FORCED_MOVING,
        STOPPED;

        public DetectionTrigger getDetectionTrigger() {
            return getNotificationPriority.read[ordinal()] != 1 ? DetectionTrigger.SDK : DetectionTrigger.EXTERNAL;
        }

        public boolean isMoving() {
            return this == MOVING || this == FORCED_MOVING;
        }
    }

    private void MediaBrowserCompatMediaItem() {
        synchronized (this) {
            if (this.PlaybackStateCompat) {
                this.MediaBrowserCompatMediaItem.IconCompatParcelizer("stopping payload batch", new Object[0]);
                this.PlaybackStateCompat = false;
                this.IconCompatParcelizer.IconCompatParcelizer(this.MediaSessionCompatToken);
                this.read.IconCompatParcelizer(ControlMessage.ALARM_CANCEL, serializer(0L));
            }
        }
    }

    private void serializer() {
        synchronized (this) {
            if (!this.PlaybackStateCompat) {
                this.PlaybackStateCompat = true;
                this.MediaBrowserCompatMediaItem.IconCompatParcelizer("starting payload batching", new Object[0]);
                read();
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    private boolean IconCompatParcelizer() {
        this.RatingCompat.getClass();
        Long lSerializer = this.MediaSessionCompatQueueItem.serializer(System.currentTimeMillis(), this.MediaDescriptionCompat.IconCompatParcelizer("LAST_SUBMISSION_TIME_KEY", 0L));
        return lSerializer == null || lSerializer.longValue() == 0;
    }

    private void read() {
        this.RatingCompat.getClass();
        Long lSerializer = this.MediaSessionCompatQueueItem.serializer(System.currentTimeMillis(), this.MediaDescriptionCompat.IconCompatParcelizer("LAST_SUBMISSION_TIME_KEY", 0L));
        parseLonglambda0 parselonglambda0 = this.MediaBrowserCompatMediaItem;
        if (lSerializer == null) {
            parselonglambda0.RemoteActionCompatParcelizer("batching configuration null", new Object[0]);
            MediaBrowserCompatMediaItem();
            return;
        }
        if (this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(this.ComponentActivity.getDetectionTrigger())) {
            this.IconCompatParcelizer.IconCompatParcelizer("PayloadBatcher", lSerializer.longValue(), this.MediaSessionCompatToken);
            parselonglambda0.IconCompatParcelizer("Executor based next batch submission will be at " + x.c(lSerializer.longValue() + System.currentTimeMillis()), new Object[0]);
            return;
        }
        this.read.IconCompatParcelizer(ControlMessage.ALARM_SCHEDULE, serializer(lSerializer.longValue()));
        parselonglambda0.IconCompatParcelizer("Alarm based next batch submission will be at " + x.c(lSerializer.longValue() + System.currentTimeMillis()), new Object[0]);
    }

    public static void read(PayloadBatcher payloadBatcher) {
        TripState tripState;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = payloadBatcher.serializer.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), payloadBatcher.write);
            if (clsIconCompatParcelizer != null) {
                if (clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                    tripState = TripState.FORCED_MOVING;
                } else {
                    tripState = clsIconCompatParcelizer == setShouldPersistWebView.class ? TripState.MOVING : TripState.STOPPED;
                }
                payloadBatcher.IconCompatParcelizer.RemoteActionCompatParcelizer(new cancelNotificationlambda1(payloadBatcher, tripState, optionalRemoteActionCompatParcelizer.write().serializer()), "PayloadBatcher");
            }
        }
    }

    public static void serializer(PayloadBatcher payloadBatcher) {
        c cVar = payloadBatcher.MediaDescriptionCompat;
        payloadBatcher.RatingCompat.getClass();
        cVar.read(System.currentTimeMillis(), "LAST_SUBMISSION_TIME_KEY");
    }

    public static TripState write(Class cls) {
        if (cls == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
            return TripState.FORCED_MOVING;
        }
        return cls == setShouldPersistWebView.class ? TripState.MOVING : TripState.STOPPED;
    }

    public final BatchingEvaluation RemoteActionCompatParcelizer(wakeScreenIfAppropriatelambda3.serializer serializerVar) {
        if (!this.ComponentActivity.isMoving()) {
            return BatchingEvaluation.TRIP_NOT_STARTED_YET;
        }
        requestBannersRefreshdefault requestbannersrefreshdefaultRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (requestbannersrefreshdefaultRemoteActionCompatParcelizer == null) {
            return BatchingEvaluation.NON_BATCHABLE_PAYLOAD;
        }
        String str = serializerVar.write;
        List list = requestbannersrefreshdefaultRemoteActionCompatParcelizer.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer.getClass();
        if (!ConfigurationManager.serializer(str, list)) {
            return BatchingEvaluation.NON_BATCHABLE_PAYLOAD;
        }
        if (!serializer(requestbannersrefreshdefaultRemoteActionCompatParcelizer)) {
            return BatchingEvaluation.INITIAL_DELAY_NOT_PASSED;
        }
        if (IconCompatParcelizer()) {
            return BatchingEvaluation.PREVIOUS_SUBMISSION_OVERDUE;
        }
        requestBannersRefreshdefault requestbannersrefreshdefaultRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        Optional<WhereClause> optional = this.PlaybackStateCompatCustomAction.read();
        if (optional.IconCompatParcelizer()) {
            long jIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer("LAST_SUBMISSION_TIME_KEY", 0L);
            for (wakeScreenIfAppropriatelambda3.serializer serializerVar2 : this.ParcelableVolumeInfo.read(optional.write())) {
                if (requestbannersrefreshdefaultRemoteActionCompatParcelizer2 == null || !ConfigurationManager.serializer(serializerVar2.write, requestbannersrefreshdefaultRemoteActionCompatParcelizer2.IconCompatParcelizer) || serializerVar2.RemoteActionCompatParcelizer < jIconCompatParcelizer) {
                    return BatchingEvaluation.OLD_PAYLOAD_NOT_SUBMITTED_YET;
                }
            }
        } else {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer("No payloads. Batching allowed", new Object[0]);
        }
        serializer();
        return BatchingEvaluation.SUCCESS;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.MediaDescriptionCompat.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        Class clsIconCompatParcelizer;
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer() && (clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), this.write)) != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer.write(), map, clsIconCompatParcelizer);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.IconCompatParcelizer;
        getActiveNotificationFactory getactivenotificationfactory = new getActiveNotificationFactory(this, readandroid_sdk_base_releaseVar);
        getValidNotificationChannel getvalidnotificationchannel = new getValidNotificationChannel(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, getvalidnotificationchannel);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class, new getNotificationIdlambda3(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(setShouldPersistWebView.class, new getNotificationPrioritylambda00(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class, new getOrCreateNotificationChannelIdlambda2(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(BrazeBootReceiver.class, new getOrCreateNotificationChannelIdlambda1(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, new getPushActionPendingIntent(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class, new getOrCreateNotificationChannelIdlambda0(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(wipeDatalambda0.class, new getOrCreateNotificationChannelId(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.read(ControlMessage.PAYLOAD_SUBMISSION_RESULT, getactivenotificationfactory);
        getanalyticsenabledenterannotations.read(ControlMessage.PAYLOAD_BATCHER_TRIGGERED, getactivenotificationfactory);
    }

    private void MediaDescriptionCompat() {
        this.read.IconCompatParcelizer(ControlMessage.SUBMIT_BATCHED_PAYLOADS, (Object) null);
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer("Sending Batched payloads", new Object[0]);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        MediaBrowserCompatMediaItem();
        this.MediaSessionCompatQueueItem.write();
        this.MediaSessionCompatResultReceiverWrapper = -1L;
        this.ComponentActivity = TripState.STOPPED;
    }

    public PayloadBatcher(Context context, ConfigurationManager configurationManager, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, c cVar, wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3, BrazeNotificationUtilsExternalSyntheticLambda0 brazeNotificationUtilsExternalSyntheticLambda0, handleCancelNotificationAction handlecancelnotificationaction) {
        this.RemoteActionCompatParcelizer = configurationManager;
        this.read = getanalyticsenabledenterannotations;
        this.serializer = getcooldownenterseconds;
        this.write = getverticalaccuracy;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.RatingCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaMetadataCompat = context;
        this.MediaBrowserCompatMediaItem = parselonglambda0;
        this.MediaDescriptionCompat = cVar;
        this.ParcelableVolumeInfo = wakescreenifappropriatelambda3;
        this.PlaybackStateCompatCustomAction = brazeNotificationUtilsExternalSyntheticLambda0;
        this.MediaSessionCompatQueueItem = handlecancelnotificationaction;
    }

    private boolean write() {
        requestBannersRefreshdefault requestbannersrefreshdefaultRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (requestbannersrefreshdefaultRemoteActionCompatParcelizer == null) {
            return true;
        }
        wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3 = this.ParcelableVolumeInfo;
        Iterator<wakeScreenIfAppropriatelambda3.serializer> it = wakescreenifappropriatelambda3.read(wakescreenifappropriatelambda3.write().write()).iterator();
        while (it.hasNext()) {
            String str = it.next().write;
            List list = requestbannersrefreshdefaultRemoteActionCompatParcelizer.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer.getClass();
            if (ConfigurationManager.serializer(str, list)) {
                return false;
            }
        }
        return true;
    }

    public static void IconCompatParcelizer(PayloadBatcher payloadBatcher) {
        synchronized (payloadBatcher) {
            if (payloadBatcher.PlaybackStateCompat) {
                if (payloadBatcher.write()) {
                    payloadBatcher.MediaBrowserCompatMediaItem();
                    return;
                }
                if (payloadBatcher.IconCompatParcelizer()) {
                    payloadBatcher.MediaDescriptionCompat();
                    c cVar = payloadBatcher.MediaDescriptionCompat;
                    payloadBatcher.RatingCompat.getClass();
                    cVar.read(System.currentTimeMillis(), "LAST_SUBMISSION_TIME_KEY");
                }
                payloadBatcher.read();
            }
        }
    }

    public static void write(PayloadBatcher payloadBatcher) {
        synchronized (payloadBatcher) {
            if (payloadBatcher.write()) {
                payloadBatcher.MediaBrowserCompatMediaItem();
            } else {
                requestBannersRefreshdefault requestbannersrefreshdefaultRemoteActionCompatParcelizer = payloadBatcher.RemoteActionCompatParcelizer();
                if (requestbannersrefreshdefaultRemoteActionCompatParcelizer != null && payloadBatcher.serializer(requestbannersrefreshdefaultRemoteActionCompatParcelizer) && payloadBatcher.ComponentActivity.isMoving()) {
                    payloadBatcher.serializer();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0013, B:12:0x0019, B:13:0x002c, B:15:0x0032, B:19:0x003e, B:22:0x004a, B:23:0x004e, B:18:0x0038), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0013, B:12:0x0019, B:13:0x002c, B:15:0x0032, B:19:0x003e, B:22:0x004a, B:23:0x004e, B:18:0x0038), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0013, B:12:0x0019, B:13:0x002c, B:15:0x0032, B:19:0x003e, B:22:0x004a, B:23:0x004e, B:18:0x0038), top: B:29:0x0001 }] */
    public static void RemoteActionCompatParcelizer(PayloadBatcher payloadBatcher, TripState tripState, Long l) {
        TripState tripState2;
        requestBannersRefreshdefault requestbannersrefreshdefaultRemoteActionCompatParcelizer;
        handleCancelNotificationAction handlecancelnotificationaction;
        synchronized (payloadBatcher) {
            int i = getNotificationPriority.read[tripState.ordinal()];
            if (i == 1) {
                tripState2 = payloadBatcher.ComponentActivity;
                if ((tripState2 != TripState.MOVING || tripState2 == TripState.FORCED_MOVING) && tripState != tripState2) {
                    payloadBatcher.MediaDescriptionCompat();
                    payloadBatcher.MediaBrowserCompatMediaItem();
                }
                payloadBatcher.ComponentActivity = tripState;
                payloadBatcher.MediaSessionCompatResultReceiverWrapper = l;
                requestbannersrefreshdefaultRemoteActionCompatParcelizer = payloadBatcher.RemoteActionCompatParcelizer();
                handlecancelnotificationaction = payloadBatcher.MediaSessionCompatQueueItem;
                if (requestbannersrefreshdefaultRemoteActionCompatParcelizer == null) {
                    handlecancelnotificationaction.write();
                } else {
                    handlecancelnotificationaction.IconCompatParcelizer(requestbannersrefreshdefaultRemoteActionCompatParcelizer, l.longValue());
                }
            } else if (i != 2) {
                if (i == 3) {
                    tripState2 = payloadBatcher.ComponentActivity;
                    if (tripState2 != TripState.MOVING) {
                        payloadBatcher.MediaDescriptionCompat();
                        payloadBatcher.MediaBrowserCompatMediaItem();
                    } else {
                        payloadBatcher.MediaDescriptionCompat();
                        payloadBatcher.MediaBrowserCompatMediaItem();
                    }
                    payloadBatcher.ComponentActivity = tripState;
                    payloadBatcher.MediaSessionCompatResultReceiverWrapper = l;
                    requestbannersrefreshdefaultRemoteActionCompatParcelizer = payloadBatcher.RemoteActionCompatParcelizer();
                    handlecancelnotificationaction = payloadBatcher.MediaSessionCompatQueueItem;
                    if (requestbannersrefreshdefaultRemoteActionCompatParcelizer == null) {
                        handlecancelnotificationaction.write();
                    } else {
                        handlecancelnotificationaction.IconCompatParcelizer(requestbannersrefreshdefaultRemoteActionCompatParcelizer, l.longValue());
                    }
                }
            } else if (payloadBatcher.ComponentActivity != TripState.STOPPED) {
                payloadBatcher.MediaDescriptionCompat();
                payloadBatcher.MediaBrowserCompatMediaItem();
                payloadBatcher.MediaSessionCompatQueueItem.write();
                payloadBatcher.MediaDescriptionCompat.read();
                payloadBatcher.ComponentActivity = tripState;
            }
        }
    }

    private boolean serializer(requestBannersRefreshdefault requestbannersrefreshdefault) {
        long millis = TimeUnit.MINUTES.toMillis(requestbannersrefreshdefault.serializer.byteValue());
        this.RatingCompat.getClass();
        return System.currentTimeMillis() >= this.MediaSessionCompatResultReceiverWrapper.longValue() + millis;
    }

    private getGeofenceTransitionPendingIntent serializer(long j) {
        getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("PayloadBatcher", this.MediaMetadataCompat);
        remoteActionCompatParcelizer.read(j);
        remoteActionCompatParcelizer.serializer(null, getValidNotificationChannellambda1.class);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(false);
        remoteActionCompatParcelizer.write(true);
        return remoteActionCompatParcelizer.write();
    }

    public static void read(PayloadBatcher payloadBatcher, TripState tripState, long j) {
        payloadBatcher.IconCompatParcelizer.RemoteActionCompatParcelizer(new cancelNotificationlambda1(payloadBatcher, tripState, j), "PayloadBatcher");
    }

    private requestBannersRefreshdefault RemoteActionCompatParcelizer() {
        requestBannersRefreshdefault requestbannersrefreshdefaultIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.ComponentActivity.getDetectionTrigger());
        if (requestbannersrefreshdefaultIconCompatParcelizer == null) {
            return null;
        }
        this.MediaSessionCompatQueueItem.getClass();
        if (handleCancelNotificationAction.serializer(requestbannersrefreshdefaultIconCompatParcelizer)) {
            return requestbannersrefreshdefaultIconCompatParcelizer;
        }
        return null;
    }
}
