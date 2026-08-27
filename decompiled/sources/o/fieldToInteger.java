package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class fieldToInteger {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final execSessionSuccessCallbackCommand serializer;

    public fieldToInteger(String str, int i, execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand) {
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
        this.serializer = execsessionsuccesscallbackcommand;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read, this.RemoteActionCompatParcelizer.hashCode() * 31, 31);
        execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand = this.serializer;
        if (execsessionsuccesscallbackcommand == null) {
            int i4 = IconCompatParcelizer + 39;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 63;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = execsessionsuccesscallbackcommand.hashCode();
        }
        return iM + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("ErrorViewEntity(title=", this.read, this.RemoteActionCompatParcelizer, ", imageRes=", ", recoveryButtonView=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 125;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 23;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof fieldToInteger)) {
                int i4 = i2 + 117;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            fieldToInteger fieldtointeger = (fieldToInteger) obj;
            if (!this.RemoteActionCompatParcelizer.equals(fieldtointeger.RemoteActionCompatParcelizer)) {
                int i6 = IconCompatParcelizer + 107;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (this.read != fieldtointeger.read) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, fieldtointeger.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
