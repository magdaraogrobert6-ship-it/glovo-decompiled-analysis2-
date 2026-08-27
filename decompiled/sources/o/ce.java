package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ce extends cc {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final bindString write;

    public ce(bindString bindstring) {
        this.write = bindstring;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 31;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.write.hashCode();
            int i3 = 97 / 0;
        } else {
            iHashCode = this.write.hashCode();
        }
        int i4 = read + 105;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowResolvableMobileServicesErrorDialog(error=" + this.write + ")";
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this != obj && (!(obj instanceof ce) || !this.write.equals(((ce) obj).write))) {
            return false;
        }
        int i3 = read + 67;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return true;
    }
}
