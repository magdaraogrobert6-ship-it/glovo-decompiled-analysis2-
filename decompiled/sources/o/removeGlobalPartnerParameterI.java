package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class removeGlobalPartnerParameterI {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final String write;

    public removeGlobalPartnerParameterI(String str, String str2, String str3, String str4, boolean z) {
        af$$ExternalSyntheticOutline0.m3978m(str2, str3, str4);
        this.write = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.IconCompatParcelizer = str4;
        this.read = z;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CountryCodeItem(flag=", this.write, ", name=", this.serializer, ", callingCode=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", countryIsoCode=", this.IconCompatParcelizer, ", isSelected=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.read, ")");
        int i4 = MediaBrowserCompatMediaItem + 99;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.write;
        int iHashCode = Boolean.hashCode(this.read) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.serializer), 31, this.RemoteActionCompatParcelizer), 31, this.IconCompatParcelizer);
        int i4 = MediaBrowserCompatMediaItem + 15;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof removeGlobalPartnerParameterI) {
            removeGlobalPartnerParameterI removeglobalpartnerparameteri = (removeGlobalPartnerParameterI) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, removeglobalpartnerparameteri.write}, getCieXyz.write())).booleanValue()) {
                int i2 = MediaBrowserCompatMediaItem + 125;
                MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, removeglobalpartnerparameteri.serializer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, removeglobalpartnerparameteri.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, removeglobalpartnerparameteri.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.read == removeglobalpartnerparameteri.read;
            }
            int i3 = MediaBrowserCompatMediaItem + 113;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = MediaBrowserCompatMediaItem + 81;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
