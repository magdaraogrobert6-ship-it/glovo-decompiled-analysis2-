package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getAsciiPjHm6EE {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final String read;

    public getAsciiPjHm6EE(String str, String str2) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Image(url=", this.IconCompatParcelizer, ", id=", this.read, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Image(url=", this.IconCompatParcelizer, ", id=", this.read, ")");
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        String str = this.read;
        if (str == null) {
            int i3 = serializer + 65;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = serializer + 115;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAsciiPjHm6EE)) {
            return false;
        }
        getAsciiPjHm6EE getasciipjhm6ee = (getAsciiPjHm6EE) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getasciipjhm6ee.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getasciipjhm6ee.read}, getCieXyz.write())).booleanValue();
        }
        int i3 = write + 125;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 != 0;
    }
}
