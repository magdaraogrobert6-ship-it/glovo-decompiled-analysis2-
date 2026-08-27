package o;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nativeGetYUVImageVUOff {
    public static final JpegCaptureDownsizingQuirk RemoteActionCompatParcelizer = new JpegCaptureDownsizingQuirk("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final JpegCaptureDownsizingQuirk read = new JpegCaptureDownsizingQuirk("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final JpegCaptureDownsizingQuirk write = new JpegCaptureDownsizingQuirk("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final List IconCompatParcelizer;
    public final ArrayList MediaBrowserCompatMediaItem;
    public final CameraRepository MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final boolean ParcelableVolumeInfo;
    public final OnePixelShiftQuirk RatingCompat;
    public final CameraXExternalSyntheticLambda0 serializer;

    public final Range IconCompatParcelizer() {
        Range range = (Range) this.MediaDescriptionCompat.read(write, SmallDisplaySizeQuirk.RemoteActionCompatParcelizer);
        Objects.requireNonNull(range);
        return range;
    }

    public final int serializer() {
        Object obj = this.RatingCompat.IconCompatParcelizer.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public nativeGetYUVImageVUOff(ArrayList arrayList, CameraRepository cameraRepository, int i, boolean z, ArrayList arrayList2, boolean z2, OnePixelShiftQuirk onePixelShiftQuirk, CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0) {
        this.MediaBrowserCompatMediaItem = arrayList;
        this.MediaDescriptionCompat = cameraRepository;
        this.MediaSessionCompatQueueItem = i;
        this.IconCompatParcelizer = Collections.unmodifiableList(arrayList2);
        this.ParcelableVolumeInfo = z2;
        this.RatingCompat = onePixelShiftQuirk;
        this.serializer = cameraXExternalSyntheticLambda0;
        this.MediaMetadataCompat = z;
    }

    public final int RemoteActionCompatParcelizer() {
        Integer num = (Integer) this.MediaDescriptionCompat.read(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int read() {
        Integer num = (Integer) this.MediaDescriptionCompat.read(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
