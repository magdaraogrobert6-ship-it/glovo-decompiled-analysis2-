package o;

/* JADX INFO: loaded from: classes3.dex */
public final class enablePreinstallTracking {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final enableCostDataInAttribution IconCompatParcelizer;
    public final enableCostDataInAttribution read;
    public final enableCostDataInAttribution serializer;
    public final enableCostDataInAttribution write;

    public enablePreinstallTracking(enableCostDataInAttribution enablecostdatainattribution, enableCostDataInAttribution enablecostdatainattribution2, enableCostDataInAttribution enablecostdatainattribution3, enableCostDataInAttribution enablecostdatainattribution4) {
        this.read = enablecostdatainattribution;
        this.serializer = enablecostdatainattribution2;
        this.write = enablecostdatainattribution3;
        this.IconCompatParcelizer = enablecostdatainattribution4;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode() + ((this.write.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        int i4 = MediaDescriptionCompat + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SafetyScores(overall=" + this.read + ", speed=" + this.serializer + ", braking=" + this.write + ", attention=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 99;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 43;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 / 2;
            }
        } else if (obj instanceof enablePreinstallTracking) {
            enablePreinstallTracking enablepreinstalltracking = (enablePreinstallTracking) obj;
            if (!this.read.equals(enablepreinstalltracking.read) || !this.serializer.equals(enablepreinstalltracking.serializer) || !this.write.equals(enablepreinstalltracking.write) || (!this.IconCompatParcelizer.equals(enablepreinstalltracking.IconCompatParcelizer))) {
                return false;
            }
        } else {
            int i4 = MediaDescriptionCompat + 25;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        return true;
    }
}
