package o;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyItemMoved extends notifyItemRangeRemoved {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final float read;

    public notifyItemMoved(float f) {
        this.read = f;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            Float.hashCode(this.read);
            obj.hashCode();
            throw null;
        }
        int iHashCode = Float.hashCode(this.read);
        int i3 = write + 1;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WeightedSpacerViewEntity(weight=" + this.read + ")";
        int i2 = IconCompatParcelizer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof notifyItemMoved) {
                if (Float.compare(this.read, ((notifyItemMoved) obj).read) == 0) {
                    return true;
                }
                int i2 = IconCompatParcelizer + 87;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = write + 99;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 25;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
