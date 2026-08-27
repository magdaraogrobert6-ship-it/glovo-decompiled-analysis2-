package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class jumpByLinesOffset extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jumpByLinesOffset(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.reset(this);
    }
}
