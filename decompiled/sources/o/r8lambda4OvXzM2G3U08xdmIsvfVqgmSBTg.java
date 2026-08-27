package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final androidx.compose.ui.text.AnnotatedString RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final boolean write;

    public r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg(androidx.compose.ui.text.AnnotatedString annotatedString, String str, String str2, boolean z) {
        annotatedString.getClass();
        this.RemoteActionCompatParcelizer = annotatedString;
        this.serializer = str;
        this.read = str2;
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.write) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.serializer), 31, this.read);
        int i4 = IconCompatParcelizer + 39;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AppVersionState(versionText=" + ((Object) this.RemoteActionCompatParcelizer) + ", updateLabelText=" + this.serializer + ", updateButtonText=" + this.read + ", isNewVersionAvailable=" + this.write + ")";
        int i2 = MediaMetadataCompat + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 61;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 0 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg) {
            r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg = (r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg) obj;
            Object[] objArr = {this.RemoteActionCompatParcelizer, r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                i = MediaMetadataCompat + 73;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else if (this.serializer.equals(r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg.serializer)) {
                if (!this.read.equals(r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg.read)) {
                    i = IconCompatParcelizer + 31;
                    MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else if (this.write == r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg.write) {
                    return true;
                }
            }
            int i5 = i % 2;
        }
        return false;
    }
}
