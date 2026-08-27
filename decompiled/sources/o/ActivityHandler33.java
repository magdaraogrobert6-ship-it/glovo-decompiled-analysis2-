package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler33 implements ActivityHandler30 {
    private static int serializer = 0;
    private static int write = 1;
    public final setApplicationContext read;

    public ActivityHandler33(setApplicationContext setapplicationcontext) {
        this.read = setapplicationcontext;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBarType=" + this.read + ")";
        int i2 = serializer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 33;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 / 5;
            }
        } else if (!(obj instanceof ActivityHandler33) || !this.read.equals(((ActivityHandler33) obj).read)) {
            return false;
        }
        int i4 = serializer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
