package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class uc {
    private static int ResultReceiver = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final String ComponentActivity;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public uc(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.MediaSessionCompatToken = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.MediaDescriptionCompat = str4;
        this.MediaSessionCompatQueueItem = str5;
        this.serializer = str6;
        this.PlaybackStateCompat = str7;
        this.ParcelableVolumeInfo = str8;
        this.MediaSessionCompatResultReceiverWrapper = str9;
        this.MediaBrowserCompatMediaItem = str10;
        this.ComponentActivity = str11;
        this.PlaybackStateCompatCustomAction = str12;
        this.RatingCompat = str13;
        this.MediaMetadataCompat = str14;
        this.RemoteActionCompatParcelizer = str15;
        this.write = str16;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 57;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CalendarInformationUiState(title=", this.MediaSessionCompatToken, ", bonusPromoTitle=", this.read, ", bonusPromoDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", promoLevelsTitle=", this.MediaDescriptionCompat, ", lowPromoText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatQueueItem, ", highPromoText=", this.serializer, ", totalBonusMultiplierTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.PlaybackStateCompat, ", totalBonusMultiplierDescription=", this.ParcelableVolumeInfo, ", totalBonusMultiplierValue=1.5 x, rushHourPromoTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatResultReceiverWrapper, ", rushHourPromoDescription=", this.MediaBrowserCompatMediaItem, ", weatherPromoTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.ComponentActivity, ", weatherPromoDescription=", this.PlaybackStateCompatCustomAction, ", nightPromoTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RatingCompat, ", nightPromoDescription=", this.MediaMetadataCompat, ", holidayPromoTitle=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", holidayPromoDescription=", this.write, ")");
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 45;
        ResultReceiver = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 99;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatToken.hashCode() * 31, 31, this.read), 31, this.IconCompatParcelizer), 31, this.MediaDescriptionCompat), 31, this.MediaSessionCompatQueueItem), 31, this.serializer), 31, this.PlaybackStateCompat);
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((this.ParcelableVolumeInfo.hashCode() + iM) * 31) + 46674960) * 31, 31, this.MediaSessionCompatResultReceiverWrapper), 31, this.MediaBrowserCompatMediaItem), 31, this.ComponentActivity), 31, this.PlaybackStateCompatCustomAction), 31, this.RatingCompat), 31, this.MediaMetadataCompat), 31, this.RemoteActionCompatParcelizer);
        int i4 = ResultReceiver + 39;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        if (!this.MediaSessionCompatToken.equals(ucVar.MediaSessionCompatToken)) {
            return false;
        }
        if (!this.read.equals(ucVar.read)) {
            int i4 = ResultReceiver + 49;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            int i5 = 5 % 3;
            return false;
        }
        if (!this.IconCompatParcelizer.equals(ucVar.IconCompatParcelizer) || !this.MediaDescriptionCompat.equals(ucVar.MediaDescriptionCompat) || !this.MediaSessionCompatQueueItem.equals(ucVar.MediaSessionCompatQueueItem) || !this.serializer.equals(ucVar.serializer) || !this.PlaybackStateCompat.equals(ucVar.PlaybackStateCompat) || !this.ParcelableVolumeInfo.equals(ucVar.ParcelableVolumeInfo) || !this.MediaSessionCompatResultReceiverWrapper.equals(ucVar.MediaSessionCompatResultReceiverWrapper)) {
            return false;
        }
        if (!this.MediaBrowserCompatMediaItem.equals(ucVar.MediaBrowserCompatMediaItem)) {
            i = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 65;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            if (!this.ComponentActivity.equals(ucVar.ComponentActivity) || !this.PlaybackStateCompatCustomAction.equals(ucVar.PlaybackStateCompatCustomAction) || !this.RatingCompat.equals(ucVar.RatingCompat)) {
                return false;
            }
            if (this.MediaMetadataCompat.equals(ucVar.MediaMetadataCompat)) {
                return this.RemoteActionCompatParcelizer.equals(ucVar.RemoteActionCompatParcelizer) && this.write.equals(ucVar.write);
            }
            i = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 9;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        ResultReceiver = i2;
        int i6 = i % 2;
        return false;
    }
}
