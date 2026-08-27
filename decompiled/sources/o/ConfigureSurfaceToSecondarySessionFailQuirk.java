package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigureSurfaceToSecondarySessionFailQuirk {
    public final ArrayList MediaBrowserCompatMediaItem;
    public Camera2CameraFactory MediaDescriptionCompat;
    public final setScreenFlashOverlayColor MediaMetadataCompat;
    public final android.util.Size MediaSessionCompatQueueItem;
    public final boolean PlaybackStateCompatCustomAction;
    public Camera2CameraFactory RatingCompat;
    public StillCaptureFlashStopRepeatingQuirk RemoteActionCompatParcelizer;
    public final int read;
    public final setScreenFlashOverlayColor serializer;
    public StillCaptureFlashStopRepeatingQuirk IconCompatParcelizer = new FlashAvailabilityBufferUnderflowQuirk(0);
    public final Camera2CameraFactory write = null;

    public final int hashCode() {
        int iHashCode = this.MediaSessionCompatQueueItem.hashCode();
        int i = this.read;
        int iHashCode2 = this.MediaBrowserCompatMediaItem.hashCode();
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ iHashCode2) * 1000003) ^ (this.PlaybackStateCompatCustomAction ? 1231 : 1237)) * 583896283) ^ this.MediaMetadataCompat.hashCode()) * 1000003) ^ this.serializer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigureSurfaceToSecondarySessionFailQuirk) {
            ConfigureSurfaceToSecondarySessionFailQuirk configureSurfaceToSecondarySessionFailQuirk = (ConfigureSurfaceToSecondarySessionFailQuirk) obj;
            return this.MediaSessionCompatQueueItem.equals(configureSurfaceToSecondarySessionFailQuirk.MediaSessionCompatQueueItem) && this.read == configureSurfaceToSecondarySessionFailQuirk.read && this.MediaBrowserCompatMediaItem.equals(configureSurfaceToSecondarySessionFailQuirk.MediaBrowserCompatMediaItem) && this.PlaybackStateCompatCustomAction == configureSurfaceToSecondarySessionFailQuirk.PlaybackStateCompatCustomAction && this.MediaMetadataCompat == configureSurfaceToSecondarySessionFailQuirk.MediaMetadataCompat && this.serializer == configureSurfaceToSecondarySessionFailQuirk.serializer;
        }
        return false;
    }

    public final String toString() {
        return "In{size=" + this.MediaSessionCompatQueueItem + ", inputFormat=" + this.read + ", outputFormats=" + this.MediaBrowserCompatMediaItem + ", virtualCamera=" + this.PlaybackStateCompatCustomAction + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.MediaMetadataCompat + ", errorEdge=" + this.serializer + "}";
    }

    public ConfigureSurfaceToSecondarySessionFailQuirk(android.util.Size size, int i, ArrayList arrayList, boolean z, setScreenFlashOverlayColor setscreenflashoverlaycolor, setScreenFlashOverlayColor setscreenflashoverlaycolor2) {
        if (size == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null size");
            throw null;
        }
        this.MediaSessionCompatQueueItem = size;
        this.read = i;
        this.MediaBrowserCompatMediaItem = arrayList;
        this.PlaybackStateCompatCustomAction = z;
        this.MediaMetadataCompat = setscreenflashoverlaycolor;
        this.serializer = setscreenflashoverlaycolor2;
    }
}
