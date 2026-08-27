package o;

import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class getOrCreateNotificationChannelIdlambda1 extends getLatitudeannotations<BrazeBootReceiver> {
    final /* synthetic */ PayloadBatcher IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOrCreateNotificationChannelIdlambda1(PayloadBatcher payloadBatcher, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "PayloadBatcher");
        this.IconCompatParcelizer = payloadBatcher;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<BrazeBootReceiver> getlongitudeannotations) {
        Class<?> cls = getlongitudeannotations.read().getClass();
        PayloadBatcher.read(this.IconCompatParcelizer, PayloadBatcher.write(cls), getlongitudeannotations.write());
    }
}
