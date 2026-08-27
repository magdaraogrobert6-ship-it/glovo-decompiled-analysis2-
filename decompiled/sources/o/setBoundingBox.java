package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class setBoundingBox extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setBoundingBox(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.onRelease(0.0f, this);
    }
}
