package o;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetButtcp implements androidx.lifecycle.DefaultLifecycleObserver {
    public final /* synthetic */ CancellableContinuationImpl serializer;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.serializer.resumeWith(createFromParcel.INSTANCE);
    }

    public accessgetButtcp(CancellableContinuationImpl cancellableContinuationImpl) {
        this.serializer = cancellableContinuationImpl;
    }
}
