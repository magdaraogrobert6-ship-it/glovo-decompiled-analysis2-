package com.sentiance.sdk.task;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.threading.executors.Executors;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Date;
import o.accessgetEventPublishercp;
import o.accesspublishException;
import o.clearAllData;
import o.configureFromServerConfiglambda1;
import o.containsandroid_sdk_base_release;
import o.createOrGetDataStorelambda010;
import o.parseLonglambda0;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0;
import o.readInt;
import o.setNotificationBadgeNumber;
import o.setPublicNotificationExtras;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes3.dex */
public class SdkJobTaskService extends JobService {
    private volatile boolean MediaBrowserCompatMediaItem;
    private parseLonglambda0 MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private JobParameters MediaSessionCompatQueueItem;
    private boolean RatingCompat;
    private createOrGetDataStorelambda010 serializer;
    private clearAllData write;
    private static final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    private static final ArrayList read = new ArrayList();
    private static final containsandroid_sdk_base_release IconCompatParcelizer = new containsandroid_sdk_base_release("SdkJobTaskService", readInt.write().write("Service").getLooper());

    public static /* synthetic */ void write(long j, JobParameters jobParameters, SdkJobTaskService sdkJobTaskService) {
        synchronized (sdkJobTaskService) {
            if (!sdkJobTaskService.MediaBrowserCompatMediaItem) {
                sdkJobTaskService.serializer.write(j, jobParameters, sdkJobTaskService);
            }
        }
    }

    public static void write(SdkJobTaskService sdkJobTaskService) {
        synchronized (sdkJobTaskService) {
            JobParameters jobParameters = sdkJobTaskService.MediaSessionCompatQueueItem;
            if (jobParameters != null) {
                sdkJobTaskService.jobFinished(jobParameters, false);
                sdkJobTaskService.MediaSessionCompatQueueItem = null;
            }
        }
    }

    public static /* synthetic */ void write(SdkJobTaskService sdkJobTaskService, JobParameters jobParameters) {
        boolean z;
        synchronized (sdkJobTaskService) {
            createOrGetDataStorelambda010 createorgetdatastorelambda010 = sdkJobTaskService.serializer;
            z = createorgetdatastorelambda010 != null ? createorgetdatastorelambda010.read(jobParameters.getJobId()) : false;
        }
        parseLonglambda0 parselonglambda0 = sdkJobTaskService.MediaDescriptionCompat;
        if (parselonglambda0 != null) {
            parselonglambda0.IconCompatParcelizer("Task %d stopped, reschedule: %s", Integer.valueOf(jobParameters.getJobId()), Boolean.valueOf(z));
        }
    }

    public static int IconCompatParcelizer() {
        int size;
        ArrayList arrayList = read;
        synchronized (arrayList) {
            size = arrayList.size();
        }
        return size;
    }

    public static /* synthetic */ void IconCompatParcelizer(long j, JobParameters jobParameters, SdkJobTaskService sdkJobTaskService) {
        sdkJobTaskService.serializer = (createOrGetDataStorelambda010) setPushUniqueId.read(TaskManager.class);
        sdkJobTaskService.write = ((Executors) setPushUniqueId.read(Executors.class)).IconCompatParcelizer();
        sdkJobTaskService.MediaDescriptionCompat = new parseLonglambda0((Context) setPushUniqueId.read(Context.class), "SdkJobTaskService", (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class));
        if (sdkJobTaskService.MediaBrowserCompatMediaItem) {
            return;
        }
        sdkJobTaskService.write.RemoteActionCompatParcelizer(new accessgetEventPublishercp(sdkJobTaskService, jobParameters, j, 1), "SdkJobTaskService");
    }

    public static void RemoteActionCompatParcelizer() {
        ArrayList<SdkJobTaskService> arrayList = RemoteActionCompatParcelizer;
        synchronized (arrayList) {
            for (SdkJobTaskService sdkJobTaskService : arrayList) {
                synchronized (sdkJobTaskService) {
                    JobParameters jobParameters = sdkJobTaskService.MediaSessionCompatQueueItem;
                    if (jobParameters != null) {
                        sdkJobTaskService.jobFinished(jobParameters, false);
                        sdkJobTaskService.MediaSessionCompatQueueItem = null;
                    }
                }
            }
            RemoteActionCompatParcelizer.clear();
        }
    }

    public static void RemoteActionCompatParcelizer(SdkJobTaskService sdkJobTaskService, Context context, long j) {
        new configureFromServerConfiglambda1(context);
        if (Debug.isDebuggerConnected()) {
            return;
        }
        setPublicNotificationExtras.serializer(context, new Date().getTime(), sdkJobTaskService.MediaMetadataCompat, SystemClock.elapsedRealtime() - j);
    }

    private void write() {
        ArrayList arrayList = read;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        ArrayList arrayList = read;
        synchronized (arrayList) {
            arrayList.add(this);
        }
        super.onCreate();
        if (!Sentiance.getInstance(this).userExists() || setNotificationBadgeNumber.read().MediaSessionCompatQueueItem()) {
            this.RatingCompat = true;
            write();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        write();
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        write();
        this.MediaBrowserCompatMediaItem = true;
        if (!this.RatingCompat) {
            parseLonglambda0 parselonglambda0 = this.MediaDescriptionCompat;
            if (parselonglambda0 != null) {
                parselonglambda0.IconCompatParcelizer("Force stopping task %d", Integer.valueOf(jobParameters.getJobId()));
            }
            clearAllData clearalldata = this.write;
            if (clearalldata != null) {
                clearalldata.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 17, jobParameters), "SdkJobTaskService");
            }
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.RatingCompat) {
            return false;
        }
        this.MediaSessionCompatQueueItem = jobParameters;
        String string = jobParameters.getExtras().getString("taskName");
        this.MediaMetadataCompat = string;
        int jobId = jobParameters.getJobId();
        if (string == null) {
            string = String.valueOf(jobId);
        }
        this.MediaMetadataCompat = string;
        Context applicationContext = getApplicationContext();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        IconCompatParcelizer.RemoteActionCompatParcelizer(new accesspublishException(this, applicationContext, jElapsedRealtime + 30000, jElapsedRealtime, new accessgetEventPublishercp(this, jobParameters, jElapsedRealtime, 0)));
        write();
        return true;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
