package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hasStableIds {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final ArrayList RemoteActionCompatParcelizer;
    public final int read;

    public hasStableIds(int i, ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
        this.read = i;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Integer.hashCode(this.read) >> (this.RemoteActionCompatParcelizer.hashCode() * 71);
        } else {
            iHashCode = (this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.read);
        }
        int i3 = serializer + 107;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof hasStableIds) {
            hasStableIds hasstableids = (hasStableIds) obj;
            if (this.RemoteActionCompatParcelizer.equals(hasstableids.RemoteActionCompatParcelizer) && this.read == hasstableids.read) {
                return true;
            }
        }
        int i4 = IconCompatParcelizer + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PageViewEntity(components=" + this.RemoteActionCompatParcelizer + ", backgroundColor=" + this.read + ")";
        int i2 = IconCompatParcelizer + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
