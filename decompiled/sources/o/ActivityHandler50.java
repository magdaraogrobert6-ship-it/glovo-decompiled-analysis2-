package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler50 extends ActivityHandler49 {
    private static int read = 0;
    private static int write = 1;
    public final ActivityHandler45 IconCompatParcelizer;

    public final ActivityHandler45 read() {
        int i = 2 % 2;
        int i2 = read + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        ActivityHandler45 activityHandler45 = this.IconCompatParcelizer;
        int i5 = i3 + 43;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return activityHandler45;
        }
        throw null;
    }

    public ActivityHandler50(ActivityHandler45 activityHandler45) {
        this.IconCompatParcelizer = activityHandler45;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = read + 105;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Success(data=" + this.IconCompatParcelizer + ")";
        int i2 = read + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 99;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 5 / 4;
            }
        } else if (!(obj instanceof ActivityHandler50) || !this.IconCompatParcelizer.equals(((ActivityHandler50) obj).IconCompatParcelizer)) {
            return false;
        }
        int i7 = write + 107;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
