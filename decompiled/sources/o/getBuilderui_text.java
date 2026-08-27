package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getBuilderui_text implements pushUrlAnnotation {
    private static int read = 1;
    private static int write;
    public final toRange IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;

    public getBuilderui_text(boolean z, toRange torange) {
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = torange;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31);
        int i4 = read + 25;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 121;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof getBuilderui_text)) {
            return false;
        }
        getBuilderui_text getbuilderui_text = (getBuilderui_text) obj;
        return this.RemoteActionCompatParcelizer == getbuilderui_text.RemoteActionCompatParcelizer && this.IconCompatParcelizer.equals(getbuilderui_text.IconCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Success(keepAlive=" + this.RemoteActionCompatParcelizer + ", outcome=" + this.IconCompatParcelizer + ")";
        int i2 = read + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
