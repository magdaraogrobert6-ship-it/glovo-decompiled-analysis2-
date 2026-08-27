package o;

/* JADX INFO: loaded from: classes3.dex */
public final class endRearDisplayPresentationSession extends getWindowAreaDisplayMetrics {
    private static int read = 0;
    private static int write = 1;
    public final ExtensionWindowAreaStatusRequirements IconCompatParcelizer;

    public endRearDisplayPresentationSession(ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements) {
        this.IconCompatParcelizer = extensionWindowAreaStatusRequirements;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = read + 109;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LocationSuccess(location=" + this.IconCompatParcelizer + ")";
        int i2 = read + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof endRearDisplayPresentationSession) && this.IconCompatParcelizer.equals(((endRearDisplayPresentationSession) obj).IconCompatParcelizer)) {
            return true;
        }
        int i4 = read + 59;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
