package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidTypeface extends setShaderStateui_text {
    private static int read = 0;
    private static int write = 1;
    public final setDrawStyle IconCompatParcelizer;
    public final getOrCreate serializer;

    public final setDrawStyle write() {
        int i = 2 % 2;
        int i2 = read + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer;
        }
        int i3 = 37 / 0;
        return this.IconCompatParcelizer;
    }

    public AndroidTypeface(setDrawStyle setdrawstyle, getOrCreate getorcreate) {
        this.IconCompatParcelizer = setdrawstyle;
        this.serializer = getorcreate;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.serializer.hashCode() / (this.IconCompatParcelizer.hashCode() << 67);
        } else {
            iHashCode = this.serializer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        }
        int i3 = write + 97;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigationErrorState(navigationButtonState=" + this.IconCompatParcelizer + ", errorDialogState=" + this.serializer + ")";
        int i2 = write + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof AndroidTypeface)) {
                return false;
            }
            AndroidTypeface androidTypeface = (AndroidTypeface) obj;
            if (!this.IconCompatParcelizer.equals(androidTypeface.IconCompatParcelizer) || !this.serializer.equals(androidTypeface.serializer)) {
                return false;
            }
        }
        int i4 = read + 63;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
