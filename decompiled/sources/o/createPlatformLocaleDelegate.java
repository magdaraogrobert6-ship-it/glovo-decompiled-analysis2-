package o;

/* JADX INFO: loaded from: classes3.dex */
public final class createPlatformLocaleDelegate extends createPrecomposedSlotHandle {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final accessgetGocp RemoteActionCompatParcelizer;
    public final String read;

    public final accessgetGocp serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        accessgetGocp accessgetgocp = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 43;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetgocp;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 83;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public createPlatformLocaleDelegate(accessgetGocp accessgetgocp, String str) {
        accessgetgocp.getClass();
        str.getClass();
        this.RemoteActionCompatParcelizer = accessgetgocp;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = IconCompatParcelizer + 115;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigationWithMode(destination=" + this.RemoteActionCompatParcelizer + ", mode=" + this.read + ")";
        int i2 = IconCompatParcelizer + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 69;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof createPlatformLocaleDelegate))) {
            createPlatformLocaleDelegate createplatformlocaledelegate = (createPlatformLocaleDelegate) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, createplatformlocaledelegate.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, createplatformlocaledelegate.read}, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 5;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 == 0;
            }
            int i5 = serializer + 105;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i6 = serializer + 19;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
