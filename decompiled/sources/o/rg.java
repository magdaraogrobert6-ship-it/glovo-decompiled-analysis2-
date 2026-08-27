package o;

/* JADX INFO: loaded from: classes3.dex */
public final class rg {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String read;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 107;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 19;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read;
        }
        int i3 = 54 / 0;
        return this.read;
    }

    public rg(String str, String str2) {
        str.getClass();
        this.write = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TrackingError(message=", this.write, ", code=", this.read, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TrackingError(message=", this.write, ", code=", this.read, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 23;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.write.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.write.hashCode();
        String str = this.read;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i4 = RemoteActionCompatParcelizer + 25;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 25;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return true;
        }
        if (!(obj instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, rgVar.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, rgVar.read}, getCieXyz.write())).booleanValue();
    }
}
