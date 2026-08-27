package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambda0VnaReYaJMb11m2G7Mh0wuBaWA implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread;
        synchronized (this) {
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
        }
        return thread;
    }
}
