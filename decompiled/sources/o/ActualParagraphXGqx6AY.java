package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ActualParagraphXGqx6AY extends ActualParagraph {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;

    public ActualParagraphXGqx6AY(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            return Integer.hashCode(1) + ((ddefault.IconCompatParcelizer.hashCode() - (iHashCode >>> 63)) >> 83);
        }
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        return Integer.hashCode(0) + ((ddefault.IconCompatParcelizer.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 93;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ActualParagraphXGqx6AY) || !this.RemoteActionCompatParcelizer.equals(((ActualParagraphXGqx6AY) obj).RemoteActionCompatParcelizer)) {
            return false;
        }
        ddefault ddefaultVar = ddefault.serializer;
        int i4 = IconCompatParcelizer + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowMessage(message=" + this.RemoteActionCompatParcelizer + ", type=" + ddefault.IconCompatParcelizer + ", length=0)";
        int i2 = IconCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
