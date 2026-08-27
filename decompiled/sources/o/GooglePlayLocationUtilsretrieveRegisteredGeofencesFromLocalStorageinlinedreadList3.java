package o;

import com.sentiance.sdk.crashdetection.api.CrashDetectionApi;
import com.sentiance.sdk.crashdetection.api.CrashDetectionDebug;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList3 implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ com.sentiance.sdk.util.N serializer;

    public /* synthetic */ GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList3(com.sentiance.sdk.util.N n, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = n;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        com.sentiance.sdk.util.N n = this.serializer;
        if (i != 0) {
            ((CrashDetectionDebug) n).lambda$generateCrashEvent$0();
        } else {
            ((CrashDetectionApi) n).lambda$invokeDummyVehicleCrash$4();
        }
    }
}
