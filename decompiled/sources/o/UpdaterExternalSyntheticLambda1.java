package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class UpdaterExternalSyntheticLambda1 extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.foundation.pager.PagerWrapperFlingBehavior RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdaterExternalSyntheticLambda1(androidx.compose.foundation.pager.PagerWrapperFlingBehavior pagerWrapperFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = pagerWrapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.performFling(null, 0.0f, this);
    }
}
