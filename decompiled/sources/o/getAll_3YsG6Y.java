package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getAll_3YsG6Y extends accessgetAllcp {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final RuntimeException read;

    public getAll_3YsG6Y(RuntimeException runtimeException) {
        this.read = runtimeException;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 21;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Error(error=" + this.read + ")";
        int i2 = IconCompatParcelizer + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
            if (this != obj) {
                if ((obj instanceof getAll_3YsG6Y) || !this.read.equals(((getAll_3YsG6Y) obj).read)) {
                    return false;
                }
            }
        } else if (this != obj) {
            if (obj instanceof getAll_3YsG6Y) {
            }
            return false;
        }
        int i4 = serializer + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
