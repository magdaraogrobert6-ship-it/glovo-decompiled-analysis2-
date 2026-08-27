package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getAlphaimpl extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ androidx.room.coroutines.Pool RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAlphaimpl(androidx.room.coroutines.Pool pool, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.acquire(this);
    }
}
