package o;

import android.media.MediaFormat;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes.dex */
public final class animateOneFrame implements animateTo {
    public final updateValuesIJZedt4animation_core IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final PreviewGreenTintQuirk MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final android.util.Size RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    @Override // o.animateTo
    public final String IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.animateTo
    public final PreviewGreenTintQuirk write() {
        return this.MediaMetadataCompat;
    }

    public static seekTo serializer() {
        seekTo seekto = new seekTo();
        seekto.MediaSessionCompatQueueItem = -1;
        seekto.RemoteActionCompatParcelizer = 1;
        seekto.IconCompatParcelizer = 2130708361;
        seekto.write = updateValuesIJZedt4animation_core.IconCompatParcelizer;
        return seekto;
    }

    @Override // o.animateTo
    public final MediaFormat RemoteActionCompatParcelizer() {
        android.util.Size size = this.RatingCompat;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.MediaSessionCompatQueueItem, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.write);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.serializer);
        int i = this.MediaBrowserCompatMediaItem;
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i);
        int i2 = this.read;
        if (i != i2) {
            mediaFormatCreateVideoFormat.setInteger("operating-rate", i2);
            mediaFormatCreateVideoFormat.setInteger(RemoteMessageConst.Notification.PRIORITY, 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.RemoteActionCompatParcelizer);
        int i3 = this.MediaDescriptionCompat;
        if (i3 != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i3);
        }
        updateValuesIJZedt4animation_core updatevaluesijzedt4animation_core = this.IconCompatParcelizer;
        int i4 = updatevaluesijzedt4animation_core.MediaSessionCompatQueueItem;
        if (i4 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i4);
        }
        int i5 = updatevaluesijzedt4animation_core.RatingCompat;
        if (i5 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i5);
        }
        int i6 = updatevaluesijzedt4animation_core.MediaBrowserCompatMediaItem;
        if (i6 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i6);
        }
        return mediaFormatCreateVideoFormat;
    }

    public final int hashCode() {
        int iHashCode = this.MediaSessionCompatQueueItem.hashCode();
        int i = this.MediaDescriptionCompat;
        int iHashCode2 = this.MediaMetadataCompat.hashCode();
        int iHashCode3 = this.RatingCompat.hashCode();
        int i2 = this.write;
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        int i3 = this.read;
        int i4 = this.MediaBrowserCompatMediaItem;
        return ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ i2) * 1000003) ^ iHashCode4) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ this.RemoteActionCompatParcelizer) * 1000003) ^ this.serializer;
    }

    public animateOneFrame(String str, int i, PreviewGreenTintQuirk previewGreenTintQuirk, android.util.Size size, int i2, updateValuesIJZedt4animation_core updatevaluesijzedt4animation_core, int i3, int i4, int i5, int i6) {
        this.MediaSessionCompatQueueItem = str;
        this.MediaDescriptionCompat = i;
        this.MediaMetadataCompat = previewGreenTintQuirk;
        this.RatingCompat = size;
        this.write = i2;
        this.IconCompatParcelizer = updatevaluesijzedt4animation_core;
        this.read = i3;
        this.MediaBrowserCompatMediaItem = i4;
        this.RemoteActionCompatParcelizer = i5;
        this.serializer = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof animateOneFrame)) {
            return false;
        }
        animateOneFrame animateoneframe = (animateOneFrame) obj;
        return this.MediaSessionCompatQueueItem.equals(animateoneframe.MediaSessionCompatQueueItem) && this.MediaDescriptionCompat == animateoneframe.MediaDescriptionCompat && this.MediaMetadataCompat.equals(animateoneframe.MediaMetadataCompat) && this.RatingCompat.equals(animateoneframe.RatingCompat) && this.write == animateoneframe.write && this.IconCompatParcelizer.equals(animateoneframe.IconCompatParcelizer) && this.read == animateoneframe.read && this.MediaBrowserCompatMediaItem == animateoneframe.MediaBrowserCompatMediaItem && this.RemoteActionCompatParcelizer == animateoneframe.RemoteActionCompatParcelizer && this.serializer == animateoneframe.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", profile=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", inputTimebase=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", resolution=");
        sb.append(this.RatingCompat);
        sb.append(", colorFormat=");
        sb.append(this.write);
        sb.append(", dataSpace=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", captureFrameRate=");
        sb.append(this.read);
        sb.append(", encodeFrameRate=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", IFrameInterval=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", bitrate=");
        return af$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }
}
