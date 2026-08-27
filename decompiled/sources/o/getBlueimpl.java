package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getBlueimpl extends ContinuationImpl {
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.room.coroutines.PassthroughConnection read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBlueimpl(androidx.room.coroutines.PassthroughConnection passthroughConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = passthroughConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.usePrepared(null, null, this);
    }
}
