package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightSpan extends IndentationFixSpan_androidKtWhenMappings {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String read;
    public final String serializer;

    public LineHeightSpan(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.serializer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PayAtPickupUiState(title=", this.read, ", formattedAmount=", this.serializer, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PayAtPickupUiState(title=", this.read, ", formattedAmount=", this.serializer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (this.read.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 109;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 51;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof LineHeightSpan) {
            LineHeightSpan lineHeightSpan = (LineHeightSpan) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, lineHeightSpan.read}, getCieXyz.write())).booleanValue())) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, lineHeightSpan.serializer}, getCieXyz.write())).booleanValue();
            }
            int i5 = RemoteActionCompatParcelizer + 27;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return false;
    }
}
