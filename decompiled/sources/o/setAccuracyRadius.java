package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setAccuracyRadius {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final ExtrasKey IconCompatParcelizer;
    public final ExtrasKey RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final String write;

    public setAccuracyRadius(int i, String str, String str2, ExtrasKey extrasKey, ExtrasKey extrasKey2) {
        this.read = i;
        this.serializer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = extrasKey;
        this.IconCompatParcelizer = extrasKey2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 89;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = hashCode() + af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_warning, (hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.read) * 31, 31, this.serializer), 31, this.write)) * 31, 31);
        int i4 = MediaBrowserCompatMediaItem + 99;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("ViewEntity(icon=", this.read, ", title=", this.serializer, ", additionalInfo=");
        sbM.append(this.write);
        sbM.append(", componentAction=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", buttonIcon=2131231163, buttonAction=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 117;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaMetadataCompat + 89;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof setAccuracyRadius) {
            setAccuracyRadius setaccuracyradius = (setAccuracyRadius) obj;
            if (this.read == setaccuracyradius.read) {
                if (this.serializer.equals(setaccuracyradius.serializer)) {
                    if (this.write.equals(setaccuracyradius.write)) {
                        if (this.RemoteActionCompatParcelizer == setaccuracyradius.RemoteActionCompatParcelizer) {
                            return this.IconCompatParcelizer == setaccuracyradius.IconCompatParcelizer;
                        }
                        int i4 = MediaBrowserCompatMediaItem + 51;
                        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        return false;
                    }
                } else {
                    int i6 = MediaMetadataCompat + 121;
                    MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            }
        } else {
            int i8 = MediaBrowserCompatMediaItem + 81;
            MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 3 % 2;
            }
        }
        return false;
    }
}
