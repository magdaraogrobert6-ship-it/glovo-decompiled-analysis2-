package com.mapbox.common.module.cronet;

import com.mapbox.common.Scheduler;
import com.mapbox.common.Task;
import com.mapbox.common.TaskOptions;
import com.mapbox.common.TaskPriority;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class CronetTimeout {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final TaskOptions DEFAULT_TIMEOUT_TASK_OPTIONS = new TaskOptions(60000, TaskPriority.DEFAULT);
    private final Task action;
    private AtomicLong deadline;
    private final Scheduler sequencedScheduler;
    private final long timeout;
    private final WeakReferenceCronetTimeout weakTimeout;

    public static final class WeakReferenceCronetTimeout implements Task {
        private final WeakReference<CronetTimeout> weakTarget;

        @Override // com.mapbox.common.Task
        public void run() {
            CronetTimeout cronetTimeout = this.weakTarget.get();
            if (cronetTimeout != null) {
                cronetTimeout.run();
            }
        }

        public WeakReferenceCronetTimeout(CronetTimeout cronetTimeout) {
            cronetTimeout.getClass();
            this.weakTarget = new WeakReference<>(cronetTimeout);
        }
    }

    private final void scheduleCallback(TaskOptions taskOptions) {
        this.sequencedScheduler.schedule(this.weakTimeout, taskOptions);
    }

    public final void resetDeadline() {
        this.deadline.set(CronetTimeoutKt.nowMilliseconds() + this.timeout);
    }

    public final void run() {
        long j = this.deadline.get();
        if (j == -1) {
            return;
        }
        long jNowMilliseconds = CronetTimeoutKt.nowMilliseconds();
        if (j <= jNowMilliseconds) {
            this.action.run();
        } else {
            scheduleCallback(new TaskOptions(j - jNowMilliseconds, TaskPriority.DEFAULT));
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CronetTimeout(Scheduler scheduler, long j, Task task) {
        scheduler.getClass();
        task.getClass();
        this.sequencedScheduler = scheduler;
        this.action = task;
        this.deadline = new AtomicLong(-1L);
        this.timeout = j * 1000;
        this.weakTimeout = new WeakReferenceCronetTimeout(this);
    }

    public final void start() {
        resetDeadline();
        long j = this.timeout;
        TaskOptions taskOptions = DEFAULT_TIMEOUT_TASK_OPTIONS;
        if (j != taskOptions.getDelay()) {
            taskOptions = new TaskOptions(this.timeout, TaskPriority.DEFAULT);
        }
        scheduleCallback(taskOptions);
    }

    public final void cancel() {
        this.deadline.set(-1L);
    }
}
