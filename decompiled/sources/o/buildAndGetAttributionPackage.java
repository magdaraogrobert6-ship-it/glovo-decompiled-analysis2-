package o;

/* JADX INFO: loaded from: classes3.dex */
public final class buildAndGetAttributionPackage extends checkDeeplinkInSessionResponseI {
    private static int serializer = 0;
    private static int write = 1;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public buildAndGetAttributionPackage(boolean z, String str) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (Boolean.hashCode(this.IconCompatParcelizer) * 31);
        int i4 = serializer + 33;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 47;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof buildAndGetAttributionPackage) {
            buildAndGetAttributionPackage buildandgetattributionpackage = (buildAndGetAttributionPackage) obj;
            if (this.IconCompatParcelizer != buildandgetattributionpackage.IconCompatParcelizer) {
                int i4 = i2 + 27;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 5;
                }
            } else if (this.RemoteActionCompatParcelizer.equals(buildandgetattributionpackage.RemoteActionCompatParcelizer)) {
                return true;
            }
        }
        int i6 = write + 11;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 77 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Displayable(isPaused=" + this.IconCompatParcelizer + ", buttonText=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
