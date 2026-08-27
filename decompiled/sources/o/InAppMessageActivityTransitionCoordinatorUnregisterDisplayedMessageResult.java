package o;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult implements r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w {
    public final CancellableContinuationImpl write;

    @Override // o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w
    public final void RemoteActionCompatParcelizer(Segment segment, int i) {
        this.write.RemoteActionCompatParcelizer(segment, i);
    }

    public InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult(CancellableContinuationImpl cancellableContinuationImpl) {
        this.write = cancellableContinuationImpl;
    }
}
