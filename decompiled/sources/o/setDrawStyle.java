package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setDrawStyle {
    private static int serializer = 0;
    private static int write = 1;
    public final setBrushSizeiaC8Vc4ui_text RemoteActionCompatParcelizer;
    public final setShadowui_text read;

    public final setShadowui_text read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 107;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        setShadowui_text setshadowui_text = this.read;
        int i4 = i2 + 99;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setshadowui_text;
        }
        obj.hashCode();
        throw null;
    }

    public setDrawStyle(setShadowui_text setshadowui_text, setBrushSizeiaC8Vc4ui_text setbrushsizeiac8vc4ui_text) {
        this.read = setshadowui_text;
        this.RemoteActionCompatParcelizer = setbrushsizeiac8vc4ui_text;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
        int i4 = serializer + 77;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigationButtonState(destinationLocation=" + this.read + ", analytics=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof setDrawStyle) {
            setDrawStyle setdrawstyle = (setDrawStyle) obj;
            if (this.read.equals(setdrawstyle.read) && this.RemoteActionCompatParcelizer.equals(setdrawstyle.RemoteActionCompatParcelizer)) {
                return true;
            }
        }
        int i3 = write + 55;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
        }
        return false;
    }
}
