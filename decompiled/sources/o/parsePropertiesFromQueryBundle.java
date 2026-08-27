package o;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class parsePropertiesFromQueryBundle implements Executor, Runnable {
    public static final java.util.logging.Logger read = java.util.logging.Logger.getLogger(parsePropertiesFromQueryBundle.class.getName());
    public static final isValidPushStoryClickInputlambda1 serializer;
    public final Executor write;
    public final ConcurrentLinkedQueue RemoteActionCompatParcelizer = new ConcurrentLinkedQueue();
    public volatile int IconCompatParcelizer = 0;

    static {
        isValidPushStoryClickInputlambda1 brazeWebViewClientCompanion;
        try {
            brazeWebViewClientCompanion = new shouldInterceptRequest(AtomicIntegerFieldUpdater.newUpdater(parsePropertiesFromQueryBundle.class, "IconCompatParcelizer"));
        } catch (Throwable th) {
            read.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            brazeWebViewClientCompanion = new BrazeWebViewClientCompanion();
        }
        serializer = brazeWebViewClientCompanion;
    }

    public final void IconCompatParcelizer(Runnable runnable) {
        isValidPushStoryClickInputlambda1 isvalidpushstoryclickinputlambda1 = serializer;
        if (isvalidpushstoryclickinputlambda1.read(this)) {
            try {
                this.write.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.RemoteActionCompatParcelizer.remove(runnable);
                }
                isvalidpushstoryclickinputlambda1.serializer(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        TextStreamsKt.serializer(runnable, "'r' must not be null.");
        this.RemoteActionCompatParcelizer.add(runnable);
        IconCompatParcelizer(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        isValidPushStoryClickInputlambda1 isvalidpushstoryclickinputlambda1 = serializer;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.RemoteActionCompatParcelizer;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    read.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e);
                }
            } catch (Throwable th) {
                isvalidpushstoryclickinputlambda1.serializer(this);
                throw th;
            }
        }
        isvalidpushstoryclickinputlambda1.serializer(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        IconCompatParcelizer(null);
    }

    public parsePropertiesFromQueryBundle(Executor executor) {
        TextStreamsKt.serializer(executor, "'executor' must not be null.");
        this.write = executor;
    }
}
