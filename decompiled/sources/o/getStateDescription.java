package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getStateDescription implements getIsTraversalGroup {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final getTextSelectionRange RemoteActionCompatParcelizer;

    public getStateDescription(getTextSelectionRange gettextselectionrange) {
        this.RemoteActionCompatParcelizer = gettextselectionrange;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            int i3 = 48 / 0;
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        }
        int i4 = IconCompatParcelizer + 17;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Rider(userData=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 61;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (obj instanceof getStateDescription) {
                if (!this.RemoteActionCompatParcelizer.equals(((getStateDescription) obj).RemoteActionCompatParcelizer)) {
                    return false;
                }
            } else {
                int i5 = i2 + 41;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return false;
                }
                int i6 = 3 / 2;
                return false;
            }
        }
        return true;
    }
}
