package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.Base64;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;
import o.access500;
import o.accessgetEightcp;
import o.accessgetEqualscp;
import o.accessgetF2cp;
import o.accessgetKcp;
import o.accessgetMediaPlayPausecp;

/* JADX INFO: loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int write = 0;

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(InAppMessageBase.EXTRAS);
        int i = jobParameters.getExtras().getInt(RemoteMessageConst.Notification.PRIORITY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        accessgetF2cp.RemoteActionCompatParcelizer(getApplicationContext());
        accessgetEqualscp accessgetequalscpWrite = accessgetEightcp.write();
        if (string == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null backendName");
            return false;
        }
        accessgetequalscpWrite.write = string;
        accessgetequalscpWrite.RemoteActionCompatParcelizer = accessgetMediaPlayPausecp.write(i);
        if (string2 != null) {
            accessgetequalscpWrite.IconCompatParcelizer = Base64.decode(string2, 0);
        }
        access500 access500Var = accessgetF2cp.read().IconCompatParcelizer;
        ((Executor) access500Var.write).execute(new accessgetKcp(access500Var, accessgetequalscpWrite.RemoteActionCompatParcelizer(), i2, new ND$$ExternalSyntheticLambda0(this, 7, jobParameters)));
        return true;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
