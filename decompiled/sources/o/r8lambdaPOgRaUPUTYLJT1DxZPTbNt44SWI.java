package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SensorStreamLauncher")
public class r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final BrazePushReceiverCompanionExternalSyntheticLambda1 read;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    public static void serializer(r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI r8lambdapograuputyljt1dxzptbnt44swi, BannerExternalSyntheticLambda0 bannerExternalSyntheticLambda0) {
        r8lambdapograuputyljt1dxzptbnt44swi.read.IconCompatParcelizer(bannerExternalSyntheticLambda0);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.read.serializer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        r8lambdaxNatrP5siKZO6RPLJ9mCXDCi3_0 r8lambdaxnatrp5sikzo6rplj9mcxdci3_0 = new r8lambdaxNatrP5siKZO6RPLJ9mCXDCi3_0(this, this.RemoteActionCompatParcelizer);
        ControlMessage controlMessage = ControlMessage.SENSORS_START;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.IconCompatParcelizer;
        getanalyticsenabledenterannotations.read(controlMessage, r8lambdaxnatrp5sikzo6rplj9mcxdci3_0);
        getanalyticsenabledenterannotations.read(ControlMessage.SENSORS_STOP, r8lambdaxnatrp5sikzo6rplj9mcxdci3_0);
    }

    public r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, BrazePushReceiverCompanionExternalSyntheticLambda1 brazePushReceiverCompanionExternalSyntheticLambda1) {
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.read = brazePushReceiverCompanionExternalSyntheticLambda1;
    }

    public static void RemoteActionCompatParcelizer(r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI r8lambdapograuputyljt1dxzptbnt44swi, getBannerId getbannerid) {
        r8lambdapograuputyljt1dxzptbnt44swi.read.read(getbannerid);
    }
}
