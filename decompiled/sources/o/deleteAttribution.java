package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteAttribution extends AwaitFirstLayoutModifier {
    private static int read = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;

    public deleteAttribution(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.RemoteActionCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i3 + 87;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("Sendbird(orderCode=", this.RemoteActionCompatParcelizer, ")");
        }
        ff$$ExternalSyntheticOutline0.m("Sendbird(orderCode=", this.RemoteActionCompatParcelizer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 115;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof deleteAttribution)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((deleteAttribution) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i4 = read + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
