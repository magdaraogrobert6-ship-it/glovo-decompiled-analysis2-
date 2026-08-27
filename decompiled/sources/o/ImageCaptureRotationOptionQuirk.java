package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk {
    public static final AeFpsRangeQuirk IconCompatParcelizer = AeFpsRangeQuirk.DEFAULT;
    public static final ImageCaptureFailedForSpecificCombinationQuirk[] RemoteActionCompatParcelizer = {ImageCaptureFailedForSpecificCombinationQuirk.S720P_16_9, ImageCaptureFailedForSpecificCombinationQuirk.S1080P_4_3, ImageCaptureFailedForSpecificCombinationQuirk.S1080P_16_9, ImageCaptureFailedForSpecificCombinationQuirk.S1440P_16_9, ImageCaptureFailedForSpecificCombinationQuirk.UHD, ImageCaptureFailedForSpecificCombinationQuirk.X_VGA};
    public static final Map serializer;
    public static final LinkedHashMap write;
    public final int MediaBrowserCompatMediaItem;
    public final AeFpsRangeQuirk MediaDescriptionCompat;
    public final SoftwareJpegEncodingPreferredQuirk MediaSessionCompatQueueItem;
    public final ImageCaptureFailedForSpecificCombinationQuirk read;

    static {
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(SoftwareJpegEncodingPreferredQuirk.YUV, 35), new onViewAttachedToWindowlambda0(SoftwareJpegEncodingPreferredQuirk.JPEG, Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationX)), new onViewAttachedToWindowlambda0(SoftwareJpegEncodingPreferredQuirk.JPEG_R, 4101), new onViewAttachedToWindowlambda0(SoftwareJpegEncodingPreferredQuirk.RAW, 32), new onViewAttachedToWindowlambda0(SoftwareJpegEncodingPreferredQuirk.PRIV, 34));
        serializer = mapRemoteActionCompatParcelizer;
        Set<Map.Entry> setEntrySet = mapRemoteActionCompatParcelizer.entrySet();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(setEntrySet, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (SoftwareJpegEncodingPreferredQuirk) entry.getKey());
        }
        write = linkedHashMap;
    }

    public final int hashCode() {
        int iHashCode = this.MediaSessionCompatQueueItem.hashCode();
        return this.MediaDescriptionCompat.hashCode() + ((this.read.hashCode() + (iHashCode * 31)) * 31);
    }

    public ImageCaptureRotationOptionQuirk(SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk, ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk, AeFpsRangeQuirk aeFpsRangeQuirk) {
        softwareJpegEncodingPreferredQuirk.getClass();
        imageCaptureFailedForSpecificCombinationQuirk.getClass();
        aeFpsRangeQuirk.getClass();
        this.MediaSessionCompatQueueItem = softwareJpegEncodingPreferredQuirk;
        this.read = imageCaptureFailedForSpecificCombinationQuirk;
        this.MediaDescriptionCompat = aeFpsRangeQuirk;
        Integer num = (Integer) serializer.get(softwareJpegEncodingPreferredQuirk);
        this.MediaBrowserCompatMediaItem = num != null ? num.intValue() : 0;
    }

    public static final ImageCaptureRotationOptionQuirk RemoteActionCompatParcelizer(SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk, ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk) {
        softwareJpegEncodingPreferredQuirk.getClass();
        imageCaptureFailedForSpecificCombinationQuirk.getClass();
        return com.mapbox.search.base.utils.extension.StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk, IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCaptureRotationOptionQuirk)) {
            return false;
        }
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) obj;
        return this.MediaSessionCompatQueueItem == imageCaptureRotationOptionQuirk.MediaSessionCompatQueueItem && this.read == imageCaptureRotationOptionQuirk.read && this.MediaDescriptionCompat == imageCaptureRotationOptionQuirk.MediaDescriptionCompat;
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.MediaSessionCompatQueueItem + ", configSize=" + this.read + ", streamUseCase=" + this.MediaDescriptionCompat + ')';
    }
}
