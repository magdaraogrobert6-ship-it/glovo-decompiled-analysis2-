package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ga extends gb {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final int serializer;
    public final int write;

    public ga(int i, int i2) {
        this.serializer = i;
        this.write = i2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return af$$ExternalSyntheticOutline0.m(this.serializer, this.write, "Update(speedLimit=", ", riderSpeed=", ")");
        }
        af$$ExternalSyntheticOutline0.m(this.serializer, this.write, "Update(speedLimit=", ", riderSpeed=", ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = Integer.hashCode(this.serializer);
            iHashCode = Integer.hashCode(this.write);
            i = iHashCode2 + 80;
        } else {
            int iHashCode3 = Integer.hashCode(this.serializer);
            iHashCode = Integer.hashCode(this.write);
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof ga)) {
                return false;
            }
            ga gaVar = (ga) obj;
            return this.serializer == gaVar.serializer && this.write == gaVar.write;
        }
        int i2 = RemoteActionCompatParcelizer + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
