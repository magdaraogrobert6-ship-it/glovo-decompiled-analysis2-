package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getSpanVerticalAligndo9XGg {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final long serializer;
    public final String write;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getSpanVerticalAligndo9XGg(int i, long j, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        String str6;
        String str7;
        if ((i & 8) != 0) {
            int i2 = MediaBrowserCompatMediaItem + 79;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 16) != 0) {
            int i5 = RatingCompat + 29;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 36 / 0;
            }
            int i7 = 2 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 32) != 0) {
            int i8 = RatingCompat + 51;
            MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                throw null;
            }
            str7 = null;
        } else {
            str7 = str4;
        }
        this(j, str, z, str5, str6, str7, (String) null);
    }

    public getSpanVerticalAligndo9XGg(long j, String str, boolean z, String str2, String str3, String str4, String str5) {
        this.serializer = j;
        this.MediaSessionCompatQueueItem = str;
        this.read = z;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaMetadataCompat = str3;
        this.write = str4;
        this.IconCompatParcelizer = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("PhoneNumberParams(deliveryId=", ", number=", this.serializer, this.MediaSessionCompatQueueItem);
        sb.append(", masked=");
        sb.append(this.read);
        sb.append(", calleeName=");
        sb.append(this.RemoteActionCompatParcelizer);
        c8$$ExternalSyntheticOutline0.m(sb, ", orderCode=", this.MediaMetadataCompat, ", callee=", this.write);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", completedAt=", this.IconCompatParcelizer, ")");
        int i4 = MediaBrowserCompatMediaItem + 69;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Long.hashCode(this.serializer);
        String str = this.MediaSessionCompatQueueItem;
        int iM = d$$ExternalSyntheticOutline0.m(((iHashCode3 * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.read);
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            int i2 = RatingCompat + 81;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.MediaMetadataCompat;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.write;
        if (str4 == null) {
            int i4 = MediaBrowserCompatMediaItem + 107;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.IconCompatParcelizer;
        return ((((((iM + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RatingCompat + 9;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getSpanVerticalAligndo9XGg)) {
            return false;
        }
        getSpanVerticalAligndo9XGg getspanverticalaligndo9xgg = (getSpanVerticalAligndo9XGg) obj;
        if (this.serializer != getspanverticalaligndo9xgg.serializer) {
            return false;
        }
        Object[] objArr = {this.MediaSessionCompatQueueItem, getspanverticalaligndo9xgg.MediaSessionCompatQueueItem};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.read != getspanverticalaligndo9xgg.read) {
            int i4 = RatingCompat + 91;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr2 = {this.RemoteActionCompatParcelizer, getspanverticalaligndo9xgg.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.MediaMetadataCompat, getspanverticalaligndo9xgg.MediaMetadataCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            int i6 = MediaBrowserCompatMediaItem + 115;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr4 = {this.write, getspanverticalaligndo9xgg.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            int i8 = MediaBrowserCompatMediaItem + 95;
            RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        Object[] objArr5 = {this.IconCompatParcelizer, getspanverticalaligndo9xgg.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i10 = MediaBrowserCompatMediaItem + 33;
        RatingCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return true;
    }
}
