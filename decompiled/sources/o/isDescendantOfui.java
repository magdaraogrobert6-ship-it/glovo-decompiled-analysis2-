package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class isDescendantOfui extends resetHasPositionalLayerTransformationsForSubtreeIfNeeded {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String read;

    public isDescendantOfui(String str) {
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read.hashCode();
        }
        this.read.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("NavigateToMainScreen(password=", this.read, ")");
            int i3 = serializer + 7;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 45 / 0;
            }
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m("NavigateToMainScreen(password=", this.read, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj || ((obj instanceof isDescendantOfui) && !(!this.read.equals(((isDescendantOfui) obj).read)))) {
            return true;
        }
        int i4 = IconCompatParcelizer + 125;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
