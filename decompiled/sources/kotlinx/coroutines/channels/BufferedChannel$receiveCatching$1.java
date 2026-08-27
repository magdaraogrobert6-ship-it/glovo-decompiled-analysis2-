package kotlinx.coroutines.channels;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.logUnregisterActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class BufferedChannel$receiveCatching$1 extends ContinuationImpl {
    public final /* synthetic */ BufferedChannel IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM5146receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m5146receiveCatchingJP2dKIU$suspendImpl(this.IconCompatParcelizer, this);
        return objM5146receiveCatchingJP2dKIU$suspendImpl == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5146receiveCatchingJP2dKIU$suspendImpl : new logUnregisterActivity(objM5146receiveCatchingJP2dKIU$suspendImpl);
    }
}
