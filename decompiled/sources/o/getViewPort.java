package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getViewPort {
    public final DeactivateEncoderSurfaceBeforeStopEncoderQuirk IconCompatParcelizer;
    public final android.graphics.Matrix MediaBrowserCompatMediaItem;
    public final int MediaMetadataCompat;
    public final android.util.Size MediaSessionCompatQueueItem;
    public final android.graphics.Rect RemoteActionCompatParcelizer;
    public final Object read;
    public final int serializer;
    public final CameraXExternalSyntheticLambda0 write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = this.IconCompatParcelizer;
        int iHashCode2 = deactivateEncoderSurfaceBeforeStopEncoderQuirk == null ? 0 : deactivateEncoderSurfaceBeforeStopEncoderQuirk.hashCode();
        int i = this.serializer;
        int iHashCode3 = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ i) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ this.MediaMetadataCompat) * 1000003) ^ this.MediaBrowserCompatMediaItem.hashCode()) * 1000003) ^ this.write.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getViewPort) {
            getViewPort getviewport = (getViewPort) obj;
            if (this.read.equals(getviewport.read)) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = getviewport.IconCompatParcelizer;
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk2 = this.IconCompatParcelizer;
                if (deactivateEncoderSurfaceBeforeStopEncoderQuirk2 == null) {
                    if (deactivateEncoderSurfaceBeforeStopEncoderQuirk == null) {
                    }
                } else if (deactivateEncoderSurfaceBeforeStopEncoderQuirk2 != deactivateEncoderSurfaceBeforeStopEncoderQuirk) {
                    return false;
                }
                if (this.serializer == getviewport.serializer && this.MediaSessionCompatQueueItem.equals(getviewport.MediaSessionCompatQueueItem) && this.RemoteActionCompatParcelizer.equals(getviewport.RemoteActionCompatParcelizer) && this.MediaMetadataCompat == getviewport.MediaMetadataCompat && this.MediaBrowserCompatMediaItem.equals(getviewport.MediaBrowserCompatMediaItem) && this.write.equals(getviewport.write)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "Packet{data=" + this.read + ", exif=" + this.IconCompatParcelizer + ", format=" + this.serializer + ", size=" + this.MediaSessionCompatQueueItem + ", cropRect=" + this.RemoteActionCompatParcelizer + ", rotationDegrees=" + this.MediaMetadataCompat + ", sensorToBufferTransform=" + this.MediaBrowserCompatMediaItem + ", cameraCaptureResult=" + this.write + "}";
    }

    public getViewPort(Object obj, DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk, int i, android.util.Size size, android.graphics.Rect rect, int i2, android.graphics.Matrix matrix, CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0) {
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null data");
            throw null;
        }
        this.read = obj;
        this.IconCompatParcelizer = deactivateEncoderSurfaceBeforeStopEncoderQuirk;
        this.serializer = i;
        this.MediaSessionCompatQueueItem = size;
        if (rect == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null cropRect");
            throw null;
        }
        this.RemoteActionCompatParcelizer = rect;
        this.MediaMetadataCompat = i2;
        if (matrix == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sensorToBufferTransform");
            throw null;
        }
        this.MediaBrowserCompatMediaItem = matrix;
        if (cameraXExternalSyntheticLambda0 != null) {
            this.write = cameraXExternalSyntheticLambda0;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null cameraCaptureResult");
            throw null;
        }
    }
}
