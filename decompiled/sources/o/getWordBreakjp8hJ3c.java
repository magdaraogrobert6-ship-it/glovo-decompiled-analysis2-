package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getWordBreakjp8hJ3c extends getStrictnessusljTpc {
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final accessgetGocp read;

    public getWordBreakjp8hJ3c(accessgetGocp accessgetgocp, String str) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.read = accessgetgocp;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 67;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        accessgetGocp accessgetgocp = this.read;
        if (accessgetgocp == null) {
            i = 0;
        } else {
            int iHashCode2 = accessgetgocp.hashCode();
            int i5 = write + 119;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Inactive(reason=" + this.IconCompatParcelizer + ", highlightTarget=" + this.read + ")";
        int i2 = write + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getWordBreakjp8hJ3c)) {
            int i4 = i3 + 99;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        getWordBreakjp8hJ3c getwordbreakjp8hj3c = (getWordBreakjp8hJ3c) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getwordbreakjp8hj3c.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getwordbreakjp8hj3c.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = write + 29;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
