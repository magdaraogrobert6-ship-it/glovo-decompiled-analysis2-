package o;

/* JADX INFO: loaded from: classes3.dex */
public final class trackAdRevenue extends setAskingAttribution {
    private static int read = 1;
    private static int serializer;
    public final boolean write;

    public trackAdRevenue(boolean z) {
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Boolean.hashCode(this.write);
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.write);
        int i3 = serializer + 113;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("UpdateLoading(showLoading=", ")", this.write);
        int i4 = read + 115;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strSerializer;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 117;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj || ((obj instanceof trackAdRevenue) && this.write == ((trackAdRevenue) obj).write)) {
            return true;
        }
        int i4 = i2 + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
