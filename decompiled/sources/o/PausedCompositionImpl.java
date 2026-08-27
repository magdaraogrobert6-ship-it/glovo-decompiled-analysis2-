package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class PausedCompositionImpl extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.pager.PagerState MediaDescriptionCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public androidx.compose.foundation.pager.PagerState read;
    public applyMeasureResultfoundation serializer;
    public SuspendLambda write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausedCompositionImpl(androidx.compose.foundation.pager.PagerState pagerState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(this.MediaDescriptionCompat, null, null, this);
    }
}
