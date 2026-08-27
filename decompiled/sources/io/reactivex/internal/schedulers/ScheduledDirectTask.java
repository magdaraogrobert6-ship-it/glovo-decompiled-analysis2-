package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask futureTask = AbstractDirectTask.write;
        this.IconCompatParcelizer = Thread.currentThread();
        try {
            this.read.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.IconCompatParcelizer = null;
        }
    }

    public ScheduledDirectTask(Runnable runnable, int i) {
        super(runnable);
    }
}
