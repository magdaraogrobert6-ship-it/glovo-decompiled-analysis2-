package o;

/* JADX INFO: loaded from: classes2.dex */
public final class obtainBrushFromComplexColor {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;

    public final String read() {
        int i = 2 % 2;
        int i2 = write + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i3 + 77;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public obtainBrushFromComplexColor(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() << (this.IconCompatParcelizer.hashCode() + 60);
        } else {
            iHashCode = (this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }
        int i3 = serializer + 65;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Action(label=" + this.IconCompatParcelizer + ", onClick=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof obtainBrushFromComplexColor)) {
                return false;
            }
            obtainBrushFromComplexColor obtainbrushfromcomplexcolor = (obtainBrushFromComplexColor) obj;
            if (this.IconCompatParcelizer.equals(obtainbrushfromcomplexcolor.IconCompatParcelizer)) {
                if (!this.RemoteActionCompatParcelizer.equals(obtainbrushfromcomplexcolor.RemoteActionCompatParcelizer)) {
                    return false;
                }
            } else {
                int i4 = write + 21;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return false;
                }
                int i5 = 5 % 4;
                return false;
            }
        }
        int i6 = serializer + 23;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
