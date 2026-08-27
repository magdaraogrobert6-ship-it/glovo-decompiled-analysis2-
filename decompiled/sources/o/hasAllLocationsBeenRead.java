package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class hasAllLocationsBeenRead extends getPayloadFromSystemPropertyReflection {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int ComponentActivity;
    public final t3 IconCompatParcelizer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final boolean ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final Integer read;
    public final Boolean serializer;
    public final boolean write;

    public final t3 RemoteActionCompatParcelizer() {
        t3 t3Var;
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 15;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            t3Var = this.IconCompatParcelizer;
            int i4 = 40 / 0;
        } else {
            t3Var = this.IconCompatParcelizer;
        }
        int i5 = i2 + 3;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return t3Var;
    }

    public hasAllLocationsBeenRead(int i, String str, boolean z, t3 t3Var, String str2, String str3, String str4, Boolean bool, String str5, String str6, boolean z2, boolean z3, boolean z4, String str7, Integer num, String str8, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
        str.getClass();
        this.ComponentActivity = i;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = str;
        this.write = z;
        this.IconCompatParcelizer = t3Var;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaSessionCompatToken = str3;
        this.PlaybackStateCompatCustomAction = str4;
        this.serializer = bool;
        this.RatingCompat = str5;
        this.MediaMetadataCompat = str6;
        this.MediaSessionCompatResultReceiverWrapper = z2;
        this.PlaybackStateCompat = z3;
        this.ParcelableVolumeInfo = z4;
        this.MediaSessionCompatQueueItem = str7;
        this.read = num;
        this.MediaDescriptionCompat = str8;
        this.MediaBrowserCompatMediaItem = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 95;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("ZoneSelected(zoneId=", this.ComponentActivity, ", zoneName=", this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, ", isBonusVisible=");
        sbM.append(this.write);
        sbM.append(", bonusMultiplier=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", buttonText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", url=", this.MediaSessionCompatToken, ", startingPointName=");
        sbM.append(this.PlaybackStateCompatCustomAction);
        sbM.append(", calendarEnabled=");
        sbM.append(this.serializer);
        sbM.append(", promoDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RatingCompat, ", seeAllButtonText=", this.MediaMetadataCompat, ", shouldShowNoSessionAvailable=");
        af$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatResultReceiverWrapper, ", shouldShowSeeAllSessionButton=", this.PlaybackStateCompat, ", shouldShowQuickSessions=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", noSessionAvailableText=", this.MediaSessionCompatQueueItem, ", cityId=", sbM, this.ParcelableVolumeInfo);
        sbM.append(this.read);
        sbM.append(", quickSessionsSliderText=");
        sbM.append(this.MediaDescriptionCompat);
        sbM.append(", quickSessionStartOptions=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 91;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.ComponentActivity) * 31, 31, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY), 31, this.write);
        t3 t3Var = this.IconCompatParcelizer;
        if (t3Var == null) {
            int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 55;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = t3Var.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.RemoteActionCompatParcelizer);
        String str = this.MediaSessionCompatToken;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.PlaybackStateCompatCustomAction;
        if (str2 == null) {
            int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 107;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 121;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int iM3 = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + ((((iM2 + iHashCode4) * 31) + iHashCode2) * 31)) * 31, 31, this.RatingCompat), 31, this.MediaMetadataCompat), 31, this.MediaSessionCompatResultReceiverWrapper), 31, this.PlaybackStateCompat), 31, this.ParcelableVolumeInfo), 31, this.MediaSessionCompatQueueItem);
        Integer num = this.read;
        if (num == null) {
            int i8 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 49;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num.hashCode();
        }
        int iM4 = af$$ExternalSyntheticOutline0.m((iM3 + iHashCode3) * 31, 31, this.MediaDescriptionCompat);
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.MediaBrowserCompatMediaItem;
        return iM4 + (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk != null ? r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasAllLocationsBeenRead)) {
            return false;
        }
        hasAllLocationsBeenRead hasalllocationsbeenread = (hasAllLocationsBeenRead) obj;
        if (this.ComponentActivity != hasalllocationsbeenread.ComponentActivity) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, hasalllocationsbeenread.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.write == hasalllocationsbeenread.write) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, hasalllocationsbeenread.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || !this.RemoteActionCompatParcelizer.equals(hasalllocationsbeenread.RemoteActionCompatParcelizer)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, hasalllocationsbeenread.MediaSessionCompatToken}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompatCustomAction, hasalllocationsbeenread.PlaybackStateCompatCustomAction}, getCieXyz.write())).booleanValue()) {
                if (!this.serializer.equals(hasalllocationsbeenread.serializer) || !this.RatingCompat.equals(hasalllocationsbeenread.RatingCompat) || !this.MediaMetadataCompat.equals(hasalllocationsbeenread.MediaMetadataCompat) || this.MediaSessionCompatResultReceiverWrapper != hasalllocationsbeenread.MediaSessionCompatResultReceiverWrapper) {
                    return false;
                }
                if (this.PlaybackStateCompat == hasalllocationsbeenread.PlaybackStateCompat) {
                    if (this.ParcelableVolumeInfo != hasalllocationsbeenread.ParcelableVolumeInfo || !this.MediaSessionCompatQueueItem.equals(hasalllocationsbeenread.MediaSessionCompatQueueItem)) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, hasalllocationsbeenread.read}, getCieXyz.write())).booleanValue() || !this.MediaDescriptionCompat.equals(hasalllocationsbeenread.MediaDescriptionCompat)) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, hasalllocationsbeenread.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue();
                }
            }
            i = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 115;
        } else {
            i = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 121;
        }
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i % 2;
        return false;
    }
}
