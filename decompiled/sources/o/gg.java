package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class gg extends gc {
    private static int read = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;

    public gg(String str) {
        str.getClass();
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = read + 63;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = read + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = ff$$ExternalSyntheticOutline0.m("Update(streetName=", this.IconCompatParcelizer, ")");
            int i3 = 63 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("Update(streetName=", this.IconCompatParcelizer, ")");
        }
        int i4 = read + 91;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 121;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof gg)) {
            int i3 = read + 115;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((gg) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue() ^ true);
    }
}
