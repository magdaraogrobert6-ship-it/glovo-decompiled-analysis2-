package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getContentCardUnviewedCount {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final getDeviceIdAsync read;

    public getContentCardUnviewedCount(getDeviceIdAsync getdeviceidasync) {
        getdeviceidasync.getClass();
        this.read = getdeviceidasync;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = IconCompatParcelizer + 83;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof getContentCardUnviewedCount))) {
                if (this.read == ((getContentCardUnviewedCount) obj).read) {
                    return true;
                }
                int i2 = IconCompatParcelizer + 103;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = serializer + 105;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
            }
            return false;
        }
        int i5 = IconCompatParcelizer + 27;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorReviewConfigRequestParams(scoreType=" + this.read + ")";
        int i2 = serializer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
