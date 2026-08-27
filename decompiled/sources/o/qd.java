package o;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class qd extends AbstractExecutorService implements Executor, AutoCloseable {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ Executor serializer;

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        int i = 2 % 2;
        int i2 = write + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        int i = 2 % 2;
        int i2 = write + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i2 % 2 == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        int i = 2 % 2;
        int i2 = write + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        instance_delegatelambda0 instance_delegatelambda0Var;
        int i = 2 % 2;
        int i2 = write + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            instance_delegatelambda0Var = instance_delegatelambda0.write;
            int i3 = 8 / 0;
        } else {
            instance_delegatelambda0Var = instance_delegatelambda0.write;
        }
        int i4 = IconCompatParcelizer + 109;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return instance_delegatelambda0Var;
    }

    public qd(CoroutineDispatcher coroutineDispatcher) {
        coroutineDispatcher.getClass();
        this.serializer = coil3.util.IntPair.write(coroutineDispatcher);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        timeUnit.getClass();
        int i4 = write + 39;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.execute(runnable);
        int i4 = write + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ForkJoinPool.commonPool();
            throw null;
        }
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            int i3 = write + 81;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    int i5 = IconCompatParcelizer + 25;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
