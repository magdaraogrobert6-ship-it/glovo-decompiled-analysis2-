package o;

import android.content.Context;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.task.SdkJobTaskService;
import com.sentiance.sdk.task.TaskManager;
import com.sentiance.sdk.threading.executors.Executors;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "SdkResetManager", componentName = "SdkResetManager")
public class handlePushNotificationPayloadlambda1 {
    private final r8lambdarI00A69l7k7NAO4I9NDF7haFpGI IconCompatParcelizer;
    private final ServiceManager MediaBrowserCompatMediaItem;
    private final Context MediaDescriptionCompat;
    private final com.sentiance.sdk.util.c MediaMetadataCompat;
    private final ConfigurationManager MediaSessionCompatQueueItem;
    private final TaskManager MediaSessionCompatResultReceiverWrapper;
    private final migratePushDeliveryEventsToJsonlambda0.write MediaSessionCompatToken;
    private final readList ParcelableVolumeInfo;
    private final handlePushperformWorklambda2 PlaybackStateCompat;
    private final Executors PlaybackStateCompatCustomAction;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final parseLonglambda0 read;
    private final getLastKnownGpsLocationIfValidlambda0 serializer;
    private final removeGeofencesRegisteredWithGeofencingClientlambda23 write;

    public final void write(boolean z) {
        this.read.read();
        this.MediaMetadataCompat.IconCompatParcelizer("sdk-reset-is-complete", false);
        this.read.IconCompatParcelizer("Reset in progress", new Object[0]);
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaDescriptionCompat()) {
            this.read.IconCompatParcelizer("Submitting reset payload", new Object[0]);
            this.PlaybackStateCompat.RemoteActionCompatParcelizer();
        }
        this.read.IconCompatParcelizer("Stopping the even bus", new Object[0]);
        this.RemoteActionCompatParcelizer.write();
        this.MediaSessionCompatQueueItem.clearData();
        if (z) {
            this.read.IconCompatParcelizer("Waiting for receivers", new Object[0]);
            this.RatingCompat.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.MediaSessionCompatToken) {
                while (removeGeofencesRegisteredWithGeofencingClientlambda22.IconCompatParcelizer() > 0 && IconCompatParcelizer(jCurrentTimeMillis)) {
                }
            }
            this.read.IconCompatParcelizer("Finishing receivers", new Object[0]);
            removeGeofencesRegisteredWithGeofencingClientlambda22.RemoteActionCompatParcelizer();
            this.read.IconCompatParcelizer("Waiting for services", new Object[0]);
            this.RatingCompat.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            synchronized (this.MediaSessionCompatToken) {
                while (r8lambdaGV766sOYYCl0YYkk8QccVU5zR38.read() > 0 && IconCompatParcelizer(jCurrentTimeMillis2)) {
                }
            }
            this.RatingCompat.getClass();
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            synchronized (this.MediaSessionCompatToken) {
                while (SdkJobTaskService.IconCompatParcelizer() > 0 && IconCompatParcelizer(jCurrentTimeMillis3)) {
                }
            }
            this.read.IconCompatParcelizer("Finishing tasks", new Object[0]);
            this.MediaSessionCompatResultReceiverWrapper.read();
            this.read.IconCompatParcelizer("Shutting down the http client", new Object[0]);
            this.serializer.write();
            this.read.IconCompatParcelizer("Cancelling handlers", new Object[0]);
            this.ParcelableVolumeInfo.IconCompatParcelizer();
            this.read.IconCompatParcelizer("Finishing unprocessed job services", new Object[0]);
            SdkJobTaskService.RemoteActionCompatParcelizer();
            this.read.IconCompatParcelizer("Shutting down the Executors", new Object[0]);
            this.PlaybackStateCompatCustomAction.write();
        }
        this.read.IconCompatParcelizer("Reinitializing the http client", new Object[0]);
        this.serializer.serializer();
        this.read.IconCompatParcelizer("Releasing wakelocks", new Object[0]);
        ((migrateSealedSessionsMapToJsonlambda20) setPushUniqueId.read(migrateSealedSessionsMapToJsonlambda20.class)).IconCompatParcelizer();
        this.read.IconCompatParcelizer("Stopping the guarding and services", new Object[0]);
        this.IconCompatParcelizer.write();
        this.MediaBrowserCompatMediaItem.read();
        this.read.IconCompatParcelizer("Calling onKillswitchActivated", new Object[0]);
        this.write.write();
        this.read.IconCompatParcelizer("Clearing all data", new Object[0]);
        Iterator it = getPublicNotificationExtras.b().RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q r8lambda9t5rqbxiyzswjwkuj3tyq12mq_q = (r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q) setPushUniqueId.read((Class) it.next());
            if (r8lambda9t5rqbxiyzswjwkuj3tyq12mq_q != null) {
                r8lambda9t5rqbxiyzswjwkuj3tyq12mq_q.clearData();
            }
        }
        File[] fileArrListFiles = parseStringlambda0.IconCompatParcelizer(this.MediaDescriptionCompat).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
        this.ParcelableVolumeInfo.MediaDescriptionCompat();
        this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
        readFloatlambda0.read().serializer();
        removeGeofencesRegisteredWithGeofencingClientlambda23.serializer().RemoteActionCompatParcelizer();
        getPublicNotificationExtras.b().read();
        setCategoryIfPresentAndSupported.write().read();
        setPushUniqueId.serializer().getClass();
        setPushUniqueId.IconCompatParcelizer();
        this.MediaMetadataCompat.IconCompatParcelizer("sdk-reset-is-complete", true);
        this.read.IconCompatParcelizer(">>>>>> reset complete <<<<<<", new Object[0]);
        this.read.write();
    }

    public handlePushNotificationPayloadlambda1(r8lambdarI00A69l7k7NAO4I9NDF7haFpGI r8lambdari00a69l7k7nao4i9ndf7hafpgi, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, removeGeofencesRegisteredWithGeofencingClientlambda23 removegeofencesregisteredwithgeofencingclientlambda23, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, parseLonglambda0 parselonglambda0, Context context, ConfigurationManager configurationManager, com.sentiance.sdk.util.c cVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ServiceManager serviceManager, migratePushDeliveryEventsToJsonlambda0.write writeVar, Executors executors, readList readlist, TaskManager taskManager, handlePushperformWorklambda2 handlepushperformworklambda2, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs) {
        this.IconCompatParcelizer = r8lambdari00a69l7k7nao4i9ndf7hafpgi;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.write = removegeofencesregisteredwithgeofencingclientlambda23;
        this.serializer = getlastknowngpslocationifvalidlambda0;
        this.read = parselonglambda0;
        this.MediaDescriptionCompat = context;
        this.MediaSessionCompatQueueItem = configurationManager;
        this.MediaMetadataCompat = cVar;
        this.RatingCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = serviceManager;
        this.MediaSessionCompatToken = writeVar;
        this.PlaybackStateCompatCustomAction = executors;
        this.ParcelableVolumeInfo = readlist;
        this.MediaSessionCompatResultReceiverWrapper = taskManager;
        this.PlaybackStateCompat = handlepushperformworklambda2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdaw447glwjfoun4bg91upxnadqezs;
    }

    public final boolean serializer() {
        return this.MediaMetadataCompat.read("sdk-reset-is-complete", true);
    }

    private boolean IconCompatParcelizer(long j) {
        try {
            this.MediaSessionCompatToken.wait(10L);
            this.RatingCompat.getClass();
            return System.currentTimeMillis() - j <= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
