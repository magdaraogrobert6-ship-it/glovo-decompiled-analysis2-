package o;

import android.graphics.PointF;
import android.os.Build;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class drawOval implements Iterator, displayInAppMessagelambda121 {
    public final drawPath serializer;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer.write();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PointF[] pointFArr;
        drawPath drawpath = this.serializer;
        float[] fArr = drawpath.write;
        drawRawPointsO7TthRY drawrawpointso7tthryRemoteActionCompatParcelizer = drawpath.RemoteActionCompatParcelizer(fArr, 0);
        if (drawrawpointso7tthryRemoteActionCompatParcelizer == drawRawPointsO7TthRY.Done) {
            return save.IconCompatParcelizer;
        }
        if (drawrawpointso7tthryRemoteActionCompatParcelizer == drawRawPointsO7TthRY.Close) {
            return save.RemoteActionCompatParcelizer;
        }
        float f = drawrawpointso7tthryRemoteActionCompatParcelizer == drawRawPointsO7TthRY.Conic ? fArr[6] : 0.0f;
        int i = drawRoundRect.read[drawrawpointso7tthryRemoteActionCompatParcelizer.ordinal()];
        if (i == 1) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1])};
        } else if (i == 2) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])};
        } else if (i == 3 || i == 4) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])};
        } else {
            pointFArr = i != 5 ? new PointF[0] : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])};
        }
        return new drawRect(drawrawpointso7tthryRemoteActionCompatParcelizer, pointFArr, f);
    }

    public drawOval(android.graphics.Path path, drawImageRectHPBpro0 drawimagerecthpbpro0, float f) {
        path.getClass();
        drawimagerecthpbpro0.getClass();
        this.serializer = Build.VERSION.SDK_INT >= 34 ? new drawImaged4ec7I(path, drawimagerecthpbpro0, f) : new androidx.graphics.path.PathIteratorPreApi34Impl(path, drawimagerecthpbpro0, f);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
