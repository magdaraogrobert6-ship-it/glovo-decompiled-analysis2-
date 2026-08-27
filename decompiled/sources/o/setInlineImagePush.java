package o;

import android.content.Context;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class setInlineImagePush extends createOrGetDataStorelambda00 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final getCooldownEnterSeconds MediaBrowserCompatMediaItem;
    private final migrateTriggersReeligibilityToJsonlambda4<Long> MediaDescriptionCompat;
    private boolean RatingCompat;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final getVerticalAccuracy read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;
    private final isGeofencesEnabledFromEnvironmentlambda1 write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map;
        synchronized (this) {
            map = new HashMap();
            Long l = this.MediaDescriptionCompat.read();
            if (l != null) {
                map.put(setSdkEnablementProviderandroid_sdk_base_release.class, l);
            }
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.MediaDescriptionCompat.IconCompatParcelizer(null);
        }
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    public static byte serializer(setInlineImagePush setinlineimagepush) {
        isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1 = setinlineimagepush.write;
        int iSerializer = isgeofencesenabledfromenvironmentlambda1.serializer();
        if (iSerializer == 0 || iSerializer == 1) {
            return isgeofencesenabledfromenvironmentlambda1.ParcelableVolumeInfo() ? (byte) 3 : (byte) 0;
        }
        if (iSerializer == 2 || iSerializer == 3) {
            return isgeofencesenabledfromenvironmentlambda1.MediaDescriptionCompat() ? (byte) 1 : (byte) 2;
        }
        return (byte) 4;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        boolean z;
        synchronized (this) {
            this.RatingCompat = true;
            if (!this.MediaBrowserCompatMediaItem.serializer((Long) null)) {
                return false;
            }
            if (!this.write.MediaBrowserCompatMediaItem()) {
                return false;
            }
            synchronized (this) {
                Long l = this.MediaDescriptionCompat.read();
                if (l != null) {
                    this.serializer.getClass();
                    z = System.currentTimeMillis() - 600000 < l.longValue();
                }
                if (z) {
                    return false;
                }
                this.RatingCompat = false;
                this.IconCompatParcelizer.read(ControlMessage.LAST_KNOWN_LOCATION_RESPONSE, new setLargeIcon(this, this.RemoteActionCompatParcelizer));
                this.IconCompatParcelizer.IconCompatParcelizer(ControlMessage.GET_LAST_KNOWN_LOCATION, Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_FAST));
                return false;
            }
        }
    }

    public setInlineImagePush(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, getCooldownEnterSeconds getcooldownenterseconds) {
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.read = getverticalaccuracy;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.write = isgeofencesenabledfromenvironmentlambda1;
        this.MediaBrowserCompatMediaItem = getcooldownenterseconds;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.MediaDescriptionCompat = new setIsInlineImagePush(this, System.currentTimeMillis());
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return this.RatingCompat;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("HeartbeatTask");
        publishexceptionlambda0.read(3600000L);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(0);
        publishexceptionlambda0.RemoteActionCompatParcelizer(0);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    public static Long serializer(setInlineImagePush setinlineimagepush, long j) {
        Optional optional = setinlineimagepush.MediaBrowserCompatMediaItem.read(setSdkEnablementProviderandroid_sdk_base_release.class, Long.valueOf(j));
        if (optional.IconCompatParcelizer()) {
            return Long.valueOf(((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer());
        }
        return null;
    }
}
