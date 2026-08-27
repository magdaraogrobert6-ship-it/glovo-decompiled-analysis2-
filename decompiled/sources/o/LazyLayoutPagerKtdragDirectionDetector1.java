package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutPagerKtdragDirectionDetector1 extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public ButtonKt read;
    public final /* synthetic */ androidx.compose.foundation.HoverableNode write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKtdragDirectionDetector1(androidx.compose.foundation.HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.HoverableNode.access$emitEnter(this.write, this);
    }
}
