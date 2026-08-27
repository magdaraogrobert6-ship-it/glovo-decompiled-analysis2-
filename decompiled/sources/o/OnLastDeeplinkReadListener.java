package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OnLastDeeplinkReadListener {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final onServiceConnected RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final Boolean read;
    public final String serializer;
    public final String write;

    public OnLastDeeplinkReadListener(String str, onServiceConnected onserviceconnected, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, List list, String str8) {
        str.getClass();
        onserviceconnected.getClass();
        str2.getClass();
        this.MediaBrowserCompatMediaItem = str;
        this.RatingCompat = onserviceconnected;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaSessionCompatResultReceiverWrapper = str3;
        this.MediaSessionCompatQueueItem = str4;
        this.serializer = str5;
        this.IconCompatParcelizer = str6;
        this.write = str7;
        this.read = bool;
        this.MediaDescriptionCompat = list;
        this.MediaMetadataCompat = str8;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("WorkOpportunityEntity(id=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", type=");
        sb.append(this.RatingCompat);
        sb.append(", description=");
        c8$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ", zoneName=", this.MediaSessionCompatResultReceiverWrapper, ", zoneGeoJson=");
        c8$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, ", centerGeoJson=", this.serializer, ", bonusTypes=");
        c8$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ", bonusMultiplier=", this.write, ", calendarEnabled=");
        sb.append(this.read);
        sb.append(", subzones=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", startTime=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.MediaMetadataCompat, ")");
        int i2 = PlaybackStateCompatCustomAction + 15;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m((this.RatingCompat.hashCode() + (this.MediaBrowserCompatMediaItem.hashCode() * 31)) * 31, 31, this.RemoteActionCompatParcelizer);
        String str = this.MediaSessionCompatResultReceiverWrapper;
        int iHashCode6 = 0;
        if (str == null) {
            int i2 = PlaybackStateCompatCustomAction + 31;
            ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.MediaSessionCompatQueueItem;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.serializer;
        if (str3 == null) {
            int i3 = PlaybackStateCompatCustomAction + 115;
            ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.IconCompatParcelizer;
        if (str4 == null) {
            int i5 = PlaybackStateCompatCustomAction + 119;
            ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.write;
        if (str5 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
            int i7 = ParcelableVolumeInfo + 41;
            PlaybackStateCompatCustomAction = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Boolean bool = this.read;
        if (bool == null) {
            int i9 = PlaybackStateCompatCustomAction + 35;
            ParcelableVolumeInfo = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = bool.hashCode();
        }
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, (((((((((((iM + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31, 31);
        String str6 = this.MediaMetadataCompat;
        if (str6 != null) {
            iHashCode6 = str6.hashCode();
            int i11 = PlaybackStateCompatCustomAction + 49;
            ParcelableVolumeInfo = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        return iM2 + iHashCode6;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLastDeeplinkReadListener)) {
            int i4 = i3 + 113;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        OnLastDeeplinkReadListener onLastDeeplinkReadListener = (OnLastDeeplinkReadListener) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, onLastDeeplinkReadListener.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue() || this.RatingCompat != onLastDeeplinkReadListener.RatingCompat) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, onLastDeeplinkReadListener.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatResultReceiverWrapper, onLastDeeplinkReadListener.MediaSessionCompatResultReceiverWrapper}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, onLastDeeplinkReadListener.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, onLastDeeplinkReadListener.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, onLastDeeplinkReadListener.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, onLastDeeplinkReadListener.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, onLastDeeplinkReadListener.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.MediaDescriptionCompat.equals(onLastDeeplinkReadListener.MediaDescriptionCompat)) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, onLastDeeplinkReadListener.MediaMetadataCompat}, getCieXyz.write())).booleanValue();
        }
        int i6 = PlaybackStateCompatCustomAction + 63;
        ParcelableVolumeInfo = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
