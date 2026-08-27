package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class s9 extends s3 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final s4 RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public s9(String str, String str2, s4 s4Var) {
        str.getClass();
        this.write = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = s4Var;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 49;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.serializer);
        s4 s4Var = this.RemoteActionCompatParcelizer;
        if (s4Var == null) {
            i = 0;
        } else {
            int iHashCode = s4Var.hashCode();
            int i5 = read + 71;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DestinationAddressVersion2(label=", this.write, ", secondaryAddress=", this.serializer, ", addressBadge=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 13;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 63;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof s9) {
            s9 s9Var = (s9) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, s9Var.write}, getCieXyz.write())).booleanValue() || !this.serializer.equals(s9Var.serializer)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, s9Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i5 = i2 + 109;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
