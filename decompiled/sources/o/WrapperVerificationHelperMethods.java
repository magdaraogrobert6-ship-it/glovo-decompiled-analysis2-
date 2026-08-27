package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class WrapperVerificationHelperMethods extends Lab {
    public android.graphics.Path serializer;
    public final Lab write;

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final void write() {
        boolean z;
        Object obj;
        Object obj2 = this.RatingCompat;
        Object obj3 = this.MediaSessionCompatToken;
        if (obj2 == null || obj3 == null) {
            z = false;
        } else {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (obj3 == null || (obj = this.RatingCompat) == null || z) {
            return;
        }
        PointF pointF2 = (PointF) obj3;
        PointF pointF3 = (PointF) obj;
        Lab lab = this.write;
        PointF pointF4 = lab.MediaBrowserCompatMediaItem;
        PointF pointF5 = lab.MediaSessionCompatResultReceiverWrapper;
        android.graphics.Matrix matrix = newD50Xyzui_graphics.write;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(pointF2.x, pointF2.y);
        if (pointF4 == null || pointF5 == null || (pointF4.length() == 0.0f && pointF5.length() == 0.0f)) {
            path.lineTo(pointF3.x, pointF3.y);
        } else {
            float f = pointF2.x;
            float f2 = pointF4.x;
            float f3 = pointF2.y;
            float f4 = pointF4.y;
            float f5 = pointF3.x;
            float f6 = pointF5.x;
            float f7 = pointF3.y;
            path.cubicTo(f2 + f, f3 + f4, f5 + f6, f7 + pointF5.y, f5, f7);
        }
        this.serializer = path;
    }

    public WrapperVerificationHelperMethods(StrokeJoinCompanion strokeJoinCompanion, Lab lab) {
        super(strokeJoinCompanion, (PointF) lab.MediaSessionCompatToken, (PointF) lab.RatingCompat, lab.MediaSessionCompatQueueItem, lab.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, lab.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, lab.PlaybackStateCompatCustomAction, lab.read);
        this.write = lab;
        write();
    }
}
