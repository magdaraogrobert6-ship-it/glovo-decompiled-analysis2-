package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class getShiftLeftEK5gGoQ implements ThreadFactory {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    public getShiftLeftEK5gGoQ() {
        this.read = 1;
        this.IconCompatParcelizer = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
            threadNewThread.setName("ScionFrontendApi");
            return threadNewThread;
        }
        if (i != 1) {
            Thread threadNewThread2 = Executors.defaultThreadFactory().newThread(new getLayoutState(runnable));
            threadNewThread2.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
            return threadNewThread2;
        }
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
        return thread;
    }

    public getShiftLeftEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq) {
        this.read = 0;
        this.IconCompatParcelizer = Executors.defaultThreadFactory();
    }

    public getShiftLeftEK5gGoQ(AtomicLong atomicLong) {
        this.read = 2;
        this.IconCompatParcelizer = atomicLong;
    }
}
