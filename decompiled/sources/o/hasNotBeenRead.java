package o;

/* JADX INFO: loaded from: classes3.dex */
public final class hasNotBeenRead {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public hasNotBeenRead(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TimeOption(id=", this.read, ", label=", this.RemoteActionCompatParcelizer, ")");
        int i4 = IconCompatParcelizer + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
        int i4 = IconCompatParcelizer + 17;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof hasNotBeenRead) {
            hasNotBeenRead hasnotbeenread = (hasNotBeenRead) obj;
            Object[] objArr = {this.read, hasnotbeenread.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.RemoteActionCompatParcelizer, hasnotbeenread.RemoteActionCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = write + 105;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 91;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
