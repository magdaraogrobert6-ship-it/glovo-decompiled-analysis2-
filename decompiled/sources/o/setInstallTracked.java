package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setInstallTracked {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final String read;

    public setInstallTracked(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Section(title=", this.IconCompatParcelizer, ", description=", this.read, ")");
        int i4 = write + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 73;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.IconCompatParcelizer.hashCode();
            iHashCode = this.read.hashCode();
            i = iHashCode2 << 123;
        } else {
            int iHashCode3 = this.IconCompatParcelizer.hashCode();
            iHashCode = this.read.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof setInstallTracked)) {
                return false;
            }
            setInstallTracked setinstalltracked = (setInstallTracked) obj;
            if (!this.IconCompatParcelizer.equals(setinstalltracked.IconCompatParcelizer) || !this.read.equals(setinstalltracked.read)) {
                return false;
            }
        }
        int i3 = serializer + 33;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
