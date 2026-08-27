package o;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobNode;

/* JADX INFO: loaded from: classes4.dex */
public final class onTouchStartedOrContinued extends JobNode {
    public final CancellableContinuationImpl RemoteActionCompatParcelizer;

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        this.RemoteActionCompatParcelizer.resumeWith(createFromParcel.INSTANCE);
    }

    public onTouchStartedOrContinued(CancellableContinuationImpl cancellableContinuationImpl) {
        this.RemoteActionCompatParcelizer = cancellableContinuationImpl;
    }
}
