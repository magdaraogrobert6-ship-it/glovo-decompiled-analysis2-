package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewDelayWhenVideoCaptureIsBoundQuirk {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public final android.util.Size read() {
        return new android.util.Size(this.MediaDescriptionCompat, this.MediaMetadataCompat);
    }

    public PreviewDelayWhenVideoCaptureIsBoundQuirk(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.read = i;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null mediaType");
            throw null;
        }
        this.MediaSessionCompatQueueItem = str;
        this.write = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.MediaDescriptionCompat = i4;
        this.MediaMetadataCompat = i5;
        this.MediaBrowserCompatMediaItem = i6;
        this.serializer = i7;
        this.IconCompatParcelizer = i8;
        this.RatingCompat = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreviewDelayWhenVideoCaptureIsBoundQuirk)) {
            return false;
        }
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) obj;
        return this.read == previewDelayWhenVideoCaptureIsBoundQuirk.read && this.MediaSessionCompatQueueItem.equals(previewDelayWhenVideoCaptureIsBoundQuirk.MediaSessionCompatQueueItem) && this.write == previewDelayWhenVideoCaptureIsBoundQuirk.write && this.RemoteActionCompatParcelizer == previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer && this.MediaDescriptionCompat == previewDelayWhenVideoCaptureIsBoundQuirk.MediaDescriptionCompat && this.MediaMetadataCompat == previewDelayWhenVideoCaptureIsBoundQuirk.MediaMetadataCompat && this.MediaBrowserCompatMediaItem == previewDelayWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem && this.serializer == previewDelayWhenVideoCaptureIsBoundQuirk.serializer && this.IconCompatParcelizer == previewDelayWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer && this.RatingCompat == previewDelayWhenVideoCaptureIsBoundQuirk.RatingCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.read);
        sb.append(", mediaType=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", bitrate=");
        sb.append(this.write);
        sb.append(", frameRate=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", width=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", height=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", profile=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", bitDepth=");
        sb.append(this.serializer);
        sb.append(", chromaSubsampling=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", hdrFormat=");
        return af$$ExternalSyntheticOutline0.m(this.RatingCompat, "}", sb);
    }

    public final int hashCode() {
        int i = this.read;
        int iHashCode = this.MediaSessionCompatQueueItem.hashCode();
        int i2 = this.write;
        int i3 = this.RemoteActionCompatParcelizer;
        int i4 = this.MediaDescriptionCompat;
        int i5 = this.MediaMetadataCompat;
        int i6 = this.MediaBrowserCompatMediaItem;
        int i7 = this.serializer;
        return ((((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ this.IconCompatParcelizer) * 1000003) ^ this.RatingCompat;
    }
}
