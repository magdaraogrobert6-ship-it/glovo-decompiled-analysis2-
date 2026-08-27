package o;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.EventLoopImplBase;

/* JADX INFO: loaded from: classes4.dex */
public final class setOnBackInvokedCallback extends EventLoopImplBase.DelayedTask {
    public final CancellableContinuationImpl IconCompatParcelizer;
    public final /* synthetic */ EventLoopImplBase write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOnBackInvokedCallback(EventLoopImplBase eventLoopImplBase, long j, CancellableContinuationImpl cancellableContinuationImpl) {
        super(j);
        this.write = eventLoopImplBase;
        this.IconCompatParcelizer = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.IconCompatParcelizer.read((CoroutineDispatcher) this.write);
    }

    @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
    public final String toString() {
        return super.toString() + this.IconCompatParcelizer;
    }
}
