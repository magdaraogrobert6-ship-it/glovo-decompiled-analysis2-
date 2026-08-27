package o;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda11 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String read;
    public final String write;

    public BrazeExternalSyntheticLambda11(String str, String str2) {
        this.read = str;
        this.write = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("WebData(url=", this.read, ", js=", this.write, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("WebData(url=", this.read, ", js=", this.write, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.read.hashCode() * 31);
        int i4 = IconCompatParcelizer + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 7;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof BrazeExternalSyntheticLambda11) {
            BrazeExternalSyntheticLambda11 brazeExternalSyntheticLambda11 = (BrazeExternalSyntheticLambda11) obj;
            if (this.read.equals(brazeExternalSyntheticLambda11.read) && this.write.equals(brazeExternalSyntheticLambda11.write)) {
                return true;
            }
        }
        int i4 = IconCompatParcelizer + 111;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
