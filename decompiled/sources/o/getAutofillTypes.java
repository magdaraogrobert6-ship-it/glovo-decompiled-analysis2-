package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getAutofillTypes extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAutofillTypes(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.access$animateToThreshold(this.RemoteActionCompatParcelizer, this);
    }
}
