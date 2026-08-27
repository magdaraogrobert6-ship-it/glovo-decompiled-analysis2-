package o;

import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public abstract class setLayoutInflater {
    public Rational RemoteActionCompatParcelizer;

    public final setLayoutResource serializer(float f, float f2, float f3) {
        PointF pointF;
        backgrounddefault backgrounddefaultVar = (backgrounddefault) this;
        float[] fArr = {f, f2};
        synchronized (backgrounddefaultVar) {
            android.graphics.Matrix matrix = backgrounddefaultVar.serializer;
            if (matrix == null) {
                pointF = backgrounddefault.IconCompatParcelizer;
            } else {
                matrix.mapPoints(fArr);
                pointF = new PointF(fArr[0], fArr[1]);
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.RemoteActionCompatParcelizer;
        setLayoutResource setlayoutresource = new setLayoutResource();
        setlayoutresource.RemoteActionCompatParcelizer = f4;
        setlayoutresource.serializer = f5;
        setlayoutresource.IconCompatParcelizer = f3;
        setlayoutresource.read = rational;
        return setlayoutresource;
    }
}
