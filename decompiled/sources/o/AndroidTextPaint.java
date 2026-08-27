package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidTextPaint extends ActualParagraph4FmOz70 {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public final String RemoteActionCompatParcelizer;
    public final ImeAction read;
    public final getSpanVerticalAligndo9XGgannotations serializer;
    public final String write;

    public AndroidTextPaint(String str, String str2, ImeAction imeAction, getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = imeAction;
        this.serializer = getspanverticalaligndo9xggannotations;
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DestinationHeaderVersion2(destinationTitle=", this.write, ", description=", this.RemoteActionCompatParcelizer, ", primaryAddress=");
            sbM.append(this.read);
            sbM.append(", phoneNumber=REDACTED)");
            string = sbM.toString();
            int i3 = 29 / 0;
        } else {
            StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("DestinationHeaderVersion2(destinationTitle=", this.write, ", description=", this.RemoteActionCompatParcelizer, ", primaryAddress=");
            sbM2.append(this.read);
            sbM2.append(", phoneNumber=REDACTED)");
            string = sbM2.toString();
        }
        int i4 = RatingCompat + 51;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        int iHashCode2 = this.read.hashCode();
        getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations = this.serializer;
        if (getspanverticalaligndo9xggannotations == null) {
            int i4 = IconCompatParcelizer + 13;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getspanverticalaligndo9xggannotations.hashCode();
        }
        return ((iHashCode2 + iM) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 117;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (obj instanceof AndroidTextPaint) {
                AndroidTextPaint androidTextPaint = (AndroidTextPaint) obj;
                Object[] objArr = {this.write, androidTextPaint.write};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr2 = {this.RemoteActionCompatParcelizer, androidTextPaint.RemoteActionCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || !this.read.equals(androidTextPaint.read)) {
                    return false;
                }
                Object[] objArr3 = {this.serializer, androidTextPaint.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i5 = i2 + 17;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        int i7 = RatingCompat + 65;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
