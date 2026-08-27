package o;

import com.sentiance.sdk.drivinginsights.api.DrivingInsightsApi;
import com.sentiance.sdk.drivinginsights.api.SafetyScoreRequestParameters;
import com.sentiance.sdk.feedback.api.FeedbackApi;
import com.sentiance.sdk.feedback.api.OccupantRoleFeedback;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getLargeIcon implements r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ getLargeIcon(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
    public final Object IconCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        return i != 0 ? ((DrivingInsightsApi) obj2).lambda$getAverageOverallSafetyScore$14((SafetyScoreRequestParameters) obj) : FeedbackApi.lambda$submitOccupantRoleFeedback$0((String) obj2, (OccupantRoleFeedback) obj);
    }
}
