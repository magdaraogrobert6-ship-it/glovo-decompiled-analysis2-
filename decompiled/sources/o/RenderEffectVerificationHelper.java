package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class RenderEffectVerificationHelper extends ContinuationImpl {
    public createBlurEffect8A3gB4 IconCompatParcelizer;
    public final /* synthetic */ coil3.network.NetworkFetcher MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public getExponentimpl serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderEffectVerificationHelper(coil3.network.NetworkFetcher networkFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return coil3.network.NetworkFetcher.access$writeToDiskCache(this.MediaDescriptionCompat, null, null, null, this);
    }
}
