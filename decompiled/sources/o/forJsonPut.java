package o;

/* JADX INFO: loaded from: classes3.dex */
public final class forJsonPut extends bExternalSyntheticLambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final a6 read;

    public forJsonPut(a6 a6Var) {
        this.read = a6Var;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = RemoteActionCompatParcelizer + 59;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ErrorDialogEntity(dialog=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (!(obj instanceof forJsonPut)) {
            int i5 = i2 + 111;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (this.read.equals(((forJsonPut) obj).read)) {
            return true;
        }
        return false;
    }
}
