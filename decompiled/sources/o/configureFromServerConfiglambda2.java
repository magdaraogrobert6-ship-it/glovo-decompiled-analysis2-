package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.detectionupdates.StationaryInfo;
import com.sentiance.sdk.detectionupdates.TripInfo;
import com.sentiance.sdk.detectionupdates.UserActivity;
import com.sentiance.sdk.detectionupdates.UserActivityType;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.trip.TripType;
import com.sentiance.sdk.util.Optional;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "UserActivityMonitor", componentName = "UserActivityMonitor")
public class configureFromServerConfiglambda2 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final getVerticalAccuracy IconCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda1<UserActivity> MediaBrowserCompatMediaItem;
    private final migrateTriggersStorageToJsonlambda4 MediaDescriptionCompat;
    private final component4android_sdk_base_release MediaMetadataCompat;
    private final readandroid_sdk_base_release RatingCompat;
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private final parseLonglambda0 serializer;
    private final getCooldownEnterSeconds write;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    public static UserActivity RemoteActionCompatParcelizer(configureFromServerConfiglambda2 configurefromserverconfiglambda2, long j) {
        UserActivity userActivity;
        Long l;
        Location location;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        wipeDatalambda0 wipedatalambda0;
        Location locationWrite;
        r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2;
        component4android_sdk_base_release component4android_sdk_base_releaseVar = configurefromserverconfiglambda2.MediaMetadataCompat;
        getVerticalAccuracy getverticalaccuracy = configurefromserverconfiglambda2.IconCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = configurefromserverconfiglambda2.write;
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        boolean z = true;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, Long.valueOf(j), true);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), getverticalaccuracy);
            if (clsIconCompatParcelizer == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class || clsIconCompatParcelizer == wipeDatalambda0.class) {
                l = null;
            } else if (clsIconCompatParcelizer != r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 = optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar)) == null) {
                z = false;
                l = null;
            } else {
                l = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer;
            }
            if (z) {
                com.sentiance.sdk.util.c cVar = configurefromserverconfiglambda2.RemoteActionCompatParcelizer;
                if (cVar.write("location-longitude")) {
                    location = new Location("");
                    location.setTime(cVar.IconCompatParcelizer("location-time", 0L));
                    location.setAccuracy(cVar.read(0.0f, "location-accuracy"));
                    location.setLatitude(cVar.read(0.0f, "location-latitude"));
                    location.setLongitude(cVar.read(0.0f, "location-longitude"));
                } else {
                    location = null;
                }
                if (location == null) {
                    Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(list, l, false);
                    if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                        Class clsWrite = getVerticalAccuracy.write(optionalRemoteActionCompatParcelizer2.write().MediaSessionCompatQueueItem());
                        if (clsWrite == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
                            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3 = optionalRemoteActionCompatParcelizer2.write().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
                            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3 == null || (r8lambdadtwa3yx1e9cvszaagaemidzvt8a = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3.serializer.addObserverForBackInvoker) == null) {
                                location = null;
                            } else {
                                locationWrite = getVerticalAccuracy.write(r8lambdadtwa3yx1e9cvszaagaemidzvt8a.write);
                                location = locationWrite;
                            }
                        } else if (clsWrite != wipeDatalambda0.class || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalRemoteActionCompatParcelizer2.write().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar)) == null || (wipedatalambda0 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.MediaBrowserCompatMediaItem) == null) {
                            location = null;
                        } else {
                            locationWrite = getVerticalAccuracy.write(wipedatalambda0.RemoteActionCompatParcelizer);
                            location = locationWrite;
                        }
                    } else {
                        location = null;
                    }
                }
            } else {
                location = null;
            }
            userActivity = configurefromserverconfiglambda2.read(clsIconCompatParcelizer, location);
        } else {
            userActivity = null;
        }
        return userActivity == null ? new UserActivity(UserActivityType.UNKNOWN, null, null) : userActivity;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.RemoteActionCompatParcelizer.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        Class clsWrite;
        HashMap map = new HashMap();
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = this.write;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), this.IconCompatParcelizer);
            if (clsIconCompatParcelizer != null) {
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer.write(), map, clsIconCompatParcelizer);
            }
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(list, Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer()), false);
            if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer() && (clsWrite = getVerticalAccuracy.write(optionalRemoteActionCompatParcelizer2.write().MediaSessionCompatQueueItem())) != null) {
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer2.write(), map, clsWrite);
            }
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.RemoteActionCompatParcelizer.read();
        this.MediaBrowserCompatMediaItem.read(new UserActivity(UserActivityType.UNKNOWN, null, null));
    }

    public final UserActivity read() {
        return this.MediaBrowserCompatMediaItem.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.RatingCompat;
        getBrazeGeofenceApiannotations getbrazegeofenceapiannotations = new getBrazeGeofenceApiannotations(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(setShouldPersistWebView.class, getbrazegeofenceapiannotations);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class, new getBrazeGeofencesannotations(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(BrazeBootReceiver.class, new getBrazeLocationApiannotations(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class, new configureFromServerConfiglambda3(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(wipeDatalambda0.class, new getBrazeGeofenceReEligibilityManagerannotations(this, readandroid_sdk_base_releaseVar));
    }

    public configureFromServerConfiglambda2(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, migrateTriggersStorageToJsonlambda4 migratetriggersstoragetojsonlambda4, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.RemoteActionCompatParcelizer = cVar;
        this.serializer = parselonglambda0;
        this.read = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = getverticalaccuracy;
        this.write = getcooldownenterseconds;
        this.MediaMetadataCompat = component4android_sdk_base_releaseVar;
        this.RatingCompat = readandroid_sdk_base_releaseVar;
        this.MediaDescriptionCompat = migratetriggersstoragetojsonlambda4;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.MediaBrowserCompatMediaItem = new r8lambdaxb3_zPEcRtxlMA4P7Bx54MKEI0M(this, System.currentTimeMillis());
    }

    public static void write(configureFromServerConfiglambda2 configurefromserverconfiglambda2, Class cls, Location location) {
        migrateTriggersReeligibilityToJsonlambda1<UserActivity> migratetriggersreeligibilitytojsonlambda1 = configurefromserverconfiglambda2.MediaBrowserCompatMediaItem;
        UserActivity userActivity = configurefromserverconfiglambda2.read(cls, location);
        configurefromserverconfiglambda2.serializer.IconCompatParcelizer("new activity: %s", userActivity == null ? "null" : userActivity.toString());
        if (userActivity != null) {
            boolean zEquals = userActivity.equals(migratetriggersreeligibilitytojsonlambda1.read());
            migratetriggersreeligibilitytojsonlambda1.read(userActivity);
            if (zEquals) {
                return;
            }
            configurefromserverconfiglambda2.read.IconCompatParcelizer(ControlMessage.NEW_USER_ACTIVITY, (Object) null);
        }
    }

    private UserActivity read(Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls, Location location) {
        if (cls != null) {
            if (location != null && Arrays.asList(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, wipeDatalambda0.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class).contains(cls)) {
                return new UserActivity(UserActivityType.STATIONARY, null, new StationaryInfo(location, this.MediaDescriptionCompat.read(location)));
            }
            if (cls != setShouldPersistWebView.class && cls != r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                if (cls == r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class || cls == BrazeBootReceiver.class) {
                    return new UserActivity(UserActivityType.UNKNOWN, null, null);
                }
            } else {
                TripType tripType = TripType.SDK_TRIP;
                if (cls == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                    tripType = TripType.EXTERNAL_TRIP;
                }
                return new UserActivity(UserActivityType.TRIP, new TripInfo(tripType), null);
            }
        }
        return null;
    }

    public static void serializer(configureFromServerConfiglambda2 configurefromserverconfiglambda2, Location location) {
        com.sentiance.sdk.util.c cVar = configurefromserverconfiglambda2.RemoteActionCompatParcelizer;
        cVar.read(location.getTime(), "location-time");
        cVar.IconCompatParcelizer(location.getAccuracy(), "location-accuracy");
        cVar.IconCompatParcelizer((float) location.getLatitude(), "location-latitude");
        cVar.IconCompatParcelizer((float) location.getLongitude(), "location-longitude");
    }
}
