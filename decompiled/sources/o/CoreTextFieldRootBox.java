package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldRootBox extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    public cancelPendingWebViewPauselambda0 serializer;
    public int write;

    public CoreTextFieldRootBox(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
    }
}
