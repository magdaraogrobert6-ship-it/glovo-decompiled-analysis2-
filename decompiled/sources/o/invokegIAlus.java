package o;

/* JADX INFO: loaded from: classes3.dex */
public final class invokegIAlus implements invoke0E7RQCE {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk read;

    public invokegIAlus(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.read = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = IconCompatParcelizer + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Success(items=" + this.read + ")";
        int i2 = IconCompatParcelizer + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof invokegIAlus) {
                Object[] objArr = {this.read, ((invokegIAlus) obj).read};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i2 = IconCompatParcelizer + 45;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 42 / 0;
                }
                return true;
            }
            int i4 = serializer + 39;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = serializer + 97;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 61;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
