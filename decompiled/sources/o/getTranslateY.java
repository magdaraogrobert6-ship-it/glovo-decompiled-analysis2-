package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getTranslateY extends setStrokeColor {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final setColorScheme write;

    public getTranslateY(setColorScheme setcolorscheme) {
        this.write = setcolorscheme;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = IconCompatParcelizer + 87;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LivenessAnalysis(challenge=" + this.write + ")";
        int i2 = IconCompatParcelizer + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 37;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (!(obj instanceof getTranslateY) || (!this.write.equals(((getTranslateY) obj).write))) {
            return false;
        }
        return true;
    }
}
