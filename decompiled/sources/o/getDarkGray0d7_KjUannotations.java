package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getDarkGray0d7_KjUannotations extends ContinuationImpl {
    public androidx.room.coroutines.ConnectionWithLock IconCompatParcelizer;
    public final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl MediaBrowserCompatMediaItem;
    public String RemoteActionCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDarkGray0d7_KjUannotations(androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.MediaBrowserCompatMediaItem.usePrepared(null, null, this);
    }
}
