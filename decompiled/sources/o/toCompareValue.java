package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class toCompareValue {
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public final int read() {
        return this.serializer - this.RemoteActionCompatParcelizer;
    }

    public final int serializer() {
        return this.read - this.write;
    }

    static {
        new toCompareValue(0, 0, 0, 0);
    }

    public toCompareValue(int i, int i2, int i3, int i4) {
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = i3;
        this.serializer = i4;
        if (i > i3) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i, "Left must be less than or equal to right, left: ", i3, ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i2, "top must be less than or equal to bottom, top: ", i4, ", bottom: "));
        throw null;
    }

    public final int hashCode() {
        int i = this.write;
        int i2 = this.RemoteActionCompatParcelizer;
        return (((((i * 31) + i2) * 31) + this.read) * 31) + this.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.write);
        sb.append(',');
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(',');
        sb.append(this.read);
        sb.append(',');
        return af$$ExternalSyntheticOutline0.m(this.serializer, "] }", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!toCompareValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        toCompareValue tocomparevalue = (toCompareValue) obj;
        return this.write == tocomparevalue.write && this.RemoteActionCompatParcelizer == tocomparevalue.RemoteActionCompatParcelizer && this.read == tocomparevalue.read && this.serializer == tocomparevalue.serializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public toCompareValue(android.graphics.Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
