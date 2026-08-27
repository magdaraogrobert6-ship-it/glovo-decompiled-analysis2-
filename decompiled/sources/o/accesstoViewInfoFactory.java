package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accesstoViewInfoFactory implements findDesignInfoProviderslambda10 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final findDesignInfoProviders RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public accesstoViewInfoFactory(String str, String str2, String str3, String str4, findDesignInfoProviders finddesigninfoproviders) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.serializer = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = finddesigninfoproviders;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 99;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PaymentUiItem(title=", this.write, ", info=", this.serializer, ", amount=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", note=", this.IconCompatParcelizer, ", tip=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RatingCompat + 17;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.serializer);
        String str = this.read;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = MediaMetadataCompat + 93;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.IconCompatParcelizer;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        findDesignInfoProviders finddesigninfoproviders = this.RemoteActionCompatParcelizer;
        if (finddesigninfoproviders != null) {
            iHashCode2 = finddesigninfoproviders.hashCode();
            int i4 = RatingCompat + 29;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = ((((iM + iHashCode) * 31) + iHashCode3) * 31) + iHashCode2;
        int i7 = RatingCompat + 39;
        MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaMetadataCompat + 115;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof accesstoViewInfoFactory)) {
            int i4 = RatingCompat + 37;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        accesstoViewInfoFactory accesstoviewinfofactory = (accesstoViewInfoFactory) obj;
        Object[] objArr = {this.write, accesstoviewinfofactory.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.serializer, accesstoviewinfofactory.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i6 = MediaMetadataCompat + 113;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr3 = {this.read, accesstoviewinfofactory.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.IconCompatParcelizer, accesstoviewinfofactory.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.RemoteActionCompatParcelizer, accesstoviewinfofactory.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i8 = MediaMetadataCompat + 49;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
