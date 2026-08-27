package o;

import android.location.Location;
import com.sentiance.sdk.crashdetection.api.CrashDetectionState;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA {
    private final float IconCompatParcelizer;
    private final float MediaBrowserCompatMediaItem;
    private final CrashDetectionState MediaDescriptionCompat;
    private final float MediaMetadataCompat;
    private final float MediaSessionCompatQueueItem;
    private final CrashSeverityInternal RatingCompat;
    private final float RemoteActionCompatParcelizer;
    private final Location read;
    private final List<populatePushStoryPage> serializer;
    private final long write;

    public static class serializer {
        private float MediaBrowserCompatMediaItem;
        private CrashDetectionState MediaDescriptionCompat;
        private float MediaMetadataCompat;
        private CrashSeverityInternal MediaSessionCompatQueueItem;
        private float RatingCompat;
        private float RemoteActionCompatParcelizer;
        private long serializer;
        private float write;
        private List<populatePushStoryPage> IconCompatParcelizer = Collections.EMPTY_LIST;
        private Location read = new Location("");

        public final void write(List list) {
            this.IconCompatParcelizer = new ArrayList(list);
        }

        public final void IconCompatParcelizer(float f) {
            this.RemoteActionCompatParcelizer = f;
        }

        public final void read(float f) {
            this.MediaMetadataCompat = f;
        }

        public final void serializer(float f) {
            this.write = f;
        }

        public final void write(float f) {
            this.RatingCompat = f;
        }

        public final void IconCompatParcelizer(long j) {
            this.serializer = j;
        }

        public final void RemoteActionCompatParcelizer(Location location) {
            this.read = location;
        }

        public final void RemoteActionCompatParcelizer(float f) {
            this.MediaBrowserCompatMediaItem = f;
        }

        public final void RemoteActionCompatParcelizer(CrashDetectionState crashDetectionState) {
            this.MediaDescriptionCompat = crashDetectionState;
        }

        public final void serializer(CrashSeverityInternal crashSeverityInternal) {
            this.MediaSessionCompatQueueItem = crashSeverityInternal;
        }
    }

    public final CrashSeverityInternal IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public final float MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final boolean MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer >= 1.0f;
    }

    public final long MediaMetadataCompat() {
        return this.write;
    }

    public final float MediaSessionCompatQueueItem() {
        return this.IconCompatParcelizer;
    }

    public final List<populatePushStoryPage> RatingCompat() {
        return this.serializer;
    }

    public final Location RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final float read() {
        return this.MediaMetadataCompat;
    }

    public final float serializer() {
        return this.MediaSessionCompatQueueItem;
    }

    public final CrashDetectionState write() {
        return this.MediaDescriptionCompat;
    }

    public r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA(serializer serializerVar) {
        this.RemoteActionCompatParcelizer = serializerVar.RemoteActionCompatParcelizer;
        this.write = serializerVar.serializer;
        this.read = serializerVar.read;
        this.IconCompatParcelizer = serializerVar.write;
        this.MediaBrowserCompatMediaItem = serializerVar.RatingCompat;
        this.MediaSessionCompatQueueItem = serializerVar.MediaMetadataCompat;
        this.MediaMetadataCompat = serializerVar.MediaBrowserCompatMediaItem;
        this.serializer = serializerVar.IconCompatParcelizer;
        this.MediaDescriptionCompat = serializerVar.MediaDescriptionCompat;
        this.RatingCompat = serializerVar.MediaSessionCompatQueueItem;
    }

    public final String toString() {
        return "CrashResult{mPrediction=" + this.RemoteActionCompatParcelizer + ", mPeakTime=" + this.write + ", mModels=" + this.serializer + ", mLocation=" + this.read + ", mMagnitudeG=" + this.IconCompatParcelizer + ", mSpeedAtImpact=" + this.MediaBrowserCompatMediaItem + ", mDeltaV=" + this.MediaSessionCompatQueueItem + ", mConfidence=" + this.MediaMetadataCompat + ", mCrashDetectionState=" + this.MediaDescriptionCompat + ", mCrashSeverity=" + this.RatingCompat + '}';
    }
}
