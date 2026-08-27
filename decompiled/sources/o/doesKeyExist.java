package o;

import com.sentiance.sdk.drivinginsights.api.DrivingInsightsApi;
import com.sentiance.sdk.drivinginsights.api.DrivingInsightsReadyListener;
import com.sentiance.sdk.drivinginsights.api.PhoneUsageEventListener;
import com.sentiance.sdk.eventtimeline.api.EventTimelineApi;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSession;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionApi;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class doesKeyExist implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ Object read;
    public final /* synthetic */ com.sentiance.sdk.util.N serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ doesKeyExist(com.sentiance.sdk.util.N n, Object obj, int i) {
        this.write = i;
        this.serializer = n;
        this.read = obj;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.write;
        Object obj = this.read;
        com.sentiance.sdk.util.N n = this.serializer;
        if (i == 0) {
            ((EventTimelineApi) n).lambda$setTransportTags$6((Map) obj);
            return;
        }
        if (i == 1) {
            ((DrivingInsightsApi) n).lambda$setPhoneUsageEventListener$3((PhoneUsageEventListener) obj);
            return;
        }
        if (i == 2) {
            ((DrivingInsightsApi) n).lambda$setDrivingInsightsReadyListener$6((DrivingInsightsReadyListener) obj);
        } else if (i != 3) {
            ((TransportSessionApi) n).lambda$deleteAllTransportSessions$6((TransportSession) obj);
        } else {
            ((TransportSessionApi) n).lambda$deleteTransportSession$5((String) obj);
        }
    }
}
