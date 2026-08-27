package o;

/* JADX INFO: loaded from: classes2.dex */
public final class isAtEnd implements getStrokeLineJoinkLtJ_vA {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final obtainBrushFromComplexColor serializer;

    public final obtainBrushFromComplexColor serializer() {
        obtainBrushFromComplexColor obtainbrushfromcomplexcolor;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            obtainbrushfromcomplexcolor = this.serializer;
            int i4 = 95 / 0;
        } else {
            obtainbrushfromcomplexcolor = this.serializer;
        }
        int i5 = i3 + 115;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return obtainbrushfromcomplexcolor;
        }
        throw null;
    }

    public isAtEnd(obtainBrushFromComplexColor obtainbrushfromcomplexcolor) {
        this.serializer = obtainbrushfromcomplexcolor;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.serializer.hashCode();
            int i3 = 62 / 0;
        } else {
            iHashCode = this.serializer.hashCode();
        }
        int i4 = read + 87;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "One(positive=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj && (!(obj instanceof isAtEnd) || (!this.serializer.equals(((isAtEnd) obj).serializer)))) {
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 63;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
