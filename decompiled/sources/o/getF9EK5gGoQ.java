package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class getF9EK5gGoQ {
    public ScheduledFuture RemoteActionCompatParcelizer;
    public final ScheduledExecutorService serializer;

    public getF9EK5gGoQ() {
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        this.RemoteActionCompatParcelizer = null;
        this.serializer = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
