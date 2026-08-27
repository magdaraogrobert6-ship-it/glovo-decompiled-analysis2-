package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getSignature extends resolvedLinkCallback {
    private static int read = 0;
    private static int serializer = 1;
    public final String write;

    public getSignature(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.write = str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(0) + af$$ExternalSyntheticOutline0.m(ddefault.IconCompatParcelizer.hashCode() * 31, 31, this.write);
        int i4 = read + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSignature)) {
            return false;
        }
        ddefault ddefaultVar = ddefault.serializer;
        if (!this.write.equals(((getSignature) obj).write)) {
            return false;
        }
        int i4 = read + 51;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBarType=" + ddefault.IconCompatParcelizer + ", message=" + this.write + ", length=0)";
        int i2 = read + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
