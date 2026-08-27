package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertiesText1 extends SemanticsPropertiesPaneTitle1 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final String serializer;

    public SemanticsPropertiesText1(String str) {
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int i4 = IconCompatParcelizer + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("LogoutRequested(invocationSite=", this.serializer, ")");
        int i4 = read + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticsPropertiesText1) {
            if (this.serializer.equals(((SemanticsPropertiesText1) obj).serializer)) {
                return true;
            }
        } else {
            int i2 = IconCompatParcelizer + 79;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = IconCompatParcelizer + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
