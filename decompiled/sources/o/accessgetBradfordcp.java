package o;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetBradfordcp extends getTextureCoordinates {
    public final android.graphics.PathMeasure MediaDescriptionCompat;
    public WrapperVerificationHelperMethods MediaMetadataCompat;
    public final PointF MediaSessionCompatQueueItem;
    public final float[] MediaSessionCompatToken;
    public final float[] PlaybackStateCompatCustomAction;

    @Override // o.getColors
    public final Object RemoteActionCompatParcelizer(Lab lab, float f) {
        WrapperVerificationHelperMethods wrapperVerificationHelperMethods = (WrapperVerificationHelperMethods) lab;
        android.graphics.Path path = wrapperVerificationHelperMethods.serializer;
        if (path == null) {
            return (PointF) lab.MediaSessionCompatToken;
        }
        WrapperVerificationHelperMethods wrapperVerificationHelperMethods2 = this.MediaMetadataCompat;
        android.graphics.PathMeasure pathMeasure = this.MediaDescriptionCompat;
        if (wrapperVerificationHelperMethods2 != wrapperVerificationHelperMethods) {
            pathMeasure.setPath(path, false);
            this.MediaMetadataCompat = wrapperVerificationHelperMethods;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.PlaybackStateCompatCustomAction;
        float[] fArr2 = this.MediaSessionCompatToken;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        float f3 = fArr[0];
        float f4 = fArr[1];
        PointF pointF = this.MediaSessionCompatQueueItem;
        pointF.set(f3, f4);
        if (f2 < 0.0f) {
            pointF.offset(fArr2[0] * f2, fArr2[1] * f2);
            return pointF;
        }
        if (f2 > length) {
            float f5 = f2 - length;
            pointF.offset(fArr2[0] * f5, fArr2[1] * f5);
        }
        return pointF;
    }

    public accessgetBradfordcp(ArrayList arrayList) {
        super(arrayList);
        this.MediaSessionCompatQueueItem = new PointF();
        this.PlaybackStateCompatCustomAction = new float[2];
        this.MediaSessionCompatToken = new float[2];
        this.MediaDescriptionCompat = new android.graphics.PathMeasure();
    }
}
