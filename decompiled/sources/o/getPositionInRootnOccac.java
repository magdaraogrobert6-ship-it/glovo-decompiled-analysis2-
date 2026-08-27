package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getPositionInRootnOccac extends ThrottledCallbacks {
    private static int read = 0;
    private static int serializer = 1;
    public final Throwable IconCompatParcelizer;

    public getPositionInRootnOccac(Throwable th) {
        th.getClass();
        this.IconCompatParcelizer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = read + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Error(error=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getPositionInRootnOccac) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((getPositionInRootnOccac) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            int i2 = serializer + 63;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        int i3 = serializer + 95;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
