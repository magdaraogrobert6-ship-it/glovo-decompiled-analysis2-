package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class sendReftagReferrerI extends sendLicenseVerificationDataI {
    private static int read = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;

    public sendReftagReferrerI(String str) {
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            int i3 = 31 / 0;
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
        }
        int i4 = read + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("Error(message=", this.IconCompatParcelizer, ")");
        }
        ff$$ExternalSyntheticOutline0.m("Error(message=", this.IconCompatParcelizer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sendReftagReferrerI) && this.IconCompatParcelizer.equals(((sendReftagReferrerI) obj).IconCompatParcelizer)) {
            return true;
        }
        int i4 = serializer + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
