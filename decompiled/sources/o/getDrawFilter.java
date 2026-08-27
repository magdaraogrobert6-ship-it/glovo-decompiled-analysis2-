package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getDrawFilter {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final double read;
    public final double serializer;

    public getDrawFilter(String str, double d, double d2) {
        this.serializer = d;
        this.read = d2;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, Double.hashCode(this.serializer) * 31, 31);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 83;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = iRemoteActionCompatParcelizer + iHashCode;
        int i7 = RemoteActionCompatParcelizer + 85;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 64 / 0;
        }
        return i6;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.serializer, "Location(latitude=", ", longitude=");
        sbM.append(this.read);
        sbM.append(", address=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 63;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDrawFilter)) {
            return false;
        }
        getDrawFilter getdrawfilter = (getDrawFilter) obj;
        if (Double.compare(this.serializer, getdrawfilter.serializer) != 0) {
            int i3 = write + 89;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (Double.compare(this.read, getdrawfilter.read) != 0) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getdrawfilter.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
