package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationCompatAction extends instantiateProvider {
    private static int ComponentActivity = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final onServiceConnected MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final Boolean read;
    public final instantiateActivity serializer;
    public final t3 write;

    public NotificationCompatAction(String str, onServiceConnected onserviceconnected, String str2, String str3, String str4, t3 t3Var, boolean z, Boolean bool, boolean z2, String str5, String str6, instantiateActivity instantiateactivity, boolean z3, String str7, String str8) {
        str.getClass();
        str2.getClass();
        this.MediaSessionCompatResultReceiverWrapper = str;
        this.MediaSessionCompatToken = onserviceconnected;
        this.PlaybackStateCompat = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.RatingCompat = str4;
        this.write = t3Var;
        this.MediaSessionCompatQueueItem = z;
        this.read = bool;
        this.MediaMetadataCompat = z2;
        this.IconCompatParcelizer = str5;
        this.MediaBrowserCompatMediaItem = str6;
        this.serializer = instantiateactivity;
        this.MediaDescriptionCompat = z3;
        this.ParcelableVolumeInfo = str7;
        this.PlaybackStateCompatCustomAction = str8;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.MediaSessionCompatResultReceiverWrapper.hashCode();
        onServiceConnected onserviceconnected = this.MediaSessionCompatToken;
        int iHashCode5 = 1;
        int iHashCode6 = 0;
        if (onserviceconnected == null) {
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 107;
            ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = onserviceconnected.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(((iHashCode4 * 31) + iHashCode) * 31, 31, this.PlaybackStateCompat), 31, this.RemoteActionCompatParcelizer);
        String str = this.RatingCompat;
        if (str == null) {
            int i3 = ComponentActivity + 47;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        t3 t3Var = this.write;
        if (t3Var == null) {
            int i5 = ComponentActivity + 67;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 67;
            ComponentActivity = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = t3Var.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((this.read.hashCode() + d$$ExternalSyntheticOutline0.m((((iM + iHashCode2) * 31) + iHashCode3) * 31, 31, this.MediaSessionCompatQueueItem)) * 31, 31, this.MediaMetadataCompat);
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            int i10 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 9;
            ComponentActivity = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str2.hashCode();
        }
        String str3 = this.MediaBrowserCompatMediaItem;
        if (str3 != null) {
            iHashCode6 = str3.hashCode();
            int i11 = ComponentActivity + 47;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        return this.PlaybackStateCompatCustomAction.hashCode() + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + ((((iM2 + iHashCode5) * 31) + iHashCode6) * 31)) * 31, 31, this.MediaDescriptionCompat), 31, this.ParcelableVolumeInfo);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("WorkNow(opportunityId=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", type=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", title=");
        c8$$ExternalSyntheticOutline0.m(sb, this.PlaybackStateCompat, ", buttonText=", this.RemoteActionCompatParcelizer, ", description=");
        sb.append(this.RatingCompat);
        sb.append(", bonusMultiplier=");
        sb.append(this.write);
        sb.append(", isBonusVisible=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", calendarEnabled=");
        sb.append(this.read);
        sb.append(", isPaymentsOnMapEnabled=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", checkSchedule=", this.IconCompatParcelizer, ", nextPossibleAvailability=", sb, this.MediaMetadataCompat);
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", availability=");
        sb.append(this.serializer);
        sb.append(", isButtonEnabled=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", promoDescription=", this.ParcelableVolumeInfo, ", seeAllButtonText=", sb, this.MediaDescriptionCompat);
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.PlaybackStateCompatCustomAction, ")");
        int i2 = ComponentActivity + 67;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationCompatAction) {
            NotificationCompatAction notificationCompatAction = (NotificationCompatAction) obj;
            Object[] objArr = {this.MediaSessionCompatResultReceiverWrapper, notificationCompatAction.MediaSessionCompatResultReceiverWrapper};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.MediaSessionCompatToken == notificationCompatAction.MediaSessionCompatToken) {
                Object[] objArr2 = {this.PlaybackStateCompat, notificationCompatAction.PlaybackStateCompat};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer.equals(notificationCompatAction.RemoteActionCompatParcelizer)) {
                    Object[] objArr3 = {this.RatingCompat, notificationCompatAction.RatingCompat};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        Object[] objArr4 = {this.write, notificationCompatAction.write};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue() && this.MediaSessionCompatQueueItem == notificationCompatAction.MediaSessionCompatQueueItem && this.read.equals(notificationCompatAction.read) && this.MediaMetadataCompat == notificationCompatAction.MediaMetadataCompat) {
                            Object[] objArr5 = {this.IconCompatParcelizer, notificationCompatAction.IconCompatParcelizer};
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                                Object[] objArr6 = {this.MediaBrowserCompatMediaItem, notificationCompatAction.MediaBrowserCompatMediaItem};
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                                    if (this.serializer == notificationCompatAction.serializer) {
                                        if (this.MediaDescriptionCompat == notificationCompatAction.MediaDescriptionCompat && this.ParcelableVolumeInfo.equals(notificationCompatAction.ParcelableVolumeInfo) && this.PlaybackStateCompatCustomAction.equals(notificationCompatAction.PlaybackStateCompatCustomAction)) {
                                            return true;
                                        }
                                    } else {
                                        int i2 = ComponentActivity + 11;
                                        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i3 = i2 % 2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 53;
        ComponentActivity = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
