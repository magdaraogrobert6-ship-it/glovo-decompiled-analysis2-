package o;

/* JADX INFO: loaded from: classes3.dex */
public final class findDesignInfoProviders {
    private static int read = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public findDesignInfoProviders(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Tip(title=", this.RemoteActionCompatParcelizer, ", amount=", this.IconCompatParcelizer, ")");
        int i4 = read + 17;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 123;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = this.IconCompatParcelizer.hashCode();
            i = iHashCode2 % 79;
        } else {
            int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = this.IconCompatParcelizer.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 99;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof findDesignInfoProviders)) {
            return false;
        }
        findDesignInfoProviders finddesigninfoproviders = (findDesignInfoProviders) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, finddesigninfoproviders.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, finddesigninfoproviders.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
