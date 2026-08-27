package o;

/* JADX INFO: loaded from: classes3.dex */
public final class transformedToOriginal {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public transformedToOriginal(String str, String str2) {
        str.getClass();
        this.write = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("RemoteBlockRiderOption(title=", this.write, ", subtitle=", this.read, ")");
        int i4 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 89;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            this.write.hashCode();
            throw null;
        }
        int iHashCode = this.write.hashCode();
        String str = this.read;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 93;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i6 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof transformedToOriginal)) {
            int i4 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return false;
        }
        transformedToOriginal transformedtooriginal = (transformedToOriginal) obj;
        Object[] objArr = {this.write, transformedtooriginal.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.read, transformedtooriginal.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
