package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getStyles {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final String PlaybackStateCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public getStyles(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        d$$ExternalSyntheticOutline0.m(str6, str7, str11, str13);
        this.write = str;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.RatingCompat = str5;
        this.MediaBrowserCompatMediaItem = str6;
        this.MediaSessionCompatQueueItem = str7;
        this.MediaMetadataCompat = str8;
        this.MediaDescriptionCompat = str9;
        this.MediaSessionCompatResultReceiverWrapper = str10;
        this.PlaybackStateCompat = str11;
        this.MediaSessionCompatToken = str12;
        this.RemoteActionCompatParcelizer = str13;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 9;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HelpCenterInitRequest(appVersion=", this.write, ", bridge=true, email=REDACTED, globalEntityId=", this.IconCompatParcelizer, ", guest=false, locale=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", logCountryCode=", this.RatingCompat, ", name=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaBrowserCompatMediaItem, ", orderId=", this.MediaSessionCompatQueueItem, ", p2pChatToken=REDACTED, p2pChatType=p2p, p2pSdkVersion=null, p2pChatCountry=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.MediaDescriptionCompat, ", platformToken=REDACTED, serviceType=rider, userId=REDACTED, verificationToken=REDACTED, hostPerseusSessionId=", this.RemoteActionCompatParcelizer, ")");
        int i4 = ParcelableVolumeInfo + 111;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 107;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, true), 31, this.serializer), 31, this.IconCompatParcelizer), 31, false), 31, this.read), 31, this.RatingCompat), 31, this.MediaBrowserCompatMediaItem), 31, this.MediaSessionCompatQueueItem);
        int iM2 = af$$ExternalSyntheticOutline0.m((((this.MediaMetadataCompat.hashCode() + iM) * 31) + 109294) * 961, 31, this.MediaDescriptionCompat);
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((this.MediaSessionCompatResultReceiverWrapper.hashCode() + iM2) * 31) + 108508794) * 31, 31, this.PlaybackStateCompat), 31, this.MediaSessionCompatToken);
        int i4 = ParcelableVolumeInfo + 73;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = ParcelableVolumeInfo + 79;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof getStyles)) {
                return false;
            }
            getStyles getstyles = (getStyles) obj;
            if (!this.write.equals(getstyles.write) || !this.serializer.equals(getstyles.serializer) || !this.IconCompatParcelizer.equals(getstyles.IconCompatParcelizer) || !this.read.equals(getstyles.read) || !this.RatingCompat.equals(getstyles.RatingCompat)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, getstyles.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getstyles.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                i = PlaybackStateCompatCustomAction + 21;
            } else if (!this.MediaMetadataCompat.equals(getstyles.MediaMetadataCompat)) {
                i = PlaybackStateCompatCustomAction + 83;
            } else {
                if (!this.MediaDescriptionCompat.equals(getstyles.MediaDescriptionCompat)) {
                    return false;
                }
                if (!this.MediaSessionCompatResultReceiverWrapper.equals(getstyles.MediaSessionCompatResultReceiverWrapper)) {
                    int i4 = ParcelableVolumeInfo + 117;
                    PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompat, getstyles.PlaybackStateCompat}, getCieXyz.write())).booleanValue() || !this.MediaSessionCompatToken.equals(getstyles.MediaSessionCompatToken)) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getstyles.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            }
            ParcelableVolumeInfo = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i % 2;
            return false;
        }
        return true;
    }
}
