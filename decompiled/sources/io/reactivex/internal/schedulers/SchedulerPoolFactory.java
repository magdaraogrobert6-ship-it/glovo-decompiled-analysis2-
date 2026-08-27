package io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SchedulerPoolFactory {
    public static final int serializer;
    public static final boolean write;
    public static final AtomicReference read = new AtomicReference();
    public static final ConcurrentHashMap RemoteActionCompatParcelizer = new ConcurrentHashMap();

    public static final class ScheduledTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(SchedulerPoolFactory.RemoteActionCompatParcelizer.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.RemoteActionCompatParcelizer.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        boolean zEquals;
        int i;
        try {
            String property = System.getProperty("rx2.purge-enabled");
            zEquals = property == null ? true : "true".equals(property);
        } catch (Throwable unused) {
        }
        write = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx2.purge-period-seconds");
                i = property2 == null ? 1 : Integer.parseInt(property2);
            } catch (Throwable unused2) {
            }
        }
        serializer = i;
        if (!write) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = read;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    ScheduledTask scheduledTask = new ScheduledTask();
                    long j = serializer;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(scheduledTask, j, j, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
