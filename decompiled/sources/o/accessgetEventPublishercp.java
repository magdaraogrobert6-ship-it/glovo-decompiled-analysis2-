package o;

import android.app.job.JobParameters;
import com.sentiance.sdk.task.SdkJobTaskService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class accessgetEventPublishercp implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ JobParameters serializer;
    public final /* synthetic */ SdkJobTaskService write;

    public /* synthetic */ accessgetEventPublishercp(SdkJobTaskService sdkJobTaskService, JobParameters jobParameters, long j, int i) {
        this.IconCompatParcelizer = i;
        this.write = sdkJobTaskService;
        this.serializer = jobParameters;
        this.read = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        long j = this.read;
        JobParameters jobParameters = this.serializer;
        SdkJobTaskService sdkJobTaskService = this.write;
        if (i != 0) {
            SdkJobTaskService.write(j, jobParameters, sdkJobTaskService);
        } else {
            SdkJobTaskService.IconCompatParcelizer(j, jobParameters, sdkJobTaskService);
        }
    }
}
