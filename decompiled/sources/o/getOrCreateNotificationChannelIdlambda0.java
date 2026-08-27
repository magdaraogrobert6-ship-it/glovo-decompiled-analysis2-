package o;

import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class getOrCreateNotificationChannelIdlambda0 extends getLatitudeannotations<r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg> {
    final /* synthetic */ PayloadBatcher write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOrCreateNotificationChannelIdlambda0(PayloadBatcher payloadBatcher, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "PayloadBatcher");
        this.write = payloadBatcher;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg> getlongitudeannotations) {
        Class<?> cls = getlongitudeannotations.read().getClass();
        PayloadBatcher.read(this.write, PayloadBatcher.write(cls), getlongitudeannotations.write());
    }
}
