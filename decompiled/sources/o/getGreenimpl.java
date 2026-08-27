package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getGreenimpl extends ContinuationImpl {
    public androidx.room.coroutines.ConnectionWithLock IconCompatParcelizer;
    public final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public ClipOp write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getGreenimpl(androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.beginTransaction(null, this);
    }
}
