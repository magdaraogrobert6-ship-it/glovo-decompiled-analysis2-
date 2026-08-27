package o;

import android.util.Range;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentMeasurePolicymeasure3 {
    public static final Range read = new Range(0, Integer.MAX_VALUE);
    public static final Range write = new Range(0, Integer.MAX_VALUE);
    public final Range IconCompatParcelizer;
    public final int MediaDescriptionCompat;
    public final int MediaSessionCompatQueueItem;
    public final Range RemoteActionCompatParcelizer;
    public final int serializer;

    public static measure3p2s80s read() {
        measure3p2s80s measure3p2s80sVar = new measure3p2s80s();
        measure3p2s80sVar.read = -1;
        measure3p2s80sVar.serializer = -1;
        measure3p2s80sVar.write = -1;
        Range range = read;
        if (range == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null bitrate");
            return null;
        }
        measure3p2s80sVar.RemoteActionCompatParcelizer = range;
        Range range2 = write;
        if (range2 != null) {
            measure3p2s80sVar.IconCompatParcelizer = range2;
            return measure3p2s80sVar;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sampleRate");
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i = this.MediaSessionCompatQueueItem;
        int i2 = this.MediaDescriptionCompat;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ this.serializer;
    }

    static {
        measure3p2s80s measure3p2s80sVar = read();
        measure3p2s80sVar.write = 0;
        measure3p2s80sVar.write();
    }

    public AnimatedContentMeasurePolicymeasure3(Range range, int i, int i2, Range range2, int i3) {
        this.IconCompatParcelizer = range;
        this.MediaSessionCompatQueueItem = i;
        this.MediaDescriptionCompat = i2;
        this.RemoteActionCompatParcelizer = range2;
        this.serializer = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimatedContentMeasurePolicymeasure3)) {
            return false;
        }
        AnimatedContentMeasurePolicymeasure3 animatedContentMeasurePolicymeasure3 = (AnimatedContentMeasurePolicymeasure3) obj;
        return this.IconCompatParcelizer.equals(animatedContentMeasurePolicymeasure3.IconCompatParcelizer) && this.MediaSessionCompatQueueItem == animatedContentMeasurePolicymeasure3.MediaSessionCompatQueueItem && this.MediaDescriptionCompat == animatedContentMeasurePolicymeasure3.MediaDescriptionCompat && this.RemoteActionCompatParcelizer.equals(animatedContentMeasurePolicymeasure3.RemoteActionCompatParcelizer) && this.serializer == animatedContentMeasurePolicymeasure3.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sourceFormat=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", source=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", sampleRate=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", channelCount=");
        return af$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }
}
