package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class executeAsOne {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public executeAsOne(String str, String str2, String str3, String str4, String str5, String str6) {
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.serializer = str5;
        this.RatingCompat = str6;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 81;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("UserLoginInfo(employeeId=", this.write, ", city=", this.read, ", brand=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", countryCode=", this.RemoteActionCompatParcelizer, ", contractType=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", globalEntityId=", this.RatingCompat, ")");
        int i4 = MediaDescriptionCompat + 107;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 5;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RatingCompat.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.read), 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
        int i4 = MediaSessionCompatQueueItem + 89;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 117;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof executeAsOne)) {
                return false;
            }
            executeAsOne executeasone = (executeAsOne) obj;
            if (!this.write.equals(executeasone.write) || !this.read.equals(executeasone.read) || !this.IconCompatParcelizer.equals(executeasone.IconCompatParcelizer) || !this.RemoteActionCompatParcelizer.equals(executeasone.RemoteActionCompatParcelizer)) {
                return false;
            }
            if (!this.serializer.equals(executeasone.serializer)) {
                int i3 = MediaSessionCompatQueueItem + 43;
                MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!this.RatingCompat.equals(executeasone.RatingCompat)) {
                return false;
            }
        }
        return true;
    }
}
