package o;

import android.content.Context;
import com.google.android.gms.stats.zza;
import com.huawei.hmf.tasks.a.i$d;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getCameraEK5gGoQ {
    public static final Object IconCompatParcelizer = new Object();
    public static getCameraEK5gGoQ write;
    public getButtonXEK5gGoQ PlaybackStateCompat;
    public i$d RatingCompat;
    public Context RemoteActionCompatParcelizer;
    public volatile getButtonBEK5gGoQ read;
    public getButtonStartEK5gGoQ serializer;
    public boolean MediaMetadataCompat = true;
    public boolean MediaBrowserCompatMediaItem = false;
    public boolean MediaDescriptionCompat = false;
    public boolean MediaSessionCompatQueueItem = true;
    public final coil3.memory.MemoryCacheService MediaSessionCompatToken = new coil3.memory.MemoryCacheService(this);
    public boolean ParcelableVolumeInfo = false;

    public final void write() {
        synchronized (this) {
            if (!this.MediaBrowserCompatMediaItem) {
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                this.MediaMetadataCompat = true;
                return;
            }
            if (this.MediaDescriptionCompat) {
                return;
            }
            this.MediaDescriptionCompat = true;
            this.read.read.add(new zza(15, this));
        }
    }

    public final void write(boolean z, boolean z2) {
        synchronized (this) {
            boolean zSerializer = serializer();
            this.ParcelableVolumeInfo = z;
            this.MediaSessionCompatQueueItem = z2;
            if (serializer() == zSerializer) {
                return;
            }
            boolean zSerializer2 = serializer();
            i$d i_d = this.RatingCompat;
            if (zSerializer2) {
                i_d.serializer();
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                return;
            }
            i_d.RemoteActionCompatParcelizer();
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        }
    }

    public final boolean serializer() {
        return this.ParcelableVolumeInfo || !this.MediaSessionCompatQueueItem;
    }
}
