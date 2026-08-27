package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getEllipsizedRightPadding implements IndentationFixSpan {
    private static int read = 1;
    private static int write;
    public final StaticLayoutFactoryDefault IconCompatParcelizer;

    public getEllipsizedRightPadding(StaticLayoutFactoryDefault staticLayoutFactoryDefault) {
        this.IconCompatParcelizer = staticLayoutFactoryDefault;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = read + 65;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 39;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getEllipsizedRightPadding)) {
            return false;
        }
        if (this.IconCompatParcelizer == ((getEllipsizedRightPadding) obj).IconCompatParcelizer) {
            return true;
        }
        int i4 = read + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BackToBackBanner(glowBoxBannerUiModel=" + this.IconCompatParcelizer + ")";
        int i2 = write + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return str;
    }
}
