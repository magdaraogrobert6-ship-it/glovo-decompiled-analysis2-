package io.reactivex.internal.schedulers;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final boolean write;

    public static final class RxCustomThread extends Thread {
        public RxCustomThread(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.RemoteActionCompatParcelizer + '-' + incrementAndGet();
        Thread rxCustomThread = this.write ? new RxCustomThread(runnable, str) : new Thread(runnable, str);
        rxCustomThread.setPriority(this.read);
        rxCustomThread.setDaemon(true);
        return rxCustomThread;
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
        this.write = z;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("RxThreadFactory["), this.RemoteActionCompatParcelizer, "]");
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }
}
