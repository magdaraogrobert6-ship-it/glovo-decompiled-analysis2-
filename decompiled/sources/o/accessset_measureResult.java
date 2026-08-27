package o;

import com.roadrunner.home.CreateHomeScope;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class accessset_measureResult extends getGraphicsContext implements ScheduledFuture {
    public final ScheduledFuture MediaMetadataCompat;

    @Override // o.getGraphicsContext
    public final void RemoteActionCompatParcelizer() {
        ScheduledFuture scheduledFuture = this.MediaMetadataCompat;
        Object obj = this.MediaBrowserCompatMediaItem;
        scheduledFuture.cancel((obj instanceof CacheDrawScope) && ((CacheDrawScope) obj).serializer);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.MediaMetadataCompat.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.MediaMetadataCompat.getDelay(timeUnit);
    }

    public accessset_measureResult(accesssetMeasurementConstraintsBRTryo0 accesssetmeasurementconstraintsbrtryo0) {
        this.MediaMetadataCompat = accesssetmeasurementconstraintsbrtryo0.IconCompatParcelizer(new CreateHomeScope(this));
    }
}
