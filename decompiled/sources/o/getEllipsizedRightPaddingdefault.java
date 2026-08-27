package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getEllipsizedRightPaddingdefault {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public getEllipsizedRightPaddingdefault(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PaymentOption(id=", this.RemoteActionCompatParcelizer, ", title=", this.read, ")");
        int i4 = write + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = IconCompatParcelizer + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 63;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getEllipsizedRightPaddingdefault)) {
            return false;
        }
        getEllipsizedRightPaddingdefault getellipsizedrightpaddingdefault = (getEllipsizedRightPaddingdefault) obj;
        Object[] objArr = {this.RemoteActionCompatParcelizer, getellipsizedrightpaddingdefault.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.read, getellipsizedrightpaddingdefault.read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = IconCompatParcelizer + 37;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
