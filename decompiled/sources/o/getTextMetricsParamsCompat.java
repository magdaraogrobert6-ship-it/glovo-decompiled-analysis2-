package o;

import android.util.Range;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getTextMetricsParamsCompat {
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final Range serializer;
    public final boolean write;

    public getTextMetricsParamsCompat(int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Range range, boolean z7) {
        this.RemoteActionCompatParcelizer = i;
        this.write = z;
        this.read = i2;
        this.MediaDescriptionCompat = z2;
        this.RatingCompat = z3;
        this.MediaMetadataCompat = z4;
        this.IconCompatParcelizer = z5;
        this.MediaSessionCompatQueueItem = z6;
        if (range == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null getTargetFpsRange");
            throw null;
        }
        this.serializer = range;
        this.MediaBrowserCompatMediaItem = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getTextMetricsParamsCompat)) {
            return false;
        }
        getTextMetricsParamsCompat gettextmetricsparamscompat = (getTextMetricsParamsCompat) obj;
        return this.RemoteActionCompatParcelizer == gettextmetricsparamscompat.RemoteActionCompatParcelizer && this.write == gettextmetricsparamscompat.write && this.read == gettextmetricsparamscompat.read && this.MediaDescriptionCompat == gettextmetricsparamscompat.MediaDescriptionCompat && this.RatingCompat == gettextmetricsparamscompat.RatingCompat && this.MediaMetadataCompat == gettextmetricsparamscompat.MediaMetadataCompat && this.IconCompatParcelizer == gettextmetricsparamscompat.IconCompatParcelizer && this.MediaSessionCompatQueueItem == gettextmetricsparamscompat.MediaSessionCompatQueueItem && this.serializer.equals(gettextmetricsparamscompat.serializer) && this.MediaBrowserCompatMediaItem == gettextmetricsparamscompat.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{getCameraMode=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", hasVideoCapture=");
        sb.append(this.write);
        sb.append(", getRequiredMaxBitDepth=");
        sb.append(this.read);
        sb.append(", isPreviewStabilizationOn=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isUltraHdrOn=");
        sb.append(this.RatingCompat);
        sb.append(", isHighSpeedOn=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", isFeatureComboInvocation=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", requiresFeatureComboQuery=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", getTargetFpsRange=");
        sb.append(this.serializer);
        sb.append(", isStrictFpsRequired=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.write ? 1231 : 1237;
        int i3 = this.read;
        int i4 = this.MediaDescriptionCompat ? 1231 : 1237;
        int i5 = this.RatingCompat ? 1231 : 1237;
        int i6 = this.MediaMetadataCompat ? 1231 : 1237;
        int i7 = this.IconCompatParcelizer ? 1231 : 1237;
        int i8 = this.MediaSessionCompatQueueItem ? 1231 : 1237;
        return ((((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ i8) * 1000003) ^ this.serializer.hashCode()) * 1000003) ^ (this.MediaBrowserCompatMediaItem ? 1231 : 1237);
    }
}
