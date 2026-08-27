package o;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class createCloseInAppMessageClickListener extends JobNode {
    public final CancellableContinuationImpl write;

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return true;
    }

    public createCloseInAppMessageClickListener(CancellableContinuationImpl cancellableContinuationImpl) {
        this.write = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        JobSupport jobSupportSerializer = serializer();
        CancellableContinuationImpl cancellableContinuationImpl = this.write;
        Throwable thWrite = cancellableContinuationImpl.write(jobSupportSerializer);
        if (cancellableContinuationImpl.MediaSessionCompatQueueItem() && ((DispatchedContinuation) cancellableContinuationImpl.RatingCompat).write(thWrite)) {
            return;
        }
        cancellableContinuationImpl.serializer(thWrite);
        if (cancellableContinuationImpl.MediaSessionCompatQueueItem()) {
            return;
        }
        cancellableContinuationImpl.IconCompatParcelizer();
    }
}
