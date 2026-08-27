package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidMultiParagraphDraw_androidKt extends buildStyledTypefaceFO1MlWM {
    private static int RatingCompat = 1;
    private static int write;
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;

    public AndroidMultiParagraphDraw_androidKt(String str, int i, boolean z, boolean z2) {
        str.getClass();
        this.read = z;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
        this.serializer = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 21;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.serializer) + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.read) * 31, 31, this.RemoteActionCompatParcelizer), 31);
        int i4 = RatingCompat + 79;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidMultiParagraphDraw_androidKt) {
            AndroidMultiParagraphDraw_androidKt androidMultiParagraphDraw_androidKt = (AndroidMultiParagraphDraw_androidKt) obj;
            if (this.read == androidMultiParagraphDraw_androidKt.read) {
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, androidMultiParagraphDraw_androidKt.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() ^ true) && this.IconCompatParcelizer == androidMultiParagraphDraw_androidKt.IconCompatParcelizer && this.serializer == androidMultiParagraphDraw_androidKt.serializer;
            }
            int i2 = write + 17;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 125;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigationEntrancePicture(showImage=" + this.read + ", imageUrl=" + this.RemoteActionCompatParcelizer + ", picturesCount=" + this.IconCompatParcelizer + ", showPictureCount=" + this.serializer + ")";
        int i2 = write + 53;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
