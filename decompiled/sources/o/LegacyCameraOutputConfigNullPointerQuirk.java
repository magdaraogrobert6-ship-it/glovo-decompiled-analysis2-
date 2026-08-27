package o;

import android.util.Range;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LegacyCameraOutputConfigNullPointerQuirk {
    public final int IconCompatParcelizer;
    public final ImageCaptureRotationOptionQuirk MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final android.util.Size MediaMetadataCompat;
    public final Range MediaSessionCompatQueueItem;
    public final getNavigationIcon RemoteActionCompatParcelizer;
    public final List read;
    public final int serializer;
    public final InitializationException write;

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        int i = this.serializer;
        int iHashCode2 = this.MediaMetadataCompat.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode4 = this.read.hashCode();
        InitializationException initializationException = this.write;
        int iHashCode5 = initializationException == null ? 0 : initializationException.hashCode();
        int i2 = this.IconCompatParcelizer;
        return ((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ i2) * 1000003) ^ this.MediaSessionCompatQueueItem.hashCode()) * 1000003) ^ (this.MediaDescriptionCompat ? 1231 : 1237);
    }

    public final SmallDisplaySizeQuirk serializer(access701 access701Var) {
        RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = SmallDisplaySizeQuirk.read(this.MediaMetadataCompat);
        repeatingStreamConstraintForVideoRecordingQuirk.MediaMetadataCompat = Integer.valueOf(this.IconCompatParcelizer);
        Range range = this.MediaSessionCompatQueueItem;
        if (range == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null expectedFrameRateRange");
            return null;
        }
        repeatingStreamConstraintForVideoRecordingQuirk.RemoteActionCompatParcelizer = range;
        getNavigationIcon getnavigationicon = this.RemoteActionCompatParcelizer;
        if (getnavigationicon == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null dynamicRange");
            return null;
        }
        repeatingStreamConstraintForVideoRecordingQuirk.write = getnavigationicon;
        repeatingStreamConstraintForVideoRecordingQuirk.IconCompatParcelizer = access701Var;
        return repeatingStreamConstraintForVideoRecordingQuirk.read();
    }

    public LegacyCameraOutputConfigNullPointerQuirk(ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk, int i, android.util.Size size, getNavigationIcon getnavigationicon, List list, InitializationException initializationException, int i2, Range range, boolean z) {
        this.MediaBrowserCompatMediaItem = imageCaptureRotationOptionQuirk;
        this.serializer = i;
        if (size == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null size");
            throw null;
        }
        this.MediaMetadataCompat = size;
        if (getnavigationicon == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null dynamicRange");
            throw null;
        }
        this.RemoteActionCompatParcelizer = getnavigationicon;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null captureTypes");
            throw null;
        }
        this.read = list;
        this.write = initializationException;
        this.IconCompatParcelizer = i2;
        if (range == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null targetFrameRate");
            throw null;
        }
        this.MediaSessionCompatQueueItem = range;
        this.MediaDescriptionCompat = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LegacyCameraOutputConfigNullPointerQuirk)) {
            return false;
        }
        LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk = (LegacyCameraOutputConfigNullPointerQuirk) obj;
        if (!this.MediaBrowserCompatMediaItem.equals(legacyCameraOutputConfigNullPointerQuirk.MediaBrowserCompatMediaItem) || this.serializer != legacyCameraOutputConfigNullPointerQuirk.serializer || !this.MediaMetadataCompat.equals(legacyCameraOutputConfigNullPointerQuirk.MediaMetadataCompat) || !this.RemoteActionCompatParcelizer.equals(legacyCameraOutputConfigNullPointerQuirk.RemoteActionCompatParcelizer) || !this.read.equals(legacyCameraOutputConfigNullPointerQuirk.read)) {
            return false;
        }
        InitializationException initializationException = legacyCameraOutputConfigNullPointerQuirk.write;
        InitializationException initializationException2 = this.write;
        if (initializationException2 == null) {
            if (initializationException != null) {
                return false;
            }
        } else if (!initializationException2.equals(initializationException)) {
            return false;
        }
        return this.IconCompatParcelizer == legacyCameraOutputConfigNullPointerQuirk.IconCompatParcelizer && this.MediaSessionCompatQueueItem.equals(legacyCameraOutputConfigNullPointerQuirk.MediaSessionCompatQueueItem) && this.MediaDescriptionCompat == legacyCameraOutputConfigNullPointerQuirk.MediaDescriptionCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", imageFormat=");
        sb.append(this.serializer);
        sb.append(", size=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", dynamicRange=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", captureTypes=");
        sb.append(this.read);
        sb.append(", implementationOptions=");
        sb.append(this.write);
        sb.append(", sessionType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", targetFrameRate=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", strictFrameRateRequired=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaDescriptionCompat, "}");
    }
}
