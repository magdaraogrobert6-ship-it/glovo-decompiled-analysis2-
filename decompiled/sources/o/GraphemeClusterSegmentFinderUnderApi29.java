package o;

/* JADX INFO: loaded from: classes3.dex */
public final class GraphemeClusterSegmentFinderUnderApi29 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final String read;
    public final String serializer;

    public GraphemeClusterSegmentFinderUnderApi29(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.serializer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OrderItemExtraProduct(quantity=", this.read, ", name=", this.serializer, ")");
        }
        int i3 = 43 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OrderItemExtraProduct(quantity=", this.read, ", name=", this.serializer, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode() * (this.read.hashCode() << 68);
        }
        return this.serializer.hashCode() + (this.read.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof GraphemeClusterSegmentFinderUnderApi29) {
                GraphemeClusterSegmentFinderUnderApi29 graphemeClusterSegmentFinderUnderApi29 = (GraphemeClusterSegmentFinderUnderApi29) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, graphemeClusterSegmentFinderUnderApi29.read}, getCieXyz.write())).booleanValue()) {
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, graphemeClusterSegmentFinderUnderApi29.serializer}, getCieXyz.write())).booleanValue())) {
                        return true;
                    }
                    int i2 = IconCompatParcelizer + 7;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
            int i5 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
