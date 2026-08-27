package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextCenterJ6kI3mc {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final long IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public getTextCenterJ6kI3mc(long j, String str, String str2, long j2, String str3, long j3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.IconCompatParcelizer = j;
        this.read = str;
        this.write = str2;
        this.MediaBrowserCompatMediaItem = j2;
        this.serializer = str3;
        this.RemoteActionCompatParcelizer = j3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.IconCompatParcelizer) * 31, 31, this.read), 31, this.write), 31, this.MediaBrowserCompatMediaItem), 31, this.serializer);
        int i4 = MediaMetadataCompat + 27;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 69;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("Session(id=", ", country=", this.IconCompatParcelizer, this.read);
        af$$ExternalSyntheticOutline0.m(sb, ", countryUrl=", this.write, ", userId=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", contract=");
        sb.append(this.serializer);
        sb.append(", cityId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(")");
        String string = sb.toString();
        int i4 = MediaMetadataCompat + 81;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaDescriptionCompat + 97;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaMetadataCompat = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 47;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof getTextCenterJ6kI3mc)) {
            int i6 = MediaDescriptionCompat + 13;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        getTextCenterJ6kI3mc gettextcenterj6ki3mc = (getTextCenterJ6kI3mc) obj;
        if (this.IconCompatParcelizer != gettextcenterj6ki3mc.IconCompatParcelizer) {
            int i8 = MediaMetadataCompat + 107;
            MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        Object[] objArr = {this.read, gettextcenterj6ki3mc.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.write, gettextcenterj6ki3mc.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || this.MediaBrowserCompatMediaItem != gettextcenterj6ki3mc.MediaBrowserCompatMediaItem) {
            return false;
        }
        Object[] objArr3 = {this.serializer, gettextcenterj6ki3mc.serializer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            if (this.RemoteActionCompatParcelizer == gettextcenterj6ki3mc.RemoteActionCompatParcelizer) {
                return true;
            }
            int i10 = MediaMetadataCompat + 69;
            MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = MediaMetadataCompat;
        int i13 = i12 + 115;
        MediaDescriptionCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        int i15 = i12 + 41;
        MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i15 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
