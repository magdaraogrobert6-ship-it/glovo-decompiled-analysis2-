package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustDeeplink {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final setSdkPrefix read;
    public final getFailureResponseData write;

    public AdjustDeeplink(setSdkPrefix setsdkprefix, getFailureResponseData getfailureresponsedata) {
        setsdkprefix.getClass();
        getfailureresponsedata.getClass();
        this.read = setsdkprefix;
        this.write = getfailureresponsedata;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.write.hashCode() >> (this.read.hashCode() * 93);
        } else {
            iHashCode = (this.read.hashCode() * 31) + this.write.hashCode();
        }
        int i3 = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RiderState(courier=" + this.read + ", riderStatus=" + this.write + ")";
        int i2 = IconCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 51;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 79;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof AdjustDeeplink)) {
            return false;
        }
        AdjustDeeplink adjustDeeplink = (AdjustDeeplink) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, adjustDeeplink.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, adjustDeeplink.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
