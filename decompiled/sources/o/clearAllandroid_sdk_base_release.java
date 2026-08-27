package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class clearAllandroid_sdk_base_release implements ThreadFactory {
    private final AtomicInteger write = new AtomicInteger();
    private final ThreadGroup RemoteActionCompatParcelizer = Thread.currentThread().getThreadGroup();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.RemoteActionCompatParcelizer, runnable, "sent:pool-" + this.write.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
