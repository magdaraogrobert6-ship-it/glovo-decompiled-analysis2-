package o;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 extends d0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final bExternalSyntheticLambda3 RemoteActionCompatParcelizer;

    public d4(bExternalSyntheticLambda3 bexternalsyntheticlambda3) {
        this.RemoteActionCompatParcelizer = bexternalsyntheticlambda3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = serializer + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToOtpScreen(otpNavData=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 1;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 89;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else if (!(obj instanceof d4) || !this.RemoteActionCompatParcelizer.equals(((d4) obj).RemoteActionCompatParcelizer)) {
            return false;
        }
        int i6 = serializer + 1;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
