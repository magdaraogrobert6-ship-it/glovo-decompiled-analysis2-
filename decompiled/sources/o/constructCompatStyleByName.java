package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class constructCompatStyleByName {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public constructCompatStyleByName(String str, String str2, String str3, String str4, String str5) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.serializer = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 93;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("BonusInfo(whatsIncludedTitle=", this.write, ", whatsIncludedDescription=", this.RemoteActionCompatParcelizer, ", notIncludedTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", notIncludedDescription=", this.read, ", disclaimer=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.serializer, ")");
        int i4 = MediaMetadataCompat + 105;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.IconCompatParcelizer), 31, this.read);
        int i4 = MediaMetadataCompat + 87;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 89;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof constructCompatStyleByName)) {
                return false;
            }
            constructCompatStyleByName constructcompatstylebyname = (constructCompatStyleByName) obj;
            if (!this.write.equals(constructcompatstylebyname.write)) {
                int i3 = MediaDescriptionCompat + 85;
                MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return false;
                }
                int i4 = 2 / 5;
                return false;
            }
            if (!this.RemoteActionCompatParcelizer.equals(constructcompatstylebyname.RemoteActionCompatParcelizer) || !this.IconCompatParcelizer.equals(constructcompatstylebyname.IconCompatParcelizer) || !this.read.equals(constructcompatstylebyname.read) || (!this.serializer.equals(constructcompatstylebyname.serializer))) {
                return false;
            }
        }
        return true;
    }
}
