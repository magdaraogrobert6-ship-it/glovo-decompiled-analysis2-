package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getPrintScreenEK5gGoQ {
    public static final Method RemoteActionCompatParcelizer;
    public static final Method serializer;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                SentryLogcatAdapter.serializer("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        serializer = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                SentryLogcatAdapter.serializer("JobSchedulerCompat", "No myUserId method available");
            }
        }
        RemoteActionCompatParcelizer = declaredMethod2;
    }
}
