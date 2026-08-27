package o;

import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class getPushActionPendingIntent extends getLatitudeannotations<r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A> {
    final /* synthetic */ PayloadBatcher RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPushActionPendingIntent(PayloadBatcher payloadBatcher, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "PayloadBatcher");
        this.RemoteActionCompatParcelizer = payloadBatcher;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A> getlongitudeannotations) {
        Class<?> cls = getlongitudeannotations.read().getClass();
        PayloadBatcher.read(this.RemoteActionCompatParcelizer, PayloadBatcher.write(cls), getlongitudeannotations.write());
    }
}
