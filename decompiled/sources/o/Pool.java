package o;

/* JADX INFO: loaded from: classes3.dex */
public final class Pool {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String read;
    public final FlowUtilcreateFlowinlinedmap12 write;

    public Pool(FlowUtilcreateFlowinlinedmap12 flowUtilcreateFlowinlinedmap12, String str) {
        this.write = flowUtilcreateFlowinlinedmap12;
        this.read = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.write.hashCode();
        String str = this.read;
        if (str == null) {
            int i4 = serializer + 93;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = serializer + 67;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return i6;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "InstructionViewState(uiStringResources=" + this.write + ", privacyPolicyLink=" + this.read + ")";
        int i2 = serializer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof Pool)) {
                return false;
            }
            Pool pool = (Pool) obj;
            if (this.write.equals(pool.write)) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, pool.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i4 = IconCompatParcelizer + 71;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
