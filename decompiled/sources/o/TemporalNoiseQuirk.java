package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class TemporalNoiseQuirk {
    public final HashMap IconCompatParcelizer;
    public final HashMap MediaBrowserCompatMediaItem;
    public final HashMap MediaMetadataCompat;
    public final HashMap MediaSessionCompatQueueItem;
    public final android.util.Size RatingCompat;
    public final HashMap RemoteActionCompatParcelizer;
    public final android.util.Size read;
    public final HashMap serializer;
    public final android.util.Size write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.MediaMetadataCompat.hashCode();
        int iHashCode3 = this.read.hashCode();
        int iHashCode4 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode5 = this.RatingCompat.hashCode();
        int iHashCode6 = this.IconCompatParcelizer.hashCode();
        int iHashCode7 = this.RemoteActionCompatParcelizer.hashCode();
        return ((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ this.serializer.hashCode()) * 1000003) ^ this.MediaSessionCompatQueueItem.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemporalNoiseQuirk)) {
            return false;
        }
        TemporalNoiseQuirk temporalNoiseQuirk = (TemporalNoiseQuirk) obj;
        return this.write.equals(temporalNoiseQuirk.write) && this.MediaMetadataCompat.equals(temporalNoiseQuirk.MediaMetadataCompat) && this.read.equals(temporalNoiseQuirk.read) && this.MediaBrowserCompatMediaItem.equals(temporalNoiseQuirk.MediaBrowserCompatMediaItem) && this.RatingCompat.equals(temporalNoiseQuirk.RatingCompat) && this.IconCompatParcelizer.equals(temporalNoiseQuirk.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(temporalNoiseQuirk.RemoteActionCompatParcelizer) && this.serializer.equals(temporalNoiseQuirk.serializer) && this.MediaSessionCompatQueueItem.equals(temporalNoiseQuirk.MediaSessionCompatQueueItem);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.write + ", s720pSizeMap=" + this.MediaMetadataCompat + ", previewSize=" + this.read + ", s1440pSizeMap=" + this.MediaBrowserCompatMediaItem + ", recordSize=" + this.RatingCompat + ", maximumSizeMap=" + this.IconCompatParcelizer + ", maximum4x3SizeMap=" + this.RemoteActionCompatParcelizer + ", maximum16x9SizeMap=" + this.serializer + ", ultraMaximumSizeMap=" + this.MediaSessionCompatQueueItem + "}";
    }

    public TemporalNoiseQuirk(android.util.Size size, HashMap map, android.util.Size size2, HashMap map2, android.util.Size size3, HashMap map3, HashMap map4, HashMap map5, HashMap map6) {
        if (size == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null analysisSize");
            throw null;
        }
        this.write = size;
        this.MediaMetadataCompat = map;
        if (size2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null previewSize");
            throw null;
        }
        this.read = size2;
        this.MediaBrowserCompatMediaItem = map2;
        if (size3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null recordSize");
            throw null;
        }
        this.RatingCompat = size3;
        this.IconCompatParcelizer = map3;
        this.RemoteActionCompatParcelizer = map4;
        this.serializer = map5;
        this.MediaSessionCompatQueueItem = map6;
    }
}
