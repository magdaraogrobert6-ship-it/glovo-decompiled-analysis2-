package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTooltipKthandleGestures211 extends ContinuationImpl {
    public SuspendLambda IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.lazy.LazyListState read;
    public applyMeasureResultfoundation serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKthandleGestures211(androidx.compose.foundation.lazy.LazyListState lazyListState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.scroll(null, null, this);
    }
}
