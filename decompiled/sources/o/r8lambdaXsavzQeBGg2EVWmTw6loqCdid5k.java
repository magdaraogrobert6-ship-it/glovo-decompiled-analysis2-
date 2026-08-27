package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk serializer;

    public r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(String str, String str2, String str3, r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.serializer = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer);
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.serializer;
        if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk == null) {
            int i4 = MediaDescriptionCompat + 41;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.hashCode();
        }
        return iM + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ProductItem(title=", this.read, ", price=", this.IconCompatParcelizer, ", quantity=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", extras=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
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
        if (obj instanceof r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k) {
            r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k r8lambdaxsavzqebgg2evwmtw6loqcdid5k = (r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdaxsavzqebgg2evwmtw6loqcdid5k.read}, getCieXyz.write())).booleanValue()) {
                int i2 = MediaDescriptionCompat + 91;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdaxsavzqebgg2evwmtw6loqcdid5k.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdaxsavzqebgg2evwmtw6loqcdid5k.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdaxsavzqebgg2evwmtw6loqcdid5k.serializer}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = MediaDescriptionCompat + 107;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = MediaDescriptionCompat + 47;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = write + 15;
        MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }
}
