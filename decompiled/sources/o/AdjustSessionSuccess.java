package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustSessionSuccess extends getSignerInstance {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final int write;

    public AdjustSessionSuccess(int i, String str) {
        str.getClass();
        this.write = i;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 63;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (Integer.hashCode(this.write) * 31);
        int i4 = read + 3;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 89;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustSessionSuccess)) {
            int i5 = i4 + 79;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        AdjustSessionSuccess adjustSessionSuccess = (AdjustSessionSuccess) obj;
        if (this.write == adjustSessionSuccess.write) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, adjustSessionSuccess.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i6 = i2 + 53;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToBonusCalendar(zoneId=" + this.write + ", zoneName=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
