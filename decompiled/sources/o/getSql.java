package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getSql extends AndroidPreparedStatement {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final insertOrUpdateTransformedNodeSubhierarchy read;
    public final String write;

    public getSql(String str, insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy) {
        insertorupdatetransformednodesubhierarchy.getClass();
        this.write = str;
        this.read = insertorupdatetransformednodesubhierarchy;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        String str = this.write;
        if (str == null) {
            int i3 = serializer + 45;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i5 = serializer + 63;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return this.read.hashCode() + (i * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 43;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getSql) {
            getSql getsql = (getSql) obj;
            Object[] objArr = {this.write, getsql.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.read == getsql.read) {
                return true;
            }
            int i5 = serializer + 85;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 9;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 38 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GoToCustomPassword(password=" + this.write + ", invocationSite=" + this.read + ")";
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
