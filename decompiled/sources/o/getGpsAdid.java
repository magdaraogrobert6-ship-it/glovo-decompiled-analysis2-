package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getGpsAdid {
    private static int PlaybackStateCompatCustomAction = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final onServiceConnected MediaDescriptionCompat;
    public final onServiceDisconnected MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final o7ExternalSyntheticLambda3 RemoteActionCompatParcelizer;
    public final String read;
    public final t3 serializer;
    public final Boolean write;

    public getGpsAdid(String str, onServiceConnected onserviceconnected, String str2, onServiceDisconnected onservicedisconnected, o7ExternalSyntheticLambda3 o7externalsyntheticlambda3, t3 t3Var, Boolean bool, List list, String str3) {
        str.getClass();
        onserviceconnected.getClass();
        str2.getClass();
        this.read = str;
        this.MediaDescriptionCompat = onserviceconnected;
        this.IconCompatParcelizer = str2;
        this.MediaMetadataCompat = onservicedisconnected;
        this.RemoteActionCompatParcelizer = o7externalsyntheticlambda3;
        this.serializer = t3Var;
        this.write = bool;
        this.MediaBrowserCompatMediaItem = list;
        this.MediaSessionCompatQueueItem = str3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m((this.MediaDescriptionCompat.hashCode() + (this.read.hashCode() * 31)) * 31, 31, this.IconCompatParcelizer);
        int iHashCode2 = this.MediaMetadataCompat.hashCode();
        o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = 0;
        int iHashCode4 = o7externalsyntheticlambda3 == null ? 0 : o7externalsyntheticlambda3.hashCode();
        t3 t3Var = this.serializer;
        if (t3Var == null) {
            int i2 = PlaybackStateCompatCustomAction + 49;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = t3Var.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, (this.write.hashCode() + ((((((iHashCode2 + iM) * 31) + iHashCode4) * 31) + iHashCode) * 31)) * 31, 31), 31, false);
        String str = this.MediaSessionCompatQueueItem;
        if (str != null) {
            iHashCode3 = str.hashCode();
            int i3 = PlaybackStateCompatCustomAction + 99;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        int i5 = iM2 + iHashCode3;
        int i6 = RatingCompat + 35;
        PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("WorkOpportunity(id=");
        sb.append(this.read);
        sb.append(", type=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", description=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", workZone=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", centerPoint=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", bonusMultiplier=");
        sb.append(this.serializer);
        sb.append(", calendarEnabled=");
        sb.append(this.write);
        sb.append(", subzones=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", isSelected=false, startTime=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, ")");
        int i2 = PlaybackStateCompatCustomAction + 51;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 23;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 57;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            }
        } else {
            if (!(obj instanceof getGpsAdid)) {
                return false;
            }
            getGpsAdid getgpsadid = (getGpsAdid) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getgpsadid.read}, getCieXyz.write())).booleanValue() || this.MediaDescriptionCompat != getgpsadid.MediaDescriptionCompat) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getgpsadid.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!this.MediaMetadataCompat.equals(getgpsadid.MediaMetadataCompat)) {
                int i6 = RatingCompat + 21;
                PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getgpsadid.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getgpsadid.serializer}, getCieXyz.write())).booleanValue() || !this.write.equals(getgpsadid.write) || !this.MediaBrowserCompatMediaItem.equals(getgpsadid.MediaBrowserCompatMediaItem)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getgpsadid.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
