package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapPainter extends ContinuationImpl {
    public final /* synthetic */ com.deliveryhero.customerchat.eventTracking.AnalyticsImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public com.deliveryhero.customerchat.analytics.model.EventCreationRequest read;
    public int serializer;
    public com.deliveryhero.customerchat.eventTracking.AnalyticsImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapPainter(com.deliveryhero.customerchat.eventTracking.AnalyticsImpl analyticsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = analyticsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.track(null, this);
    }
}
