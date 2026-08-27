package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.trip.StartTripCallback;
import com.sentiance.sdk.trip.TransportMode;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class renderUrlIntoView implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ Sentiance IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ TransportMode read;
    public final /* synthetic */ Map serializer;
    public final /* synthetic */ int write = 0;

    public /* synthetic */ renderUrlIntoView(Sentiance sentiance, BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, Map map, TransportMode transportMode) {
        this.IconCompatParcelizer = sentiance;
        this.RemoteActionCompatParcelizer = brazeNotificationUtilsExternalSyntheticLambda14;
        this.serializer = map;
        this.read = transportMode;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.write;
        TransportMode transportMode = this.read;
        Map map = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        Sentiance sentiance = this.IconCompatParcelizer;
        if (i != 0) {
            sentiance.lambda$startTrip$28((BrazeNotificationUtilsExternalSyntheticLambda14) obj, map, transportMode);
        } else {
            sentiance.lambda$startTrip$27((StartTripCallback) obj, transportMode, map);
        }
    }

    public /* synthetic */ renderUrlIntoView(Sentiance sentiance, StartTripCallback startTripCallback, TransportMode transportMode, Map map) {
        this.IconCompatParcelizer = sentiance;
        this.RemoteActionCompatParcelizer = startTripCallback;
        this.read = transportMode;
        this.serializer = map;
    }
}
