package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.IconCompatParcelizer = Thread.currentThread();
        try {
            this.read.run();
            this.IconCompatParcelizer = null;
        } catch (Throwable th) {
            this.IconCompatParcelizer = null;
            lazySet(AbstractDirectTask.write);
            RxJavaPlugins.IconCompatParcelizer(th);
        }
    }

    public ScheduledDirectPeriodicTask(Runnable runnable, int i) {
        super(runnable);
    }
}
