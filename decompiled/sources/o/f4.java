package o;

/* JADX INFO: loaded from: classes3.dex */
public final class f4 extends f1 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String serializer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 95;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.write;
        int i4 = i2 + 17;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        throw null;
    }

    public f4(String str, String str2) {
        str.getClass();
        this.write = str;
        this.serializer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("MarkerClicked(id=", this.write, ", tag=", this.serializer, ")");
        int i4 = read + 11;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.write.hashCode();
        String str = this.serializer;
        if (str == null) {
            int i2 = read;
            int i3 = i2 + 3;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 17;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 47;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        Object[] objArr = {this.write, f4Var.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 107;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr2 = {this.serializer, f4Var.serializer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = read + 67;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
