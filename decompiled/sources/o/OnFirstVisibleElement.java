package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes2.dex */
public final class OnFirstVisibleElement extends LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 {
    public JobScheduler write;

    @Override // o.LayoutNodeSubcompositionsStatedeactivateOutOfFrame1
    public final boolean MediaMetadataCompat() {
        return true;
    }

    public final void IconCompatParcelizer(long j) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        serializer();
        MediaSessionCompatToken();
        JobScheduler jobScheduler = this.write;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getPackageName())).hashCode()) != null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        getWindowEK5gGoQ getwindowek5ggoqMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        if (getwindowek5ggoqMediaSessionCompatQueueItem != getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.PlaybackStateCompat.serializer(getwindowek5ggoqMediaSessionCompatQueueItem.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
        getlookaheaddelegate3.PlaybackStateCompat.serializer(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getPackageName())).hashCode(), new ComponentName(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.write;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
        getlookaheaddelegate4.PlaybackStateCompat.serializer(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final getWindowEK5gGoQ MediaSessionCompatQueueItem() {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        serializer();
        MediaSessionCompatToken();
        if (this.write == null) {
            return getWindowEK5gGoQ.MISSING_JOB_SCHEDULER;
        }
        Boolean boolRemoteActionCompatParcelizer = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.RemoteActionCompatParcelizer("google_analytics_sgtm_upload_enabled");
        if (boolRemoteActionCompatParcelizer == null || !boolRemoteActionCompatParcelizer.booleanValue()) {
            return getWindowEK5gGoQ.NOT_ENABLED_IN_MANIFEST;
        }
        if (lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaMetadataCompat < 119000) {
            return getWindowEK5gGoQ.SDK_TOO_OLD;
        }
        if (onLayoutRectChangeddefault.RemoteActionCompatParcelizer(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat)) {
            return !lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat().MediaSessionCompatResultReceiverWrapper() ? getWindowEK5gGoQ.NON_PLAY_MODE : getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE;
        }
        return getWindowEK5gGoQ.MEASUREMENT_SERVICE_NOT_ENABLED;
    }

    public OnFirstVisibleElement(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
    }
}
