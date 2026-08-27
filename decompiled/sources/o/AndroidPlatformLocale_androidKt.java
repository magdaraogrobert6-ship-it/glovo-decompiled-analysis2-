package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidPlatformLocale_androidKt extends createPrecomposedSlotHandle {
    private static int read = 1;
    private static int write;
    public final accessgetGocp RemoteActionCompatParcelizer;

    public final accessgetGocp read() {
        int i = 2 % 2;
        int i2 = write + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        accessgetGocp accessgetgocp = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 97;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetgocp;
    }

    public AndroidPlatformLocale_androidKt(accessgetGocp accessgetgocp) {
        accessgetgocp.getClass();
        this.RemoteActionCompatParcelizer = accessgetgocp;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i3 = read + 11;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Navigation(destination=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidPlatformLocale_androidKt)) {
            return false;
        }
        Object[] objArr = {this.RemoteActionCompatParcelizer, ((AndroidPlatformLocale_androidKt) obj).RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i2 = read + 123;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 85;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return true;
    }
}
