package o;

import com.sentiance.okhttp3.u$a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o read = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(3);
    public final List write;

    public final int hashCode() {
        return (this.write.hashCode() ^ 16777619) * (-2128831035);
    }

    public r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog(u$a u_a) {
        this.write = Collections.unmodifiableList(u_a.IconCompatParcelizer);
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read(new StringBuilder("TimelineUpdateEvent{timelines="), this.write, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog)) {
            return false;
        }
        Object obj2 = ((r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog) obj).write;
        List list = this.write;
        return list == obj2 || list.equals(obj2);
    }
}
