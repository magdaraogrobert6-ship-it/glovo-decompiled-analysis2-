package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class multiPut extends accessmultiRemove {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final ArrayList read;

    public multiPut(ArrayList arrayList) {
        this.read = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = RemoteActionCompatParcelizer + 65;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Success(chats=" + this.read + ")";
        int i2 = IconCompatParcelizer + 95;
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
        int i2 = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof multiPut) && this.read.equals(((multiPut) obj).read)) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return false;
    }
}
