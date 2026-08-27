package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.task.TaskManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "KeepAwake", componentName = "KeepAwake")
public class setTitleText implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg read;
    private final TaskManager serializer;
    private final BrazeNotificationPayloadActionButton write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    public static void IconCompatParcelizer(setTitleText settitletext) {
        BrazeNotificationPayloadActionButton brazeNotificationPayloadActionButton = settitletext.write;
        if (brazeNotificationPayloadActionButton.IconCompatParcelizer() != null) {
            settitletext.serializer.read((createOrGetDataStorelambda00) brazeNotificationPayloadActionButton, false);
        }
    }

    public setTitleText(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, TaskManager taskManager, BrazeNotificationPayloadActionButton brazeNotificationPayloadActionButton, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg) {
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.serializer = taskManager;
        this.write = brazeNotificationPayloadActionButton;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.read = r8lambdafxbjord4rv7hbevein3jpfseg;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        if (this.read.serializer(null) <= 29) {
            readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.IconCompatParcelizer;
            setShouldFetchTestTriggers setshouldfetchtesttriggers = new setShouldFetchTestTriggers(this, readandroid_sdk_base_releaseVar);
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
            getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, setshouldfetchtesttriggers);
            getanalyticsenabledenterannotations.IconCompatParcelizer((getLatitudeannotations<r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>) new setShouldRefreshBanners(this, readandroid_sdk_base_releaseVar));
        }
    }
}
