package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class RippleNode extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapFlingBehavior IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$tryApproach(this.IconCompatParcelizer, null, 0.0f, 0.0f, null, this);
    }
}
