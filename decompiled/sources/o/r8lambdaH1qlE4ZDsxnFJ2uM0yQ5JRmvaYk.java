package o;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.os.Build;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "AppConfigChangeManager")
public class r8lambdaH1qlE4ZDsxnFJ2uM0yQ5JRmvaYk implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final NotificationManager MediaBrowserCompatMediaItem;
    private final readandroid_sdk_base_release MediaDescriptionCompat;
    private deleteRegisteredGeofenceCache MediaMetadataCompat;
    private final r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg MediaSessionCompatQueueItem;
    private final AlarmManager RatingCompat;
    private final component4android_sdk_base_release RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final getVerticalAccuracy serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    public static void read(r8lambdaH1qlE4ZDsxnFJ2uM0yQ5JRmvaYk r8lambdah1qle4zdsxnfj2um0yq5jrmvayk) {
        deleteRegisteredGeofenceCache deleteregisteredgeofencecache;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        synchronized (r8lambdah1qle4zdsxnfj2um0yq5jrmvayk) {
            getCooldownEnterSeconds getcooldownenterseconds = r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.read;
            r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.write.getClass();
            Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(deleteRegisteredGeofenceCache.class, Long.valueOf(System.currentTimeMillis()));
            if (!optionalIconCompatParcelizer.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.RemoteActionCompatParcelizer)) == null || (deleteregisteredgeofencecache = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.MediaSessionCompatToken) == null) {
                deleteregisteredgeofencecache = null;
            }
            r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.MediaMetadataCompat = deleteregisteredgeofencecache;
            if (deleteregisteredgeofencecache == null) {
                deleteRegisteredGeofenceCache deleteregisteredgeofencecacheRemoteActionCompatParcelizer = r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.RemoteActionCompatParcelizer();
                r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.MediaMetadataCompat = deleteregisteredgeofencecacheRemoteActionCompatParcelizer;
                r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.read(deleteregisteredgeofencecacheRemoteActionCompatParcelizer);
            } else {
                synchronized (r8lambdah1qle4zdsxnfj2um0yq5jrmvayk) {
                    deleteRegisteredGeofenceCache deleteregisteredgeofencecacheRemoteActionCompatParcelizer2 = r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.RemoteActionCompatParcelizer();
                    if (!deleteregisteredgeofencecacheRemoteActionCompatParcelizer2.equals(r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.MediaMetadataCompat)) {
                        r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.MediaMetadataCompat = deleteregisteredgeofencecacheRemoteActionCompatParcelizer2;
                        r8lambdah1qle4zdsxnfj2um0yq5jrmvayk.read(deleteregisteredgeofencecacheRemoteActionCompatParcelizer2);
                    }
                }
            }
        }
    }

    public final deleteRegisteredGeofenceCache RemoteActionCompatParcelizer() {
        Boolean bool = this.MediaSessionCompatQueueItem.read();
        getDeviceDataProviderandroid_sdk_base_release getdevicedataproviderandroid_sdk_base_release = new getDeviceDataProviderandroid_sdk_base_release();
        getdevicedataproviderandroid_sdk_base_release.write = Boolean.valueOf(this.MediaBrowserCompatMediaItem.areNotificationsEnabled());
        getdevicedataproviderandroid_sdk_base_release.serializer = bool;
        getdevicedataproviderandroid_sdk_base_release.IconCompatParcelizer = Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? this.RatingCompat.canScheduleExactAlarms() : true);
        return new deleteRegisteredGeofenceCache(getdevicedataproviderandroid_sdk_base_release);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.read.IconCompatParcelizer(deleteRegisteredGeofenceCache.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, deleteRegisteredGeofenceCache.class);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.MediaMetadataCompat = null;
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdaMp_A8sPkb2zVOjvVIlw90B4cz5M(this, this.MediaDescriptionCompat));
    }

    public r8lambdaH1qlE4ZDsxnFJ2uM0yQ5JRmvaYk(getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, NotificationManager notificationManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg, AlarmManager alarmManager) {
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RemoteActionCompatParcelizer = component4android_sdk_base_releaseVar;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.serializer = getverticalaccuracy;
        this.read = getcooldownenterseconds;
        this.MediaBrowserCompatMediaItem = notificationManager;
        this.MediaDescriptionCompat = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = r8lambdafxbjord4rv7hbevein3jpfseg;
        this.RatingCompat = alarmManager;
    }

    private void read(deleteRegisteredGeofenceCache deleteregisteredgeofencecache) {
        this.write.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.serializer.getClass();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.ParcelableVolumeInfo = deleteregisteredgeofencecache;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        this.IconCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }
}
