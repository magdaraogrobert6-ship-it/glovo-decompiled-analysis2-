package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I {
    private static int read = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final boolean serializer;

    public r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I(String str, boolean z) {
        this.IconCompatParcelizer = str;
        this.serializer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i2 = write + 101;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = write + 73;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iHashCode2 = Boolean.hashCode(this.serializer) + (iHashCode * 31);
        int i6 = read + 55;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (obj instanceof r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I) {
                r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I r8lambdapuqoe0vc36y8sbkts_umsekf62i = (r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I) obj;
                Object[] objArr = {this.IconCompatParcelizer, r8lambdapuqoe0vc36y8sbkts_umsekf62i.IconCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    i = read + 85;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else if (this.serializer != r8lambdapuqoe0vc36y8sbkts_umsekf62i.serializer) {
                    return false;
                }
            } else {
                i = write + 17;
                read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i % 2;
            return false;
        }
        int i4 = read + 123;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TooltipState(text=" + this.IconCompatParcelizer + ", isVisible=" + this.serializer + ")";
        int i2 = read + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
