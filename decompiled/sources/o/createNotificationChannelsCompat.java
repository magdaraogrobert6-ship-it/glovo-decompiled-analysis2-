package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createNotificationChannelsCompat {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompat;
    public final t3 IconCompatParcelizer;
    public final onServiceConnected MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatToken;
    public final String RatingCompat;
    public final List RemoteActionCompatParcelizer;
    public final Boolean read;
    public final o7ExternalSyntheticLambda3 serializer;
    public final instantiateActivity write;

    public createNotificationChannelsCompat(String str, String str2, List list, o7ExternalSyntheticLambda3 o7externalsyntheticlambda3, t3 t3Var, boolean z, instantiateActivity instantiateactivity, Boolean bool, onServiceConnected onserviceconnected, String str3, String str4) {
        str.getClass();
        str2.getClass();
        list.getClass();
        instantiateactivity.getClass();
        this.RatingCompat = str;
        this.MediaSessionCompatToken = str2;
        this.RemoteActionCompatParcelizer = list;
        this.serializer = o7externalsyntheticlambda3;
        this.IconCompatParcelizer = t3Var;
        this.MediaDescriptionCompat = z;
        this.write = instantiateactivity;
        this.read = bool;
        this.MediaBrowserCompatMediaItem = onserviceconnected;
        this.MediaSessionCompatQueueItem = str3;
        this.MediaMetadataCompat = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ createNotificationChannelsCompat(String str, String str2, List list, o7ExternalSyntheticLambda3 o7externalsyntheticlambda3, t3 t3Var, boolean z, instantiateActivity instantiateactivity, Boolean bool, onServiceConnected onserviceconnected, String str3, int i) {
        onServiceConnected onserviceconnected2;
        String str4;
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) != 0) {
            int i2 = MediaSessionCompatResultReceiverWrapper + 107;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            PlaybackStateCompat = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 109;
            MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            onserviceconnected2 = null;
        } else {
            onserviceconnected2 = onserviceconnected;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
            int i6 = PlaybackStateCompat + 89;
            MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            str4 = null;
        } else {
            str4 = str3;
        }
        this(str, str2, list, o7externalsyntheticlambda3, t3Var, z, instantiateactivity, bool, onserviceconnected2, (String) null, str4);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 69;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("StartNowOpportunity(id=", this.RatingCompat, ", zoneName=", this.MediaSessionCompatToken, ", area=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", center=");
        sbM.append(this.serializer);
        sbM.append(", bonusMultiplier=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", isSelected=");
        sbM.append(this.MediaDescriptionCompat);
        sbM.append(", availability=");
        sbM.append(this.write);
        sbM.append(", calendarEnabled=");
        sbM.append(this.read);
        sbM.append(", type=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", description=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", startTime=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.MediaMetadataCompat, ")");
        int i4 = PlaybackStateCompat + 27;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = 1;
        int i2 = MediaSessionCompatResultReceiverWrapper + 1;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.RatingCompat.hashCode() * 31, 31, this.MediaSessionCompatToken), 31);
        o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 = this.serializer;
        int iHashCode3 = o7externalsyntheticlambda3 == null ? 0 : o7externalsyntheticlambda3.hashCode();
        t3 t3Var = this.IconCompatParcelizer;
        if (t3Var == null) {
            iHashCode = 0;
        } else {
            iHashCode = t3Var.hashCode();
            int i4 = MediaSessionCompatResultReceiverWrapper + 79;
            PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((((iM + iHashCode3) * 31) + iHashCode) * 31, 31, this.MediaDescriptionCompat);
        int iHashCode4 = this.write.hashCode();
        Boolean bool = this.read;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        onServiceConnected onserviceconnected = this.MediaBrowserCompatMediaItem;
        int iHashCode6 = onserviceconnected == null ? 0 : onserviceconnected.hashCode();
        String str = this.MediaSessionCompatQueueItem;
        if (str == null) {
            int i6 = PlaybackStateCompat + 29;
            MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                iHashCode2 = 0;
            }
        } else {
            iHashCode2 = str.hashCode();
        }
        String str2 = this.MediaMetadataCompat;
        return ((((((((iHashCode4 + iM2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createNotificationChannelsCompat)) {
            return false;
        }
        createNotificationChannelsCompat createnotificationchannelscompat = (createNotificationChannelsCompat) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, createnotificationchannelscompat.RatingCompat}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, createnotificationchannelscompat.MediaSessionCompatToken}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, createnotificationchannelscompat.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, createnotificationchannelscompat.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, createnotificationchannelscompat.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.MediaDescriptionCompat != createnotificationchannelscompat.MediaDescriptionCompat) {
                int i2 = MediaSessionCompatResultReceiverWrapper + 47;
                PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (this.write != createnotificationchannelscompat.write) {
                int i4 = PlaybackStateCompat + 93;
                MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, createnotificationchannelscompat.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.MediaBrowserCompatMediaItem == createnotificationchannelscompat.MediaBrowserCompatMediaItem) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, createnotificationchannelscompat.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, createnotificationchannelscompat.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i6 = MediaSessionCompatResultReceiverWrapper + 101;
                PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            int i7 = PlaybackStateCompat + 7;
            MediaSessionCompatResultReceiverWrapper = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = MediaSessionCompatResultReceiverWrapper + 125;
        PlaybackStateCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
