package o;

import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class setLastShapeui {
    public final getWasLayerBlockInvokedui IconCompatParcelizer;
    public final hitNearFh5PU_I MediaBrowserCompatMediaItem;
    public final int MediaSessionCompatQueueItem;
    public final SnapshotVersion RatingCompat;
    public final SnapshotVersion RemoteActionCompatParcelizer;
    public final long read;
    public final Integer serializer;
    public final getClipMetadata write;

    public final setLastShapeui RemoteActionCompatParcelizer(getClipMetadata getclipmetadata, SnapshotVersion snapshotVersion) {
        return new setLastShapeui(this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem, this.read, this.IconCompatParcelizer, snapshotVersion, this.RemoteActionCompatParcelizer, getclipmetadata, null);
    }

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        int i = this.MediaSessionCompatQueueItem;
        int i2 = (int) this.read;
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        int iHashCode3 = this.RatingCompat.read.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.read.hashCode();
        return Objects.hashCode(this.serializer) + ((this.write.hashCode() + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (((((iHashCode * 31) + i) * 31) + i2) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final setLastShapeui write(long j) {
        return new setLastShapeui(this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem, j, this.IconCompatParcelizer, this.RatingCompat, this.RemoteActionCompatParcelizer, this.write, this.serializer);
    }

    public setLastShapeui(hitNearFh5PU_I hitnearfh5pu_i, int i, long j, getWasLayerBlockInvokedui getwaslayerblockinvokedui, SnapshotVersion snapshotVersion, SnapshotVersion snapshotVersion2, getClipMetadata getclipmetadata, Integer num) {
        hitnearfh5pu_i.getClass();
        this.MediaBrowserCompatMediaItem = hitnearfh5pu_i;
        this.MediaSessionCompatQueueItem = i;
        this.read = j;
        this.RemoteActionCompatParcelizer = snapshotVersion2;
        this.IconCompatParcelizer = getwaslayerblockinvokedui;
        snapshotVersion.getClass();
        this.RatingCompat = snapshotVersion;
        getclipmetadata.getClass();
        this.write = getclipmetadata;
        this.serializer = num;
    }

    public final String toString() {
        return "TargetData{target=" + this.MediaBrowserCompatMediaItem + ", targetId=" + this.MediaSessionCompatQueueItem + ", sequenceNumber=" + this.read + ", purpose=" + this.IconCompatParcelizer + ", snapshotVersion=" + this.RatingCompat + ", lastLimboFreeSnapshotVersion=" + this.RemoteActionCompatParcelizer + ", resumeToken=" + this.write + ", expectedCount=" + this.serializer + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || setLastShapeui.class != obj.getClass()) {
            return false;
        }
        setLastShapeui setlastshapeui = (setLastShapeui) obj;
        return this.MediaBrowserCompatMediaItem.equals(setlastshapeui.MediaBrowserCompatMediaItem) && this.MediaSessionCompatQueueItem == setlastshapeui.MediaSessionCompatQueueItem && this.read == setlastshapeui.read && this.IconCompatParcelizer.equals(setlastshapeui.IconCompatParcelizer) && this.RatingCompat.equals(setlastshapeui.RatingCompat) && this.RemoteActionCompatParcelizer.equals(setlastshapeui.RemoteActionCompatParcelizer) && this.write.equals(setlastshapeui.write) && Objects.equals(this.serializer, setlastshapeui.serializer);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setLastShapeui(hitNearFh5PU_I hitnearfh5pu_i, int i, long j, getWasLayerBlockInvokedui getwaslayerblockinvokedui) {
        SnapshotVersion snapshotVersion = SnapshotVersion.IconCompatParcelizer;
        this(hitnearfh5pu_i, i, j, getwaslayerblockinvokedui, snapshotVersion, snapshotVersion, getRootForTest.PlaybackStateCompatCustomAction, null);
    }
}
