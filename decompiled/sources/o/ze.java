package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ze extends zgExternalSyntheticLambda3 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final double RemoteActionCompatParcelizer;

    public ze(double d) {
        this.RemoteActionCompatParcelizer = d;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.RemoteActionCompatParcelizer);
        int i4 = IconCompatParcelizer + 9;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Distance(value=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 73;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ze)) {
            int i4 = IconCompatParcelizer + 83;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (Double.compare(this.RemoteActionCompatParcelizer, ((ze) obj).RemoteActionCompatParcelizer) != 0) {
            return false;
        }
        int i6 = write + 25;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
