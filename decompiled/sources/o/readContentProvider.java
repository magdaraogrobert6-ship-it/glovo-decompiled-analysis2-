package o;

/* JADX INFO: loaded from: classes3.dex */
public final class readContentProvider {
    private static int serializer = 0;
    private static int write = 1;
    public final hasNotBeenRead IconCompatParcelizer;
    public final boolean read;

    public readContentProvider(hasNotBeenRead hasnotbeenread, boolean z) {
        this.IconCompatParcelizer = hasnotbeenread;
        this.read = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.read) + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = write + 107;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof readContentProvider) {
            readContentProvider readcontentprovider = (readContentProvider) obj;
            if (this.IconCompatParcelizer.equals(readcontentprovider.IconCompatParcelizer)) {
                if (this.read == readcontentprovider.read) {
                    return true;
                }
            } else {
                int i2 = write + 107;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
        }
        int i4 = write + 115;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EndTimeOption(option=" + this.IconCompatParcelizer + ", isDefault=" + this.read + ")";
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return str;
    }
}
