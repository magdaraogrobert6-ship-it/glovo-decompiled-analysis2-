package o;

import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class getOrCreateNotificationChannelId extends getLatitudeannotations<wipeDatalambda0> {
    final /* synthetic */ PayloadBatcher IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOrCreateNotificationChannelId(PayloadBatcher payloadBatcher, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "PayloadBatcher");
        this.IconCompatParcelizer = payloadBatcher;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<wipeDatalambda0> getlongitudeannotations) {
        Class<?> cls = getlongitudeannotations.read().getClass();
        PayloadBatcher.read(this.IconCompatParcelizer, PayloadBatcher.write(cls), getlongitudeannotations.write());
    }
}
