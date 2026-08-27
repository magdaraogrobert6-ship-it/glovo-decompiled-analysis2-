package o;

/* JADX INFO: loaded from: classes3.dex */
public final class copyNs73l9s {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String RemoteActionCompatParcelizer;
    public final FocusGroupPropertiesNodeonExit1 write;

    public copyNs73l9s(String str, FocusGroupPropertiesNodeonExit1 focusGroupPropertiesNodeonExit1) {
        str.getClass();
        focusGroupPropertiesNodeonExit1.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = focusGroupPropertiesNodeonExit1;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = IconCompatParcelizer + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DeclineParams(url=" + this.RemoteActionCompatParcelizer + ", data=" + this.write + ")";
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof copyNs73l9s) {
            copyNs73l9s copyns73l9s = (copyNs73l9s) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, copyns73l9s.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 39;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, copyns73l9s.write}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i4 = read + 3;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = read + 101;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
