package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno implements r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U read;
    public final generatePOSTBodyString serializer;
    public final int write;

    public r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U r8lambda7pyt14uieahlprgfczvsqchol6u, int i, generatePOSTBodyString generatepostbodystring) {
        r8lambda7pyt14uieahlprgfczvsqchol6u.getClass();
        this.read = r8lambda7pyt14uieahlprgfczvsqchol6u;
        this.write = i;
        this.serializer = generatepostbodystring;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return af$$ExternalSyntheticOutline0.m(this.write, this.read.hashCode() * 31, 31) + this.serializer.hashCode();
        }
        return this.serializer.hashCode() >>> af$$ExternalSyntheticOutline0.m(this.write, this.read.hashCode() - 1, 7);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno) {
            r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno r8lambdaxtopdafkn1nrhqs3unfxqeftmno = (r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno) obj;
            if (this.read == r8lambdaxtopdafkn1nrhqs3unfxqeftmno.read && this.write == r8lambdaxtopdafkn1nrhqs3unfxqeftmno.write && this.serializer.equals(r8lambdaxtopdafkn1nrhqs3unfxqeftmno.serializer)) {
                return true;
            }
        } else {
            int i2 = RemoteActionCompatParcelizer + 81;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ConfirmSettingDialog(preferenceKey=" + this.read + ", keyResId=" + this.write + ", dialogEntity=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
