package o;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda205 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String serializer;
    public final String write;

    public BrazeExternalSyntheticLambda205(String str, String str2) {
        this.serializer = str;
        this.write = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("WebDataViewEntity(url=", this.serializer, ", js=", this.write, ")");
            int i3 = IconCompatParcelizer + 41;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("WebDataViewEntity(url=", this.serializer, ", js=", this.write, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write.hashCode() % (this.serializer.hashCode() / 29);
        }
        return this.write.hashCode() + (this.serializer.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof BrazeExternalSyntheticLambda205)) {
                return false;
            }
            BrazeExternalSyntheticLambda205 brazeExternalSyntheticLambda205 = (BrazeExternalSyntheticLambda205) obj;
            if (!this.serializer.equals(brazeExternalSyntheticLambda205.serializer) || !this.write.equals(brazeExternalSyntheticLambda205.write)) {
                return false;
            }
        }
        int i3 = IconCompatParcelizer + 23;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
