package o;

/* JADX INFO: loaded from: classes3.dex */
public final class b5 extends b2ExternalSyntheticLambda15 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final Throwable IconCompatParcelizer;

    public b5(Throwable th) {
        this.IconCompatParcelizer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = read + 119;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowError(throwable=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 45;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 87;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else if (obj instanceof b5) {
            if (!this.IconCompatParcelizer.equals(((b5) obj).IconCompatParcelizer)) {
                return false;
            }
        } else {
            int i8 = i4 + 41;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        return true;
    }
}
