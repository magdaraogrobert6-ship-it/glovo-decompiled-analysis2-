package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class s5 extends s3 {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final s4 RemoteActionCompatParcelizer;
    public final String read;

    public s5(String str, String str2, s4 s4Var) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = s4Var;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer);
        s4 s4Var = this.RemoteActionCompatParcelizer;
        if (s4Var == null) {
            int i3 = write + 15;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = s4Var.hashCode();
            int i5 = write + 87;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 % 5;
            }
            i = iHashCode;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DestinationAddress(label=", this.read, ", address=", this.IconCompatParcelizer, ", addressBadge=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 117;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (!(!(obj instanceof s5))) {
                s5 s5Var = (s5) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, s5Var.read}, getCieXyz.write())).booleanValue()) {
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, s5Var.IconCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, s5Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i6 = write + 45;
                        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        return i6 % 2 != 0;
                    }
                    int i7 = serializer + 39;
                    write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i7 % 2 == 0;
                }
                int i8 = write + 121;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i8 % 2 != 0;
            }
            int i9 = i4 + 113;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 != 0;
        }
        int i10 = i2 + 73;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return true;
    }
}
