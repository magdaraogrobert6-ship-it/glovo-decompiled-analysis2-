package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getActivityHandler extends AdjustEventSuccess {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final getGdprUrl IconCompatParcelizer;

    public getActivityHandler(getGdprUrl getgdprurl) {
        this.IconCompatParcelizer = getgdprurl;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = serializer + 119;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBarState=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj || ((obj instanceof getActivityHandler) && !(!this.IconCompatParcelizer.equals(((getActivityHandler) obj).IconCompatParcelizer)))) {
            return true;
        }
        int i3 = serializer + 59;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
