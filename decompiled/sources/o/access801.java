package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class access801 {
    public final ImageUtilCodecFailedException IconCompatParcelizer;
    public final Class MediaBrowserCompatMediaItem;
    public final String MediaSessionCompatQueueItem;
    public final List RemoteActionCompatParcelizer;
    public final mapToBase read;
    public final android.util.Size serializer;
    public final SmallDisplaySizeQuirk write;

    public final int hashCode() {
        int iHashCode = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode2 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode3 = this.read.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        android.util.Size size = this.serializer;
        int iHashCode5 = size == null ? 0 : size.hashCode();
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.write;
        int iHashCode6 = smallDisplaySizeQuirk == null ? 0 : smallDisplaySizeQuirk.hashCode();
        List list = this.RemoteActionCompatParcelizer;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }

    public access801(String str, Class cls, mapToBase maptobase, ImageUtilCodecFailedException imageUtilCodecFailedException, android.util.Size size, SmallDisplaySizeQuirk smallDisplaySizeQuirk, ArrayList arrayList) {
        this.MediaSessionCompatQueueItem = str;
        this.MediaBrowserCompatMediaItem = cls;
        if (maptobase == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sessionConfig");
            throw null;
        }
        this.read = maptobase;
        if (imageUtilCodecFailedException == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null useCaseConfig");
            throw null;
        }
        this.IconCompatParcelizer = imageUtilCodecFailedException;
        this.serializer = size;
        this.write = smallDisplaySizeQuirk;
        this.RemoteActionCompatParcelizer = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof access801)) {
            return false;
        }
        access801 access801Var = (access801) obj;
        if (!this.MediaSessionCompatQueueItem.equals(access801Var.MediaSessionCompatQueueItem) || !this.MediaBrowserCompatMediaItem.equals(access801Var.MediaBrowserCompatMediaItem) || !this.read.equals(access801Var.read) || !this.IconCompatParcelizer.equals(access801Var.IconCompatParcelizer)) {
            return false;
        }
        android.util.Size size = access801Var.serializer;
        android.util.Size size2 = this.serializer;
        if (size2 == null) {
            if (size != null) {
                return false;
            }
        } else if (!size2.equals(size)) {
            return false;
        }
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = access801Var.write;
        SmallDisplaySizeQuirk smallDisplaySizeQuirk2 = this.write;
        if (smallDisplaySizeQuirk2 == null) {
            if (smallDisplaySizeQuirk != null) {
                return false;
            }
        } else if (!smallDisplaySizeQuirk2.equals(smallDisplaySizeQuirk)) {
            return false;
        }
        List list = access801Var.RemoteActionCompatParcelizer;
        List list2 = this.RemoteActionCompatParcelizer;
        if (list2 == null) {
            return list == null;
        }
        return list2.equals(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", useCaseType=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", sessionConfig=");
        sb.append(this.read);
        sb.append(", useCaseConfig=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", surfaceResolution=");
        sb.append(this.serializer);
        sb.append(", streamSpec=");
        sb.append(this.write);
        sb.append(", captureTypes=");
        return MediaSessionCompatQueueItem.read(sb, this.RemoteActionCompatParcelizer, "}");
    }
}
