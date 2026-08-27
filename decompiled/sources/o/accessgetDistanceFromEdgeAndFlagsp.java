package o;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDistanceFromEdgeAndFlagsp implements ThreadFactory {
    public final /* synthetic */ AtomicLong IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ ThreadFactory read;
    public final /* synthetic */ Boolean write;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.read.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        AtomicLong atomicLong = this.IconCompatParcelizer;
        Objects.requireNonNull(atomicLong);
        threadNewThread.setName(String.format(java.util.Locale.ROOT, this.RemoteActionCompatParcelizer, Long.valueOf(atomicLong.getAndIncrement())));
        Boolean bool = this.write;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }

    public accessgetDistanceFromEdgeAndFlagsp(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.read = threadFactory;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = atomicLong;
        this.write = bool;
    }
}
