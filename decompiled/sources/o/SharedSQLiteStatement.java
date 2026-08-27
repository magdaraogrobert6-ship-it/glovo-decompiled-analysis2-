package o;

/* JADX INFO: loaded from: classes3.dex */
public final class SharedSQLiteStatement extends onValidateSchema {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final generatePOSTBodyString read;

    public SharedSQLiteStatement(generatePOSTBodyString generatepostbodystring) {
        this.read = generatepostbodystring;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = write + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(entity=" + this.read + ")";
        int i2 = IconCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 111;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 73;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof SharedSQLiteStatement) {
            return this.read.equals(((SharedSQLiteStatement) obj).read);
        }
        int i7 = i4 + 87;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
