package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsSortKtUnmergedConfigComparator1 extends r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public SemanticsSortKtUnmergedConfigComparator1(String str, int i, String str2, String str3, String str4) {
        this.serializer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = str3;
        this.read = str4;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write), 31), 31, this.IconCompatParcelizer);
        int i4 = RatingCompat + 41;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 55;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Data(title=", this.serializer, ", description=", this.write, ", icon=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", enableBtnText=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", cancelBtnText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.read, ")");
        int i4 = RatingCompat + 29;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsSortKtUnmergedConfigComparator1)) {
            return false;
        }
        SemanticsSortKtUnmergedConfigComparator1 semanticsSortKtUnmergedConfigComparator1 = (SemanticsSortKtUnmergedConfigComparator1) obj;
        if (!this.serializer.equals(semanticsSortKtUnmergedConfigComparator1.serializer) || !this.write.equals(semanticsSortKtUnmergedConfigComparator1.write)) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == semanticsSortKtUnmergedConfigComparator1.RemoteActionCompatParcelizer) {
            return this.IconCompatParcelizer.equals(semanticsSortKtUnmergedConfigComparator1.IconCompatParcelizer) && this.read.equals(semanticsSortKtUnmergedConfigComparator1.read);
        }
        int i3 = MediaDescriptionCompat + 121;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
