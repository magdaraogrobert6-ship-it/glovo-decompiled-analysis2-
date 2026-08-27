package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextDirection extends getUnderline {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String read;

    public TextDirection(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int iHashCode2 = Integer.hashCode(0) + ((ddefault.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
        int i4 = write + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 95;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 5;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof TextDirection) || !this.read.equals(((TextDirection) obj).read)) {
            return false;
        }
        ddefault ddefaultVar = ddefault.serializer;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowMessage(message=" + this.read + ", type=" + ddefault.IconCompatParcelizer + ", length=0)";
        int i2 = IconCompatParcelizer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
        return str;
    }
}
