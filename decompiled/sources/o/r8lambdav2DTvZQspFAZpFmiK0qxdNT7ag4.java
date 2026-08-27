package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4 extends r8lambdav4khHexYF7B8JZECOja6EPumcY4 {
    private static int serializer = 0;
    private static int write = 1;
    public final r8lambdav9lEwuigriKPLoepmU9DzDAsGns RemoteActionCompatParcelizer;
    public final String read;

    public r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4(r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns, String str) {
        r8lambdav9lewuigrikploepmu9dzdasgns.getClass();
        this.RemoteActionCompatParcelizer = r8lambdav9lewuigrikploepmu9dzdasgns;
        this.read = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r1 r3
  0x0028: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = serializer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            str = this.read;
            int i3 = 59 / 0;
            if (str != null) {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            str = this.read;
            if (str != null) {
                iHashCode2 = str.hashCode();
            }
        }
        int i4 = (iHashCode * 31) + iHashCode2;
        int i5 = write + 23;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4) {
                r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4 r8lambdav2dtvzqspfazpfmik0qxdnt7ag4 = (r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4) obj;
                if (this.RemoteActionCompatParcelizer != r8lambdav2dtvzqspfazpfmik0qxdnt7ag4.RemoteActionCompatParcelizer) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdav2dtvzqspfazpfmik0qxdnt7ag4.read}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = write + 121;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = serializer + 33;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = serializer + 115;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SettingsMenuItemUiState(style=" + this.RemoteActionCompatParcelizer + ", newTag=" + this.read + ")";
        int i2 = serializer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
