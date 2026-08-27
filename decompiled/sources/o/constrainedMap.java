package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class constrainedMap {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final int IconCompatParcelizer;
    public final int serializer;
    public final String write;

    public constrainedMap(int i, int i2, String str) {
        this.serializer = i;
        this.IconCompatParcelizer = i2;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, Integer.hashCode(this.serializer) * 31, 31);
        int i4 = RemoteActionCompatParcelizer + 87;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m(this.serializer, this.IconCompatParcelizer, "Icon(drawableRes=", ", tint=", ", description="), this.write, ")");
            int i3 = RemoteActionCompatParcelizer + 21;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strM;
            }
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m(this.serializer, this.IconCompatParcelizer, "Icon(drawableRes=", ", tint=", ", description="), this.write, ")");
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof constrainedMap) {
            constrainedMap constrainedmap = (constrainedMap) obj;
            if (this.serializer == constrainedmap.serializer) {
                if (this.IconCompatParcelizer == constrainedmap.IconCompatParcelizer && this.write.equals(constrainedmap.write)) {
                    return true;
                }
            } else {
                int i5 = i3 + 67;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        int i7 = RemoteActionCompatParcelizer + 9;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
