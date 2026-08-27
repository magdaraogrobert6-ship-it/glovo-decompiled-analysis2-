package o;

import com.sentiance.sdk.DebugApi;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.trip.TripTimeoutListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class removeGeofencesRegisteredWithGeofencingClientlambda25 implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ removeGeofencesRegisteredWithGeofencingClientlambda25(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            requestSingleLocationUpdateFromGooglePlaylambda0.RemoteActionCompatParcelizer((requestSingleLocationUpdateFromGooglePlaylambda0) obj);
            return;
        }
        if (i == 1) {
            DebugApi.lambda$uploadEvents$0((getEnabledannotations) obj);
            return;
        }
        if (i == 2) {
            DebugApi.lambda$uploadLogs$1((getStableKey) obj);
        } else if (i != 3) {
            ((TripTimeoutListener) obj).onTripTimeout();
        } else {
            ((Sentiance) obj).lambda$processInitSuccess$36();
        }
    }
}
