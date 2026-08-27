package com.mapbox.common;

import java.util.concurrent.Executor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
public final class SchedulerExecutorDispatcherKt {
    public static final ExecutorCoroutineDispatcher asDispatcher(Scheduler scheduler) {
        scheduler.getClass();
        return new SchedulerExecutorDispatcher(asExecutor(scheduler));
    }

    public static final Executor asExecutor(final Scheduler scheduler) {
        scheduler.getClass();
        return new Executor() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt.asExecutor.1
            @Override // java.util.concurrent.Executor
            public void execute(final Runnable runnable) {
                scheduler.schedule(new Task() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt$asExecutor$1$execute$1
                    @Override // com.mapbox.common.Task
                    public void run() {
                        Runnable runnable2 = runnable;
                        runnable2.getClass();
                        runnable2.run();
                    }
                }, new TaskOptions(0L, TaskPriority.DEFAULT));
            }
        };
    }
}
