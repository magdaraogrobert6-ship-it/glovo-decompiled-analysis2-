package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class RecomposerExternalSyntheticLambda4 extends ContinuationImpl {
    public width IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.pager.PagerState read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposerExternalSyntheticLambda4(androidx.compose.foundation.pager.PagerState pagerState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.animateScrollToPage(0, null, this);
    }
}
