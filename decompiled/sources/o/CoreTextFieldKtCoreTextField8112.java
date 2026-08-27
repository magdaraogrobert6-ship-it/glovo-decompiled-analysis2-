package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldKtCoreTextField8112 extends ContinuationImpl {
    public /* synthetic */ Object read;
    public int write;

    public CoreTextFieldKtCoreTextField8112(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.AnchoredDraggableKt.access$restartable(null, null, this);
    }
}
