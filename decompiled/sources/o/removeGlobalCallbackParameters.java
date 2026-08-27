package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class removeGlobalCallbackParameters {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public removeGlobalCallbackParameters(String str, String str2, String str3, List list, String str4) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.RemoteActionCompatParcelizer = list;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3;
        this.read = str4;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 59;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.write), 31, this.serializer);
        int i4 = MediaMetadataCompat + 109;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CountryCodePickerViewState(items=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", searchQuery=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", title=");
        c8$$ExternalSyntheticOutline0.m(sb, this.write, ", searchPlaceholder=", this.serializer, ", closeButtonLabel=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = MediaMetadataCompat + 53;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RatingCompat + 99;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof removeGlobalCallbackParameters)) {
            return false;
        }
        removeGlobalCallbackParameters removeglobalcallbackparameters = (removeGlobalCallbackParameters) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, removeglobalcallbackparameters.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, removeglobalcallbackparameters.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, removeglobalcallbackparameters.write}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, removeglobalcallbackparameters.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, removeglobalcallbackparameters.read}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = RatingCompat + 37;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = RatingCompat + 65;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
