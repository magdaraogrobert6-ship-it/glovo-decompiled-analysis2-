package o;

/* JADX INFO: loaded from: classes3.dex */
public final class t2ExternalSyntheticLambda5 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final int RemoteActionCompatParcelizer;
    public final long write;

    public t2ExternalSyntheticLambda5(int i, long j) {
        this.RemoteActionCompatParcelizer = i;
        this.write = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write) + (Integer.hashCode(this.RemoteActionCompatParcelizer) * 31);
        int i4 = IconCompatParcelizer + 57;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iM729hashCodeimpl;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof t2ExternalSyntheticLambda5) {
            t2ExternalSyntheticLambda5 t2externalsyntheticlambda5 = (t2ExternalSyntheticLambda5) obj;
            if (this.RemoteActionCompatParcelizer == t2externalsyntheticlambda5.RemoteActionCompatParcelizer && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.write, t2externalsyntheticlambda5.write)) {
                return true;
            }
        }
        int i4 = read + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BonusIndicator(icon=" + this.RemoteActionCompatParcelizer + ", iconColor=" + androidx.compose.ui.graphics.Color.m730toStringimpl(this.write) + ")";
        int i2 = IconCompatParcelizer + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
