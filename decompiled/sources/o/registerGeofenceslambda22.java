package o;

import com.sentiance.core.model.events.ThriftBool;
import com.sentiance.sdk.drivinginsights.api.DrivingInsightsApi;
import com.sentiance.sdk.drivinginsights.api.HarshDrivingEvent;
import com.sentiance.sdk.drivinginsights.api.HarshDrivingEventListener;
import com.sentiance.sdk.util.DateTime;
import io.sentry.Scopes$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class registerGeofenceslambda22 extends getLatitudeannotations<setConfiguredCustomEndpointandroid_sdk_base_release> {
    final /* synthetic */ DrivingInsightsApi RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public registerGeofenceslambda22(DrivingInsightsApi drivingInsightsApi) {
        super(drivingInsightsApi.getParallelExecutor(), "DrivingInsightsApi");
        this.RemoteActionCompatParcelizer = drivingInsightsApi;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<setConfiguredCustomEndpointandroid_sdk_base_release> getlongitudeannotations) {
        Long l;
        setConfiguredCustomEndpointandroid_sdk_base_release setconfiguredcustomendpointandroid_sdk_base_release = getlongitudeannotations.read();
        if (setconfiguredcustomendpointandroid_sdk_base_release.read != ThriftBool.TRUE) {
            return;
        }
        DrivingInsightsApi drivingInsightsApi = this.RemoteActionCompatParcelizer;
        HarshDrivingEventListener harshDrivingEventListener = drivingInsightsApi.mHarshDrivingEventListener;
        drivingInsightsApi.log("Sending harsh driving event to the enclosing app", new Object[0]);
        if (harshDrivingEventListener == null || (l = setconfiguredcustomendpointandroid_sdk_base_release.MediaSessionCompatQueueItem) == null) {
            return;
        }
        DateTime dateTime = drivingInsightsApi.getTimelineUtil().read(l);
        BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer.getClass();
        HarshDrivingEvent harshDrivingEventSerializer = BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer.serializer(setconfiguredcustomendpointandroid_sdk_base_release, dateTime);
        if (harshDrivingEventSerializer != null) {
            readBoolean.serializer(new Scopes$$ExternalSyntheticLambda0(harshDrivingEventListener, 2, harshDrivingEventSerializer));
        }
    }
}
