package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class getD55 implements ThreadFactory {
    public static final AtomicInteger read = new AtomicInteger(1);
    public final String IconCompatParcelizer;
    public final ThreadGroup serializer;
    public final AtomicInteger write = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.serializer, runnable, this.IconCompatParcelizer + this.write.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public getD55() {
        SecurityManager securityManager = System.getSecurityManager();
        this.serializer = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.IconCompatParcelizer = "lottie-" + read.getAndIncrement() + "-thread-";
    }
}
