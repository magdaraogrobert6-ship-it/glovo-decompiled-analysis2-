package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class offsetFromEdgeMKHz9U {
    public final boolean IconCompatParcelizer;
    public final asList MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final accesssetLastLayerDrawingWasSkippedp MediaMetadataCompat;
    public final withinLayerBoundsk4lQ0M RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final ArrayList serializer;
    public final withinLayerBoundsk4lQ0M write;

    public final int hashCode() {
        int iHashCode = this.MediaMetadataCompat.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.RatingCompat.hashCode();
        int iHashCode4 = this.serializer.hashCode();
        return ((((((((this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer.hashCode() + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31) + (this.MediaDescriptionCompat ? 1 : 0)) * 31) + (this.read ? 1 : 0)) * 31) + (this.RemoteActionCompatParcelizer ? 1 : 0)) * 31) + (this.IconCompatParcelizer ? 1 : 0);
    }

    public offsetFromEdgeMKHz9U(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m, withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m2, ArrayList arrayList, boolean z, asList aslist, boolean z2, boolean z3, boolean z4) {
        this.MediaMetadataCompat = accesssetlastlayerdrawingwasskippedp;
        this.write = withinlayerboundsk4lq0m;
        this.RatingCompat = withinlayerboundsk4lq0m2;
        this.serializer = arrayList;
        this.MediaDescriptionCompat = z;
        this.MediaBrowserCompatMediaItem = aslist;
        this.read = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.IconCompatParcelizer = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof offsetFromEdgeMKHz9U)) {
            return false;
        }
        offsetFromEdgeMKHz9U offsetfromedgemkhz9u = (offsetFromEdgeMKHz9U) obj;
        if (this.MediaDescriptionCompat == offsetfromedgemkhz9u.MediaDescriptionCompat && this.read == offsetfromedgemkhz9u.read && this.RemoteActionCompatParcelizer == offsetfromedgemkhz9u.RemoteActionCompatParcelizer && this.MediaMetadataCompat.equals(offsetfromedgemkhz9u.MediaMetadataCompat) && this.MediaBrowserCompatMediaItem.equals(offsetfromedgemkhz9u.MediaBrowserCompatMediaItem) && this.write.equals(offsetfromedgemkhz9u.write) && this.RatingCompat.equals(offsetfromedgemkhz9u.RatingCompat) && this.IconCompatParcelizer == offsetfromedgemkhz9u.IconCompatParcelizer) {
            return this.serializer.equals(offsetfromedgemkhz9u.serializer);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewSnapshot(");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ");
        sb.append(this.write);
        sb.append(", ");
        sb.append(this.RatingCompat);
        sb.append(", ");
        sb.append(this.serializer);
        sb.append(", isFromCache=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", mutatedKeys=");
        sb.append(this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        sb.append(", didSyncStateChange=");
        sb.append(this.read);
        sb.append(", excludesMetadataChanges=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", hasCachedResults=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
    }
}
