package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ad extends ac {
    private static int read = 0;
    private static int write = 1;
    public final bExternalSyntheticLambda3 RemoteActionCompatParcelizer;

    public ad(bExternalSyntheticLambda3 bexternalsyntheticlambda3) {
        this.RemoteActionCompatParcelizer = bexternalsyntheticlambda3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            int i3 = 74 / 0;
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        }
        int i4 = read + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToOtpScreen(otpNavData=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 25;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if (obj instanceof ad) {
            if (!this.RemoteActionCompatParcelizer.equals(((ad) obj).RemoteActionCompatParcelizer)) {
                return false;
            }
        } else {
            int i4 = read + 61;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            int i5 = 2 / 2;
            return false;
        }
        return true;
    }
}
