package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class matchParentSize extends ContinuationImpl {
    public Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public matchParentSize(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.animation.core.SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(this.write, this);
    }
}
