package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getGdprUrl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String write;

    public getGdprUrl(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (ddefault.IconCompatParcelizer.hashCode() * 31);
        int i4 = serializer + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getGdprUrl) {
            ddefault ddefaultVar = ddefault.serializer;
            if (this.write.equals(((getGdprUrl) obj).write)) {
                return true;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 5;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SnackBarState(snackBarType=" + ddefault.IconCompatParcelizer + ", message=" + this.write + ")";
        int i2 = serializer + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
