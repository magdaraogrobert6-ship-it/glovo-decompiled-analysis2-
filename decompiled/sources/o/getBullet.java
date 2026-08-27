package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getBullet {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final String write;

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 15;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 85;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 21;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        int i6 = i2 + 107;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        String str = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 119;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public getBullet(int i, String str, int i2, String str2) {
        str2.getClass();
        this.read = i;
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = i2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Integer.hashCode(this.read);
            throw null;
        }
        int iHashCode2 = Integer.hashCode(this.read);
        String str = this.write;
        if (str == null) {
            int i3 = IconCompatParcelizer + 27;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return Integer.hashCode(this.serializer) + af$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + iHashCode) * 31, 31, this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Rollout(rampSeconds=", this.read, ", rolloutHashInput=", this.write, ", startAt=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", targetPercentage=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 49;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getBullet) {
            getBullet getbullet = (getBullet) obj;
            if (this.read == getbullet.read) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getbullet.write}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getbullet.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (this.serializer == getbullet.serializer) {
                    return true;
                }
                int i2 = RatingCompat + 35;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = IconCompatParcelizer + 11;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        int i4 = RatingCompat + 1;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
