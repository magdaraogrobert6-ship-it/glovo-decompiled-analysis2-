package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustTestOptions extends sign {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String read;
    public final String write;

    public AdjustTestOptions(String str, String str2) {
        this.write = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NotWorkingNoZone(title=", this.write, ", description=", this.read, ")");
        }
        int i3 = 31 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NotWorkingNoZone(title=", this.write, ", description=", this.read, ")");
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 125;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.write.hashCode();
            iHashCode = this.read.hashCode();
            i = iHashCode2 % 58;
        } else {
            int iHashCode3 = this.write.hashCode();
            iHashCode = this.read.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = serializer + 51;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof AdjustTestOptions)) {
                return false;
            }
            AdjustTestOptions adjustTestOptions = (AdjustTestOptions) obj;
            if (!this.write.equals(adjustTestOptions.write)) {
                int i3 = serializer + 111;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!this.read.equals(adjustTestOptions.read)) {
                return false;
            }
        }
        return true;
    }
}
