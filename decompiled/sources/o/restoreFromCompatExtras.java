package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class restoreFromCompatExtras extends setBuilder {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public restoreFromCompatExtras(String str, String str2, String str3) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.serializer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.read);
        int i4 = IconCompatParcelizer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Displayable(title=", this.RemoteActionCompatParcelizer, ", description=", this.read, ", linkText="), this.serializer, ")");
        int i4 = write + 13;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof restoreFromCompatExtras)) {
            return false;
        }
        restoreFromCompatExtras restorefromcompatextras = (restoreFromCompatExtras) obj;
        if (this.RemoteActionCompatParcelizer.equals(restorefromcompatextras.RemoteActionCompatParcelizer)) {
            return this.read.equals(restorefromcompatextras.read) && this.serializer.equals(restorefromcompatextras.serializer);
        }
        int i4 = write + 29;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        int i5 = 4 / 2;
        return false;
    }
}
