package o;

import io.grpc.Status;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getFontLoader extends getHapticFeedBack {
    public final Status IconCompatParcelizer;
    public final getClipMetadata RemoteActionCompatParcelizer;
    public final getFontFamilyResolver read;
    public final List serializer;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        Status status = this.IconCompatParcelizer;
        return ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + (status != null ? status.PlaybackStateCompat.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchTargetChange{changeType=");
        sb.append(this.read);
        sb.append(", targetIds=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.serializer, '}');
    }

    public getFontLoader(getFontFamilyResolver getfontfamilyresolver, List list, getClipMetadata getclipmetadata, Status status) {
        getRectManager.RemoteActionCompatParcelizer(status == null || getfontfamilyresolver == getFontFamilyResolver.Removed, "Got cause for a target change that was not a removal", new Object[0]);
        this.read = getfontfamilyresolver;
        this.serializer = list;
        this.RemoteActionCompatParcelizer = getclipmetadata;
        if (status == null || status.IconCompatParcelizer()) {
            this.IconCompatParcelizer = null;
        } else {
            this.IconCompatParcelizer = status;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getFontLoader.class == obj.getClass()) {
            getFontLoader getfontloader = (getFontLoader) obj;
            if (this.read != getfontloader.read || !this.serializer.equals(getfontloader.serializer) || !this.RemoteActionCompatParcelizer.equals(getfontloader.RemoteActionCompatParcelizer)) {
                return false;
            }
            Status status = getfontloader.IconCompatParcelizer;
            Status status2 = this.IconCompatParcelizer;
            if (status2 != null) {
                return status != null && status2.PlaybackStateCompat.equals(status.PlaybackStateCompat);
            }
            if (status == null) {
                return true;
            }
        }
        return false;
    }
}
