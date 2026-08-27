package o;

/* JADX INFO: loaded from: classes3.dex */
public final class supportStartPostponedEnterTransition {
    private static int serializer = 1;
    private static int write;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk IconCompatParcelizer;

    public supportStartPostponedEnterTransition(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.IconCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = serializer + 67;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FloatingContentState(rows=" + this.IconCompatParcelizer + ")";
        int i2 = write + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof supportStartPostponedEnterTransition) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((supportStartPostponedEnterTransition) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                    return true;
                }
                int i2 = write + 23;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            int i3 = serializer;
            int i4 = i3 + 15;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 41;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = write + 65;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
