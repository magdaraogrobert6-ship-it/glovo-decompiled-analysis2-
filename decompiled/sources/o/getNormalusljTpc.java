package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getNormalusljTpc {
    private static int read = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public getNormalusljTpc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public static getNormalusljTpc RemoteActionCompatParcelizer(getNormalusljTpc getnormalusljtpc, String str) {
        int i = 2 % 2;
        String str2 = getnormalusljtpc.RemoteActionCompatParcelizer;
        getnormalusljtpc.getClass();
        str2.getClass();
        getNormalusljTpc getnormalusljtpc2 = new getNormalusljTpc(str2, str);
        int i2 = serializer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getnormalusljtpc2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NavigationSessionId(navigationSession=", this.RemoteActionCompatParcelizer, ", tripSession=", this.IconCompatParcelizer, ")");
        int i4 = read + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() % (this.RemoteActionCompatParcelizer.hashCode() >> 42);
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        }
        int i3 = serializer + 21;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 101;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof getNormalusljTpc) {
            getNormalusljTpc getnormalusljtpc = (getNormalusljTpc) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getnormalusljtpc.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i4 = read + 119;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getnormalusljtpc.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = read + 13;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = serializer + 105;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
