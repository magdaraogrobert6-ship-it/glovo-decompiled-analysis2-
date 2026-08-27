package o;

import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class getNotificationPrioritylambda00 extends getLatitudeannotations<setShouldPersistWebView> {
    final /* synthetic */ PayloadBatcher write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNotificationPrioritylambda00(PayloadBatcher payloadBatcher, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "PayloadBatcher");
        this.write = payloadBatcher;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<setShouldPersistWebView> getlongitudeannotations) {
        Class<?> cls = getlongitudeannotations.read().getClass();
        PayloadBatcher.read(this.write, PayloadBatcher.write(cls), getlongitudeannotations.write());
    }
}
