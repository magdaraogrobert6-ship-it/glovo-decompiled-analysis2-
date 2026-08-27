package o;

/* JADX INFO: loaded from: classes3.dex */
public final class zb extends za {
    private static int read = 0;
    private static int write = 1;
    public final double IconCompatParcelizer;

    public zb(double d) {
        this.IconCompatParcelizer = d;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.IconCompatParcelizer);
        int i4 = write + 77;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Tips(value=" + this.IconCompatParcelizer + ")";
        int i2 = read + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof zb) {
                if (Double.compare(this.IconCompatParcelizer, ((zb) obj).IconCompatParcelizer) == 0) {
                    return true;
                }
                int i2 = write + 53;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = read + 5;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = read + 121;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
