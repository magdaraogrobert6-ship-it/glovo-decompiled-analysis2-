package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.crashdetection.api.CrashDetectionApi;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getDiskCacheDir implements r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk {
    public final /* synthetic */ int write;

    public /* synthetic */ getDiskCacheDir(int i) {
        this.write = i;
    }

    @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
    public final Object IconCompatParcelizer() {
        switch (this.write) {
            case 0:
                return Sentiance.lambda$getWiFiQuotaLimit$19();
            case 1:
                return Sentiance.lambda$getMobileQuotaLimit$21();
            case 2:
                return Sentiance.lambda$getDiskQuotaLimit$23();
            case 3:
                return Sentiance.lambda$getTransmittableDataTypes$18();
            case 4:
                return Sentiance.lambda$isAppSessionDataCollectionEnabled$48();
            case 5:
                return Sentiance.lambda$getWiFiQuotaUsage$20();
            case 6:
                return Sentiance.lambda$getDiskQuotaUsage$24();
            case 7:
                return Sentiance.lambda$getUserActivity$46();
            case 8:
                return Sentiance.lambda$isSdkKillSwitched$51();
            case 9:
                return Sentiance.lambda$getSdkStatus$33();
            case 10:
                return Sentiance.lambda$isAllowedToUseMobileData$50();
            case 11:
                return Sentiance.lambda$getMobileQuotaUsage$22();
            default:
                return CrashDetectionApi.lambda$isVehicleCrashDetectionSupported$6();
        }
    }
}
