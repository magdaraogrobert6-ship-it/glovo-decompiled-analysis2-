package o;

/* JADX INFO: loaded from: classes3.dex */
public final class FontStyleSaverlambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String write;

    public FontStyleSaverlambda0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AcceptanceRate(title=", this.write, ", subtitle=", this.IconCompatParcelizer, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AcceptanceRate(title=", this.write, ", subtitle=", this.IconCompatParcelizer, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer.hashCode() >> (this.write.hashCode() >>> 50);
        }
        return (this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 69;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (obj instanceof FontStyleSaverlambda0) {
            FontStyleSaverlambda0 fontStyleSaverlambda0 = (FontStyleSaverlambda0) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, fontStyleSaverlambda0.write}, getCieXyz.write())).booleanValue()) {
                int i3 = read + 31;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, fontStyleSaverlambda0.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i5 = read + 73;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
