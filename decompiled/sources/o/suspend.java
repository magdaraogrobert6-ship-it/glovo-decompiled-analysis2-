package o;

/* JADX INFO: loaded from: classes3.dex */
public final class suspend {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final boolean RemoteActionCompatParcelizer;
    public final String write;

    public suspend(String str, boolean z) {
        this.write = str;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) / (this.write.hashCode() * 111);
        } else {
            iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + (this.write.hashCode() * 31);
        }
        int i3 = serializer + 103;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof suspend) {
            suspend suspendVar = (suspend) obj;
            if (this.write.equals(suspendVar.write)) {
                return this.RemoteActionCompatParcelizer == suspendVar.RemoteActionCompatParcelizer;
            }
            int i5 = IconCompatParcelizer + 55;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 77;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShimmerText(mainText=" + this.write + ", hasEllipsis=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
