package o;

import com.sentiance.sdk.crashdetection.api.CrashDetectionApi;
import com.sentiance.sdk.crashdetection.api.VehicleCrashDiagnosticListener;
import com.sentiance.sdk.crashdetection.api.VehicleCrashListener;
import com.sentiance.sdk.drivinginsights.api.DrivingInsightsApi;
import com.sentiance.sdk.drivinginsights.api.HarshDrivingEventListener;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionApi;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1 implements SdkMetadataDataStoreProviderCompanion {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ com.sentiance.sdk.util.N serializer;

    public /* synthetic */ GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1(com.sentiance.sdk.util.N n, Object obj, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = n;
        this.read = obj;
    }

    @Override // o.SdkMetadataDataStoreProviderCompanion
    public final Object serializer() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        com.sentiance.sdk.util.N n = this.serializer;
        if (i == 0) {
            return ((CrashDetectionApi) n).lambda$setVehicleCrashListener$0((VehicleCrashListener) obj);
        }
        if (i == 1) {
            return ((CrashDetectionApi) n).lambda$setVehicleCrashDiagnosticListener$1((VehicleCrashDiagnosticListener) obj);
        }
        if (i != 2) {
            return i != 3 ? ((TransportSessionApi) n).lambda$setTransportSessionListener$3((TransportSessionListener) obj) : ((DrivingInsightsApi) n).lambda$getDrivingInsights$7((String) obj);
        }
        return ((DrivingInsightsApi) n).lambda$setHarshDrivingEventListener$0((HarshDrivingEventListener) obj);
    }
}
