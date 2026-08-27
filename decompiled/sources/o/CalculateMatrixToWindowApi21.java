package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class CalculateMatrixToWindowApi21 {
    public final int RemoteActionCompatParcelizer;
    public final PointF write;

    public CalculateMatrixToWindowApi21(int i, PointF pointF) {
        this.RemoteActionCompatParcelizer = i;
        this.write = pointF;
    }

    public final String toString() {
        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp("FaceLandmark");
        accessgettvteletextcp.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "type");
        accessgettvteletextcp.write(this.write, "position");
        return accessgettvteletextcp.toString();
    }
}
