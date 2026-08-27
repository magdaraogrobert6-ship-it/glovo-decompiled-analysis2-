package o;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 35;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return "VisibleZoomRange(minInclusive=0.0, maxInclusive=22.0)";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Double.hashCode(22.0d) << (Double.hashCode(1.0d) / 110);
        }
        return (Double.hashCode(0.0d) * 31) + Double.hashCode(22.0d);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        if (Double.compare(0.0d, 0.0d) == 0) {
            return Double.compare(22.0d, 22.0d) == 0;
        }
        int i4 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
