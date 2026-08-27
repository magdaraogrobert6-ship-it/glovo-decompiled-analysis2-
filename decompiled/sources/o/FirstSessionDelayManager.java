package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FirstSessionDelayManager {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompat = 1;
    public final Boolean IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final List serializer;
    public final String write;

    public FirstSessionDelayManager(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, Boolean bool) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.RemoteActionCompatParcelizer = str;
        this.MediaMetadataCompat = str2;
        this.write = str3;
        this.MediaDescriptionCompat = str4;
        this.MediaSessionCompatQueueItem = str5;
        this.MediaBrowserCompatMediaItem = str6;
        this.RatingCompat = str7;
        this.serializer = list;
        this.read = str8;
        this.IconCompatParcelizer = bool;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 29;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("StartNowOpportunityData(id=", this.RemoteActionCompatParcelizer, ", type=", this.MediaMetadataCompat, ", description=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.write, ", startTime=", this.MediaDescriptionCompat, ", zoneName=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatQueueItem, ", zoneGeoJson=", this.MediaBrowserCompatMediaItem, ", zoneCenterGeoJson=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.RatingCompat, ", bonusTypes=", this.serializer, ", bonusMultiplier=");
        sbM.append(this.read);
        sbM.append(", calendarEnabled=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = PlaybackStateCompat + 39;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.MediaMetadataCompat), 31, this.write);
        String str = this.MediaDescriptionCompat;
        if (str == null) {
            int i2 = PlaybackStateCompat + 17;
            MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.MediaSessionCompatQueueItem;
        if (str2 == null) {
            int i4 = PlaybackStateCompat + 41;
            MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.RatingCompat;
        if (str4 == null) {
            int i6 = PlaybackStateCompat + 73;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaSessionCompatToken = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 43;
            PlaybackStateCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        List list = this.serializer;
        if (list == null) {
            int i11 = MediaSessionCompatToken + 43;
            PlaybackStateCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = list.hashCode();
        }
        String str5 = this.read;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.IconCompatParcelizer;
        return ((((((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaSessionCompatToken + 21;
            PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof FirstSessionDelayManager)) {
            return false;
        }
        FirstSessionDelayManager firstSessionDelayManager = (FirstSessionDelayManager) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, firstSessionDelayManager.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, firstSessionDelayManager.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            int i3 = PlaybackStateCompat + 97;
            MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, firstSessionDelayManager.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, firstSessionDelayManager.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, firstSessionDelayManager.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            int i4 = MediaSessionCompatToken + 111;
            PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, firstSessionDelayManager.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, firstSessionDelayManager.RatingCompat}, getCieXyz.write())).booleanValue()) {
            int i6 = PlaybackStateCompat + 81;
            MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, firstSessionDelayManager.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, firstSessionDelayManager.read}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, firstSessionDelayManager.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i8 = MediaSessionCompatToken + 39;
        PlaybackStateCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
