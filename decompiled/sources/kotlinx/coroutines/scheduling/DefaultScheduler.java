package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.NamedDispatcher;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultScheduler extends ExecutorCoroutineDispatcher {
    public static final DefaultScheduler serializer;
    public CoroutineScheduler IconCompatParcelizer;

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final Executor getExecutor() {
        return this.IconCompatParcelizer;
    }

    static {
        int i = TasksKt.read;
        int i2 = TasksKt.serializer;
        long j = TasksKt.IconCompatParcelizer;
        String str = TasksKt.write;
        DefaultScheduler defaultScheduler = new DefaultScheduler();
        defaultScheduler.IconCompatParcelizer = new CoroutineScheduler(j, str, i, i2);
        serializer = defaultScheduler;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        CoroutineScheduler.serializer(this.IconCompatParcelizer, runnable, 6);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        CoroutineScheduler.serializer(this.IconCompatParcelizer, runnable, 2);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.RemoteActionCompatParcelizer(i);
        if (i >= TasksKt.read) {
            return str != null ? new NamedDispatcher(this, str) : this;
        }
        return super.limitedParallelism(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
}
