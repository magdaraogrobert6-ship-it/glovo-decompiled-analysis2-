package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class generatePOSTBodyString {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final boolean IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public generatePOSTBodyString(String str, boolean z, String str2, String str3, String str4, String str5, int i, String str6) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = MediaBrowserCompatMediaItem + 125;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = MediaBrowserCompatMediaItem + 9;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = MediaSessionCompatQueueItem + 85;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i8 = MediaBrowserCompatMediaItem + 97;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str4 = null;
        }
        if ((i & 16) != 0) {
            int i11 = MediaBrowserCompatMediaItem;
            int i12 = i11 + 29;
            MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                int i13 = 1 / 0;
            }
            int i14 = i11 + 31;
            MediaSessionCompatQueueItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                int i15 = 5 % 5;
            } else {
                int i16 = 2 % 2;
            }
            str5 = null;
        }
        str6 = (i & 32) != 0 ? null : str6;
        z = (i & 64) != 0 ? true : z;
        this.MediaMetadataCompat = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.serializer = str4;
        this.read = str5;
        this.RatingCompat = str6;
        this.IconCompatParcelizer = z;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 119;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("MessageDialogEntity(title=", this.MediaMetadataCompat, ", description=", this.RemoteActionCompatParcelizer, ", mainActionButton=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.write, ", secondaryActionButton=", this.serializer, ", tertiaryActionButton=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", warningActionButton=", this.RatingCompat, ", cancellable=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ")");
        int i4 = MediaBrowserCompatMediaItem + 55;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.MediaMetadataCompat;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.write;
        if (str3 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
            int i2 = MediaBrowserCompatMediaItem + 101;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        String str4 = this.serializer;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.read;
        if (str5 == null) {
            int i4 = MediaBrowserCompatMediaItem + 107;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.RatingCompat;
        return Boolean.hashCode(this.IconCompatParcelizer) + (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 107;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof generatePOSTBodyString)) {
            int i4 = i2 + 91;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        generatePOSTBodyString generatepostbodystring = (generatePOSTBodyString) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, generatepostbodystring.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            int i6 = MediaBrowserCompatMediaItem;
            int i7 = i6 + 75;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 119;
            MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 88 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, generatepostbodystring.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, generatepostbodystring.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, generatepostbodystring.serializer}, getCieXyz.write())).booleanValue()) {
            int i11 = MediaBrowserCompatMediaItem + 23;
            MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, generatepostbodystring.read}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, generatepostbodystring.RatingCompat}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == generatepostbodystring.IconCompatParcelizer;
        }
        int i13 = MediaBrowserCompatMediaItem + 17;
        MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return false;
    }
}
