package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ExtraSupportedOutputSizeQuirk {
    public final Executor IconCompatParcelizer;
    public final android.graphics.Matrix MediaBrowserCompatMediaItem;
    public final valueOf MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final setSubtitleTextColor MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatToken;
    public final List PlaybackStateCompat;
    public int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final HashMap read;
    public final int serializer;
    public final android.graphics.Rect write;

    public final boolean RemoteActionCompatParcelizer() {
        Iterator it = this.read.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        setSubtitleTextColor setsubtitletextcolor = this.MediaSessionCompatQueueItem;
        int iHashCode2 = setsubtitletextcolor == null ? 0 : setsubtitletextcolor.hashCode();
        valueOf valueof = this.MediaDescriptionCompat;
        int iHashCode3 = valueof != null ? valueof.hashCode() : 0;
        int iHashCode4 = this.write.hashCode();
        int iHashCode5 = this.MediaBrowserCompatMediaItem.hashCode();
        int i = this.MediaMetadataCompat;
        int i2 = this.RemoteActionCompatParcelizer;
        return ((((((((((((((((((iHashCode ^ 1000003) * (-721379959)) ^ iHashCode2) * 1000003) ^ iHashCode3) * (-721379959)) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.serializer) * 1000003) ^ (this.MediaSessionCompatToken ? 1231 : 1237)) * 1000003) ^ this.PlaybackStateCompat.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExtraSupportedOutputSizeQuirk) {
            ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = (ExtraSupportedOutputSizeQuirk) obj;
            if (this.IconCompatParcelizer.equals(extraSupportedOutputSizeQuirk.IconCompatParcelizer)) {
                setSubtitleTextColor setsubtitletextcolor = extraSupportedOutputSizeQuirk.MediaSessionCompatQueueItem;
                setSubtitleTextColor setsubtitletextcolor2 = this.MediaSessionCompatQueueItem;
                if (setsubtitletextcolor2 != null ? setsubtitletextcolor2.equals(setsubtitletextcolor) : setsubtitletextcolor == null) {
                    valueOf valueof = extraSupportedOutputSizeQuirk.MediaDescriptionCompat;
                    valueOf valueof2 = this.MediaDescriptionCompat;
                    if (valueof2 == null) {
                        if (valueof == null) {
                        }
                    } else if (valueof2 != valueof) {
                        return false;
                    }
                    if (this.write.equals(extraSupportedOutputSizeQuirk.write) && this.MediaBrowserCompatMediaItem.equals(extraSupportedOutputSizeQuirk.MediaBrowserCompatMediaItem) && this.MediaMetadataCompat == extraSupportedOutputSizeQuirk.MediaMetadataCompat && this.RemoteActionCompatParcelizer == extraSupportedOutputSizeQuirk.RemoteActionCompatParcelizer && this.serializer == extraSupportedOutputSizeQuirk.serializer && this.MediaSessionCompatToken == extraSupportedOutputSizeQuirk.MediaSessionCompatToken && this.PlaybackStateCompat.equals(extraSupportedOutputSizeQuirk.PlaybackStateCompat)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void read(int i) {
        HashMap map = this.read;
        if (!map.containsKey(Integer.valueOf(i))) {
            setInflatedId.serializer("TakePictureRequest", "The format is not supported in simultaneous capture");
        } else {
            map.put(Integer.valueOf(i), Boolean.TRUE);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", inMemoryCallback=null, onDiskCallback=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", outputFileOptions=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", secondaryOutputFileOptions=null, cropRect=");
        sb.append(this.write);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", rotationDegrees=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", jpegQuality=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", captureMode=");
        sb.append(this.serializer);
        sb.append(", simultaneousCapture=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return MediaSessionCompatQueueItem.read(sb, this.PlaybackStateCompat, "}");
    }

    public ExtraSupportedOutputSizeQuirk(Executor executor, setSubtitleTextColor setsubtitletextcolor, valueOf valueof, android.graphics.Rect rect, android.graphics.Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        this.RatingCompat = ((androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk) getSurfaceProvider.read.read(androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.read = new HashMap();
        if (executor == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null appExecutor");
            throw null;
        }
        this.IconCompatParcelizer = executor;
        this.MediaSessionCompatQueueItem = setsubtitletextcolor;
        this.MediaDescriptionCompat = valueof;
        this.write = rect;
        if (matrix == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sensorToBufferTransform");
            throw null;
        }
        this.MediaBrowserCompatMediaItem = matrix;
        this.MediaMetadataCompat = i;
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = i3;
        this.MediaSessionCompatToken = z;
        if (list != null) {
            this.PlaybackStateCompat = list;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }
}
