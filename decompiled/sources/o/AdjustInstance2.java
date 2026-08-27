package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstance2 {
    private static int read = 0;
    private static int serializer = 1;
    public final boolean IconCompatParcelizer;
    public final String write;

    public AdjustInstance2(String str, boolean z) {
        this.write = str;
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + (this.write.hashCode() * 31);
        int i4 = read + 51;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof AdjustInstance2)) {
                return false;
            }
            AdjustInstance2 adjustInstance2 = (AdjustInstance2) obj;
            if (this.write.equals(adjustInstance2.write)) {
                if (this.IconCompatParcelizer != adjustInstance2.IconCompatParcelizer) {
                    return false;
                }
            } else {
                int i2 = serializer + 55;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = read + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TitleViewEntity(title=" + this.write + ", showMyShiftsButton=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
