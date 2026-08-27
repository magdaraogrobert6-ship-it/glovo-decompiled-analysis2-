package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class SelectionHandlesKt extends ContinuationImpl {
    public createBrazeUserChangeEventSubscriberlambda0 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionHandlesKt(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.m56doFlingAnimationQWom1Mo(0L, this);
    }
}
