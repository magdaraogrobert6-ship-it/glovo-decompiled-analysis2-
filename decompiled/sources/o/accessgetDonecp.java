package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetDonecp {
    private static int read = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final accessgetGocp write;

    public final accessgetGocp serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 111;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetGocp accessgetgocp = this.write;
        int i5 = i2 + 67;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return accessgetgocp;
        }
        throw null;
    }

    public accessgetDonecp(accessgetGocp accessgetgocp, String str, String str2) {
        str2.getClass();
        this.write = accessgetgocp;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.write.hashCode();
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i3 = read + 3;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = serializer + 69;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return this.RemoteActionCompatParcelizer.hashCode() + (((iHashCode * 31) + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Params(destination=");
        sb.append(this.write);
        sb.append(", destinationLabel=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", vehicleType=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = read + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 25;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof accessgetDonecp)) {
            return false;
        }
        accessgetDonecp accessgetdonecp = (accessgetDonecp) obj;
        if (!this.write.equals(accessgetdonecp.write)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, accessgetdonecp.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, accessgetdonecp.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
