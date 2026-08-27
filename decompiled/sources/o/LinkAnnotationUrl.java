package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkAnnotationUrl {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final boolean write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 63;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 45;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i2 + 97;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = read + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 == 0) {
            str = this.serializer;
            int i4 = 28 / 0;
        } else {
            str = this.serializer;
        }
        int i5 = i3 + 45;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return str;
    }

    public LinkAnnotationUrl(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = z;
        this.serializer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 1;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("GlobalEntityConfig(globalEntityId=", this.IconCompatParcelizer, ", selfServiceRegion=", this.RemoteActionCompatParcelizer, ", registerDeviceTokenForP2pChat=REDACTED, selfServiceBrand="), this.serializer, ")");
            int i3 = MediaDescriptionCompat + 3;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("GlobalEntityConfig(globalEntityId=", this.IconCompatParcelizer, ", selfServiceRegion=", this.RemoteActionCompatParcelizer, ", registerDeviceTokenForP2pChat=REDACTED, selfServiceBrand="), this.serializer, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.write);
        String str = this.serializer;
        if (str == null) {
            int i2 = read + 25;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaDescriptionCompat = i3;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
            int i4 = i3 + 25;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = iM + iHashCode;
        int i7 = MediaDescriptionCompat + 11;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkAnnotationUrl)) {
            int i2 = MediaDescriptionCompat + 69;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        LinkAnnotationUrl linkAnnotationUrl = (LinkAnnotationUrl) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, linkAnnotationUrl.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, linkAnnotationUrl.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i4 = read + 79;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.write != linkAnnotationUrl.write) {
            int i6 = read + 45;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, linkAnnotationUrl.serializer}, getCieXyz.write())).booleanValue()) {
            int i8 = read + 65;
            MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = MediaDescriptionCompat + 105;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
