package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkSaverlambda1 extends LineHeightStyleSaverlambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final String IconCompatParcelizer;

    public LinkSaverlambda1(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = Integer.hashCode(-1) + ((ddefault.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
        int i4 = RemoteActionCompatParcelizer + 115;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof LinkSaverlambda1) || !this.IconCompatParcelizer.equals(((LinkSaverlambda1) obj).IconCompatParcelizer)) {
                return false;
            }
            ddefault ddefaultVar = ddefault.serializer;
            return true;
        }
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 39;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(message=" + this.IconCompatParcelizer + ", snackbarType=" + ddefault.IconCompatParcelizer + ", duration=-1)";
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
