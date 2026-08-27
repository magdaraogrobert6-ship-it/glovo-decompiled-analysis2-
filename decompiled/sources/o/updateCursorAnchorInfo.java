package o;

/* JADX INFO: loaded from: classes3.dex */
public final class updateCursorAnchorInfo {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final getLogoDescription IconCompatParcelizer;
    public final Float read;

    public updateCursorAnchorInfo(getLogoDescription getlogodescription, Float f) {
        this.IconCompatParcelizer = getlogodescription;
        this.read = f;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        Float f = this.read;
        if (f == null) {
            int i4 = RemoteActionCompatParcelizer + 89;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = f.hashCode();
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = RemoteActionCompatParcelizer + 59;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return i6;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (obj instanceof updateCursorAnchorInfo) {
                updateCursorAnchorInfo updatecursoranchorinfo = (updateCursorAnchorInfo) obj;
                if (this.IconCompatParcelizer != updatecursoranchorinfo.IconCompatParcelizer) {
                    int i4 = i2 + 87;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 == 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, updatecursoranchorinfo.read}, getCieXyz.write())).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BackCameraSpec(selector=" + this.IconCompatParcelizer + ", minFocalLengthMm=" + this.read + ")";
        int i2 = serializer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
