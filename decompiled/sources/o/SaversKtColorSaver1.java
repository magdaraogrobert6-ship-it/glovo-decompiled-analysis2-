package o;

/* JADX INFO: loaded from: classes3.dex */
public final class SaversKtColorSaver1 extends getUrlAnnotationSaverannotations {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final ddefault read;
    public final String serializer;

    public SaversKtColorSaver1(String str, ddefault ddefaultVar) {
        this.serializer = str;
        this.read = ddefaultVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = Integer.hashCode(-1) + ((this.read.hashCode() + (iHashCode * 31)) * 31);
        int i4 = write + 39;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HideLoadingAndShowSnackBar(message=" + this.serializer + ", snackbarType=" + this.read + ", duration=-1)";
        int i2 = write + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 45;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof SaversKtColorSaver1) {
            SaversKtColorSaver1 saversKtColorSaver1 = (SaversKtColorSaver1) obj;
            if (this.serializer.equals(saversKtColorSaver1.serializer) && this.read.equals(saversKtColorSaver1.read)) {
                return true;
            }
        }
        int i4 = write + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
