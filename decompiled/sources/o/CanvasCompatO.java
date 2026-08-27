package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class CanvasCompatO extends measure {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String RemoteActionCompatParcelizer;

    public CanvasCompatO(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = read + 71;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("ShowError(error=", this.RemoteActionCompatParcelizer, ")");
        }
        ff$$ExternalSyntheticOutline0.m("ShowError(error=", this.RemoteActionCompatParcelizer, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 25;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if (obj instanceof CanvasCompatO) {
            if (!this.RemoteActionCompatParcelizer.equals(((CanvasCompatO) obj).RemoteActionCompatParcelizer)) {
                return false;
            }
        } else {
            int i4 = read + 59;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 115;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
