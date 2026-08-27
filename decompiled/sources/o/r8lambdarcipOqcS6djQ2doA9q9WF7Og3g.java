package o;

import com.sentiance.sdk.eventtimeline.api.EventTimelineApi;
import com.sentiance.sdk.eventtimeline.api.PotentialVehicleTransportStartListener;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionApi;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8lambdarcipOqcS6djQ2doA9q9WF7Og3g implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ r8lambdarcipOqcS6djQ2doA9q9WF7Og3g(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            EventTimelineApi.lambda$setPotentialVehicleTransportStartListener$7((PotentialVehicleTransportStartListener) obj);
        } else if (i != 1) {
            ((TransportSessionApi) obj).lambda$enableTransportSessionRecording$1();
        } else {
            ((TransportSessionApi) obj).lambda$disableTransportSessionRecording$2();
        }
    }
}
