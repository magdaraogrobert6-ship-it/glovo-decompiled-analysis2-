package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getNonevmbZdU8 extends HyphensCompanion {
    private static int serializer = 1;
    private static int write;
    public final getSimplefcGXIks read;

    public final getSimplefcGXIks serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 71;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getSimplefcGXIks getsimplefcgxiks = this.read;
        int i5 = i2 + 101;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return getsimplefcgxiks;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getNonevmbZdU8(getSimplefcGXIks getsimplefcgxiks) {
        getsimplefcgxiks.getClass();
        this.read = getsimplefcgxiks;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode();
        }
        this.read.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Arrival(routeOptions=" + this.read + ")";
        int i2 = serializer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 125;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof getNonevmbZdU8) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((getNonevmbZdU8) obj).read}, getCieXyz.write())).booleanValue();
        }
        int i4 = serializer + 73;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
