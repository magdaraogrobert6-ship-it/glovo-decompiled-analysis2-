package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getProtocol {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final float RemoteActionCompatParcelizer;
    public final AdjustBridgeUtil1 serializer;
    public final long write;

    public getProtocol(long j, AdjustBridgeUtil1 adjustBridgeUtil1, float f) {
        adjustBridgeUtil1.getClass();
        this.write = j;
        this.serializer = adjustBridgeUtil1;
        this.RemoteActionCompatParcelizer = f;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM3803hashCodeimpl = androidx.compose.ui.unit.IntOffset.m3803hashCodeimpl(this.write);
        int iHashCode = Float.hashCode(this.RemoteActionCompatParcelizer) + ((this.serializer.hashCode() + (iM3803hashCodeimpl * 31)) * 31);
        int i4 = read + 75;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getProtocol) {
                getProtocol getprotocol = (getProtocol) obj;
                if (!androidx.compose.ui.unit.IntOffset.m3800equalsimpl0(this.write, getprotocol.write)) {
                    return false;
                }
                if (this.serializer == getprotocol.serializer) {
                    if (Float.compare(this.RemoteActionCompatParcelizer, getprotocol.RemoteActionCompatParcelizer) == 0) {
                        return true;
                    }
                    int i2 = read + 43;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = read + 123;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = IconCompatParcelizer + 35;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = read + 83;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TooltipPopupPosition(offset=" + androidx.compose.ui.unit.IntOffset.m3808toStringimpl(this.write) + ", arrowPosition=" + this.serializer + ", centerPositionX=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
