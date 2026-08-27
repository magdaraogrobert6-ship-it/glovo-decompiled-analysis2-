package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class tg extends tc {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk serializer;
    public final String write;

    @Override // o.tc
    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = read + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 == 0) {
            str = this.IconCompatParcelizer;
            int i4 = 9 / 0;
        } else {
            str = this.IconCompatParcelizer;
        }
        int i5 = i3 + 119;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    @Override // o.tc
    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        boolean z = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 25;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.tc
    public final String read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        throw null;
    }

    public tg(String str, String str2, boolean z, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
    }

    public static tg RemoteActionCompatParcelizer(tg tgVar, boolean z) {
        int i = 2 % 2;
        String str = tgVar.write;
        String str2 = tgVar.IconCompatParcelizer;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = tgVar.serializer;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        tg tgVar2 = new tg(str, str2, z, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
        int i2 = MediaDescriptionCompat + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return tgVar2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 81;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i5 = MediaDescriptionCompat + 3;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(i * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Available(headerTitle=", this.write, ", headerSubtitle=", this.IconCompatParcelizer, ", showLoading=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", bonusList=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 21;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, tgVar.write}, getCieXyz.write())).booleanValue()) {
            if (this.IconCompatParcelizer.equals(tgVar.IconCompatParcelizer)) {
                if (this.RemoteActionCompatParcelizer != tgVar.RemoteActionCompatParcelizer) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, tgVar.serializer}, getCieXyz.write())).booleanValue();
            }
            int i4 = MediaDescriptionCompat + 115;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            int i5 = 4 / 5;
            return false;
        }
        int i6 = read + 13;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
