package o;

import io.grpc.stub.ClientCalls;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class parseGender extends ConcurrentLinkedQueue implements Executor {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(parseGender.class.getName());
    public static final Object serializer = new Object();
    public volatile Object IconCompatParcelizer;

    public final void serializer() {
        this.IconCompatParcelizer = serializer;
        while (true) {
            Runnable runnable = (Runnable) poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                RemoteActionCompatParcelizer.log(Level.WARNING, "Runnable threw exception", th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.IconCompatParcelizer;
        if (obj != serializer) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && ClientCalls.IconCompatParcelizer) {
            throw new RejectedExecutionException();
        }
    }

    public final void RemoteActionCompatParcelizer() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Runnable runnable = (Runnable) poll();
        if (runnable == null) {
            this.IconCompatParcelizer = Thread.currentThread();
            while (true) {
                try {
                    Runnable runnable2 = (Runnable) poll();
                    if (runnable2 != null) {
                        this.IconCompatParcelizer = null;
                        runnable = runnable2;
                        break;
                    } else {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                    }
                } catch (Throwable th) {
                    this.IconCompatParcelizer = null;
                    throw th;
                }
            }
        }
        do {
            try {
                runnable.run();
            } catch (Throwable th2) {
                RemoteActionCompatParcelizer.log(Level.WARNING, "Runnable threw exception", th2);
            }
            runnable = (Runnable) poll();
        } while (runnable != null);
    }
}
