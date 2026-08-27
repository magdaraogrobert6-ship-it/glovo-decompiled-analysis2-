package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setContentType {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final boolean IconCompatParcelizer;
    public final generatePOSTBodyString write;

    public setContentType(boolean z, generatePOSTBodyString generatepostbodystring) {
        this.IconCompatParcelizer = z;
        this.write = generatepostbodystring;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.IconCompatParcelizer);
        generatePOSTBodyString generatepostbodystring = this.write;
        if (generatepostbodystring == null) {
            int i4 = read + 113;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = generatepostbodystring.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 63;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setContentType)) {
            return false;
        }
        setContentType setcontenttype = (setContentType) obj;
        if (this.IconCompatParcelizer == setcontenttype.IconCompatParcelizer) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setcontenttype.write}, getCieXyz.write())).booleanValue();
        }
        int i4 = read + 67;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LogoutUiState(isLoading=" + this.IconCompatParcelizer + ", logoutPopupEntity=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
