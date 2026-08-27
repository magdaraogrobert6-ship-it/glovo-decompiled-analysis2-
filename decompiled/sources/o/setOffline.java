package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.trip.StopTripCallback;

/* JADX INFO: loaded from: classes3.dex */
final class setOffline implements Runnable {
    final /* synthetic */ shouldSkipCaching IconCompatParcelizer;
    final /* synthetic */ getTrackingId read;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        shouldSkipCaching shouldskipcaching = this.IconCompatParcelizer;
        StopTripCallback stopTripCallback = shouldskipcaching.serializer;
        Sentiance sentiance = shouldskipcaching.read;
        if (zRemoteActionCompatParcelizer) {
            sentiance.log("Trip successfully stopped", new Object[0]);
            stopTripCallback.onSuccess();
        } else {
            sentiance.log("Trip stop failed", new Object[0]);
            stopTripCallback.onFailure(sentiance.getSdkStatus());
        }
    }

    public setOffline(shouldSkipCaching shouldskipcaching, getTrackingId gettrackingid) {
        this.IconCompatParcelizer = shouldskipcaching;
        this.read = gettrackingid;
    }
}
