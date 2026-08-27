package o;

import com.sentiance.sdk.drivinginsights.api.DrivingInsightsApi;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionApi;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class registerGeofenceslambda23 implements removeGeofencesRegisteredWithGeofencingClientlambda20 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ com.sentiance.sdk.util.N serializer;

    public /* synthetic */ registerGeofenceslambda23(com.sentiance.sdk.util.N n, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = n;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda20
    public final void write() {
        int i = this.RemoteActionCompatParcelizer;
        com.sentiance.sdk.util.N n = this.serializer;
        if (i != 0) {
            ((TransportSessionApi) n).onBootstrapComplete();
        } else {
            ((DrivingInsightsApi) n).onBootstrapComplete();
        }
    }
}
