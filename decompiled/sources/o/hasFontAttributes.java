package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hasFontAttributes {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final getSimplefcGXIks write;

    public final List serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 67;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ArrayList arrayList = this.read;
        int i5 = i2 + 111;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    public final getSimplefcGXIks write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getSimplefcGXIks getsimplefcgxiks = this.write;
        int i5 = i2 + 77;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getsimplefcgxiks;
    }

    public hasFontAttributes(getSimplefcGXIks getsimplefcgxiks, ArrayList arrayList) {
        this.write = getsimplefcgxiks;
        this.read = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.write.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DestinationPreviewState(routeOptions=" + this.write + ", secondaryDestinations=" + this.read + ")";
        int i2 = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof hasFontAttributes) {
            hasFontAttributes hasfontattributes = (hasFontAttributes) obj;
            if (this.write.equals(hasfontattributes.write)) {
                return this.read.equals(hasfontattributes.read);
            }
            int i2 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            int i3 = 3 / 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 59;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
