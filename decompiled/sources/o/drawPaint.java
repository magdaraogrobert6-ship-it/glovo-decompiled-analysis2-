package o;

/* JADX INFO: loaded from: classes3.dex */
public final class drawPaint extends drawPosText {
    private static int read = 0;
    private static int serializer = 1;
    public final getDrawFilter write;

    public drawPaint(getDrawFilter getdrawfilter) {
        getdrawfilter.getClass();
        this.write = getdrawfilter;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode();
            int i3 = 19 / 0;
        } else {
            iHashCode = this.write.hashCode();
        }
        int i4 = serializer + 51;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Selected(location=" + this.write + ")";
        int i2 = read + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 47;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof drawPaint) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((drawPaint) obj).write}, getCieXyz.write())).booleanValue();
        }
        int i4 = i2 + 25;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
