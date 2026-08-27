package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isTrimLastLineBottomimplui_text extends LineHeightStyleTrim {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final LineHeightStyleModeCompanion read;

    public isTrimLastLineBottomimplui_text(String str, LineHeightStyleModeCompanion lineHeightStyleModeCompanion) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.read = lineHeightStyleModeCompanion;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() / (this.IconCompatParcelizer.hashCode() % 63);
        }
        return this.read.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SpeedLimitState(speedLimit=" + this.IconCompatParcelizer + ", riderSpeed=" + this.read + ")";
        int i2 = write + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 49;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof isTrimLastLineBottomimplui_text) {
            isTrimLastLineBottomimplui_text istrimlastlinebottomimplui_text = (isTrimLastLineBottomimplui_text) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, istrimlastlinebottomimplui_text.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.read.equals(istrimlastlinebottomimplui_text.read);
        }
        int i5 = i2 + 71;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
