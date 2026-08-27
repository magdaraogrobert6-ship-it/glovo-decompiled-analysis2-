package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getGranularOptions extends setStoreAppId {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final String read;

    public getGranularOptions(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.read = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.read.hashCode() * (ddefault.IconCompatParcelizer.hashCode() - 65);
        } else {
            iHashCode = this.read.hashCode() + (ddefault.IconCompatParcelizer.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 47;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            int i4 = 15 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof getGranularOptions) {
            ddefault ddefaultVar = ddefault.serializer;
            if (this.read.equals(((getGranularOptions) obj).read)) {
                return true;
            }
        } else {
            int i5 = i3 + 75;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBarType=" + ddefault.IconCompatParcelizer + ", message=" + this.read + ")";
        int i2 = IconCompatParcelizer + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
