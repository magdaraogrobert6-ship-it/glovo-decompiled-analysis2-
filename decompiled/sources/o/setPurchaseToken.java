package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setPurchaseToken {
    private static int read = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public setPurchaseToken(String str, String str2) {
        str2.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BreakRequestOption(displayName=", this.write, ", optionKey=", this.RemoteActionCompatParcelizer, ")");
            int i3 = read + 41;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BreakRequestOption(displayName=", this.write, ", optionKey=", this.RemoteActionCompatParcelizer, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        int i4 = read + 3;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setPurchaseToken) {
            setPurchaseToken setpurchasetoken = (setPurchaseToken) obj;
            if (this.write.equals(setpurchasetoken.write)) {
                Object[] objArr = {this.RemoteActionCompatParcelizer, setpurchasetoken.RemoteActionCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        int i4 = serializer + 57;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
