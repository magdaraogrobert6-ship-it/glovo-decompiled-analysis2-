package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getOnThirdPartySharingSettingsReadListener extends setOnAdidReadListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;

    public getOnThirdPartySharingSettingsReadListener(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(0) + af$$ExternalSyntheticOutline0.m(ddefault.IconCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer);
        int i4 = serializer + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 65;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getOnThirdPartySharingSettingsReadListener)) {
            return false;
        }
        ddefault ddefaultVar = ddefault.serializer;
        return this.IconCompatParcelizer.equals(((getOnThirdPartySharingSettingsReadListener) obj).IconCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBarType=" + ddefault.IconCompatParcelizer + ", message=" + this.IconCompatParcelizer + ", length=0)";
        int i2 = serializer + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
