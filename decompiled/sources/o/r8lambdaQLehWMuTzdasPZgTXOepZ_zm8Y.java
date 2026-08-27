package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaQLehWMuTzdasPZgTXOepZ_zm8Y extends accessgetRadioButtoncp {
    private static int read = 0;
    private static int serializer = 1;
    public final r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA IconCompatParcelizer;

    public final r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 119;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA r8lambda8ew4gch7wj99pe_ivdynvykauda = this.IconCompatParcelizer;
        int i5 = i2 + 55;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda8ew4gch7wj99pe_ivdynvykauda;
    }

    public r8lambdaQLehWMuTzdasPZgTXOepZ_zm8Y(r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA r8lambda8ew4gch7wj99pe_ivdynvykauda) {
        this.IconCompatParcelizer = r8lambda8ew4gch7wj99pe_ivdynvykauda;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = serializer + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenHelpCenter(helpCenterDeepLinkParams=" + this.IconCompatParcelizer + ")";
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj || ((obj instanceof r8lambdaQLehWMuTzdasPZgTXOepZ_zm8Y) && !(!this.IconCompatParcelizer.equals(((r8lambdaQLehWMuTzdasPZgTXOepZ_zm8Y) obj).IconCompatParcelizer)))) {
            return true;
        }
        int i4 = read + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return false;
    }
}
