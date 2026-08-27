package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class getMaxValue {
    public final PointF RemoteActionCompatParcelizer;
    public final PointF read;
    public final PointF write;

    public final String toString() {
        PointF pointF = this.read;
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = this.write;
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        PointF pointF3 = this.RemoteActionCompatParcelizer;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public getMaxValue() {
        this.write = new PointF();
        this.RemoteActionCompatParcelizer = new PointF();
        this.read = new PointF();
    }

    public getMaxValue(PointF pointF, PointF pointF2, PointF pointF3) {
        this.write = pointF;
        this.RemoteActionCompatParcelizer = pointF2;
        this.read = pointF3;
    }
}
