package o;

/* JADX INFO: loaded from: classes3.dex */
public final class f6 {
    private static int read = 0;
    private static int serializer = 1;
    public final double IconCompatParcelizer;
    public final double RemoteActionCompatParcelizer;
    public final fc write;

    public f6(fc fcVar, double d, double d2) {
        fcVar.getClass();
        this.write = fcVar;
        this.RemoteActionCompatParcelizer = d;
        this.IconCompatParcelizer = d2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write.hashCode() * 31, 31) + Double.hashCode(this.IconCompatParcelizer);
        }
        return Double.hashCode(this.IconCompatParcelizer) >> r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write.hashCode() >> 71, 67);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            int i2 = serializer + 3;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        f6 f6Var = (f6) obj;
        if (this.write != f6Var.write) {
            int i3 = read + 11;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (Double.compare(this.RemoteActionCompatParcelizer, f6Var.RemoteActionCompatParcelizer) != 0) {
            return false;
        }
        if (Double.compare(this.IconCompatParcelizer, f6Var.IconCompatParcelizer) == 0) {
            return true;
        }
        int i5 = serializer + 65;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "IconAnchor(type=" + this.write + ", horizontalOffset=" + this.RemoteActionCompatParcelizer + ", verticalOffset=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return str;
    }
}
