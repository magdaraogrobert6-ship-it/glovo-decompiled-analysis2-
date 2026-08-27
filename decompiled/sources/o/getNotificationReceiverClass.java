package o;

import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class getNotificationReceiverClass implements Runnable {
    final /* synthetic */ PayloadBatcher serializer;

    @Override // java.lang.Runnable
    public final void run() {
        PayloadBatcher.IconCompatParcelizer(this.serializer);
    }

    public getNotificationReceiverClass(PayloadBatcher payloadBatcher) {
        this.serializer = payloadBatcher;
    }
}
