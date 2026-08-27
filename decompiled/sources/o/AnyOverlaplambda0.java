package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AnyOverlaplambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String serializer;

    public AnyOverlaplambda0(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.serializer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Integer.hashCode(-1) - ((ddefault.serializer.hashCode() >>> (this.serializer.hashCode() - 124)) - 55);
        } else {
            iHashCode = Integer.hashCode(-1) + ((ddefault.serializer.hashCode() + (this.serializer.hashCode() * 31)) * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 5;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 117;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof AnyOverlaplambda0) || !this.serializer.equals(((AnyOverlaplambda0) obj).serializer)) {
            return false;
        }
        ddefault ddefaultVar = ddefault.serializer;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackbar(message=" + this.serializer + ", snackbarType=" + ddefault.serializer + ", duration=-1)";
        int i2 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
