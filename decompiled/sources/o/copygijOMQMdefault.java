package o;

/* JADX INFO: loaded from: classes3.dex */
public final class copygijOMQMdefault extends HyphensCompanion {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final accessgetGocp IconCompatParcelizer;
    public final String serializer;

    public final accessgetGocp IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 89;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetGocp accessgetgocp = this.IconCompatParcelizer;
        int i5 = i2 + 93;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return accessgetgocp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer;
        }
        int i3 = 57 / 0;
        return this.serializer;
    }

    public copygijOMQMdefault(accessgetGocp accessgetgocp, String str) {
        this.serializer = str;
        this.IconCompatParcelizer = accessgetgocp;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer.hashCode();
            throw null;
        }
        int iHashCode2 = this.serializer.hashCode();
        accessgetGocp accessgetgocp = this.IconCompatParcelizer;
        if (accessgetgocp == null) {
            int i3 = RemoteActionCompatParcelizer + 83;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accessgetgocp.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Stopped(reason=" + this.serializer + ", highlightingTarget=" + this.IconCompatParcelizer + ")";
        int i2 = write + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 49;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 4 % 2;
            }
        } else {
            if (!(obj instanceof copygijOMQMdefault)) {
                return false;
            }
            copygijOMQMdefault copygijomqmdefault = (copygijOMQMdefault) obj;
            if (!this.serializer.equals(copygijomqmdefault.serializer)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, copygijomqmdefault.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
