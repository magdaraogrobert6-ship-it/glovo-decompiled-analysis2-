package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class copywmQWz5cdefault extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ androidx.room.coroutines.PassthroughConnection write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copywmQWz5cdefault(androidx.room.coroutines.PassthroughConnection passthroughConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = passthroughConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.transaction(null, null, this);
    }
}
