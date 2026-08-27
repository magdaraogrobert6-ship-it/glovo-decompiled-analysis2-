package o;

import android.content.Context;
import android.os.SystemClock;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.task.SdkJobTaskService;

/* JADX INFO: loaded from: classes4.dex */
public final class accesspublishException implements Runnable {
    final /* synthetic */ long IconCompatParcelizer;
    final /* synthetic */ SdkJobTaskService RemoteActionCompatParcelizer;
    final /* synthetic */ Context read;
    final /* synthetic */ accessgetEventPublishercp serializer;
    final /* synthetic */ long write;

    public accesspublishException(SdkJobTaskService sdkJobTaskService, Context context, long j, long j2, accessgetEventPublishercp accessgeteventpublishercp) {
        this.RemoteActionCompatParcelizer = sdkJobTaskService;
        this.read = context;
        this.IconCompatParcelizer = j;
        this.write = j2;
        this.serializer = accessgeteventpublishercp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (SdkJobTaskService.RemoteActionCompatParcelizer) {
            SdkJobTaskService.RemoteActionCompatParcelizer.remove(this.RemoteActionCompatParcelizer);
        }
        setNewlyReceivedPushStory setnewlyreceivedpushstory = setNotificationBadgeNumber.read();
        if (this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem) {
            return;
        }
        if (setnewlyreceivedpushstory.MediaSessionCompatQueueItem()) {
            SdkJobTaskService.write(this.RemoteActionCompatParcelizer);
            return;
        }
        if (!Sentiance.getInstance(this.read).userExists()) {
            SdkJobTaskService.write(this.RemoteActionCompatParcelizer);
            return;
        }
        if (SystemClock.elapsedRealtime() > this.IconCompatParcelizer) {
            SdkJobTaskService.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this.write);
            SdkJobTaskService.write(this.RemoteActionCompatParcelizer);
        } else {
            if (setnewlyreceivedpushstory.write()) {
                this.serializer.run();
                return;
            }
            synchronized (SdkJobTaskService.RemoteActionCompatParcelizer) {
                SdkJobTaskService.RemoteActionCompatParcelizer.add(this.RemoteActionCompatParcelizer);
                SdkJobTaskService.IconCompatParcelizer.IconCompatParcelizer(this, 100L);
            }
        }
    }
}
