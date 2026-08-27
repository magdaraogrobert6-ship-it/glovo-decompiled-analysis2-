package androidx.compose.ui.graphics;

import coil3.util.UtilsKt;
import java.util.Arrays;
import o.MediaSessionCompatQueueItem;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes4.dex */
public final class PathSegment {
    public static final int $stable = 8;
    private final float[] points;
    private final Type type;
    private final float weight;

    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    public final float[] getPoints() {
        return this.points;
    }

    public final Type getType() {
        return this.type;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode();
        return Float.hashCode(this.weight) + ((Arrays.hashCode(this.points) + (iHashCode * 31)) * 31);
    }

    public PathSegment(Type type, float[] fArr, float f) {
        this.type = type;
        this.points = fArr;
        this.weight = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.type);
        sb.append(", points=");
        String string = Arrays.toString(this.points);
        string.getClass();
        sb.append(string);
        sb.append(", weight=");
        return MediaSessionCompatQueueItem.serializer(sb, this.weight, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight) {
                return true;
            }
        }
        return false;
    }
}
