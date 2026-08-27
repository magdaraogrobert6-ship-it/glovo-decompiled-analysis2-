package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class addDate extends addDateInSeconds {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final boolean IconCompatParcelizer;
    public final float MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final addDoubleWithoutRounding MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final int write;

    public addDate(String str, String str2, String str3, String str4, boolean z, float f, int i, addDoubleWithoutRounding adddoublewithoutrounding, long j, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        adddoublewithoutrounding.getClass();
        this.RatingCompat = str;
        this.read = str2;
        this.MediaDescriptionCompat = str3;
        this.serializer = str4;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatMediaItem = f;
        this.write = i;
        this.MediaSessionCompatQueueItem = adddoublewithoutrounding;
        this.MediaMetadataCompat = j;
        this.RemoteActionCompatParcelizer = j2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 75;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RatingCompat.hashCode() * 31, 31, this.read), 31, this.MediaDescriptionCompat);
        String str = this.serializer;
        if (str == null) {
            int i4 = PlaybackStateCompat + 51;
            ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.RemoteActionCompatParcelizer) + MediaSessionCompatQueueItem.IconCompatParcelizer((this.MediaSessionCompatQueueItem.hashCode() + af$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline1.m(this.MediaBrowserCompatMediaItem, d$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.IconCompatParcelizer), 31), 31)) * 31, 31, this.MediaMetadataCompat);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 79;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM730toStringimpl = androidx.compose.ui.graphics.Color.m730toStringimpl(this.MediaMetadataCompat);
        String strM730toStringimpl2 = androidx.compose.ui.graphics.Color.m730toStringimpl(this.RemoteActionCompatParcelizer);
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Banner(name=", this.RatingCompat, ", description=", this.read, ", url=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaDescriptionCompat, ", iconUrl=", this.serializer, ", hasProgress=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", percentage=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", goalCount=");
        sbM.append(this.write);
        sbM.append(", status=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", indicatorColor=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, strM730toStringimpl, ", indicatorBackgroundColor=", strM730toStringimpl2, ")");
        int i4 = ParcelableVolumeInfo + 5;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 101;
        PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof addDate) {
            addDate adddate = (addDate) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, adddate.RatingCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, adddate.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, adddate.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, adddate.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.IconCompatParcelizer != adddate.IconCompatParcelizer) {
                int i5 = ParcelableVolumeInfo + 9;
                PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i5 % 2 != 0;
            }
            if (Float.compare(this.MediaBrowserCompatMediaItem, adddate.MediaBrowserCompatMediaItem) == 0) {
                return this.write == adddate.write && this.MediaSessionCompatQueueItem == adddate.MediaSessionCompatQueueItem && !(androidx.compose.ui.graphics.Color.m723equalsimpl0(this.MediaMetadataCompat, adddate.MediaMetadataCompat) ^ true) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.RemoteActionCompatParcelizer, adddate.RemoteActionCompatParcelizer);
            }
            int i6 = ParcelableVolumeInfo + 37;
            PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i2 + 89;
        PlaybackStateCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
