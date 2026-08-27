package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustSigner extends getSignerInstance {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String IconCompatParcelizer;

    public AdjustSigner(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Integer.hashCode(1) - af$$ExternalSyntheticOutline0.m(ddefault.IconCompatParcelizer.hashCode() / 65, 112, this.IconCompatParcelizer);
        }
        return Integer.hashCode(0) + af$$ExternalSyntheticOutline0.m(ddefault.IconCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 29;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof AdjustSigner)) {
                return false;
            }
            ddefault ddefaultVar = ddefault.serializer;
            return this.IconCompatParcelizer.equals(((AdjustSigner) obj).IconCompatParcelizer);
        }
        int i4 = i2 + 75;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBarType=" + ddefault.IconCompatParcelizer + ", message=" + this.IconCompatParcelizer + ", length=0)";
        int i2 = read + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
