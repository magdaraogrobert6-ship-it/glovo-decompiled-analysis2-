package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.trip.StartTripCallback;

/* JADX INFO: loaded from: classes5.dex */
final class isDiskCacheStarting implements Runnable {
    final /* synthetic */ boolean read;
    final /* synthetic */ getMemoryCache serializer;

    @Override // java.lang.Runnable
    public final void run() {
        getMemoryCache getmemorycache = this.serializer;
        StartTripCallback startTripCallback = getmemorycache.write;
        Sentiance sentiance = getmemorycache.read;
        if (this.read) {
            sentiance.log("Trip successfully started", new Object[0]);
            startTripCallback.onSuccess();
        } else {
            sentiance.log("Trip start failed", new Object[0]);
            startTripCallback.onFailure(sentiance.getSdkStatus());
        }
    }

    public isDiskCacheStarting(getMemoryCache getmemorycache, boolean z) {
        this.serializer = getmemorycache;
        this.read = z;
    }
}
