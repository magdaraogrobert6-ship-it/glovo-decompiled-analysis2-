package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class t2 {
    private static int ParcelableVolumeInfo = 1;
    private static int RatingCompat;
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public final t3 read;
    public final t1 serializer;
    public final Boolean write;

    public t2(String str, int i, String str2, t1 t1Var, t3 t3Var, boolean z, boolean z2, boolean z3, Boolean bool) {
        str.getClass();
        this.MediaMetadataCompat = str;
        this.MediaDescriptionCompat = i;
        this.MediaSessionCompatQueueItem = str2;
        this.serializer = t1Var;
        this.read = t3Var;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
        this.MediaBrowserCompatMediaItem = z3;
        this.write = bool;
    }

    public static t2 IconCompatParcelizer(t2 t2Var, boolean z) {
        int i = 2 % 2;
        String str = t2Var.MediaMetadataCompat;
        int i2 = t2Var.MediaDescriptionCompat;
        String str2 = t2Var.MediaSessionCompatQueueItem;
        t1 t1Var = t2Var.serializer;
        t3 t3Var = t2Var.read;
        boolean z2 = t2Var.RemoteActionCompatParcelizer;
        boolean z3 = t2Var.MediaBrowserCompatMediaItem;
        Boolean bool = t2Var.write;
        t2Var.getClass();
        str.getClass();
        t2 t2Var2 = new t2(str, i2, str2, t1Var, t3Var, z, z2, z3, bool);
        int i3 = ParcelableVolumeInfo + 35;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return t2Var2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 83;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("WorkingOpportunity(zoneName=", this.MediaDescriptionCompat, this.MediaMetadataCompat, ", zoneId=", ", url=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", startingPoint=");
        sbM.append(this.serializer);
        sbM.append(", bonusMultiplier=");
        sbM.append(this.read);
        sbM.append(", isSelected=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", forceShowZone=");
        af$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", upcomingSession=", this.MediaBrowserCompatMediaItem, ", calendarEnabled=");
        String strM = c8$$ExternalSyntheticOutline0.m(sbM, ")", this.write);
        int i4 = ParcelableVolumeInfo + 33;
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
        int iM = af$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, this.MediaMetadataCompat.hashCode() * 31, 31);
        String str = this.MediaSessionCompatQueueItem;
        if (str == null) {
            int i2 = RatingCompat + 107;
            ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        t1 t1Var = this.serializer;
        if (t1Var == null) {
            int i3 = ParcelableVolumeInfo + 77;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = t1Var.hashCode();
        }
        t3 t3Var = this.read;
        return this.write.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((((((iM + iHashCode) * 31) + iHashCode2) * 31) + (t3Var != null ? t3Var.hashCode() : 0)) * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, this.MediaBrowserCompatMediaItem);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 55;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof t2)) {
                return false;
            }
            t2 t2Var = (t2) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, t2Var.MediaMetadataCompat}, getCieXyz.write())).booleanValue() || this.MediaDescriptionCompat != t2Var.MediaDescriptionCompat) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, t2Var.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, t2Var.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, t2Var.read}, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != t2Var.IconCompatParcelizer) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == t2Var.RemoteActionCompatParcelizer) {
                if (this.MediaBrowserCompatMediaItem != t2Var.MediaBrowserCompatMediaItem || (!this.write.equals(t2Var.write))) {
                    return false;
                }
            } else {
                int i4 = ParcelableVolumeInfo + 17;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
