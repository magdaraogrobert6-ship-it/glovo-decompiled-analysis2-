package o;

import android.os.PowerManager;
import com.sentiance.sdk.InjectUsing;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LocationModeReliabilityMonitor")
public class r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private boolean MediaMetadataCompat;
    private final r8lambdaSUwf1m9MlOX2CsKpYUNU0RzrUsQ RatingCompat;
    private final PowerManager RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private final HashMap<r8lambdaZQ8uyXmhlaXDpUbPCryPXeoi9E, clearandroid_sdk_base_release> serializer = new HashMap<>();
    private final parseLonglambda0 write;

    public static void serializer(r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM r8lambda7xdj8hz3fhe1sorygyl0chronm) {
        synchronized (r8lambda7xdj8hz3fhe1sorygyl0chronm) {
            boolean z = r8lambda7xdj8hz3fhe1sorygyl0chronm.MediaMetadataCompat;
            PowerManager powerManager = r8lambda7xdj8hz3fhe1sorygyl0chronm.RemoteActionCompatParcelizer;
            boolean z2 = !powerManager.isPowerSaveMode() || powerManager.isInteractive();
            r8lambda7xdj8hz3fhe1sorygyl0chronm.MediaMetadataCompat = z2;
            if (z != z2) {
                r8lambda7xdj8hz3fhe1sorygyl0chronm.IconCompatParcelizer();
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        synchronized (this) {
            boolean z = this.MediaMetadataCompat;
            PowerManager powerManager = this.RemoteActionCompatParcelizer;
            boolean z2 = !powerManager.isPowerSaveMode() || powerManager.isInteractive();
            this.MediaMetadataCompat = z2;
            if (z != z2) {
                IconCompatParcelizer();
            }
        }
        return this.MediaMetadataCompat;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.serializer.clear();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        r8lambdaC_OxPFb59JpKzGCgDTkYtaz8lx0 r8lambdac_oxpfb59jpkzgcgdtkytaz8lx0 = new r8lambdaC_OxPFb59JpKzGCgDTkYtaz8lx0(this, this.IconCompatParcelizer);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(BrazeInternal.class, r8lambdac_oxpfb59jpkzgcgdtkytaz8lx0);
        boolean zIsPowerSaveMode = this.RemoteActionCompatParcelizer.isPowerSaveMode();
        r8lambdaSUwf1m9MlOX2CsKpYUNU0RzrUsQ r8lambdasuwf1m9mlox2cskpyunu0rzrusq = this.RatingCompat;
        if (zIsPowerSaveMode) {
            getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(retryInAppMessage.class, r8lambdasuwf1m9mlox2cskpyunu0rzrusq);
        } else {
            getanalyticsenabledenterannotations.serializer(retryInAppMessage.class, r8lambdasuwf1m9mlox2cskpyunu0rzrusq);
        }
    }

    public r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, PowerManager powerManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, parseLonglambda0 parselonglambda0) {
        this.read = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = powerManager;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.write = parselonglambda0;
        this.RatingCompat = new r8lambdaSUwf1m9MlOX2CsKpYUNU0RzrUsQ(this, readandroid_sdk_base_releaseVar);
        this.MediaMetadataCompat = !powerManager.isPowerSaveMode() || powerManager.isInteractive();
    }

    private void IconCompatParcelizer() {
        this.write.IconCompatParcelizer("reliability changed notifying consumers, reliability: %s", Boolean.valueOf(this.MediaMetadataCompat));
        for (Map.Entry<r8lambdaZQ8uyXmhlaXDpUbPCryPXeoi9E, clearandroid_sdk_base_release> entry : this.serializer.entrySet()) {
            entry.getValue().RemoteActionCompatParcelizer(new BrazeNotificationPayloadCompanion(this, entry.getKey()));
        }
    }

    public static void RemoteActionCompatParcelizer(r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM r8lambda7xdj8hz3fhe1sorygyl0chronm, Boolean bool) {
        r8lambdaSUwf1m9MlOX2CsKpYUNU0RzrUsQ r8lambdasuwf1m9mlox2cskpyunu0rzrusq = r8lambda7xdj8hz3fhe1sorygyl0chronm.RatingCompat;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = r8lambda7xdj8hz3fhe1sorygyl0chronm.read;
        if (bool != null && bool.booleanValue()) {
            getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(retryInAppMessage.class, r8lambdasuwf1m9mlox2cskpyunu0rzrusq);
        } else {
            getanalyticsenabledenterannotations.serializer(retryInAppMessage.class, r8lambdasuwf1m9mlox2cskpyunu0rzrusq);
        }
    }

    public final void IconCompatParcelizer(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        synchronized (this) {
            this.serializer.put(populatenotificationbuilderlambda1, readandroid_sdk_base_releaseVar);
        }
    }

    public final void read(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1) {
        synchronized (this) {
            this.serializer.remove(populatenotificationbuilderlambda1);
        }
    }
}
