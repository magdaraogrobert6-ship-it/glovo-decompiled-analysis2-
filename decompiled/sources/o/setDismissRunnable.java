package o;

import kotlinx.coroutines.EventLoopImplBase;

/* JADX INFO: loaded from: classes4.dex */
public final class setDismissRunnable extends EventLoopImplBase.DelayedTask {
    public final Runnable IconCompatParcelizer;

    @Override // java.lang.Runnable
    public final void run() {
        this.IconCompatParcelizer.run();
    }

    @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
    public final String toString() {
        return super.toString() + this.IconCompatParcelizer;
    }

    public setDismissRunnable(Runnable runnable, long j) {
        super(j);
        this.IconCompatParcelizer = runnable;
    }
}
