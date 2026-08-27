package o;

/* JADX INFO: loaded from: classes3.dex */
public final class displayCustomViewInline extends clearCompatExtraKeys {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String serializer;

    public displayCustomViewInline(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = Integer.hashCode(-1) + ((ddefault.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
        int i4 = RemoteActionCompatParcelizer + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 63;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if ((obj instanceof displayCustomViewInline) && this.serializer.equals(((displayCustomViewInline) obj).serializer)) {
            ddefault ddefaultVar = ddefault.serializer;
            return true;
        }
        int i6 = RemoteActionCompatParcelizer + 115;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HideLoadingAndShowSnackBar(message=" + this.serializer + ", snackbarType=" + ddefault.IconCompatParcelizer + ", duration=-1)";
        int i2 = read + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
