package o;

import android.content.Context;
import android.os.Bundle;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "MovingStateDetector")
public class r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final invokeFallbackFirebaseServicelambda2 IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaBrowserCompatMediaItem;
    private final populateNotificationBuilderlambda1 MediaDescriptionCompat;
    private final getVerticalAccuracy MediaSessionCompatQueueItem;
    private final isGeofencesEnabledFromEnvironmentlambda1 MediaSessionCompatResultReceiverWrapper;
    private final readandroid_sdk_base_release MediaSessionCompatToken;
    private final component4android_sdk_base_release ParcelableVolumeInfo;
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4> PlaybackStateCompat;
    private final retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release PlaybackStateCompatCustomAction;
    private final r8lambdaUM3EKNivlpu_OeoydQAPHN3yvk RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private final handleOnNewTokenlambda2 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final getCooldownEnterSeconds read;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final parseLonglambda0 write;
    private final addNotificationActionlambda1 MediaMetadataCompat = new addNotificationActionlambda1(this);
    private boolean ComponentActivity = false;
    private boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void read(r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4) {
        synchronized (this) {
            r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj5 = this.PlaybackStateCompat.read();
            if (r8lambdanez6ekwx2hesalwlynojtz0dlj5 != null && r8lambdanez6ekwx2hesalwlynojtz0dlj5.getClass() == r8lambdanez6ekwx2hesalwlynojtz0dlj4.getClass()) {
                this.write.IconCompatParcelizer("Already in state %s", r8lambdanez6ekwx2hesalwlynojtz0dlj4.write());
                return;
            }
            if (r8lambdanez6ekwx2hesalwlynojtz0dlj5 != null && r8lambdanez6ekwx2hesalwlynojtz0dlj4.MediaDescriptionCompat() <= r8lambdanez6ekwx2hesalwlynojtz0dlj5.MediaDescriptionCompat()) {
                this.write.IconCompatParcelizer("%s time %s is earlier than the previous state's time %s. Not switching.", r8lambdanez6ekwx2hesalwlynojtz0dlj4.write(), com.sentiance.sdk.util.x.c(r8lambdanez6ekwx2hesalwlynojtz0dlj4.MediaDescriptionCompat()), com.sentiance.sdk.util.x.c(r8lambdanez6ekwx2hesalwlynojtz0dlj5.MediaDescriptionCompat()));
                return;
            }
            this.write.IconCompatParcelizer("Changing state: %s -> %s", r8lambdanez6ekwx2hesalwlynojtz0dlj5 != null ? r8lambdanez6ekwx2hesalwlynojtz0dlj5.write() : "?", r8lambdanez6ekwx2hesalwlynojtz0dlj4.write());
            if (r8lambdanez6ekwx2hesalwlynojtz0dlj5 != null && r8lambdanez6ekwx2hesalwlynojtz0dlj5.MediaSessionCompatQueueItem() > 0) {
                this.serializer.IconCompatParcelizer(ControlMessage.ALARM_CANCEL, RemoteActionCompatParcelizer(r8lambdanez6ekwx2hesalwlynojtz0dlj5));
            }
            this.PlaybackStateCompat.IconCompatParcelizer(r8lambdanez6ekwx2hesalwlynojtz0dlj4);
            if (r8lambdanez6ekwx2hesalwlynojtz0dlj4.MediaSessionCompatQueueItem() > 0) {
                this.serializer.IconCompatParcelizer(ControlMessage.ALARM_SCHEDULE, RemoteActionCompatParcelizer(r8lambdanez6ekwx2hesalwlynojtz0dlj4));
            }
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer = r8lambdanez6ekwx2hesalwlynojtz0dlj4.serializer();
            if (r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer != null) {
                this.serializer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write() {
        synchronized (this) {
            if (this.ComponentActivity) {
                return;
            }
            if (!this.read.serializer((Long) null)) {
                this.write.IconCompatParcelizer("Trying to start when the sdk is stopped. Not starting.", new Object[0]);
                return;
            }
            if (this.PlaybackStateCompatCustomAction.IconCompatParcelizer().read()) {
                r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = this.PlaybackStateCompat.read();
                if (r8lambdanez6ekwx2hesalwlynojtz0dlj4 == null || !Arrays.asList(r8lambda_MvJ1JSrxq892xe8HQfhgWx_XuY.class, invokeFallbackFirebaseServicelambda4.class).contains(r8lambdanez6ekwx2hesalwlynojtz0dlj4.getClass())) {
                    this.MediaBrowserCompatMediaItem.getClass();
                    IconCompatParcelizer(System.currentTimeMillis());
                }
            } else {
                RemoteActionCompatParcelizer();
            }
            r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj5 = this.PlaybackStateCompat.read();
            this.write.IconCompatParcelizer("Initial state: %s", r8lambdanez6ekwx2hesalwlynojtz0dlj5 != null ? r8lambdanez6ekwx2hesalwlynojtz0dlj5.write() : "null");
            this.ComponentActivity = true;
            serializer();
        }
    }

    public static void write(r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0, boolean z) {
        synchronized (r8lambda1mlf560mcjaa_exgr2d0icegcf0) {
            r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = r8lambda1mlf560mcjaa_exgr2d0icegcf0.PlaybackStateCompat.read();
            boolean z2 = false;
            if (!r8lambda1mlf560mcjaa_exgr2d0icegcf0.read.serializer((Long) null)) {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("Cannot stop forced moving. Sdk is not started.", new Object[0]);
            } else if (!r8lambda1mlf560mcjaa_exgr2d0icegcf0.MediaDescriptionCompat.read().isEmpty()) {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("Cannot stop forced moving. Sdk is off the grid.", new Object[0]);
            } else if (r8lambdanez6ekwx2hesalwlynojtz0dlj4 == null || r8lambdanez6ekwx2hesalwlynojtz0dlj4.getClass() != invokeFallbackFirebaseServicelambda4.class) {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("Cannot stop forced moving. Not in forced moving state.", new Object[0]);
            } else {
                boolean z3 = r8lambda1mlf560mcjaa_exgr2d0icegcf0.PlaybackStateCompatCustomAction.IconCompatParcelizer().read();
                r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = r8lambda1mlf560mcjaa_exgr2d0icegcf0.MediaBrowserCompatMediaItem;
                if (z3) {
                    r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                    r8lambda1mlf560mcjaa_exgr2d0icegcf0.IconCompatParcelizer(System.currentTimeMillis());
                } else {
                    r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                    r8lambda1mlf560mcjaa_exgr2d0icegcf0.write(System.currentTimeMillis());
                }
                z2 = true;
            }
            r8lambda1mlf560mcjaa_exgr2d0icegcf0.serializer.IconCompatParcelizer(ControlMessage.FORCED_MOVING_STOP_RESULT, new getTrackingId(z2, z));
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.MediaBrowserCompatMediaItem.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                IconCompatParcelizer(jCurrentTimeMillis);
                this.ComponentActivity = false;
            }
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        this.PlaybackStateCompat.IconCompatParcelizer(null);
    }

    private void IconCompatParcelizer(long j) {
        migrateTriggersReeligibilityToJsonlambda4<r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4> migratetriggersreeligibilitytojsonlambda4 = this.PlaybackStateCompat;
        r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = migratetriggersreeligibilitytojsonlambda4.read();
        read(new r8lambda_MvJ1JSrxq892xe8HQfhgWx_XuY(this.RemoteActionCompatParcelizer, migratetriggersreeligibilitytojsonlambda4.read(), this.MediaMetadataCompat, null, Math.max(j, (r8lambdanez6ekwx2hesalwlynojtz0dlj4 == null ? 0L : r8lambdanez6ekwx2hesalwlynojtz0dlj4.MediaDescriptionCompat()) + 1)));
    }

    public static void read(r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0, isTestSend istestsend) {
        Map<String, String> map;
        Byte bSerializer;
        synchronized (r8lambda1mlf560mcjaa_exgr2d0icegcf0) {
            boolean z = false;
            if (r8lambda1mlf560mcjaa_exgr2d0icegcf0.read.serializer((Long) null)) {
                HashSet hashSet = r8lambda1mlf560mcjaa_exgr2d0icegcf0.MediaDescriptionCompat.read();
                if (!hashSet.isEmpty()) {
                    List listAsList = Arrays.asList((byte) 9, (byte) 12);
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!listAsList.contains((Byte) it.next())) {
                            }
                        }
                    }
                }
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.MediaBrowserCompatMediaItem.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (hashSet.contains((byte) 12)) {
                    r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("Resolving geofence timeout OTG", new Object[0]);
                    r8lambda1mlf560mcjaa_exgr2d0icegcf0.serializer.IconCompatParcelizer(ControlMessage.GEOFENCE_TIMEOUT_OTG_RESOLVED, Long.valueOf(jCurrentTimeMillis));
                }
                if (r8lambda1mlf560mcjaa_exgr2d0icegcf0.MediaDescriptionCompat.serializer()) {
                    r8lambda1mlf560mcjaa_exgr2d0icegcf0.serializer.IconCompatParcelizer(ControlMessage.NO_ACCURATE_LOCATIONS_OTG_RESOLVED, Long.valueOf(jCurrentTimeMillis));
                }
                if (istestsend != null) {
                    Map<String, String> map2 = istestsend.read();
                    bSerializer = istestsend.serializer();
                    map = map2;
                } else {
                    map = null;
                    bSerializer = null;
                }
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.read(new invokeFallbackFirebaseServicelambda4(r8lambda1mlf560mcjaa_exgr2d0icegcf0.RemoteActionCompatParcelizer, r8lambda1mlf560mcjaa_exgr2d0icegcf0.PlaybackStateCompat.read(), r8lambda1mlf560mcjaa_exgr2d0icegcf0.MediaMetadataCompat, null, jCurrentTimeMillis, map, bSerializer));
                z = true;
            } else {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("Cannot switch to forced moving. Sdk is not started.", new Object[0]);
            }
            r8lambda1mlf560mcjaa_exgr2d0icegcf0.serializer.IconCompatParcelizer(ControlMessage.FORCED_MOVING_START_RESULT, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(long j) {
        read(new handleHmsRemoteMessageDatalambda0(this.RemoteActionCompatParcelizer, this.PlaybackStateCompat.read(), this.MediaMetadataCompat, null, j));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        Long lRemoteActionCompatParcelizer;
        HashMap map = new HashMap();
        this.MediaBrowserCompatMediaItem.getClass();
        r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4Write = this.IconCompatParcelizer.write(System.currentTimeMillis(), this.MediaMetadataCompat, false);
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = this.read;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, (Long) null, false);
        boolean zIconCompatParcelizer = optionalRemoteActionCompatParcelizer.IconCompatParcelizer();
        getVerticalAccuracy getverticalaccuracy = this.MediaSessionCompatQueueItem;
        if (zIconCompatParcelizer) {
            map.put(getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), getverticalaccuracy), Long.valueOf(optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer()));
            Long lRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(r8lambdanez6ekwx2hesalwlynojtz0dlj4Write, optionalRemoteActionCompatParcelizer.write());
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(list, Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer()), false);
            if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer2.write(), map, getVerticalAccuracy.write(optionalRemoteActionCompatParcelizer2.write().MediaSessionCompatQueueItem()));
                if (r8lambdanez6ekwx2hesalwlynojtz0dlj4Write != null && (lRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdanez6ekwx2hesalwlynojtz0dlj4Write.RatingCompat(), optionalRemoteActionCompatParcelizer2.write())) != null) {
                    lRemoteActionCompatParcelizer2 = lRemoteActionCompatParcelizer;
                }
            }
            if (lRemoteActionCompatParcelizer2 != null) {
                map.put(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, lRemoteActionCompatParcelizer2);
            }
        }
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer3 = getcooldownenterseconds.RemoteActionCompatParcelizer(Arrays.asList(requestGeofenceRefresh.class, unsubscribeFromBannersDismissedEvent.class), (Long) null, false);
        if (optionalRemoteActionCompatParcelizer3.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer3.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer3.write(), getverticalaccuracy));
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.MediaSessionCompatToken;
        r8lambdaFQzyvaUo9fA2IFhjx9_urSUVv4 r8lambdafqzyvauo9fa2ifhjx9_ursuvv4 = new r8lambdaFQzyvaUo9fA2IFhjx9_urSUVv4(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.serializer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, r8lambdafqzyvauo9fa2ifhjx9_ursuvv4);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, new r8lambdaOjnO5EJyRKro6LNS1EdrJpEpqMM(this, readandroid_sdk_base_releaseVar, this.MediaDescriptionCompat));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdaapq2ma3YaOjMaHornqxpwAqmIBE(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ.class, new r8lambdaUV1q29gyaonu1r8oVvhZpz5QvQA(this, readandroid_sdk_base_releaseVar));
        r8lambdaKAcc_ZvYvG_y7XHlZvaOrwdY9ro r8lambdakacc_zvyvg_y7xhlzvaorwdy9ro = new r8lambdaKAcc_ZvYvG_y7XHlZvaOrwdY9ro(this, readandroid_sdk_base_releaseVar);
        getanalyticsenabledenterannotations.read(ControlMessage.MOVING_STATE_TIMEOUT, r8lambdakacc_zvyvg_y7xhlzvaorwdy9ro);
        getanalyticsenabledenterannotations.read(ControlMessage.FORCED_MOVING_START, r8lambdakacc_zvyvg_y7xhlzvaorwdy9ro);
        getanalyticsenabledenterannotations.read(ControlMessage.FORCED_MOVING_STOP, r8lambdakacc_zvyvg_y7xhlzvaorwdy9ro);
        getanalyticsenabledenterannotations.read(ControlMessage.FORCED_MOVING_TIMEOUT, r8lambdakacc_zvyvg_y7xhlzvaorwdy9ro);
        getanalyticsenabledenterannotations.read(ControlMessage.LIKELY_STATIONARY, r8lambdakacc_zvyvg_y7xhlzvaorwdy9ro);
    }

    public r8lambda1mlF560MCjaA_ExgR2d0icEgcF0(Context context, invokeFallbackFirebaseServicelambda2 invokefallbackfirebaseservicelambda2, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, ConfigurationManager configurationManager, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, component4android_sdk_base_release component4android_sdk_base_releaseVar, handleOnNewTokenlambda2 handleonnewtokenlambda2) {
        this.RemoteActionCompatParcelizer = context;
        this.MediaBrowserCompatMediaItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = invokefallbackfirebaseservicelambda2;
        this.read = getcooldownenterseconds;
        this.serializer = getanalyticsenabledenterannotations;
        this.write = parselonglambda0;
        this.MediaSessionCompatQueueItem = getverticalaccuracy;
        this.MediaDescriptionCompat = populatenotificationbuilderlambda1;
        this.MediaSessionCompatToken = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatResultReceiverWrapper = isgeofencesenabledfromenvironmentlambda1;
        this.PlaybackStateCompatCustomAction = retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = handleonnewtokenlambda2;
        this.ParcelableVolumeInfo = component4android_sdk_base_releaseVar;
        this.RatingCompat = new r8lambdaUM3EKNivlpu_OeoydQAPHN3yvk(this, readandroid_sdk_base_releaseVar);
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.PlaybackStateCompat = new r8lambdaBsIlZ0yo6tf0ffvZi_u1KJqyUCI(this, System.currentTimeMillis());
    }

    private void serializer() {
        long jCurrentTimeMillis;
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.read.IconCompatParcelizer(addBannerViewMonitor.class, (Long) null);
        HashMap map = new HashMap();
        map.put(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, this.RatingCompat);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            jCurrentTimeMillis = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer();
        } else {
            this.MediaBrowserCompatMediaItem.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.serializer.IconCompatParcelizer(map, jCurrentTimeMillis);
    }

    public static void read(r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0, long j) {
        synchronized (r8lambda1mlf560mcjaa_exgr2d0icegcf0) {
            if (!r8lambda1mlf560mcjaa_exgr2d0icegcf0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("OTG is resolved, but Sdk has not yet been initialized.", new Object[0]);
                return;
            }
            if (!r8lambda1mlf560mcjaa_exgr2d0icegcf0.ComponentActivity) {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write();
            } else {
                r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = r8lambda1mlf560mcjaa_exgr2d0icegcf0.PlaybackStateCompat.read();
                boolean z = r8lambda1mlf560mcjaa_exgr2d0icegcf0.PlaybackStateCompatCustomAction.IconCompatParcelizer().read();
                if (r8lambdanez6ekwx2hesalwlynojtz0dlj4 != null && r8lambdanez6ekwx2hesalwlynojtz0dlj4.getClass() == invokeFallbackFirebaseServicelambda4.class) {
                    r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("OTG resolved, but current state is ForcedMoving.", new Object[0]);
                } else if (!z && (r8lambdanez6ekwx2hesalwlynojtz0dlj4 == null || r8lambdanez6ekwx2hesalwlynojtz0dlj4.getClass() == r8lambda_MvJ1JSrxq892xe8HQfhgWx_XuY.class)) {
                    r8lambda1mlf560mcjaa_exgr2d0icegcf0.write(j);
                }
            }
        }
    }

    private getGeofenceTransitionPendingIntent RemoteActionCompatParcelizer(r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4) {
        getGeofenceTransitionPendingIntent getgeofencetransitionpendingintentWrite;
        synchronized (this) {
            r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj5 = this.PlaybackStateCompat.read();
            Bundle bundle = new Bundle();
            bundle.putString("name", r8lambdanez6ekwx2hesalwlynojtz0dlj5 != null ? r8lambdanez6ekwx2hesalwlynojtz0dlj5.write() : null);
            getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("MovingStateTimeout", this.RemoteActionCompatParcelizer);
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(true);
            remoteActionCompatParcelizer.read(r8lambdanez6ekwx2hesalwlynojtz0dlj4.MediaSessionCompatQueueItem());
            remoteActionCompatParcelizer.serializer(bundle, r8lambda7nFp0tn4gQdk4sVvHZrNtLJUA0.class);
            remoteActionCompatParcelizer.write(true);
            getgeofencetransitionpendingintentWrite = remoteActionCompatParcelizer.write();
        }
        return getgeofencetransitionpendingintentWrite;
    }

    private void RemoteActionCompatParcelizer() {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        invokeSuspendlambda0 invokesuspendlambda0;
        r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = this.PlaybackStateCompat.read();
        boolean zIsEmpty = this.MediaDescriptionCompat.read().isEmpty();
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.MediaBrowserCompatMediaItem;
        if (!zIsEmpty) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            IconCompatParcelizer(System.currentTimeMillis());
            return;
        }
        if (r8lambdanez6ekwx2hesalwlynojtz0dlj4 == null) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            write(System.currentTimeMillis());
        } else if (r8lambdanez6ekwx2hesalwlynojtz0dlj4.getClass() == r8lambda_MvJ1JSrxq892xe8HQfhgWx_XuY.class) {
            long jMediaDescriptionCompat = r8lambdanez6ekwx2hesalwlynojtz0dlj4.MediaDescriptionCompat();
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.read.IconCompatParcelizer(invokeSuspendlambda0.class, Long.valueOf(System.currentTimeMillis()));
            Long lValueOf = (!optionalIconCompatParcelizer.IconCompatParcelizer() || optionalIconCompatParcelizer.write().serializer() <= jMediaDescriptionCompat || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(this.ParcelableVolumeInfo)) == null || (invokesuspendlambda0 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.getFullyDrawnReporter) == null || invokesuspendlambda0.read.booleanValue()) ? null : r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            if (lValueOf == null) {
                lValueOf = Long.valueOf(System.currentTimeMillis());
            }
            write(lValueOf.longValue());
        }
    }

    public static void RemoteActionCompatParcelizer(r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0, r8lambdausxx_nBCDjux6DjI7stc6kTRA r8lambdausxx_nbcdjux6dji7stc6ktra) {
        r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4Write;
        synchronized (r8lambda1mlf560mcjaa_exgr2d0icegcf0) {
            r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = r8lambda1mlf560mcjaa_exgr2d0icegcf0.PlaybackStateCompat.read();
            if (r8lambda1mlf560mcjaa_exgr2d0icegcf0.IconCompatParcelizer() && r8lambdanez6ekwx2hesalwlynojtz0dlj4 != null) {
                if (r8lambdanez6ekwx2hesalwlynojtz0dlj4.write().equals(r8lambdausxx_nbcdjux6dji7stc6ktra.RemoteActionCompatParcelizer()) && r8lambdanez6ekwx2hesalwlynojtz0dlj4.MediaSessionCompatQueueItem() > 0 && (r8lambdanez6ekwx2hesalwlynojtz0dlj4Write = r8lambdanez6ekwx2hesalwlynojtz0dlj4.write(r8lambdausxx_nbcdjux6dji7stc6ktra.write())) != null) {
                    r8lambda1mlf560mcjaa_exgr2d0icegcf0.read(r8lambdanez6ekwx2hesalwlynojtz0dlj4Write);
                }
            }
        }
    }

    public static void IconCompatParcelizer(r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0, long j) {
        synchronized (r8lambda1mlf560mcjaa_exgr2d0icegcf0) {
            r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = r8lambda1mlf560mcjaa_exgr2d0icegcf0.PlaybackStateCompat.read();
            if (r8lambdanez6ekwx2hesalwlynojtz0dlj4 != null && r8lambdanez6ekwx2hesalwlynojtz0dlj4.getClass() == r8lambda_MvJ1JSrxq892xe8HQfhgWx_XuY.class) {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("Sdk OTG event. Already in stopped state", new Object[0]);
            } else {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("Sdk has gone off the grid", new Object[0]);
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.IconCompatParcelizer(j);
            }
        }
    }

    private Long RemoteActionCompatParcelizer(r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4, getCooldownEnterSeconds.read readVar) {
        if (r8lambdanez6ekwx2hesalwlynojtz0dlj4 == null || r8lambdanez6ekwx2hesalwlynojtz0dlj4.MediaMetadataCompat() == null) {
            return null;
        }
        long jSerializer = readVar.serializer();
        Optional<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> optionalRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, Long.valueOf(jSerializer), new BrazeNotificationActionUtils(r8lambdanez6ekwx2hesalwlynojtz0dlj4));
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            return optionalRemoteActionCompatParcelizer.write().write;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IconCompatParcelizer() {
        synchronized (this) {
            if (this.PlaybackStateCompat.read() == null) {
                this.write.IconCompatParcelizer("Current state is null", new Object[0]);
                return false;
            }
            if (this.ComponentActivity) {
                return true;
            }
            this.write.IconCompatParcelizer("Not started", new Object[0]);
            return false;
        }
    }
}
