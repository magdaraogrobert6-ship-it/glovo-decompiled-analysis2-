package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getImm {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;

    public getImm(String str, boolean z) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = write + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 105;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 23;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof getImm) {
            getImm getimm = (getImm) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getimm.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == getimm.RemoteActionCompatParcelizer;
        }
        int i7 = i2 + 95;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Vote(count=" + this.IconCompatParcelizer + ", pressed=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
