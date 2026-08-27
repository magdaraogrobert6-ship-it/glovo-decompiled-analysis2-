package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextSelectionRange {
    private static int ComponentActivity = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final List PlaybackStateCompatCustomAction;
    public final Long RatingCompat;
    public final List RemoteActionCompatParcelizer;
    public final String ResultReceiver;
    public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final long read;
    public final String serializer;
    public final String write;

    public getTextSelectionRange(String str, Long l, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, long j, List list2, String str11, String str12, String str13, boolean z) {
        m1$$ExternalSyntheticOutline0.m(str, str5, str6, str7, str8);
        str9.getClass();
        str10.getClass();
        list2.getClass();
        str11.getClass();
        str13.getClass();
        this.ParcelableVolumeInfo = str;
        this.RatingCompat = l;
        this.ResultReceiver = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaSessionCompatToken = str4;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = str5;
        this.serializer = str6;
        this.RemoteActionCompatParcelizer = list;
        this.MediaBrowserCompatMediaItem = str7;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str8;
        this.MediaMetadataCompat = str9;
        this.IconCompatParcelizer = str10;
        this.read = j;
        this.PlaybackStateCompatCustomAction = list2;
        this.write = str11;
        this.PlaybackStateCompat = str12;
        this.MediaSessionCompatQueueItem = str13;
        this.MediaSessionCompatResultReceiverWrapper = z;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("UserData(id=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", expires=");
        sb.append(this.RatingCompat);
        sb.append(", username=REDACTED, emailServer=REDACTED, issuer=null, role=");
        c8$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatToken, ", token=REDACTED, contractType=", this.serializer, ", countries=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", countryCode=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", url=");
        c8$$ExternalSyntheticOutline0.m(sb, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, ", currency=", this.MediaMetadataCompat, ", city=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cityId=");
        sb.append(this.read);
        sb.append(", idVerificationLocations=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", brand=");
        sb.append(this.write);
        sb.append(", name=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", email=REDACTED, isNewPasswordRequired=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(")");
        String string = sb.toString();
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 87;
        ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.ParcelableVolumeInfo.hashCode();
        int iHashCode4 = this.RatingCompat.hashCode();
        String str = this.ResultReceiver;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = ComponentActivity;
            int i3 = i2 + 93;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 11;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            int i7 = ComponentActivity + 79;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i9 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 33;
            ComponentActivity = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        String str3 = this.MediaSessionCompatToken;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((((((iHashCode4 + (iHashCode3 * 31)) * 31) + iHashCode) * 31) + iHashCode2) * 961) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus), 31, this.serializer);
        List list = this.RemoteActionCompatParcelizer;
        int iM2 = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.PlaybackStateCompatCustomAction, d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + (list == null ? 0 : list.hashCode())) * 31, 31, this.MediaBrowserCompatMediaItem), 31, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys), 31, this.MediaMetadataCompat), 31, this.IconCompatParcelizer), 31, this.read), 31), 31, this.write);
        String str4 = this.PlaybackStateCompat;
        if (str4 == null) {
            int i11 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 25;
            ComponentActivity = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode5 = str4.hashCode();
        }
        return Boolean.hashCode(this.MediaSessionCompatResultReceiverWrapper) + af$$ExternalSyntheticOutline0.m((iM2 + iHashCode5) * 31, 31, this.MediaSessionCompatQueueItem);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = ComponentActivity + 25;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTextSelectionRange)) {
            return false;
        }
        getTextSelectionRange gettextselectionrange = (getTextSelectionRange) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ParcelableVolumeInfo, gettextselectionrange.ParcelableVolumeInfo}, getCieXyz.write())).booleanValue() || !this.RatingCompat.equals(gettextselectionrange.RatingCompat)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ResultReceiver, gettextselectionrange.ResultReceiver}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, gettextselectionrange.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, gettextselectionrange.MediaSessionCompatToken}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, gettextselectionrange.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, gettextselectionrange.serializer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, gettextselectionrange.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, gettextselectionrange.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, gettextselectionrange.r8lambda54BeH8ZsBru0CXI2CCSP2syNys}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, gettextselectionrange.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, gettextselectionrange.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || this.read != gettextselectionrange.read) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompatCustomAction, gettextselectionrange.PlaybackStateCompatCustomAction}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, gettextselectionrange.write}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompat, gettextselectionrange.PlaybackStateCompat}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, gettextselectionrange.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() && this.MediaSessionCompatResultReceiverWrapper == gettextselectionrange.MediaSessionCompatResultReceiverWrapper;
                }
                i = ComponentActivity + 85;
            } else {
                i = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 93;
                ComponentActivity = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i5 = i % 2;
            return false;
        }
        i = ComponentActivity + 45;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i % 2;
        return false;
    }
}
