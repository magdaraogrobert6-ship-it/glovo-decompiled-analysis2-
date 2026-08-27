package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdam8zKDGVczFsFTURUOoSF_afmF0 implements r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public r8lambdam8zKDGVczFsFTURUOoSF_afmF0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OpenExternalUrl(url=", this.RemoteActionCompatParcelizer, ", analyticsName=", this.read, ")");
            int i3 = 38 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OpenExternalUrl(url=", this.RemoteActionCompatParcelizer, ", analyticsName=", this.read, ")");
        }
        int i4 = IconCompatParcelizer + 117;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = IconCompatParcelizer + 99;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof r8lambdam8zKDGVczFsFTURUOoSF_afmF0))) {
            r8lambdam8zKDGVczFsFTURUOoSF_afmF0 r8lambdam8zkdgvczfsfturuoosf_afmf0 = (r8lambdam8zKDGVczFsFTURUOoSF_afmF0) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdam8zkdgvczfsfturuoosf_afmf0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdam8zkdgvczfsfturuoosf_afmf0.read}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i2 = serializer + 87;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 11;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
