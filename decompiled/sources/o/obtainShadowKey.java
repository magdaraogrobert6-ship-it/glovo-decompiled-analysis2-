package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class obtainShadowKey extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public com.deliveryhero.customerchat.fwf.FeatureFlagProvider read;
    public final /* synthetic */ com.deliveryhero.customerchat.fwf.FeatureFlagProvider serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obtainShadowKey(com.deliveryhero.customerchat.fwf.FeatureFlagProvider featureFlagProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = featureFlagProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return com.deliveryhero.customerchat.fwf.FeatureFlagProvider.access$fetchUserFeatureFlags(this.serializer, null, null, this);
    }
}
