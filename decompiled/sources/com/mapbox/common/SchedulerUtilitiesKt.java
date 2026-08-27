package com.mapbox.common;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class SchedulerUtilitiesKt {
    public static final void schedule(Scheduler scheduler, TaskOptions taskOptions, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        scheduler.getClass();
        taskOptions.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        scheduler.schedule(new Task() { // from class: com.mapbox.common.SchedulerUtilitiesKt.schedule.1
            @Override // com.mapbox.common.Task
            public void run() {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        }, taskOptions);
    }

    public static /* synthetic */ void schedule$default(Scheduler scheduler, TaskOptions taskOptions, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 1) != 0) {
            taskOptions = new TaskOptions(0L, TaskPriority.DEFAULT);
        }
        schedule(scheduler, taskOptions, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }
}
