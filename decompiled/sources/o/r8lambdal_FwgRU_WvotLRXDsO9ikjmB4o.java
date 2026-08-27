package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o implements r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.write = str3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode() * af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 126, 107, this.serializer);
        } else {
            iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.serializer);
        }
        int i3 = read + 49;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("OpenAuthWebView(url=", this.RemoteActionCompatParcelizer, ", title=", this.serializer, ", analyticsName="), this.write, ")");
        int i4 = read + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o)) {
                return false;
            }
            r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o r8lambdal_fwgru_wvotlrxdso9ikjmb4o = (r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdal_fwgru_wvotlrxdso9ikjmb4o.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdal_fwgru_wvotlrxdso9ikjmb4o.serializer}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdal_fwgru_wvotlrxdso9ikjmb4o.write}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = read + 3;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            int i3 = IconCompatParcelizer + 93;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IconCompatParcelizer + 9;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
