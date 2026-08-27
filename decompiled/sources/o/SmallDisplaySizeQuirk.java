package o;

import android.util.Range;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class SmallDisplaySizeQuirk {
    public static final Range RemoteActionCompatParcelizer = new Range(0, 0);
    public final Range IconCompatParcelizer;
    public final int MediaDescriptionCompat;
    public final android.util.Size MediaMetadataCompat;
    public final boolean RatingCompat;
    public final getNavigationIcon read;
    public final InitializationException serializer;
    public final android.util.Size write;

    public static RepeatingStreamConstraintForVideoRecordingQuirk read(android.util.Size size) {
        RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = new RepeatingStreamConstraintForVideoRecordingQuirk();
        if (size == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null resolution");
            return null;
        }
        repeatingStreamConstraintForVideoRecordingQuirk.serializer = size;
        repeatingStreamConstraintForVideoRecordingQuirk.read = size;
        repeatingStreamConstraintForVideoRecordingQuirk.MediaMetadataCompat = 0;
        Range range = RemoteActionCompatParcelizer;
        if (range == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null expectedFrameRateRange");
            return null;
        }
        repeatingStreamConstraintForVideoRecordingQuirk.RemoteActionCompatParcelizer = range;
        repeatingStreamConstraintForVideoRecordingQuirk.write = getNavigationIcon.MediaDescriptionCompat;
        repeatingStreamConstraintForVideoRecordingQuirk.MediaSessionCompatQueueItem = Boolean.FALSE;
        return repeatingStreamConstraintForVideoRecordingQuirk;
    }

    public final int hashCode() {
        int iHashCode = this.MediaMetadataCompat.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.read.hashCode();
        int i = this.MediaDescriptionCompat;
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        InitializationException initializationException = this.serializer;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ i) * 1000003) ^ iHashCode4) * 1000003) ^ (initializationException == null ? 0 : initializationException.hashCode())) * 1000003) ^ (this.RatingCompat ? 1231 : 1237);
    }

    public final RepeatingStreamConstraintForVideoRecordingQuirk read() {
        RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = new RepeatingStreamConstraintForVideoRecordingQuirk();
        repeatingStreamConstraintForVideoRecordingQuirk.serializer = this.MediaMetadataCompat;
        repeatingStreamConstraintForVideoRecordingQuirk.read = this.write;
        repeatingStreamConstraintForVideoRecordingQuirk.write = this.read;
        repeatingStreamConstraintForVideoRecordingQuirk.MediaMetadataCompat = Integer.valueOf(this.MediaDescriptionCompat);
        repeatingStreamConstraintForVideoRecordingQuirk.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        repeatingStreamConstraintForVideoRecordingQuirk.IconCompatParcelizer = this.serializer;
        repeatingStreamConstraintForVideoRecordingQuirk.MediaSessionCompatQueueItem = Boolean.valueOf(this.RatingCompat);
        return repeatingStreamConstraintForVideoRecordingQuirk;
    }

    public SmallDisplaySizeQuirk(android.util.Size size, android.util.Size size2, getNavigationIcon getnavigationicon, int i, Range range, InitializationException initializationException, boolean z) {
        this.MediaMetadataCompat = size;
        this.write = size2;
        this.read = getnavigationicon;
        this.MediaDescriptionCompat = i;
        this.IconCompatParcelizer = range;
        this.serializer = initializationException;
        this.RatingCompat = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SmallDisplaySizeQuirk)) {
            return false;
        }
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = (SmallDisplaySizeQuirk) obj;
        if (!this.MediaMetadataCompat.equals(smallDisplaySizeQuirk.MediaMetadataCompat) || !this.write.equals(smallDisplaySizeQuirk.write) || !this.read.equals(smallDisplaySizeQuirk.read) || this.MediaDescriptionCompat != smallDisplaySizeQuirk.MediaDescriptionCompat || !this.IconCompatParcelizer.equals(smallDisplaySizeQuirk.IconCompatParcelizer)) {
            return false;
        }
        InitializationException initializationException = smallDisplaySizeQuirk.serializer;
        InitializationException initializationException2 = this.serializer;
        if (initializationException2 == null) {
            if (initializationException != null) {
                return false;
            }
        } else if (!initializationException2.equals(initializationException)) {
            return false;
        }
        return this.RatingCompat == smallDisplaySizeQuirk.RatingCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.write);
        sb.append(", dynamicRange=");
        sb.append(this.read);
        sb.append(", sessionType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", implementationOptions=");
        sb.append(this.serializer);
        sb.append(", zslDisabled=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RatingCompat, "}");
    }
}
