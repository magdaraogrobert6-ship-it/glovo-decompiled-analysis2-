package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class Violation extends TargetFragmentUsageViolation {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String read;

    public Violation(String str) {
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        String str = this.read;
        if (str == null) {
            int i2 = IconCompatParcelizer + 73;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0 ? 1 : 0;
        }
        int iHashCode = str.hashCode();
        int i3 = IconCompatParcelizer + 29;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("Show(loadingText=", this.read, ")");
            int i3 = IconCompatParcelizer + 31;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m("Show(loadingText=", this.read, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Violation)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((Violation) obj).read}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i3 = IconCompatParcelizer + 87;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 == 0;
    }
}
