package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class SelectionHandlewLIcFTc extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ androidx.compose.foundation.gestures.NonTouchScrollingLogic write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionHandlewLIcFTc(androidx.compose.foundation.gestures.NonTouchScrollingLogic nonTouchScrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = nonTouchScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.userScroll$foundation(null, this);
    }
}
