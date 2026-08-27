package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getExtraDataMapannotations {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.read;
        int i4 = i3 + 77;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        String str = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 59;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        if (i2 % 2 == 0) {
            str = this.serializer;
            int i4 = 14 / 0;
        } else {
            str = this.serializer;
        }
        int i5 = i3 + 15;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 29;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i2 + 95;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public getExtraDataMapannotations(String str, String str2, String str3, String str4, String str5) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.serializer = str4;
        this.read = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 51;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("FeedbackViewEntity(menuItem=", this.write, ", subject=", this.RemoteActionCompatParcelizer, ", body=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", title=", this.serializer, ", recipient=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.read, ")");
        int i4 = MediaMetadataCompat + 81;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 61;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.IconCompatParcelizer), 31, this.serializer);
        int i4 = MediaMetadataCompat + 41;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 43;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getExtraDataMapannotations)) {
            return false;
        }
        getExtraDataMapannotations getextradatamapannotations = (getExtraDataMapannotations) obj;
        if (this.write.equals(getextradatamapannotations.write)) {
            return this.RemoteActionCompatParcelizer.equals(getextradatamapannotations.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(getextradatamapannotations.IconCompatParcelizer) && this.serializer.equals(getextradatamapannotations.serializer) && this.read.equals(getextradatamapannotations.read);
        }
        int i4 = MediaMetadataCompat + 121;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
