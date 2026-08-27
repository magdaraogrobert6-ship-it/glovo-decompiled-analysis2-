package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class sgExternalSyntheticLambda2 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final t0 IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public sgExternalSyntheticLambda2(String str, t0 t0Var, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.serializer = str;
        this.IconCompatParcelizer = t0Var;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.write.hashCode() + af$$ExternalSyntheticOutline0.m((this.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31, 31, this.RemoteActionCompatParcelizer);
        int i4 = MediaBrowserCompatMediaItem + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Payment(infraLevel=");
        sb.append(this.serializer);
        sb.append(", pin=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", nextPaymentTime=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ", lastPaymentTime=", this.write, ")");
        int i2 = MediaBrowserCompatMediaItem + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof sgExternalSyntheticLambda2) {
            sgExternalSyntheticLambda2 sgexternalsyntheticlambda2 = (sgExternalSyntheticLambda2) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, sgexternalsyntheticlambda2.serializer}, getCieXyz.write())).booleanValue() || !this.IconCompatParcelizer.equals(sgexternalsyntheticlambda2.IconCompatParcelizer)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, sgexternalsyntheticlambda2.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, sgexternalsyntheticlambda2.write}, getCieXyz.write())).booleanValue();
        }
        int i5 = i3 + 115;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
