package o;

/* JADX INFO: loaded from: classes3.dex */
public final class fh extends fe {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final g5 RemoteActionCompatParcelizer;
    public final g4 read;
    public final f8 write;

    public fh(f8 f8Var, g5 g5Var) {
        g4 g4Var = new g4();
        g5Var.getClass();
        super(g5Var);
        this.write = f8Var;
        this.read = g4Var;
        this.RemoteActionCompatParcelizer = g5Var;
    }

    @Override // o.fe
    public final g5 read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        g5 g5Var = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 47;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return g5Var;
    }

    @Override // o.fe
    public final g4 serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        g4 g4Var = this.read;
        int i5 = i3 + 33;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return g4Var;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode() + ((this.read.hashCode() + (iHashCode * 31)) * 31);
        int i4 = IconCompatParcelizer + 71;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 85;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof fh) {
            fh fhVar = (fh) obj;
            if (this.write.equals(fhVar.write) && this.read.equals(fhVar.read) && this.RemoteActionCompatParcelizer == fhVar.RemoteActionCompatParcelizer) {
                return true;
            }
        } else {
            int i5 = i2 + 121;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        int i7 = IconCompatParcelizer + 123;
        MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 38 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SafeAreaTarget(point=" + this.write + ", visibleZoomRange=" + this.read + ", showInSafeArea=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 61;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
