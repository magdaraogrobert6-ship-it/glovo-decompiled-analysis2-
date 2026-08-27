package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstance7 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final accesssetAreOutboundNetworkRequestsOfflinecp RemoteActionCompatParcelizer;
    public final checkRevenue write;

    public AdjustInstance7(checkRevenue checkrevenue, accesssetAreOutboundNetworkRequestsOfflinecp accesssetareoutboundnetworkrequestsofflinecp) {
        checkrevenue.getClass();
        accesssetareoutboundnetworkrequestsofflinecp.getClass();
        this.write = checkrevenue;
        this.RemoteActionCompatParcelizer = accesssetareoutboundnetworkrequestsofflinecp;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() >>> (this.write.hashCode() >> 51);
        } else {
            iHashCode = (this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }
        int i3 = read + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StatusWithAreaProximity(status=" + this.write + ", proximity=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustInstance7)) {
            int i4 = i3 + 101;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        AdjustInstance7 adjustInstance7 = (AdjustInstance7) obj;
        Object[] objArr = {this.write, adjustInstance7.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i6 = read;
            int i7 = i6 + 9;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 19;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        Object[] objArr2 = {this.RemoteActionCompatParcelizer, adjustInstance7.RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i11 = read + 95;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
