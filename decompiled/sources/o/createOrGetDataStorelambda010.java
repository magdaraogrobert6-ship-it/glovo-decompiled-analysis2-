package o;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.task.SdkJobTaskService;
import com.sentiance.sdk.task.TaskManager;
import com.sentiance.sdk.threading.executors.Executors;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "JobBasedTaskManager", componentName = "JobBasedTaskManager", dataLogTag = "tasks")
public class createOrGetDataStorelambda010 extends TaskManager {
    private final JobScheduler IconCompatParcelizer;
    private final Context RemoteActionCompatParcelizer;
    private final ConcurrentHashMap read;
    private final ConcurrentHashMap<createOrGetDataStorelambda00, JobParameters> serializer;
    private final parseLonglambda0 write;

    @Override // com.sentiance.sdk.task.TaskManager
    public final void RemoteActionCompatParcelizer(createOrGetDataStorelambda00 createorgetdatastorelambda00, boolean z) {
        ConcurrentHashMap<createOrGetDataStorelambda00, JobParameters> concurrentHashMap = this.serializer;
        JobParameters jobParameters = concurrentHashMap.get(createorgetdatastorelambda00);
        ConcurrentHashMap concurrentHashMap2 = this.read;
        SdkJobTaskService sdkJobTaskService = (SdkJobTaskService) concurrentHashMap2.get(createorgetdatastorelambda00);
        if (jobParameters == null || sdkJobTaskService == null) {
            return;
        }
        this.write.IconCompatParcelizer("Finishing task: %s (%d)", createorgetdatastorelambda00.RemoteActionCompatParcelizer().MediaMetadataCompat(), Integer.valueOf(createorgetdatastorelambda00.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer()));
        sdkJobTaskService.jobFinished(jobParameters, z);
        concurrentHashMap.remove(createorgetdatastorelambda00);
        concurrentHashMap2.remove(createorgetdatastorelambda00);
    }

