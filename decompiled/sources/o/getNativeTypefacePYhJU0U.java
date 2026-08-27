package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getNativeTypefacePYhJU0U extends toAccessibilitySpannableString {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;
    public final boolean write;

    public getNativeTypefacePYhJU0U(String str, int i, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
        this.read = z;
        this.serializer = z2;
        this.write = z3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("EntrancePictureIcon(imageUrl=", this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, ", picturesCount=", ", showPictureCount=");
        af$$ExternalSyntheticOutline0.m(sbM, this.read, ", showTooltip=", this.serializer, ", isIconVisible=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.write, ")");
        int i4 = MediaDescriptionCompat + 87;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public static getNativeTypefacePYhJU0U write(getNativeTypefacePYhJU0U getnativetypefacepyhju0u, int i) {
        boolean z;
        boolean z2;
        int i2 = 2 % 2;
        String str = getnativetypefacepyhju0u.RemoteActionCompatParcelizer;
        int i3 = getnativetypefacepyhju0u.IconCompatParcelizer;
        boolean z3 = getnativetypefacepyhju0u.read;
        if ((i & 8) != 0) {
            int i4 = MediaDescriptionCompat + 109;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                z2 = getnativetypefacepyhju0u.serializer;
                int i5 = 13 / 0;
            } else {
                z2 = getnativetypefacepyhju0u.serializer;
            }
            z = z2;
        } else {
            z = false;
        }
        int i6 = RatingCompat;
        int i7 = i6 + 121;
        MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i6 + 61;
        MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        boolean z4 = (i & 16) != 0 ? getnativetypefacepyhju0u.write : true;
        str.getClass();
        return new getNativeTypefacePYhJU0U(str, i3, z3, z, z4);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.write) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer.hashCode() * 31, 31), 31, this.read), 31, this.serializer);
        int i4 = RatingCompat + 71;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNativeTypefacePYhJU0U)) {
            return false;
        }
        getNativeTypefacePYhJU0U getnativetypefacepyhju0u = (getNativeTypefacePYhJU0U) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getnativetypefacepyhju0u.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i2 = MediaDescriptionCompat + 1;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (this.IconCompatParcelizer != getnativetypefacepyhju0u.IconCompatParcelizer) {
            int i4 = MediaDescriptionCompat + 117;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.read == getnativetypefacepyhju0u.read) {
            return this.serializer == getnativetypefacepyhju0u.serializer && this.write == getnativetypefacepyhju0u.write;
        }
        int i6 = MediaDescriptionCompat + 69;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
