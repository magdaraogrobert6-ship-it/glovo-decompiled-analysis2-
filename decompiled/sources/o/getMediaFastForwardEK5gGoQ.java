package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.camera.video.Recorder$3;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.location.zzak;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zza;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaFastForwardEK5gGoQ extends accessgetNumPad7cp implements ActivityRecognitionClient {
    public static final accessgetNumLockcp IconCompatParcelizer = new accessgetNumLockcp("ActivityRecognition.API", new onSizeChanged(7), new io.sentry.hints.PlaybackStateCompatCustomAction(8));

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        activityTransitionRequest.zza(this.MediaDescriptionCompat);
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new accessgetGreencp(activityTransitionRequest, 29, pendingIntent);
        taskApiCall$BuilderIconCompatParcelizer.write = 2405;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestActivityUpdates(long j, PendingIntent pendingIntent) {
        zza zzaVar = new zza();
        zzaVar.zza(j);
        zzb zzbVarZzb = zzaVar.zzb();
        zzbVarZzb.zza(this.MediaDescriptionCompat);
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new Recorder$3(zzbVarZzb, pendingIntent, false, 27);
        taskApiCall$BuilderIconCompatParcelizer.write = 2401;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestSleepSegmentUpdates(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        accessgetSystemNavigationDowncp.serializer(pendingIntent, "PendingIntent must be specified.");
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new colorResource(this, pendingIntent, sleepSegmentRequest);
        taskApiCall$BuilderIconCompatParcelizer.read = new Feature[]{zzo.zzb};
        taskApiCall$BuilderIconCompatParcelizer.write = 2410;
        return read(0, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new zzak(1, pendingIntent);
        taskApiCall$BuilderIconCompatParcelizer.write = 2406;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeActivityUpdates(PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new zzak(0, pendingIntent);
        taskApiCall$BuilderIconCompatParcelizer.write = 2402;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeSleepSegmentUpdates(PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new zzak(2, pendingIntent);
        taskApiCall$BuilderIconCompatParcelizer.write = 2411;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    public getMediaFastForwardEK5gGoQ(Context context, Activity activity, accessgetNumLockcp accessgetnumlockcp, accessgetNumPad2cp accessgetnumpad2cp, accessgetNumPad8cp accessgetnumpad8cp) {
        super(context, activity, accessgetnumlockcp, accessgetnumpad2cp, accessgetnumpad8cp);
    }
}
