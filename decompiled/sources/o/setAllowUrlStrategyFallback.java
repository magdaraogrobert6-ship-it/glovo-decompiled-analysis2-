package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setAllowUrlStrategyFallback {
    private static int read = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final int serializer;

    public setAllowUrlStrategyFallback(int i, String str) {
        this.serializer = i;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 105;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = Integer.hashCode(this.serializer);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = write + 59;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setAllowUrlStrategyFallback) {
            setAllowUrlStrategyFallback setallowurlstrategyfallback = (setAllowUrlStrategyFallback) obj;
            if (this.serializer == setallowurlstrategyfallback.serializer) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setallowurlstrategyfallback.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            int i2 = write + 101;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 93;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToBonusCalendar(zoneId=" + this.serializer + ", zoneName=" + this.IconCompatParcelizer + ")";
        int i2 = write + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
