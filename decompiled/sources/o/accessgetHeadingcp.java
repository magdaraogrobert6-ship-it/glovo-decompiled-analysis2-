package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetHeadingcp extends HyphensCompanion {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final getSimplefcGXIks read;

    public accessgetHeadingcp(getSimplefcGXIks getsimplefcgxiks) {
        this.read = getsimplefcgxiks;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = write + 25;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Reroute(routeOptions=" + this.read + ")";
        int i2 = write + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj || ((obj instanceof accessgetHeadingcp) && !(!this.read.equals(((accessgetHeadingcp) obj).read)))) {
            return true;
        }
        int i4 = write + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return false;
    }
}
