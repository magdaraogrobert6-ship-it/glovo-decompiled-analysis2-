package o;

/* JADX INFO: loaded from: classes3.dex */
public final class measurexDpz5zY {
    private static int read = 1;
    private static int write;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk IconCompatParcelizer;

    public measurexDpz5zY(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        this.IconCompatParcelizer = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = read + 85;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OverlayBodyConfiguration(items=" + this.IconCompatParcelizer + ")";
        int i2 = write + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 43;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof measurexDpz5zY)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((measurexDpz5zY) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = read;
        int i8 = i7 + 115;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        int i10 = i7 + 17;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
