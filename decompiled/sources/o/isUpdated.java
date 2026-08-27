package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isUpdated {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final int IconCompatParcelizer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 53;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 41;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    public isUpdated(int i, String str) {
        str.getClass();
        this.IconCompatParcelizer = i;
        this.write = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode() % (Integer.hashCode(this.IconCompatParcelizer) * 88);
        } else {
            iHashCode = this.write.hashCode() + (Integer.hashCode(this.IconCompatParcelizer) * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 29;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 117;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isUpdated)) {
            return false;
        }
        isUpdated isupdated = (isUpdated) obj;
        if (this.IconCompatParcelizer == isupdated.IconCompatParcelizer) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, isupdated.write}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = RemoteActionCompatParcelizer + 17;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 15;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartingPoint(id=" + this.IconCompatParcelizer + ", name=" + this.write + ")";
        int i2 = serializer + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
