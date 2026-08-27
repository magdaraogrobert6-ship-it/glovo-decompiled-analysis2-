package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getColorSpaceimpl extends ContinuationImpl {
    public long IconCompatParcelizer;
    public final /* synthetic */ androidx.room.coroutines.Pool MediaBrowserCompatMediaItem;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public createInAppMessageEventSubscriber read;
    public int serializer;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getColorSpaceimpl(androidx.room.coroutines.Pool pool, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.MediaBrowserCompatMediaItem.m3952acquireWithTimeoutKLykuaI(0L, null, this);
    }
}
