package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedIUNYP9k {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final int read;
    public final String write;

    public getUnspecifiedIUNYP9k(int i, String str) {
        this.read = i;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (Integer.hashCode(this.read) * 31);
        int i4 = serializer + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 61;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getUnspecifiedIUNYP9k)) {
            return false;
        }
        getUnspecifiedIUNYP9k getunspecifiediunyp9k = (getUnspecifiedIUNYP9k) obj;
        return this.read == getunspecifiediunyp9k.read && this.write.equals(getunspecifiediunyp9k.write);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ExamplePhoto(imageResId=" + this.read + ", description=" + this.write + ")";
        int i2 = IconCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
