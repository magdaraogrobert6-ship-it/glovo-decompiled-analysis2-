package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler12 extends ActivityHandler15 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;

    public ActivityHandler12(String str) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = IconCompatParcelizer + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("OpenWebView(url=", this.RemoteActionCompatParcelizer, ")");
        int i4 = serializer + 111;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 67;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof ActivityHandler12)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((ActivityHandler12) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 47;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = IconCompatParcelizer + 107;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
