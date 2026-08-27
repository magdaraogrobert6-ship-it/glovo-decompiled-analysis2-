package o;

import android.graphics.PointF;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getTransformui_graphics extends getTextureCoordinates {
    public final /* synthetic */ int MediaSessionCompatQueueItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getTransformui_graphics(List list, int i) {
        super(list);
        this.MediaSessionCompatQueueItem = i;
    }

    public static float IconCompatParcelizer(Lab lab, float f) {
        Object obj = lab.MediaSessionCompatToken;
        if (obj == null || lab.RatingCompat == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing values for keyframe.");
            return 0.0f;
        }
        if (lab.ParcelableVolumeInfo == -3987645.8f) {
            lab.ParcelableVolumeInfo = ((Float) obj).floatValue();
        }
        float f2 = lab.ParcelableVolumeInfo;
        if (lab.MediaDescriptionCompat == -3987645.8f) {
            lab.MediaDescriptionCompat = ((Float) lab.RatingCompat).floatValue();
        }
        return getD50.serializer(f2, lab.MediaDescriptionCompat, f);
    }

    public int read(Lab lab, float f) {
        if (lab.MediaSessionCompatToken != null && lab.RatingCompat != null) {
            return Illuminant.serializer(getD50.IconCompatParcelizer(f, 0.0f, 1.0f), ((Integer) lab.MediaSessionCompatToken).intValue(), ((Integer) lab.RatingCompat).intValue());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing values for keyframe.");
        return 0;
    }

    @Override // o.getColors
    public final Object RemoteActionCompatParcelizer(Lab lab, float f) {
        Object obj;
        int i;
        int i2 = this.MediaSessionCompatQueueItem;
        if (i2 == 0) {
            return (f != 1.0f || (obj = lab.RatingCompat) == null) ? (getMinValue) lab.MediaSessionCompatToken : (getMinValue) obj;
        }
        if (i2 == 1) {
            return Integer.valueOf(read(lab, f));
        }
        if (i2 == 2) {
            return Float.valueOf(IconCompatParcelizer(lab, f));
        }
        Object obj2 = lab.MediaSessionCompatToken;
        if (obj2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing values for keyframe.");
            return null;
        }
        Object obj3 = lab.RatingCompat;
        if (obj3 == null) {
            if (lab.ResultReceiver == 784923401) {
                lab.ResultReceiver = ((Integer) obj2).intValue();
            }
            i = lab.ResultReceiver;
        } else {
            if (lab.MediaMetadataCompat == 784923401) {
                lab.MediaMetadataCompat = ((Integer) obj3).intValue();
            }
            i = lab.MediaMetadataCompat;
        }
        if (lab.ResultReceiver == 784923401) {
            lab.ResultReceiver = ((Integer) obj2).intValue();
        }
        int i3 = lab.ResultReceiver;
        PointF pointF = getD50.write;
        return Integer.valueOf((int) ((f * (i - i3)) + i3));
    }

    public float write() {
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        return IconCompatParcelizer(this.read.MediaDescriptionCompat(), serializer());
    }
}
