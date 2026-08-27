package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk {
    public final int IconCompatParcelizer;
    public final int MediaDescriptionCompat;
    public final valueOf MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final ExtraSupportedOutputSizeQuirk MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final android.graphics.Matrix RatingCompat;
    public final DrawModifierNodeKt RemoteActionCompatParcelizer;
    public final android.graphics.Rect read;
    public final ImageCaptureFailWithAutoFlashQuirk write;
    public int serializer = -1;
    public final ArrayList MediaBrowserCompatMediaItem = new ArrayList();

    public ImageCaptureFailedWhenVideoCaptureIsBoundQuirk(getNavigationContentDescription getnavigationcontentdescription, ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk, ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk, DrawModifierNodeKt drawModifierNodeKt, int i) {
        this.MediaDescriptionCompat = i;
        this.MediaSessionCompatResultReceiverWrapper = extraSupportedOutputSizeQuirk;
        this.MediaMetadataCompat = extraSupportedOutputSizeQuirk.MediaDescriptionCompat;
        this.IconCompatParcelizer = extraSupportedOutputSizeQuirk.RemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = extraSupportedOutputSizeQuirk.MediaMetadataCompat;
        this.read = extraSupportedOutputSizeQuirk.write;
        this.RatingCompat = extraSupportedOutputSizeQuirk.MediaBrowserCompatMediaItem;
        this.write = imageCaptureFailWithAutoFlashQuirk;
        this.MediaSessionCompatToken = String.valueOf(getnavigationcontentdescription.hashCode());
        List<LegacySessionConfig> list = getnavigationcontentdescription.read;
        Objects.requireNonNull(list);
        for (LegacySessionConfig legacySessionConfig : list) {
            ArrayList arrayList = this.MediaBrowserCompatMediaItem;
            legacySessionConfig.getClass();
            arrayList.add(0);
        }
        this.RemoteActionCompatParcelizer = drawModifierNodeKt;
    }
}
