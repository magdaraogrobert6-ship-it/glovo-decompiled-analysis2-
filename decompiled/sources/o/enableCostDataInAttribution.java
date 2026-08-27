package o;

/* JADX INFO: loaded from: classes3.dex */
public final class enableCostDataInAttribution {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final enableDeviceIdsReadingOnce IconCompatParcelizer;
    public final float serializer;

    public enableCostDataInAttribution(float f, enableDeviceIdsReadingOnce enabledeviceidsreadingonce) {
        this.serializer = f;
        this.IconCompatParcelizer = enabledeviceidsreadingonce;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 91;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = Float.hashCode(this.serializer);
            iHashCode = this.IconCompatParcelizer.hashCode();
            i = iHashCode2 * 13;
        } else {
            int iHashCode3 = Float.hashCode(this.serializer);
            iHashCode = this.IconCompatParcelizer.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = write + 51;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof enableCostDataInAttribution) {
            enableCostDataInAttribution enablecostdatainattribution = (enableCostDataInAttribution) obj;
            return Float.compare(this.serializer, enablecostdatainattribution.serializer) == 0 && this.IconCompatParcelizer == enablecostdatainattribution.IconCompatParcelizer;
        }
        int i5 = i3 + 73;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SafetyScore(score=" + this.serializer + ", tag=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
