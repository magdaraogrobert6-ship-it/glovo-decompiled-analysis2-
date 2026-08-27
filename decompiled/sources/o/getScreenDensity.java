package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getScreenDensity extends getPackageName {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final deepCopy RemoteActionCompatParcelizer;
    public final String write;

    public getScreenDensity(String str, deepCopy deepcopy) {
        str.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = deepcopy;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.write.hashCode();
        deepCopy deepcopy = this.RemoteActionCompatParcelizer;
        if (deepcopy == null) {
            iHashCode = 0;
        } else {
            iHashCode = deepcopy.hashCode();
            int i2 = IconCompatParcelizer + 83;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = serializer + 79;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RiderOnPause(description=" + this.write + ", action=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getScreenDensity) {
            getScreenDensity getscreendensity = (getScreenDensity) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getscreendensity.write}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getscreendensity.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 123;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 107;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return z;
            }
            throw null;
        }
        int i5 = IconCompatParcelizer + 107;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
