package o;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.util.Pair;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.services.ServiceForegroundMode;
import com.sentiance.sdk.util.Optional;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "StateTimeoutMonitor", componentName = "StateTimeoutMonitor")
public class addNotificationActionslambda1 extends handleHmsRemoteMessageDatalambda1 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final Context ComponentActivity;
    private boolean IconCompatParcelizer;
    private Pair<Long, Long> MediaBrowserCompatMediaItem;
    private Long MediaDescriptionCompat;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 MediaMetadataCompat;
    private Long MediaSessionCompatQueueItem;
    private final com.sentiance.sdk.util.c MediaSessionCompatResultReceiverWrapper;
    private final readandroid_sdk_base_release MediaSessionCompatToken;
    private final getVerticalAccuracy ParcelableVolumeInfo;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI PlaybackStateCompat;
    private final getAnalyticsEnabledEnterannotations PlaybackStateCompatCustomAction;
    private final parseLonglambda0 RatingCompat;
    private accessgetInternalInstancecp RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds ResultReceiver;
    private final r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final populateNotificationBuilderlambda1 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final ConfigurationManager r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final migrateTriggersReeligibilityToJsonlambda1<Boolean> r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private final ServerConfigDataStoreProviderCompanion r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private final getDismissalTimeMsannotations r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private final migrateTriggersReeligibilityToJsonlambda1<Boolean> r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private final addNotificationActionslambda2 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    private final retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release read;
    private boolean serializer;
    private boolean write;

    private void MediaMetadataCompat() {
        synchronized (this) {
            this.RatingCompat.IconCompatParcelizer("Starting", new Object[0]);
            this.serializer = false;
            if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.ComponentActivity() <= 0) {
                this.RatingCompat.IconCompatParcelizer("Monitoring disabled by configuration", new Object[0]);
                MediaSessionCompatQueueItem();
                return;
            }
            accessgetInternalInstancecp accessgetinternalinstancecp = this.RemoteActionCompatParcelizer;
            if (accessgetinternalinstancecp == null) {
                return;
            }
            long jWrite = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, accessgetinternalinstancecp.read, write());
            if (jWrite > 0 || this.MediaBrowserCompatMediaItem != null) {
                this.MediaBrowserCompatMediaItem = null;
                serializer(jWrite);
            } else {
                RemoteActionCompatParcelizer();
            }
            if (!this.IconCompatParcelizer) {
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer(this.MediaMetadataCompat, new IntentFilter("android.intent.action.TIME_TICK"));
                this.IconCompatParcelizer = true;
            }
            this.write = true;
        }
    }

    private void MediaSessionCompatQueueItem() {
        synchronized (this) {
            if (this.write) {
                this.write = false;
                this.RatingCompat.IconCompatParcelizer("Stopping", new Object[0]);
                this.RemoteActionCompatParcelizer = null;
                this.PlaybackStateCompatCustomAction.IconCompatParcelizer(ControlMessage.ALARM_CANCEL, RemoteActionCompatParcelizer(0L));
                this.IconCompatParcelizer = false;
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(this.MediaMetadataCompat);
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        accessgetInternalInstancecp accessgetinternalinstancecp;
        synchronized (this) {
            if (!this.serializer && (accessgetinternalinstancecp = this.RemoteActionCompatParcelizer) != null) {
                this.serializer = true;
                if (accessgetinternalinstancecp.RemoteActionCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                    this.PlaybackStateCompatCustomAction.IconCompatParcelizer(ControlMessage.FORCED_MOVING_TIMEOUT, (Object) null);
                } else {
                    boolean z = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read(DetectionTrigger.SDK).shortValue() > 0;
                    getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.PlaybackStateCompatCustomAction;
                    if (z) {
                        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.NO_ACCURATE_LOCATIONS_OTG, (Object) null);
                    } else {
                        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.GEOFENCE_TIMEOUT_OTG, (Object) null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ac A[Catch: all -> 0x00d3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x001c, B:10:0x0033, B:12:0x003f, B:15:0x004a, B:34:0x00cc, B:18:0x005e, B:20:0x0082, B:24:0x009d, B:25:0x00ac, B:32:0x00bc), top: B:40:0x0001 }] */
    private accessgetInternalInstancecp serializer() {
        Long lValueOf;
        synchronized (this) {
            getCooldownEnterSeconds getcooldownenterseconds = this.ResultReceiver;
            List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, (Long) null, false);
            if (optionalRemoteActionCompatParcelizer.read()) {
                this.RatingCompat.IconCompatParcelizer("No moving state", new Object[0]);
                return null;
            }
            getVerticalAccuracy getverticalaccuracy = this.ParcelableVolumeInfo;
            int iMediaSessionCompatQueueItem = optionalRemoteActionCompatParcelizer.write().MediaSessionCompatQueueItem();
            getverticalaccuracy.getClass();
            Class clsWrite = getVerticalAccuracy.write(iMediaSessionCompatQueueItem);
            if (clsWrite == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                if (!this.read.IconCompatParcelizer().read()) {
                    this.RatingCompat.IconCompatParcelizer("Currently in a non-triggered trips forced-moving state.", new Object[0]);
                    return null;
                }
                lValueOf = Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer());
            } else if (clsWrite == setShouldPersistWebView.class) {
                long jSerializer = optionalRemoteActionCompatParcelizer.write().serializer();
                Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = this.ResultReceiver.RemoteActionCompatParcelizer(list, Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer()), false);
                if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                    getVerticalAccuracy getverticalaccuracy2 = this.ParcelableVolumeInfo;
                    int iMediaSessionCompatQueueItem2 = optionalRemoteActionCompatParcelizer2.write().MediaSessionCompatQueueItem();
                    getverticalaccuracy2.getClass();
                    Class clsWrite2 = getVerticalAccuracy.write(iMediaSessionCompatQueueItem2);
                    if (clsWrite2 == BrazeBootReceiver.class || clsWrite2 == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                        lValueOf = Long.valueOf(optionalRemoteActionCompatParcelizer2.write().serializer());
                    } else {
                        lValueOf = Long.valueOf(jSerializer);
                    }
                } else {
                    lValueOf = Long.valueOf(jSerializer);
                }
            } else {
                lValueOf = (clsWrite == BrazeBootReceiver.class || clsWrite == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) ? Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer()) : null;
            }
            return lValueOf != null ? new accessgetInternalInstancecp(clsWrite, lValueOf) : null;
        }
    }

    private Long write() {
        synchronized (this) {
            Long l = this.MediaSessionCompatQueueItem;
            if (l == null && this.MediaDescriptionCompat == null) {
                return null;
            }
            if (l != null && this.MediaDescriptionCompat != null) {
                return Long.valueOf(Math.max(l.longValue(), this.MediaDescriptionCompat.longValue()));
            }
            if (l != null) {
                return l;
            }
            return this.MediaDescriptionCompat;
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        synchronized (this) {
            HashMap map = new HashMap();
            if (this.RemoteActionCompatParcelizer == null) {
                return map;
            }
            getCooldownEnterSeconds getcooldownenterseconds = this.ResultReceiver;
            List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, (Long) null, false);
            if (optionalRemoteActionCompatParcelizer.read()) {
                return map;
            }
            getVerticalAccuracy getverticalaccuracy = this.ParcelableVolumeInfo;
            int iMediaSessionCompatQueueItem = optionalRemoteActionCompatParcelizer.write().MediaSessionCompatQueueItem();
            getverticalaccuracy.getClass();
            Class clsWrite = getVerticalAccuracy.write(iMediaSessionCompatQueueItem);
            if (clsWrite != null) {
                map.put(clsWrite, Long.valueOf(optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer()));
            }
            if (clsWrite == setShouldPersistWebView.class) {
                Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = this.ResultReceiver.RemoteActionCompatParcelizer(list, Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer()), false);
                getVerticalAccuracy getverticalaccuracy2 = this.ParcelableVolumeInfo;
                int iMediaSessionCompatQueueItem2 = optionalRemoteActionCompatParcelizer2.write().MediaSessionCompatQueueItem();
                getverticalaccuracy2.getClass();
                Class clsWrite2 = getVerticalAccuracy.write(iMediaSessionCompatQueueItem2);
                if (clsWrite2 == BrazeBootReceiver.class || clsWrite2 == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                    map.put(clsWrite2, Long.valueOf(optionalRemoteActionCompatParcelizer2.write().RemoteActionCompatParcelizer()));
                }
            }
            return map;
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            MediaSessionCompatQueueItem();
            migrateTriggersReeligibilityToJsonlambda1<Boolean> migratetriggersreeligibilitytojsonlambda1 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            Boolean bool = Boolean.FALSE;
            migratetriggersreeligibilitytojsonlambda1.read(bool);
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read(bool);
            this.serializer = false;
            this.MediaDescriptionCompat = null;
            this.MediaSessionCompatQueueItem = null;
            this.RemoteActionCompatParcelizer = null;
            this.MediaBrowserCompatMediaItem = null;
        }
    }

    private void IconCompatParcelizer() {
        boolean zBooleanValue = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read().booleanValue();
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.PlaybackStateCompatCustomAction;
        if (zBooleanValue) {
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.NO_ACCURATE_LOCATIONS_OTG_RESOLVED, (Object) null);
        }
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read().booleanValue()) {
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.GEOFENCE_TIMEOUT_OTG_RESOLVED, (Object) null);
        }
    }

    private getGeofenceTransitionPendingIntent RemoteActionCompatParcelizer(long j) {
        getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("StateTimeoutMonitor", this.ComponentActivity);
        remoteActionCompatParcelizer.read(j);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(false);
        remoteActionCompatParcelizer.IconCompatParcelizer(new handleNotificationActionClickedlambda1(this, this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0));
        remoteActionCompatParcelizer.write(false);
        return remoteActionCompatParcelizer.write();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.MediaSessionCompatResultReceiverWrapper.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.MediaSessionCompatToken;
        handleNotificationActionClicked handlenotificationactionclicked = new handleNotificationActionClicked(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.PlaybackStateCompatCustomAction;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, handlenotificationactionclicked);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, new handleNotificationActionClickedlambda0(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, new handleNotificationActionClickedlambda3(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new handleNotificationActionClickedlambda2(this, readandroid_sdk_base_releaseVar));
    }

    public final Pair<Long, Long> read() {
        return this.MediaBrowserCompatMediaItem;
    }

    public addNotificationActionslambda1(parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, com.sentiance.sdk.util.c cVar, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, ConfigurationManager configurationManager, getCooldownEnterSeconds getcooldownenterseconds, Context context, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, addNotificationActionslambda2 addnotificationactionslambda2, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, getExpirationTimestampSeconds getexpirationtimestampseconds) {
        Pair<Long, Long> pair;
        super("LocationAccuracyMonitor", getanalyticsenabledenterannotations);
        this.MediaMetadataCompat = new addNotificationActions(this);
        this.RatingCompat = parselonglambda0;
        this.PlaybackStateCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.PlaybackStateCompatCustomAction = getanalyticsenabledenterannotations;
        this.MediaSessionCompatToken = readandroid_sdk_base_releaseVar;
        this.ParcelableVolumeInfo = getverticalaccuracy;
        this.MediaSessionCompatResultReceiverWrapper = cVar;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = configurationManager;
        this.ResultReceiver = getcooldownenterseconds;
        this.ComponentActivity = context;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = serverConfigDataStoreProviderCompanion;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = addnotificationactionslambda2;
        this.read = retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release;
        this.IconCompatParcelizer = false;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = populatenotificationbuilderlambda1;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new getDismissalTimeMsannotations("StateTimeoutMonitor");
        this.serializer = false;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read("StateTimeoutMonitor", 600000L, ServiceForegroundMode.O_ONLY, true, false, StartLocationFixRequest$Purpose.DETECTIONS);
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new addNotificationActionlambda3(this, jCurrentTimeMillis);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new addNotificationActionslambda0(this, jCurrentTimeMillis);
        com.sentiance.sdk.util.c cVar2 = new com.sentiance.sdk.util.c(context, "TripTimeoutMonitor", getexpirationtimestampseconds);
        if (cVar2.write("last-geofence-event-time")) {
            cVar.read(cVar2.IconCompatParcelizer("last-geofence-event-time", -1L), "last-geofence-event-time");
        }
        if (cVar2.write("last-accurate-fix-time")) {
            cVar.read(cVar2.IconCompatParcelizer("last-accurate-fix-time", -1L), "last-accurate-fix-time");
        }
        cVar2.read();
        long jIconCompatParcelizer = cVar.IconCompatParcelizer("last-geofence-event-time", -1L);
        if (jIconCompatParcelizer != -1) {
            this.MediaDescriptionCompat = Long.valueOf(jIconCompatParcelizer);
        }
        long jIconCompatParcelizer2 = cVar.IconCompatParcelizer("last-accurate-fix-time", -1L);
        if (jIconCompatParcelizer2 != -1) {
            this.MediaSessionCompatQueueItem = Long.valueOf(jIconCompatParcelizer2);
        }
        this.RemoteActionCompatParcelizer = serializer();
        synchronized (this) {
            if (configurationManager.ComponentActivity() <= 0) {
                parselonglambda0.IconCompatParcelizer("Monitoring disabled by configuration", new Object[0]);
            } else {
                accessgetInternalInstancecp accessgetinternalinstancecp = this.RemoteActionCompatParcelizer;
                if (accessgetinternalinstancecp != null) {
                    long jWrite = addnotificationactionslambda2.write(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, accessgetinternalinstancecp.read, write());
                    if (jWrite <= 0) {
                        parselonglambda0.IconCompatParcelizer("Trip already timed out", new Object[0]);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        pair = new Pair<>(Long.valueOf(jCurrentTimeMillis2 - Math.abs(jWrite)), Long.valueOf(jCurrentTimeMillis2));
                    }
                }
            }
            pair = null;
        }
        this.MediaBrowserCompatMediaItem = pair;
    }

    public static void RemoteActionCompatParcelizer(addNotificationActionslambda1 addnotificationactionslambda1, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu) {
        synchronized (addnotificationactionslambda1) {
            if (Arrays.asList((byte) 3, (byte) 1, (byte) 2).contains(r8lambdazeccixubf3xvz58yt5bojkwhdu.read)) {
                addnotificationactionslambda1.PlaybackStateCompat.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                addnotificationactionslambda1.MediaSessionCompatResultReceiverWrapper.read(jCurrentTimeMillis, "last-geofence-event-time");
                addnotificationactionslambda1.IconCompatParcelizer();
                addnotificationactionslambda1.MediaDescriptionCompat = Long.valueOf(jCurrentTimeMillis);
                accessgetInternalInstancecp accessgetinternalinstancecp = addnotificationactionslambda1.RemoteActionCompatParcelizer;
                if (accessgetinternalinstancecp != null) {
                    addnotificationactionslambda1.RemoteActionCompatParcelizer(addnotificationactionslambda1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, accessgetinternalinstancecp.read);
                }
            }
        }
    }

    private void serializer(long j) {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null) {
                return;
            }
            this.PlaybackStateCompatCustomAction.IconCompatParcelizer(ControlMessage.ALARM_SCHEDULE, RemoteActionCompatParcelizer(j));
        }
    }

    public static void serializer(addNotificationActionslambda1 addnotificationactionslambda1) {
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = addnotificationactionslambda1.PlaybackStateCompatCustomAction;
        populateNotificationBuilderlambda1 populatenotificationbuilderlambda1 = addnotificationactionslambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (populatenotificationbuilderlambda1.read().size() == 1 && populatenotificationbuilderlambda1.serializer()) {
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, addnotificationactionslambda1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        } else {
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_STOP, addnotificationactionslambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        }
    }

    public static void IconCompatParcelizer(addNotificationActionslambda1 addnotificationactionslambda1) {
        synchronized (addnotificationactionslambda1) {
            accessgetInternalInstancecp accessgetinternalinstancecp = addnotificationactionslambda1.RemoteActionCompatParcelizer;
            if (accessgetinternalinstancecp == null) {
                return;
            }
            if (addnotificationactionslambda1.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(addnotificationactionslambda1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, accessgetinternalinstancecp.read, addnotificationactionslambda1.write()) < 0) {
                addnotificationactionslambda1.RemoteActionCompatParcelizer();
            }
        }
    }

    public static void IconCompatParcelizer(addNotificationActionslambda1 addnotificationactionslambda1, Location location) {
        synchronized (addnotificationactionslambda1) {
            if (location.hasAccuracy() && location.getAccuracy() <= 150.0f) {
                addnotificationactionslambda1.PlaybackStateCompat.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                addnotificationactionslambda1.MediaSessionCompatResultReceiverWrapper.read(jCurrentTimeMillis, "last-accurate-fix-time");
                addnotificationactionslambda1.IconCompatParcelizer();
                addnotificationactionslambda1.MediaSessionCompatQueueItem = Long.valueOf(jCurrentTimeMillis);
                accessgetInternalInstancecp accessgetinternalinstancecp = addnotificationactionslambda1.RemoteActionCompatParcelizer;
                if (accessgetinternalinstancecp != null) {
                    addnotificationactionslambda1.RemoteActionCompatParcelizer(addnotificationactionslambda1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, accessgetinternalinstancecp.read);
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(Class cls, Long l) {
        synchronized (this) {
            if (Arrays.asList(setShouldPersistWebView.class, BrazeBootReceiver.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class).contains(cls)) {
                long jWrite = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(cls, l, write());
                if (jWrite > 0) {
                    serializer(jWrite);
                } else {
                    RemoteActionCompatParcelizer();
                }
            }
        }
    }

    @Override // o.handleHmsRemoteMessageDatalambda1
    public final void serializer(long j, Class cls) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer = serializer();
            if (Arrays.asList(setShouldPersistWebView.class, BrazeBootReceiver.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class).contains(cls)) {
                MediaMetadataCompat();
            } else if (cls == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class && this.read.IconCompatParcelizer().read()) {
                MediaMetadataCompat();
            } else {
                MediaSessionCompatQueueItem();
            }
        }
    }

    public static getCooldownEnterSeconds.read write(addNotificationActionslambda1 addnotificationactionslambda1, long j) {
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = addnotificationactionslambda1.ResultReceiver.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(j), true);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            return optionalRemoteActionCompatParcelizer.write();
        }
        return null;
    }
}
