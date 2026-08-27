package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getAllRenderedRouteIds extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapFlingBehavior write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAllRenderedRouteIds(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.performFling(null, 0.0f, null, this);
    }
}
