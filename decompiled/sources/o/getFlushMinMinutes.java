package o;

import com.sentiance.sdk.eventtimeline.api.EventTimelineApi;
import com.sentiance.sdk.feedback.api.FeedbackApi;
import com.sentiance.sdk.feedback.api.VehicleCrashDetectionFeedback;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getFlushMinMinutes implements r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ getFlushMinMinutes(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
    public final Object IconCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        return i != 0 ? EventTimelineApi.lambda$getTimelineEvent$4((String) obj) : FeedbackApi.lambda$submitVehicleCrashDetectionFeedback$1((VehicleCrashDetectionFeedback) obj);
    }
}
