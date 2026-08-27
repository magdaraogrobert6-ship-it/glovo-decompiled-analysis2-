package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getLiveRegion implements getIsTraversalGroup {
    private static int read = 0;
    private static int serializer = 1;
    public final Throwable IconCompatParcelizer;

    public getLiveRegion(Throwable th) {
        this.IconCompatParcelizer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = serializer + 27;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Failure(error=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj && (!(obj instanceof getLiveRegion) || !this.IconCompatParcelizer.equals(((getLiveRegion) obj).IconCompatParcelizer))) {
            return false;
        }
        int i4 = read + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
