package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustThirdPartySharing extends sign {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int ParcelableVolumeInfo = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final AdjustRemoteTrigger read;
    public final boolean serializer;
    public final t3 write;

    public AdjustThirdPartySharing(int i, String str, t3 t3Var, String str2, boolean z, boolean z2, String str3, String str4, AdjustRemoteTrigger adjustRemoteTrigger, String str5, String str6, String str7) {
        str.getClass();
        this.PlaybackStateCompatCustomAction = i;
        this.PlaybackStateCompat = str;
        this.write = t3Var;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = z2;
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.read = adjustRemoteTrigger;
        this.RatingCompat = str5;
        this.MediaSessionCompatQueueItem = str6;
        this.MediaDescriptionCompat = str7;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r1 r3
  0x0038: PHI (r1v24 int) = (r1v7 int), (r1v28 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r3v4 o.t3) = (r3v1 o.t3), (r3v7 o.t3) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v28 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        t3 t3Var;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatResultReceiverWrapper + 73;
        ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.PlaybackStateCompatCustomAction) << 47, 76, this.PlaybackStateCompat);
            t3Var = this.write;
            if (t3Var == null) {
                i = 0;
            } else {
                int iHashCode = t3Var.hashCode();
                int i4 = ParcelableVolumeInfo + 47;
                MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                i = iHashCode;
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.PlaybackStateCompatCustomAction) * 31, 31, this.PlaybackStateCompat);
            t3Var = this.write;
            if (t3Var == null) {
                i = 0;
            } else {
                int iHashCode2 = t3Var.hashCode();
                int i6 = ParcelableVolumeInfo + 47;
                MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i = iHashCode2;
            }
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + i) * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, this.serializer), 31, this.MediaMetadataCompat), 31, this.MediaBrowserCompatMediaItem);
        return this.MediaDescriptionCompat.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.read.hashCode() + iM2) * 31, 31, this.RatingCompat), 31, this.MediaSessionCompatQueueItem);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 91;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("NotWorking(zoneId=", this.PlaybackStateCompatCustomAction, ", zoneName=", this.PlaybackStateCompat, ", bonusMultiplier=");
        sbM.append(this.write);
        sbM.append(", buttonText=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", calendarEnabled=");
        af$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", isPaymentsOnMapEnabled=", this.serializer, ", promoDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaMetadataCompat, ", seeAllButtonText=", this.MediaBrowserCompatMediaItem, ", onDemandAvailability=");
        sbM.append(this.read);
        sbM.append(", outsideActiveAreaDescription=");
        sbM.append(this.RatingCompat);
        sbM.append(", outsideZoneButtonText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatQueueItem, ", outsideZoneDescription=", this.MediaDescriptionCompat, ")");
        int i4 = MediaSessionCompatResultReceiverWrapper + 61;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 45;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 47;
            ParcelableVolumeInfo = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 5 / 3;
            }
        } else if (obj instanceof AdjustThirdPartySharing) {
            AdjustThirdPartySharing adjustThirdPartySharing = (AdjustThirdPartySharing) obj;
            if (this.PlaybackStateCompatCustomAction != adjustThirdPartySharing.PlaybackStateCompatCustomAction) {
                return false;
            }
            Object[] objArr = {this.PlaybackStateCompat, adjustThirdPartySharing.PlaybackStateCompat};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.write, adjustThirdPartySharing.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || !this.IconCompatParcelizer.equals(adjustThirdPartySharing.IconCompatParcelizer) || this.RemoteActionCompatParcelizer != adjustThirdPartySharing.RemoteActionCompatParcelizer || this.serializer != adjustThirdPartySharing.serializer || !this.MediaMetadataCompat.equals(adjustThirdPartySharing.MediaMetadataCompat) || !this.MediaBrowserCompatMediaItem.equals(adjustThirdPartySharing.MediaBrowserCompatMediaItem) || !this.read.equals(adjustThirdPartySharing.read) || !this.RatingCompat.equals(adjustThirdPartySharing.RatingCompat) || !this.MediaSessionCompatQueueItem.equals(adjustThirdPartySharing.MediaSessionCompatQueueItem) || !this.MediaDescriptionCompat.equals(adjustThirdPartySharing.MediaDescriptionCompat)) {
                return false;
            }
        } else {
            int i8 = i4 + 103;
            MediaSessionCompatResultReceiverWrapper = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return false;
            }
            int i9 = 4 % 4;
            return false;
        }
        return true;
    }
}
