package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class NewThreadScheduler extends Scheduler {
    public static final RxThreadFactory write = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    public final ThreadFactory serializer = write;

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker write() {
        return new NewThreadWorker(this.serializer);
    }
}
