package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getPayloadFromFileSystem extends PackageHandler7 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final ddefault RemoteActionCompatParcelizer;
    public final String serializer;

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        String str = this.serializer;
        int i5 = i3 + 59;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final ddefault write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        ddefault ddefaultVar = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 15;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return ddefaultVar;
    }

    public getPayloadFromFileSystem(String str, ddefault ddefaultVar) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = ddefaultVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 51;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode = this.serializer.hashCode();
            return Integer.hashCode(0) / ((this.RemoteActionCompatParcelizer.hashCode() % (iHashCode >> 92)) * 77);
        }
        int iHashCode2 = this.serializer.hashCode();
        return Integer.hashCode(0) + ((this.RemoteActionCompatParcelizer.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HideLoadingAndShowSnackBar(message=" + this.serializer + ", snackbarType=" + this.RemoteActionCompatParcelizer + ", duration=0)";
        int i2 = write + 95;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 17;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getPayloadFromFileSystem) {
            getPayloadFromFileSystem getpayloadfromfilesystem = (getPayloadFromFileSystem) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getpayloadfromfilesystem.serializer}, getCieXyz.write())).booleanValue()) {
                return this.RemoteActionCompatParcelizer.equals(getpayloadfromfilesystem.RemoteActionCompatParcelizer);
            }
            int i5 = MediaBrowserCompatMediaItem + 47;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 53;
        MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
