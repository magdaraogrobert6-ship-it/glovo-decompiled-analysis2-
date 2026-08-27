package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class drawDoubleRoundRect extends CanvasCompatR {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final ArrayList IconCompatParcelizer;

    public drawDoubleRoundRect(ArrayList arrayList) {
        this.IconCompatParcelizer = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = RemoteActionCompatParcelizer + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DeliveryDetails(destinations=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof drawDoubleRoundRect) {
            return this.IconCompatParcelizer.equals(((drawDoubleRoundRect) obj).IconCompatParcelizer);
        }
        int i4 = i3 + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
