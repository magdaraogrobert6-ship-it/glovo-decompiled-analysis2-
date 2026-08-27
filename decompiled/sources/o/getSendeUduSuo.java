package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getSendeUduSuo {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final InputMethodManagerImplimm2 serializer;
    public final String write;

    public getSendeUduSuo(InputMethodManagerImplimm2 inputMethodManagerImplimm2, String str) {
        inputMethodManagerImplimm2.getClass();
        str.getClass();
        this.serializer = inputMethodManagerImplimm2;
        this.write = str;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode2 = this.serializer.hashCode();
            iHashCode = this.write.hashCode();
        } else {
            int iHashCode3 = this.serializer.hashCode();
            iHashCode = this.write.hashCode();
            iHashCode2 = iHashCode3 * 31;
        }
        int i3 = iHashCode + iHashCode2;
        int i4 = RemoteActionCompatParcelizer + 119;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return i3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToScreen(screen=" + this.serializer + ", address=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSendeUduSuo)) {
            int i2 = read + 105;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        getSendeUduSuo getsendeudusuo = (getSendeUduSuo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getsendeudusuo.serializer}, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 51;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getsendeudusuo.write}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = RemoteActionCompatParcelizer + 31;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
