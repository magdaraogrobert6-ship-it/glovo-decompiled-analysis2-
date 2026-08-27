package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setBitmap extends getMaximumBitmapWidth {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String read;
    public final ddefault write;

    public setBitmap(String str, ddefault ddefaultVar) {
        str.getClass();
        this.read = str;
        this.write = ddefaultVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int iHashCode2 = Integer.hashCode(-1) + ((this.write.hashCode() + (iHashCode * 31)) * 31);
        int i4 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(message=" + this.read + ", snackbarType=" + this.write + ", duration=-1)";
        int i2 = IconCompatParcelizer + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 25;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 103;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 54 / 0;
            }
            return true;
        }
        if (obj instanceof setBitmap) {
            setBitmap setbitmap = (setBitmap) obj;
            Object[] objArr = {this.read, setbitmap.read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.write.equals(setbitmap.write)) {
                return true;
            }
        }
        return false;
    }
}
