package o;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class setAnimatingClose implements setAndStartAnimation {
    public final ScheduledFuture read;

    public setAnimatingClose(ScheduledFuture scheduledFuture) {
        this.read = scheduledFuture;
    }

    @Override // o.setAndStartAnimation
    public final void RemoteActionCompatParcelizer() {
        this.read.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.read + ']';
    }
}
