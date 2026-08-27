package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt;
import o.TextAnnouncementContentCardView;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {
    public static final CoroutineDispatcher IconCompatParcelizer;
    public static final DefaultIoScheduler RemoteActionCompatParcelizer = new DefaultIoScheduler();

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final Executor getExecutor() {
        return this;
    }

    static {
        UnlimitedIoScheduler unlimitedIoScheduler = UnlimitedIoScheduler.IconCompatParcelizer;
        int iSerializer = SystemPropsKt.serializer();
        if (64 >= iSerializer) {
            iSerializer = 64;
        }
        IconCompatParcelizer = CoroutineDispatcher.limitedParallelism$default(unlimitedIoScheduler, SystemPropsKt.IconCompatParcelizer(iSerializer, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        IconCompatParcelizer.dispatch(textAnnouncementContentCardView, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        IconCompatParcelizer.dispatchYield(textAnnouncementContentCardView, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        return UnlimitedIoScheduler.IconCompatParcelizer.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }
}
