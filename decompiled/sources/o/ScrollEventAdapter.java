package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ScrollEventAdapter extends CustomVersionedParcelable {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final setApplicationContext write;

    public ScrollEventAdapter(setApplicationContext setapplicationcontext) {
        this.write = setapplicationcontext;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode();
            int i3 = 73 / 0;
        } else {
            iHashCode = this.write.hashCode();
        }
        int i4 = IconCompatParcelizer + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBarErrorAndDismissLoading(snackBar=" + this.write + ")";
        int i2 = read + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if ((obj instanceof ScrollEventAdapter) && this.write.equals(((ScrollEventAdapter) obj).write)) {
            return true;
        }
        int i4 = read + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return false;
    }
}
