package o;

import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class cancelNotificationlambda1 implements Runnable {
    final /* synthetic */ PayloadBatcher IconCompatParcelizer;
    final /* synthetic */ PayloadBatcher.TripState RemoteActionCompatParcelizer;
    final /* synthetic */ long write;

    public cancelNotificationlambda1(PayloadBatcher payloadBatcher, PayloadBatcher.TripState tripState, long j) {
        this.IconCompatParcelizer = payloadBatcher;
        this.RemoteActionCompatParcelizer = tripState;
        this.write = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PayloadBatcher.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, Long.valueOf(this.write));
    }
}
