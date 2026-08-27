package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setRevenue extends setAdRevenuePlacement {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final boolean RemoteActionCompatParcelizer;
    public final String serializer;

    public setRevenue(String str, boolean z) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + (this.serializer.hashCode() * 31);
        int i4 = write + 51;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRevenue)) {
            int i4 = i3 + 73;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        setRevenue setrevenue = (setRevenue) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setrevenue.serializer}, getCieXyz.write())).booleanValue())) {
            return this.RemoteActionCompatParcelizer == setrevenue.RemoteActionCompatParcelizer;
        }
        int i5 = write + 35;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NonRetryableError(message=" + this.serializer + ", shouldRequestPermission=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
