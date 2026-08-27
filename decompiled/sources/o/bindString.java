package o;

/* JADX INFO: loaded from: classes3.dex */
public final class bindString extends bindBytes {
    private static int read = 0;
    private static int write = 1;
    public final bindLong IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;

    public bindString(int i, bindLong bindlong) {
        bindlong.getClass();
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = bindlong;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() - (Integer.hashCode(this.RemoteActionCompatParcelizer) >> 24);
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode() + (Integer.hashCode(this.RemoteActionCompatParcelizer) * 31);
        }
        int i3 = write + 81;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 57;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof bindString)) {
            return false;
        }
        bindString bindstring = (bindString) obj;
        if (this.RemoteActionCompatParcelizer == bindstring.RemoteActionCompatParcelizer) {
            return this.IconCompatParcelizer == bindstring.IconCompatParcelizer;
        }
        int i4 = write + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ResolvableError(errorStatus=" + this.RemoteActionCompatParcelizer + ", mobileServiceType=" + this.IconCompatParcelizer + ")";
        int i2 = read + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
