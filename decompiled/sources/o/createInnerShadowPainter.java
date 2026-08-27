package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class createInnerShadowPainter extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ com.deliveryhero.customerchat.fwf.FeatureFlagProvider serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createInnerShadowPainter(com.deliveryhero.customerchat.fwf.FeatureFlagProvider featureFlagProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = featureFlagProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.getUserFeatureFlags(this);
    }
}
