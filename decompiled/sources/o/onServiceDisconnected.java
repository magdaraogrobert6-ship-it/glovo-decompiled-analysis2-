package o;

/* JADX INFO: loaded from: classes3.dex */
public final class onServiceDisconnected {
    private static int read = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final getSuccessResponseData write;

    public onServiceDisconnected(String str, getSuccessResponseData getsuccessresponsedata) {
        this.IconCompatParcelizer = str;
        this.write = getsuccessresponsedata;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 109;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.IconCompatParcelizer.hashCode();
            iHashCode = this.write.hashCode();
            i = iHashCode2 / 68;
        } else {
            int iHashCode3 = this.IconCompatParcelizer.hashCode();
            iHashCode = this.write.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WorkZone(name=" + this.IconCompatParcelizer + ", geoJson=" + this.write + ")";
        int i2 = read + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 25;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 55;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof onServiceDisconnected)) {
            return false;
        }
        onServiceDisconnected onservicedisconnected = (onServiceDisconnected) obj;
        return this.IconCompatParcelizer.equals(onservicedisconnected.IconCompatParcelizer) && this.write.equals(onservicedisconnected.write);
    }
}
