package o;

/* JADX INFO: loaded from: classes3.dex */
public final class g7 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final double IconCompatParcelizer;

    public g7(double d) {
        this.IconCompatParcelizer = d;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ZoomLevelConfiguration(defaultZoomLevel=" + this.IconCompatParcelizer + ", heatmapZoomLevel=11.0, minZoomLevel=1.0, maxZoomLevel=22.0)";
        int i2 = serializer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode = Double.hashCode(22.0d) + (i2 % 2 != 0 ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(1.0d, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(11.0d, Double.hashCode(this.IconCompatParcelizer) * 112, 120), 84) : r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(1.0d, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(11.0d, Double.hashCode(this.IconCompatParcelizer) * 31, 31), 31));
        int i3 = RemoteActionCompatParcelizer + 11;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 11;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof g7)) {
                return false;
            }
            if (Double.compare(this.IconCompatParcelizer, ((g7) obj).IconCompatParcelizer) == 0) {
                if (Double.compare(11.0d, 11.0d) != 0 || Double.compare(1.0d, 1.0d) != 0 || Double.compare(22.0d, 22.0d) != 0) {
                    return false;
                }
            } else {
                int i4 = serializer + 57;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        int i6 = RemoteActionCompatParcelizer + 17;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
