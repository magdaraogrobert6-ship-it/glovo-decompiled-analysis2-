package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class AutofillModifierKt extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutofillModifierKt(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.animateToHidden(this);
    }
}
