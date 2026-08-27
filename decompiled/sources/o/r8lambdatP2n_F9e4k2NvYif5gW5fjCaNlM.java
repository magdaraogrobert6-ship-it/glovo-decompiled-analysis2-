package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final int read;
    public final boolean serializer;

    public r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM(boolean z, int i) {
        this.serializer = z;
        this.read = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.read) + (Boolean.hashCode(this.serializer) * 31);
        int i4 = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 105;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM)) {
            int i4 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm = (r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM) obj;
        if (this.serializer != r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm.serializer) {
            return false;
        }
        if (this.read == r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm.read) {
            return true;
        }
        int i6 = RemoteActionCompatParcelizer;
        int i7 = i6 + 61;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i6 + 49;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BadgeState(isVisible=" + this.serializer + ", count=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
