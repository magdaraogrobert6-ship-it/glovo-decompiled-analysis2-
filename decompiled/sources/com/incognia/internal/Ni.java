package com.incognia.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ni {
    public static void BGx(Context context, int i) {
        JobInfo pendingJob;
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (XUh.BGx(XUh.BGx, 24, 0, 2)) {
                pendingJob = jobScheduler.getPendingJob(i);
            } else {
                List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                Object obj = null;
                if (allPendingJobs != null) {
                    for (Object obj2 : allPendingJobs) {
                        if (((JobInfo) obj2).getId() == i) {
                            obj = obj2;
                            break;
                        }
                    }
                    pendingJob = (JobInfo) obj;
                } else {
                    pendingJob = null;
                }
            }
            if (pendingJob != null) {
                jobScheduler.cancel(pendingJob.getId());
            }
        } catch (Throwable unused) {
        }
    }
}
