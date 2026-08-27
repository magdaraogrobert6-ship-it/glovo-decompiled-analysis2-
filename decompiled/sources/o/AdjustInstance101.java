package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstance101 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final int read;

    public AdjustInstance101(String str, int i) {
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 25;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = Integer.hashCode(this.read);
            i = iHashCode2 >>> 64;
        } else {
            int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = Integer.hashCode(this.read);
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdjustInstance101) {
            AdjustInstance101 adjustInstance101 = (AdjustInstance101) obj;
            if (this.RemoteActionCompatParcelizer.equals(adjustInstance101.RemoteActionCompatParcelizer) && this.read == adjustInstance101.read) {
                return true;
            }
        }
        int i4 = IconCompatParcelizer + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowOnMapButton(text=" + this.RemoteActionCompatParcelizer + ", zoneId=" + this.read + ")";
        int i2 = IconCompatParcelizer + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
