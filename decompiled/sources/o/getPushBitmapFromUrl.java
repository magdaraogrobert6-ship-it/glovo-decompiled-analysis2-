package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.trip.StopTripCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class getPushBitmapFromUrl implements Runnable {
    final /* synthetic */ Sentiance read;
    final /* synthetic */ StopTripCallback serializer;

    @Override // java.lang.Runnable
    public final void run() {
        this.serializer.onFailure(this.read.getSdkStatus());
    }

    public getPushBitmapFromUrl(Sentiance sentiance, StopTripCallback stopTripCallback) {
        this.read = sentiance;
        this.serializer = stopTripCallback;
    }
}
