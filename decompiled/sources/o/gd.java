package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class gd extends gf {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final double IconCompatParcelizer;
    public final String read;
    public final String serializer;

    public gd(double d, String str, String str2) {
        this.read = str;
        this.serializer = str2;
        this.IconCompatParcelizer = d;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ", isDestinationArrived=false)", c8$$ExternalSyntheticOutline0.m("Update(timeRemaining=", this.read, ", distanceRemaining=", this.serializer, ", rawDistanceRemainingMeters="));
        int i4 = write + 47;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(false) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.serializer), 31);
        int i4 = RemoteActionCompatParcelizer + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 113;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 97;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        if (!this.read.equals(gdVar.read) || !this.serializer.equals(gdVar.serializer) || Double.compare(this.IconCompatParcelizer, gdVar.IconCompatParcelizer) != 0) {
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 35;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
