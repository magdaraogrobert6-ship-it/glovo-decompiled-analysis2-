package androidx.compose.ui.graphics;

import bo.app.af$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public class Interval<T> {
    public static final int $stable = 0;
    private final T data;
    private final float end;
    private final float start;

    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public final boolean contains(float f) {
        return f <= this.end && this.start <= f;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.end, Float.hashCode(this.start) * 31, 31);
        T t = this.data;
        return iM + (t != null ? t.hashCode() : 0);
    }

    public final boolean overlaps(Interval<T> interval) {
        return this.start <= interval.end && this.end >= interval.start;
    }

    public Interval(float f, float f2, T t) {
        this.start = f;
        this.end = f2;
        this.data = t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", data=");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, (Object) this.data, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            if (this.start == interval.start && this.end == interval.end) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, interval.data}, getCieXyz.write())).booleanValue();
            }
        }
        return false;
    }

    public /* synthetic */ Interval(float f, float f2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? null : obj);
    }

    public final boolean overlaps(float f, float f2) {
        return this.start <= f2 && this.end >= f;
    }
}
