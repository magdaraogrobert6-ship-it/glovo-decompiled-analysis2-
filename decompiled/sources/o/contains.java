package o;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class contains {
    public static final String RemoteActionCompatParcelizer = setRotationX.IconCompatParcelizer("SystemJobScheduler");

    public static final JobScheduler read(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? IntervalTree.write(jobScheduler) : jobScheduler;
    }
}
