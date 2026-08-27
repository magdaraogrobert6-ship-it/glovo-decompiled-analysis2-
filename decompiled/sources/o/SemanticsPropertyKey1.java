package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertyKey1 extends SemanticsRegion {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final String write;

    public SemanticsPropertyKey1(String str) {
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write.hashCode();
        }
        this.write.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("EncryptPassword(input=", this.write, ")");
        }
        ff$$ExternalSyntheticOutline0.m("EncryptPassword(input=", this.write, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj && (!(obj instanceof SemanticsPropertyKey1) || !this.write.equals(((SemanticsPropertyKey1) obj).write))) {
            return false;
        }
        int i4 = IconCompatParcelizer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
