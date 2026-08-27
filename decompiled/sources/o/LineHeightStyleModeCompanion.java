package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleModeCompanion {
    private static int read = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final String write;

    public LineHeightStyleModeCompanion(String str, boolean z) {
        str.getClass();
        this.write = str;
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Boolean.hashCode(this.IconCompatParcelizer) >>> (this.write.hashCode() / 60);
        }
        return (this.write.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LineHeightStyleModeCompanion) {
            LineHeightStyleModeCompanion lineHeightStyleModeCompanion = (LineHeightStyleModeCompanion) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, lineHeightStyleModeCompanion.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.IconCompatParcelizer == lineHeightStyleModeCompanion.IconCompatParcelizer) {
                return true;
            }
            int i2 = serializer + 119;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = serializer + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RiderSpeed(riderSpeed=" + this.write + ", showAlertColor=" + this.IconCompatParcelizer + ")";
        int i2 = read + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
