package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class teardownEventMetadataS {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final boolean IconCompatParcelizer;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public teardownEventMetadataS(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3;
        this.RatingCompat = str4;
        this.read = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PhoneNumberViewEntity(isMasked=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", number=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", callee=");
        c8$$ExternalSyntheticOutline0.m(sb, this.write, ", calleeName=", this.serializer, ", orderCode=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RatingCompat, ", completedAt=", this.read, ")");
        int i2 = MediaMetadataCompat + 59;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode4 = Boolean.hashCode(this.IconCompatParcelizer);
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode5 = 0;
        if (str == null) {
            int i4 = MediaMetadataCompat + 3;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = MediaBrowserCompatMediaItem + 61;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String str2 = this.write;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.serializer;
        if (str3 == null) {
            int i8 = MediaBrowserCompatMediaItem + 55;
            MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.RatingCompat;
        if (str4 == null) {
            int i10 = MediaBrowserCompatMediaItem + 29;
            MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.read;
        if (str5 != null) {
            iHashCode5 = str5.hashCode();
            int i12 = MediaMetadataCompat + 67;
            MediaBrowserCompatMediaItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        return (((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof teardownEventMetadataS)) {
            return false;
        }
        teardownEventMetadataS teardowneventmetadatas = (teardownEventMetadataS) obj;
        if (this.IconCompatParcelizer != teardowneventmetadatas.IconCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, teardowneventmetadatas.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, teardowneventmetadatas.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, teardowneventmetadatas.serializer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, teardowneventmetadatas.RatingCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, teardowneventmetadatas.read}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = MediaMetadataCompat + 65;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = MediaBrowserCompatMediaItem + 41;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 != 0;
    }
}
