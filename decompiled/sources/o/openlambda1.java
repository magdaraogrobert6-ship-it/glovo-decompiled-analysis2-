package o;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class openlambda1 implements createClickListener {
    public final ScheduledFuture read;

    public openlambda1(ScheduledFuture scheduledFuture) {
        this.read = scheduledFuture;
    }

    @Override // o.createClickListener
    public final void RemoteActionCompatParcelizer(Throwable th) {
        this.read.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.read + ']';
    }
}
