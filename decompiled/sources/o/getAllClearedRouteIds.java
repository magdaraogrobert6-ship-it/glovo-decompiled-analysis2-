package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getAllClearedRouteIds extends ContinuationImpl {
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapFlingBehavior write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAllClearedRouteIds(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.write.fling(null, 0.0f, null, this);
    }
}
