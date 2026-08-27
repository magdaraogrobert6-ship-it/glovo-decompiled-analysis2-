package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambda9WZGo8jxmhcanMko0p70vdir2pY {
    public boolean IconCompatParcelizer;
    public PointF RemoteActionCompatParcelizer;
    public final ArrayList serializer;

    public r8lambda9WZGo8jxmhcanMko0p70vdir2pY(PointF pointF, boolean z, List list) {
        this.RemoteActionCompatParcelizer = pointF;
        this.IconCompatParcelizer = z;
        this.serializer = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.serializer.size());
        sb.append("closed=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.IconCompatParcelizer, '}');
    }

    public final void IconCompatParcelizer(float f, float f2) {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new PointF();
        }
        this.RemoteActionCompatParcelizer.set(f, f2);
    }

    public r8lambda9WZGo8jxmhcanMko0p70vdir2pY() {
        this.serializer = new ArrayList();
    }
}
