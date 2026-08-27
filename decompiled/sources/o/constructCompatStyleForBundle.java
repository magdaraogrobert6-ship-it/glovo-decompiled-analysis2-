package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class constructCompatStyleForBundle extends constructStyleForExtras {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final onServiceConnected write;

    public constructCompatStyleForBundle(String str, onServiceConnected onserviceconnected, String str2, String str3, String str4) {
        str.getClass();
        onserviceconnected.getClass();
        str4.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = onserviceconnected;
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
        this.read = str4;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.write.hashCode() + (iHashCode * 31)) * 31, 31, this.IconCompatParcelizer), 31, this.serializer);
        int i4 = RatingCompat + 35;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("WorkNow(opportunityId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", type=");
        sb.append(this.write);
        sb.append(", title=");
        c8$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ", buttonText=", this.serializer, ", description=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = MediaDescriptionCompat + 15;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof constructCompatStyleForBundle)) {
            return false;
        }
        constructCompatStyleForBundle constructcompatstyleforbundle = (constructCompatStyleForBundle) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, constructcompatstyleforbundle.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (this.write != constructcompatstyleforbundle.write || !this.IconCompatParcelizer.equals(constructcompatstyleforbundle.IconCompatParcelizer)) {
                return false;
            }
            if (this.serializer.equals(constructcompatstyleforbundle.serializer)) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, constructcompatstyleforbundle.read}, getCieXyz.write())).booleanValue();
            }
            i = RatingCompat + 77;
            MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            int i3 = MediaDescriptionCompat + 89;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return false;
            }
            i = 4;
        }
        int i4 = i % 2;
        return false;
    }
}
