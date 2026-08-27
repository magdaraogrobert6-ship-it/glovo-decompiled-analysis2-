package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class BlurEffect3YTHUZs extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ coil3.network.NetworkFetcher RemoteActionCompatParcelizer;
    public int read;
    public createInAppMessageEventSubscriber serializer;
    public createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurEffect3YTHUZs(coil3.network.NetworkFetcher networkFetcher, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return coil3.network.NetworkFetcher.access$doFetch(this.RemoteActionCompatParcelizer, this);
    }
}
