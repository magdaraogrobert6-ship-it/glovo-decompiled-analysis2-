package o;

import io.grpc.SynchronizationContext$1;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.TextStreamsKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class getMethodQuietlylambda1 implements Executor {
    public final ConcurrentLinkedQueue IconCompatParcelizer = new ConcurrentLinkedQueue();
    public final AtomicReference serializer = new AtomicReference();
    public final Thread.UncaughtExceptionHandler write;

    public final void RemoteActionCompatParcelizer() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.IconCompatParcelizer;
        do {
            Thread threadCurrentThread = Thread.currentThread();
            do {
                atomicReference = this.serializer;
                if (atomicReference.compareAndSet(null, threadCurrentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                this.write.uncaughtException(Thread.currentThread(), th);
                            }
                        } catch (Throwable th2) {
                            atomicReference.set(null);
                            throw th2;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final FormBody.Builder read(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        invokeMethodQuietlylambda0 invokemethodquietlylambda0 = new invokeMethodQuietlylambda0(runnable);
        return new FormBody.Builder(invokemethodquietlylambda0, (ScheduledFuture) scheduledExecutorService.schedule(new SynchronizationContext$1(0, this, invokemethodquietlylambda0, runnable, false), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        read(runnable);
        RemoteActionCompatParcelizer();
    }

    public final void read(Runnable runnable) {
        TextStreamsKt.serializer(runnable, "runnable is null");
        this.IconCompatParcelizer.add(runnable);
    }

    public final void write() {
        TextStreamsKt.RemoteActionCompatParcelizer("Not called from the SynchronizationContext", Thread.currentThread() == this.serializer.get());
    }

    public getMethodQuietlylambda1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.write = uncaughtExceptionHandler;
    }
}
