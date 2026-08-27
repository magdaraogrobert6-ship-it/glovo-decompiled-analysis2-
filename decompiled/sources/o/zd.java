package o;

/* JADX INFO: loaded from: classes3.dex */
public final class zd extends za {
    private static int read = 1;
    private static int write;
    public final double IconCompatParcelizer;

    public zd(double d) {
        this.IconCompatParcelizer = d;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = Double.hashCode(this.IconCompatParcelizer);
            int i3 = 3 / 0;
        } else {
            iHashCode = Double.hashCode(this.IconCompatParcelizer);
        }
        int i4 = read + 37;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Distance(value=" + this.IconCompatParcelizer + ")";
        int i2 = write + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            return (obj instanceof zd) && Double.compare(this.IconCompatParcelizer, ((zd) obj).IconCompatParcelizer) == 0;
        }
        int i4 = i3 + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
