package o;

import android.os.AsyncTask;
import bo.app.w4$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: o.textInputSession, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC0208textInputSession implements Executor {
    public final Semaphore IconCompatParcelizer;
    public final Executor RemoteActionCompatParcelizer;

    public ExecutorC0208textInputSession() {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.IconCompatParcelizer = new Semaphore(4);
        this.RemoteActionCompatParcelizer = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.IconCompatParcelizer.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.RemoteActionCompatParcelizer.execute(new w4$$ExternalSyntheticLambda0(this, 24, runnable));
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
