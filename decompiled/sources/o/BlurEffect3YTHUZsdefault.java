package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class BlurEffect3YTHUZsdefault extends ContinuationImpl {
    public int IconCompatParcelizer;
    public RegistryMissingComponentException read;
    public final /* synthetic */ coil3.network.NetworkFetcher serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurEffect3YTHUZsdefault(coil3.network.NetworkFetcher networkFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return coil3.network.NetworkFetcher.access$toImageSource(this.serializer, null, this);
    }
}
