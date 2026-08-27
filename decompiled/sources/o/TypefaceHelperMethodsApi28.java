package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TypefaceHelperMethodsApi28 {
    private static int read = 1;
    private static int serializer;
    public final ddefault RemoteActionCompatParcelizer;
    public final String write;

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.write;
        int i5 = i3 + 101;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final ddefault write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 9;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ddefault ddefaultVar = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 35;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return ddefaultVar;
    }

    public TypefaceHelperMethodsApi28(String str, ddefault ddefaultVar) {
        str.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = ddefaultVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.hashCode() << (this.write.hashCode() - 34);
        }
        return (this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackbar(title=" + this.write + ", snackbarType=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof TypefaceHelperMethodsApi28) {
                TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = (TypefaceHelperMethodsApi28) obj;
                Object[] objArr = {this.write, typefaceHelperMethodsApi28.write};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || !this.RemoteActionCompatParcelizer.equals(typefaceHelperMethodsApi28.RemoteActionCompatParcelizer)) {
                    return false;
                }
            } else {
                int i5 = i3 + 71;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        int i7 = serializer + 125;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
