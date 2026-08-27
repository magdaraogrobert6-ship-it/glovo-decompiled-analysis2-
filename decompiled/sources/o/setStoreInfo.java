package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setStoreInfo {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final boolean read;
    public final boolean serializer;

    public setStoreInfo(boolean z, boolean z2) {
        this.read = z;
        this.serializer = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.serializer) >>> (Boolean.hashCode(this.read) / 17);
        }
        return (Boolean.hashCode(this.read) * 31) + Boolean.hashCode(this.serializer);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 67;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setStoreInfo)) {
            return false;
        }
        setStoreInfo setstoreinfo = (setStoreInfo) obj;
        if (this.read == setstoreinfo.read) {
            if (this.serializer == setstoreinfo.serializer) {
                return true;
            }
            int i4 = write + 77;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 43;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShiftExtension(isShiftExtensionAllowed=" + this.read + ", isShiftExtensionRequestedByRider=" + this.serializer + ")";
        int i2 = write + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
