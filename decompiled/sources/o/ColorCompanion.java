package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ColorCompanion extends ContinuationImpl {
    public boolean IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl read;
    public androidx.room.coroutines.ConnectionWithLock serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorCompanion(androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.endTransaction(false, this);
    }
}
