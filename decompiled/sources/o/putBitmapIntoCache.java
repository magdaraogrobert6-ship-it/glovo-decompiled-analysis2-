package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.trip.StartTripCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class putBitmapIntoCache implements Runnable {
    final /* synthetic */ Sentiance IconCompatParcelizer;
    final /* synthetic */ StartTripCallback serializer;

    @Override // java.lang.Runnable
    public final void run() {
        this.serializer.onFailure(this.IconCompatParcelizer.getSdkStatus());
    }

    public putBitmapIntoCache(Sentiance sentiance, StartTripCallback startTripCallback) {
        this.IconCompatParcelizer = sentiance;
        this.serializer = startTripCallback;
    }
}
