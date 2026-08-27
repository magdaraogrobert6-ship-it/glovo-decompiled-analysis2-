package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getPlatformLocale extends createPrecomposedSlotHandle {
    private static int read = 0;
    private static int serializer = 1;
    public final accessgetGocp write;

    public final accessgetGocp read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 61;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        accessgetGocp accessgetgocp = this.write;
        int i4 = i2 + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accessgetgocp;
    }

    public getPlatformLocale(accessgetGocp accessgetgocp) {
        accessgetgocp.getClass();
        this.write = accessgetgocp;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = serializer + 69;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Display(destination=" + this.write + ")";
        int i2 = serializer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 15;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPlatformLocale)) {
            int i4 = i2 + 17;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr = {this.write, ((getPlatformLocale) obj).write};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = read + 75;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
