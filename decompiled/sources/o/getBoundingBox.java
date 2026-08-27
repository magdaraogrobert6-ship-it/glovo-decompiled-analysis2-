package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getBoundingBox extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBoundingBox(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.mo123onPreFlingQWom1Mo(0L, this);
    }
}
