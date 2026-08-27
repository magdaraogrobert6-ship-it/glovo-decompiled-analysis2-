package kotlinx.coroutines.channels;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.logUnregisterActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ BufferedChannel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5148receiveCatchingOnNoWaiterSuspendGKJJFZk = this.write.m5148receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM5148receiveCatchingOnNoWaiterSuspendGKJJFZk == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5148receiveCatchingOnNoWaiterSuspendGKJJFZk : new logUnregisterActivity(objM5148receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
