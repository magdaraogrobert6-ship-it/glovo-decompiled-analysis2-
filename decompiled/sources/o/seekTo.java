package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class seekTo extends TransitionanimateTo111 {
    public Integer IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public Integer MediaDescriptionCompat;
    public PreviewGreenTintQuirk MediaMetadataCompat;
    public Integer MediaSessionCompatQueueItem;
    public android.util.Size RatingCompat;
    public Integer RemoteActionCompatParcelizer;
    public Integer read;
    public Integer serializer;
    public updateValuesIJZedt4animation_core write;

    public final animateOneFrame RemoteActionCompatParcelizer() {
        String strConcat = this.MediaBrowserCompatMediaItem == null ? " mimeType" : "";
        if (this.MediaSessionCompatQueueItem == null) {
            strConcat = strConcat.concat(" profile");
        }
        if (this.MediaMetadataCompat == null) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (this.RatingCompat == null) {
            strConcat = strConcat.concat(" resolution");
        }
        if (this.IconCompatParcelizer == null) {
            strConcat = strConcat.concat(" colorFormat");
        }
        if (this.write == null) {
            strConcat = strConcat.concat(" dataSpace");
        }
        if (this.read == null) {
            strConcat = strConcat.concat(" captureFrameRate");
        }
        if (this.MediaDescriptionCompat == null) {
            strConcat = strConcat.concat(" encodeFrameRate");
        }
        if (this.RemoteActionCompatParcelizer == null) {
            strConcat = strConcat.concat(" IFrameInterval");
        }
        if (this.serializer == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (strConcat.isEmpty()) {
            return new animateOneFrame(this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem.intValue(), this.MediaMetadataCompat, this.RatingCompat, this.IconCompatParcelizer.intValue(), this.write, this.read.intValue(), this.MediaDescriptionCompat.intValue(), this.RemoteActionCompatParcelizer.intValue(), this.serializer.intValue());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
        return null;
    }
}
