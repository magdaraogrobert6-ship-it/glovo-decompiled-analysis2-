package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final boolean IconCompatParcelizer;
    public final String RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final boolean serializer;
    public final String write;

    public b1(int i, String str, String str2, boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.RemoteActionCompatParcelizer = i;
        this.RatingCompat = str;
        this.write = str2;
        this.serializer = z;
        this.IconCompatParcelizer = z2;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.RatingCompat), 31, this.write), 31, this.serializer), 31, this.IconCompatParcelizer);
        int i4 = MediaDescriptionCompat + 51;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 3;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("PopUpDialogViewEntity(illustrationRes=", this.RemoteActionCompatParcelizer, ", title=", this.RatingCompat, ", message=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.write, ", showDialog=", ", isCancelable=", sbM, this.serializer);
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", onDialogVisibilityChanged=");
        sbM.append(this.read);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 45;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 109;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.RemoteActionCompatParcelizer != b1Var.RemoteActionCompatParcelizer || !this.RatingCompat.equals(b1Var.RatingCompat)) {
            return false;
        }
        if (this.write.equals(b1Var.write)) {
            return this.serializer == b1Var.serializer && this.IconCompatParcelizer == b1Var.IconCompatParcelizer && this.read.equals(b1Var.read);
        }
        int i3 = MediaMetadataCompat + 77;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
