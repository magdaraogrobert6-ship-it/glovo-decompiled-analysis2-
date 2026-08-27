package o;

import android.graphics.PointF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class drawRect {
    public final float RemoteActionCompatParcelizer;
    public final drawRawPointsO7TthRY read;
    public final PointF[] write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return Float.hashCode(this.RemoteActionCompatParcelizer) + (((iHashCode * 31) + Arrays.hashCode(this.write)) * 31);
    }

    public drawRect(drawRawPointsO7TthRY drawrawpointso7tthry, PointF[] pointFArr, float f) {
        drawrawpointso7tthry.getClass();
        this.read = drawrawpointso7tthry;
        this.write = pointFArr;
        this.RemoteActionCompatParcelizer = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.read);
        sb.append(", points=");
        String string = Arrays.toString(this.write);
        string.getClass();
        sb.append(string);
        sb.append(", weight=");
        return MediaSessionCompatQueueItem.serializer(sb, this.RemoteActionCompatParcelizer, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!drawRect.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        drawRect drawrect = (drawRect) obj;
        return this.read == drawrect.read && Arrays.equals(this.write, drawrect.write) && this.RemoteActionCompatParcelizer == drawrect.RemoteActionCompatParcelizer;
    }
}
