package o;

/* JADX INFO: loaded from: classes3.dex */
public final class createTypefaceSpan extends ComposeClickableSpan {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String write;

    public createTypefaceSpan(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode = this.write.hashCode();
            return Integer.hashCode(0) >> ((ddefault.IconCompatParcelizer.hashCode() >>> (iHashCode >> 34)) >>> 55);
        }
        int iHashCode2 = this.write.hashCode();
        return Integer.hashCode(0) + ((ddefault.IconCompatParcelizer.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 103;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof createTypefaceSpan) || !this.write.equals(((createTypefaceSpan) obj).write)) {
                return false;
            }
            ddefault ddefaultVar = ddefault.serializer;
            int i5 = RemoteActionCompatParcelizer + 119;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i6 = i2 + 75;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowMessage(message=" + this.write + ", type=" + ddefault.IconCompatParcelizer + ", length=0)";
        int i2 = read + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return str;
    }
}
