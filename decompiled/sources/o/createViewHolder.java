package o;

/* JADX INFO: loaded from: classes3.dex */
public final class createViewHolder {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final releaseHorizontalGlow RemoteActionCompatParcelizer;
    public final String read;

    public createViewHolder(releaseHorizontalGlow releasehorizontalglow, String str) {
        releasehorizontalglow.getClass();
        str.getClass();
        this.RemoteActionCompatParcelizer = releasehorizontalglow;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = IconCompatParcelizer + 63;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ButtonActionData(action=" + this.RemoteActionCompatParcelizer + ", id=" + this.read + ")";
        int i2 = write + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 55;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof createViewHolder)) {
            return false;
        }
        createViewHolder createviewholder = (createViewHolder) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, createviewholder.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, createviewholder.read}, getCieXyz.write())).booleanValue();
        }
        int i4 = IconCompatParcelizer + 45;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
