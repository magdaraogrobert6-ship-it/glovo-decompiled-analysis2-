package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getCyan0d7_KjUannotations extends ContinuationImpl {
    public Object IconCompatParcelizer;
    public final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl RatingCompat;
    public Throwable RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCyan0d7_KjUannotations(androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.RatingCompat.transaction$1(null, null, this);
    }
}