    @Override // com.sentiance.sdk.task.TaskManager
    public final void read(createOrGetDataStorelambda00 createorgetdatastorelambda00, boolean z) {
        JobScheduler jobScheduler = this.IconCompatParcelizer;
        if (!z) {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            List<JobInfo> list = Collections.EMPTY_LIST;
            if (allPendingJobs == null) {
                allPendingJobs = list;
            }
            int iRemoteActionCompatParcelizer = createorgetdatastorelambda00.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
            Iterator<JobInfo> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == iRemoteActionCompatParcelizer) {
                    return;
                }
            }
        }
        accesssetEventPublishercp accessseteventpublishercpRemoteActionCompatParcelizer = createorgetdatastorelambda00.RemoteActionCompatParcelizer();
        this.write.IconCompatParcelizer("%s task: %s (%d)", z ? "Force-rescheduling" : "Scheduling", accessseteventpublishercpRemoteActionCompatParcelizer.MediaMetadataCompat(), Integer.valueOf(accessseteventpublishercpRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("taskName", accessseteventpublishercpRemoteActionCompatParcelizer.MediaMetadataCompat());
        JobInfo.Builder builder = new JobInfo.Builder(accessseteventpublishercpRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), new ComponentName(this.RemoteActionCompatParcelizer, (Class<?>) SdkJobTaskService.class));
        builder.setPersisted(true).setBackoffCriteria(accessseteventpublishercpRemoteActionCompatParcelizer.write(), accessseteventpublishercpRemoteActionCompatParcelizer.IconCompatParcelizer()).setRequiredNetworkType(accessseteventpublishercpRemoteActionCompatParcelizer.RatingCompat()).setRequiresCharging(accessseteventpublishercpRemoteActionCompatParcelizer.MediaDescriptionCompat()).setExtras(persistableBundle);
        if (accessseteventpublishercpRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
            builder.setPeriodic(accessseteventpublishercpRemoteActionCompatParcelizer.serializer());
        } else {
            builder.setMinimumLatency(accessseteventpublishercpRemoteActionCompatParcelizer.read());
        }
        jobScheduler.schedule(builder.build());
    }

    public final void write(long j, JobParameters jobParameters, SdkJobTaskService sdkJobTaskService) {
        int jobId = jobParameters.getJobId();
        createOrGetDataStorelambda00 createorgetdatastorelambda00Write = write(jobId);
        parseLonglambda0 parselonglambda0 = this.write;
        if (createorgetdatastorelambda00Write == null) {
            parselonglambda0.IconCompatParcelizer("Task with id %d was never scheduled", Integer.valueOf(jobId));
            sdkJobTaskService.jobFinished(jobParameters, false);
            return;
        }
        this.read.put(createorgetdatastorelambda00Write, sdkJobTaskService);
        accesssetEventPublishercp accessseteventpublishercpRemoteActionCompatParcelizer = createorgetdatastorelambda00Write.RemoteActionCompatParcelizer();
        parselonglambda0.IconCompatParcelizer("Executing task: %s (%d)", accessseteventpublishercpRemoteActionCompatParcelizer.MediaMetadataCompat(), Integer.valueOf(accessseteventpublishercpRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()));
        ConcurrentHashMap<createOrGetDataStorelambda00, JobParameters> concurrentHashMap = this.serializer;
        if (concurrentHashMap.get(createorgetdatastorelambda00Write) != null) {
            parselonglambda0.IconCompatParcelizer("Task %d is already running", Integer.valueOf(jobId));
            return;
        }
        concurrentHashMap.put(createorgetdatastorelambda00Write, jobParameters);
        if (read(createorgetdatastorelambda00Write, j)) {
            return;
        }
        parselonglambda0.IconCompatParcelizer("Task %s (%d) failed to execute, finishing it.", accessseteventpublishercpRemoteActionCompatParcelizer.MediaMetadataCompat(), Integer.valueOf(accessseteventpublishercpRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()));
        RemoteActionCompatParcelizer(createorgetdatastorelambda00Write, false);
    }

    public createOrGetDataStorelambda010(Context context, parseLonglambda0 parselonglambda0, JobScheduler jobScheduler, Executors executors, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY r8lambdagt3ok5kqtheeii2u7flzq1_mnqy, com.sentiance.sdk.util.c cVar, r8lambdarI00A69l7k7NAO4I9NDF7haFpGI r8lambdari00a69l7k7nao4i9ndf7hafpgi, ConfigurationManager configurationManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, readList readlist, readFloatlambda0 readfloatlambda0) {
        super(context, getanalyticsenabledenterannotations, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, executors, r8lambdagt3ok5kqtheeii2u7flzq1_mnqy, cVar, parselonglambda0, r8lambdari00a69l7k7nao4i9ndf7hafpgi, configurationManager, readandroid_sdk_base_releaseVar, readlist, readfloatlambda0);
        this.RemoteActionCompatParcelizer = context;
        this.write = parselonglambda0;
        this.IconCompatParcelizer = jobScheduler;
        this.read = new ConcurrentHashMap();
        this.serializer = new ConcurrentHashMap<>();
    }

    @Override // com.sentiance.sdk.task.TaskManager
    public final boolean serializer(int i) {
        createOrGetDataStorelambda00 createorgetdatastorelambda00Write = write(i);
        if (createorgetdatastorelambda00Write == null) {
            return false;
        }
        this.write.IconCompatParcelizer("Stopping task %s", createorgetdatastorelambda00Write.RemoteActionCompatParcelizer().MediaMetadataCompat());
        this.serializer.remove(createorgetdatastorelambda00Write);
        return createorgetdatastorelambda00Write.read(this.RemoteActionCompatParcelizer);
    }

    @Override // com.sentiance.sdk.task.TaskManager
    public final void write(String str) {
        this.IconCompatParcelizer.cancel(accesssetEventPublishercp.read(str));
    }
}
