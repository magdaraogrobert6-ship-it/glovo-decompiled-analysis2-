package o;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class SizeCannotEncodeVideoQuirk implements RunnableScheduledFuture {
    public final AtomicReference IconCompatParcelizer = new AtomicReference(null);
    public final long read;
    public final Callable serializer;
    public final onDrawBehind write;

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.write.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.write.serializer.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.read - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.write.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.write.serializer.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.IconCompatParcelizer.getAndSet(null);
        if (ondrawwithcontent != null) {
            try {
                ondrawwithcontent.RemoteActionCompatParcelizer(this.serializer.call());
            } catch (Exception e) {
                ondrawwithcontent.serializer(e);
            }
        }
    }

    public SizeCannotEncodeVideoQuirk(Handler handler, long j, Callable callable) {
        this.read = j;
        this.serializer = callable;
        this.write = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new androidx.navigation.NavArgsLazy(7, this, handler, callable, false));
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.write.serializer.get(j, timeUnit);
    }
}
