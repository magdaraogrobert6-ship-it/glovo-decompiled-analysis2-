package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessclassifyTextM8tDOmk extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessclassifyTextM8tDOmk(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.tryAwaitRelease(this);
    }
}
