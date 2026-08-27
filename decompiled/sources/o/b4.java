package o;

/* JADX INFO: loaded from: classes3.dex */
public final class b4 extends b2ExternalSyntheticLambda15 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final isInitialized write;

    public b4(isInitialized isinitialized) {
        this.write = isinitialized;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = IconCompatParcelizer + 111;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackbarFromHost(snackbar=" + this.write + ")";
        int i2 = IconCompatParcelizer + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b4) && this.write.equals(((b4) obj).write)) {
            return true;
        }
        int i4 = serializer + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
