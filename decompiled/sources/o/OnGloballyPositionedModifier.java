package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzpg;

/* JADX INFO: loaded from: classes2.dex */
public final class OnGloballyPositionedModifier extends getOnGloballyPositioned {
    public Integer RemoteActionCompatParcelizer;
    public final AlarmManager read;
    public OnGlobalLayoutListenerKt write;

    public final void MediaSessionCompatQueueItem() {
        JobScheduler jobScheduler = (JobScheduler) ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(MediaSessionCompatResultReceiverWrapper());
        }
    }

    public OnGloballyPositionedModifier(zzpg zzpgVar) {
        super(zzpgVar);
        this.read = (AlarmManager) ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("alarm");
    }

    public final void serializer() {
        ComponentActivity();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Unscheduling upload");
        AlarmManager alarmManager = this.read;
        if (alarmManager != null) {
            Context context = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), getPictureSymbolsEK5gGoQ.read));
        }
        MediaMetadataCompat().IconCompatParcelizer();
        MediaSessionCompatQueueItem();
    }

    public final int MediaSessionCompatResultReceiverWrapper() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = Integer.valueOf("measurement".concat(String.valueOf(((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getPackageName())).hashCode());
        }
        return this.RemoteActionCompatParcelizer.intValue();
    }

    @Override // o.getOnGloballyPositioned
    public final void read() {
        AlarmManager alarmManager = this.read;
        if (alarmManager != null) {
            Context context = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), getPictureSymbolsEK5gGoQ.read));
        }
        MediaSessionCompatQueueItem();
    }

    public final LayoutNodeSubcompositionsStatecreateMeasureResult1 MediaMetadataCompat() {
        if (this.write == null) {
            this.write = new OnGlobalLayoutListenerKt(this, this.MediaSessionCompatToken.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, 0);
        }
        return this.write;
    }
}
