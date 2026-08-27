package o;

import com.deliveryhero.perseus.utils.BackoffTimer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class isQuad extends ContinuationImpl {
    public BackoffTimer IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ BackoffTimer serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isQuad(BackoffTimer backoffTimer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = backoffTimer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.serializer.refreshConfig$perseus_release(this);
    }
}
