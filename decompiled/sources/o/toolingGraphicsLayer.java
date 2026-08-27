package o;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class toolingGraphicsLayer {
    public static final toolingGraphicsLayer IconCompatParcelizer = new toolingGraphicsLayer();
    public final boolean MediaBrowserCompatMediaItem;
    public final setCompositingStrategyaDBOjCE MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final drawOutlinehn5TExg read;
    public final long serializer;
    public final Set write;

    public final int hashCode() {
        int iHashCode = this.MediaDescriptionCompat.hashCode();
        boolean z = this.MediaMetadataCompat;
        boolean z2 = this.MediaSessionCompatQueueItem;
        boolean z3 = this.RatingCompat;
        boolean z4 = this.MediaBrowserCompatMediaItem;
        long j = this.serializer;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.RemoteActionCompatParcelizer;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode2 = this.write.hashCode();
        NetworkRequest networkRequestWrite = write();
        return ((iHashCode2 + (((((((((((((iHashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + i) * 31) + i2) * 31)) * 31) + (networkRequestWrite != null ? networkRequestWrite.hashCode() : 0);
    }

    public final NetworkRequest write() {
        return (NetworkRequest) this.read.read;
    }

    public toolingGraphicsLayer(toolingGraphicsLayer toolinggraphicslayer) {
        toolinggraphicslayer.getClass();
        this.MediaMetadataCompat = toolinggraphicslayer.MediaMetadataCompat;
        this.MediaSessionCompatQueueItem = toolinggraphicslayer.MediaSessionCompatQueueItem;
        this.read = toolinggraphicslayer.read;
        this.MediaDescriptionCompat = toolinggraphicslayer.MediaDescriptionCompat;
        this.RatingCompat = toolinggraphicslayer.RatingCompat;
        this.MediaBrowserCompatMediaItem = toolinggraphicslayer.MediaBrowserCompatMediaItem;
        this.write = toolinggraphicslayer.write;
        this.serializer = toolinggraphicslayer.serializer;
        this.RemoteActionCompatParcelizer = toolinggraphicslayer.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.MediaDescriptionCompat + ", requiresCharging=" + this.MediaMetadataCompat + ", requiresDeviceIdle=" + this.MediaSessionCompatQueueItem + ", requiresBatteryNotLow=" + this.RatingCompat + ", requiresStorageNotLow=" + this.MediaBrowserCompatMediaItem + ", contentTriggerUpdateDelayMillis=" + this.serializer + ", contentTriggerMaxDelayMillis=" + this.RemoteActionCompatParcelizer + ", contentUriTriggers=" + this.write + ", }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !toolingGraphicsLayer.class.equals(obj.getClass())) {
            return false;
        }
        toolingGraphicsLayer toolinggraphicslayer = (toolingGraphicsLayer) obj;
        if (this.MediaMetadataCompat != toolinggraphicslayer.MediaMetadataCompat || this.MediaSessionCompatQueueItem != toolinggraphicslayer.MediaSessionCompatQueueItem || this.RatingCompat != toolinggraphicslayer.RatingCompat || this.MediaBrowserCompatMediaItem != toolinggraphicslayer.MediaBrowserCompatMediaItem || this.serializer != toolinggraphicslayer.serializer || this.RemoteActionCompatParcelizer != toolinggraphicslayer.RemoteActionCompatParcelizer) {
            return false;
        }
        Object[] objArr = {write(), toolinggraphicslayer.write()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.MediaDescriptionCompat != toolinggraphicslayer.MediaDescriptionCompat) {
            return false;
        }
        Object[] objArr2 = {this.write, toolinggraphicslayer.write};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue();
    }

    public toolingGraphicsLayer(drawOutlinehn5TExg drawoutlinehn5texg, setCompositingStrategyaDBOjCE setcompositingstrategyadbojce, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        setcompositingstrategyadbojce.getClass();
        this.read = drawoutlinehn5texg;
        this.MediaDescriptionCompat = setcompositingstrategyadbojce;
        this.MediaMetadataCompat = z;
        this.MediaSessionCompatQueueItem = z2;
        this.RatingCompat = z3;
        this.MediaBrowserCompatMediaItem = z4;
        this.serializer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.write = set;
    }

    public toolingGraphicsLayer() {
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
        setcompositingstrategyadbojce.getClass();
        this.read = new drawOutlinehn5TExg(null);
        this.MediaDescriptionCompat = setcompositingstrategyadbojce;
        this.MediaMetadataCompat = false;
        this.MediaSessionCompatQueueItem = false;
        this.RatingCompat = false;
        this.MediaBrowserCompatMediaItem = false;
        this.serializer = -1L;
        this.RemoteActionCompatParcelizer = -1L;
        this.write = ItemTouchHelperAdapter.serializer;
    }
}
