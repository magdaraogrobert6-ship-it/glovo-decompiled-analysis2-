package o;

import android.graphics.Point;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesImplonExit1 {
    public final int IconCompatParcelizer;
    public final Point RemoteActionCompatParcelizer;
    public final int read;

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public FocusPropertiesImplonExit1(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FocusPropertiesImplonExit1)) {
            return false;
        }
        FocusPropertiesImplonExit1 focusPropertiesImplonExit1 = (FocusPropertiesImplonExit1) obj;
        return this.read == focusPropertiesImplonExit1.read && this.IconCompatParcelizer == focusPropertiesImplonExit1.IconCompatParcelizer && this.RemoteActionCompatParcelizer.equals(focusPropertiesImplonExit1.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.read;
        return this.RemoteActionCompatParcelizer.hashCode() + (((i * 31) + this.IconCompatParcelizer) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.read;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i == 2) {
            str = "BottomRight";
        } else if (i != 3) {
            str = "Invalid";
        } else {
            str = "BottomLeft";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", center=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
