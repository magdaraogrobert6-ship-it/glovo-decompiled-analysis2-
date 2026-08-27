package o;

import com.sentiance.sdk.InjectUsing;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "TestConfiguration")
public final class storeRegisteredGeofencesToLocalStoragelambda0 {
    private final com.sentiance.sdk.util.c serializer;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new IconCompatParcelizer(null);
    }

    public storeRegisteredGeofencesToLocalStoragelambda0(com.sentiance.sdk.util.c cVar) {
        cVar.getClass();
        this.serializer = cVar;
    }

    public final boolean MediaDescriptionCompat() {
        return this.serializer.read("on_device_data_sync/autoSyncAllPayloadsOverride", false);
    }

    public final void read(Boolean bool) {
        com.sentiance.sdk.util.c cVar = this.serializer;
        if (bool == null) {
            cVar.read("transportPostProcessing/enabled");
        } else {
            cVar.IconCompatParcelizer("transportPostProcessing/enabled", bool.booleanValue());
        }
    }

    public final void IconCompatParcelizer(Float f) {
        com.sentiance.sdk.util.c cVar = this.serializer;
        if (f == null) {
            cVar.read("wrong_way_driving/maxAcceptableDistanceOverride");
        } else {
            cVar.IconCompatParcelizer(f.floatValue(), "wrong_way_driving/maxAcceptableDistanceOverride");
        }
    }

    public final Boolean MediaSessionCompatQueueItem() {
        com.sentiance.sdk.util.c cVar = this.serializer;
        if (cVar.write("transportPostProcessing/enabled")) {
            return Boolean.valueOf(cVar.read("transportPostProcessing/enabled", false));
        }
        return null;
    }

    public final void read(Float f) {
        com.sentiance.sdk.util.c cVar = this.serializer;
        if (f == null) {
            cVar.read("wrong_way_driving/minAcceptableSpeedOverride");
        } else {
            cVar.IconCompatParcelizer(f.floatValue(), "wrong_way_driving/minAcceptableSpeedOverride");
        }
    }

    public final Float serializer() {
        return removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read(this.serializer, "wrong_way_driving/minAcceptableDistanceOverride");
    }

    public final Float write() {
        return removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read(this.serializer, "wrong_way_driving/minAcceptableSpeedOverride");
    }

    public final void write(Float f) {
        com.sentiance.sdk.util.c cVar = this.serializer;
        if (f == null) {
            cVar.read("wrong_way_driving/minAcceptableDistanceOverride");
        } else {
            cVar.IconCompatParcelizer(f.floatValue(), "wrong_way_driving/minAcceptableDistanceOverride");
        }
    }

    public final String IconCompatParcelizer() {
        return this.serializer.write("classifiedTransportModeOverride", (String) null);
    }

    public final Float RemoteActionCompatParcelizer() {
        return removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read(this.serializer, "wrong_way_driving/maxAcceptableAccuracyOverride");
    }

    public final Float read() {
        return removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read(this.serializer, "wrong_way_driving/maxAcceptableDistanceOverride");
    }

    public final void serializer(Float f) {
        com.sentiance.sdk.util.c cVar = this.serializer;
        if (f == null) {
            cVar.read("wrong_way_driving/maxAcceptableAccuracyOverride");
        } else {
            cVar.IconCompatParcelizer(f.floatValue(), "wrong_way_driving/maxAcceptableAccuracyOverride");
        }
    }

    public final void write(String str) {
        this.serializer.RemoteActionCompatParcelizer("classifiedTransportModeOverride", str);
    }

    public final void read(boolean z) {
        this.serializer.IconCompatParcelizer("on_device_data_sync/autoSyncAllPayloadsOverride", z);
    }
}
