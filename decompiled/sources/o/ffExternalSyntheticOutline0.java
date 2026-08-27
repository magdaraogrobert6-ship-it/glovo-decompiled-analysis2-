package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ffExternalSyntheticOutline0 extends fe {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final String read;
    public final g4 write;

    public ffExternalSyntheticOutline0(String str) {
        g4 g4Var = new g4();
        str.getClass();
        super(g5.NEVER);
        this.read = str;
        this.IconCompatParcelizer = "demand";
        this.write = g4Var;
    }

    @Override // o.fe
    public final g4 serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        g4 g4Var = this.write;
        int i5 = i3 + 39;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return g4Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer);
        int i4 = MediaMetadataCompat + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HeatMap(url=", this.read, ", geoJsonProperty=", this.IconCompatParcelizer, ", visibleZoomRange=");
            sbM.append(this.write);
            sbM.append(")");
            return sbM.toString();
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("HeatMap(url=", this.read, ", geoJsonProperty=", this.IconCompatParcelizer, ", visibleZoomRange=");
        sbM2.append(this.write);
        sbM2.append(")");
        sbM2.toString();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffExternalSyntheticOutline0)) {
            return false;
        }
        ffExternalSyntheticOutline0 ffexternalsyntheticoutline0 = (ffExternalSyntheticOutline0) obj;
        Object[] objArr = {this.read, ffexternalsyntheticoutline0.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i3 = MediaMetadataCompat + 107;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 77;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.IconCompatParcelizer, ffexternalsyntheticoutline0.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.write, ffexternalsyntheticoutline0.write};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = MediaMetadataCompat + 105;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
