package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaXjIFM2Rv3TSSvQET1b2_Nyl7Sp8 extends accessgetRadioButtoncp {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 63;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.serializer;
        int i5 = i2 + 107;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 13;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i2 + 33;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdaXjIFM2Rv3TSSvQET1b2_Nyl7Sp8(String str, String str2, String str3, String str4) {
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.read = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 43;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("OpenWebApp(url=", this.serializer, ", title=", this.IconCompatParcelizer, ", analyticsName="), this.write, ", tag=", this.read, ")");
        int i4 = MediaMetadataCompat + 17;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.write);
        int i4 = MediaMetadataCompat + 115;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat;
        int i4 = i3 + 69;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (this == obj) {
            int i6 = i3 + 91;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaXjIFM2Rv3TSSvQET1b2_Nyl7Sp8)) {
            return false;
        }
        r8lambdaXjIFM2Rv3TSSvQET1b2_Nyl7Sp8 r8lambdaxjifm2rv3tssvqet1b2_nyl7sp8 = (r8lambdaXjIFM2Rv3TSSvQET1b2_Nyl7Sp8) obj;
        if (this.serializer.equals(r8lambdaxjifm2rv3tssvqet1b2_nyl7sp8.serializer)) {
            if (this.IconCompatParcelizer.equals(r8lambdaxjifm2rv3tssvqet1b2_nyl7sp8.IconCompatParcelizer)) {
                return this.write.equals(r8lambdaxjifm2rv3tssvqet1b2_nyl7sp8.write) && this.read.equals(r8lambdaxjifm2rv3tssvqet1b2_nyl7sp8.read);
            }
            i = MediaMetadataCompat + 67;
        } else {
            i = MediaMetadataCompat + 61;
        }
        MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i % 2;
        return false;
    }
}
