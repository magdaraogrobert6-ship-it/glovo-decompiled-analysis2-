package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.services.ServiceForegroundMode;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LocationFixRequestTask")
public class getInstanceannotations extends createOrGetDataStorelambda00 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private boolean MediaBrowserCompatMediaItem;
    private final getCooldownEnterSeconds MediaDescriptionCompat;
    private final retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release MediaMetadataCompat;
    private final isGeofencesEnabledFromEnvironmentlambda1 RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final populateNotificationBuilderlambda2 serializer;
    private final BrazeNotificationStyleFactory write;

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        this.MediaBrowserCompatMediaItem = true;
        boolean z = this.MediaMetadataCompat.IconCompatParcelizer().read();
        parseLonglambda0 parselonglambda0 = this.read;
        if (z) {
            parselonglambda0.IconCompatParcelizer("Not requesting location fix because triggered trips are enabled", new Object[0]);
            return false;
        }
        if (!this.MediaDescriptionCompat.serializer((Long) null)) {
            parselonglambda0.IconCompatParcelizer("Sdk is not started", new Object[0]);
            return false;
        }
        if (!this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
            parselonglambda0.IconCompatParcelizer("Location is not accessible", new Object[0]);
            return false;
        }
        this.MediaBrowserCompatMediaItem = false;
        populateNotificationBuilderlambda2 populatenotificationbuilderlambda2 = this.serializer;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.IconCompatParcelizer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, populatenotificationbuilderlambda2);
        getanalyticsenabledenterannotations.read(ControlMessage.LOCATION_FIX_TIMEDOUT, this.write);
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.IconCompatParcelizer("LocationFixRequestTask", ServiceForegroundMode.O_ONLY, StartLocationFixRequest$Purpose.DETECTIONS));
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write(0);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.read(3600000L);
        publishexceptionlambda0.write("LocationFixRequestTask");
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    public getInstanceannotations(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, getCooldownEnterSeconds getcooldownenterseconds) {
        this.read = parselonglambda0;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = isgeofencesenabledfromenvironmentlambda1;
        this.MediaMetadataCompat = retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release;
        this.MediaDescriptionCompat = getcooldownenterseconds;
        this.serializer = new populateNotificationBuilderlambda2(this, readandroid_sdk_base_releaseVar);
        this.write = new BrazeNotificationStyleFactory(this, readandroid_sdk_base_releaseVar);
    }

    public static void write(getInstanceannotations getinstanceannotations) {
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = getinstanceannotations.IconCompatParcelizer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(getinstanceannotations.serializer);
        getanalyticsenabledenterannotations.read(getinstanceannotations.write);
    }
}
