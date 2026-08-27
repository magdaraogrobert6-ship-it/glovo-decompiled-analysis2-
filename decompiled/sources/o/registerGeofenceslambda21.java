package o;

import com.sentiance.sdk.drivinginsights.api.DrivingInsightsApi;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class registerGeofenceslambda21 implements r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ DrivingInsightsApi serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ registerGeofenceslambda21(DrivingInsightsApi drivingInsightsApi, String str, int i) {
        this.write = i;
        this.serializer = drivingInsightsApi;
        this.IconCompatParcelizer = str;
    }

    @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
    public final Object IconCompatParcelizer() {
        int i = this.write;
        String str = this.IconCompatParcelizer;
        DrivingInsightsApi drivingInsightsApi = this.serializer;
        if (i == 0) {
            return drivingInsightsApi.lambda$getCallEvents$11(str);
        }
        if (i == 1) {
            return drivingInsightsApi.lambda$getWrongWayDrivingEvents$13(str);
        }
        if (i == 2) {
            return drivingInsightsApi.lambda$getCallWhileMovingEvents$10(str);
        }
        if (i != 3) {
            return i != 4 ? drivingInsightsApi.lambda$getHarshDrivingEvents$8(str) : drivingInsightsApi.lambda$getPhoneUsageEvents$9(str);
        }
        return drivingInsightsApi.lambda$getSpeedingEvents$12(str);
    }
}
