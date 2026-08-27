package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class pf {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final String MediaSessionCompatToken;
    public final androidx.compose.ui.text.AnnotatedString PlaybackStateCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final long serializer;
    public final String write;

    public pf(String str, long j, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.MediaSessionCompatToken = str;
        this.serializer = j;
        this.IconCompatParcelizer = z;
        this.MediaSessionCompatQueueItem = z2;
        this.MediaMetadataCompat = str2;
        this.read = str3;
        this.write = str4;
        this.MediaDescriptionCompat = str5;
        this.MediaBrowserCompatMediaItem = str6;
        this.RemoteActionCompatParcelizer = str7;
        this.RatingCompat = str8;
        this.PlaybackStateCompat = annotatedString;
    }

    public static pf RemoteActionCompatParcelizer(pf pfVar, String str, long j, boolean z, boolean z2, String str2, int i) {
        String str3;
        long j2;
        int i2 = 2 % 2;
        int i3 = ParcelableVolumeInfo + 27;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 93;
            ParcelableVolumeInfo = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                str3 = pfVar.MediaSessionCompatToken;
            } else {
                String str4 = pfVar.MediaSessionCompatToken;
                throw null;
            }
        } else {
            str3 = str;
        }
        if ((i & 2) != 0) {
            int i7 = i4 + 77;
            ParcelableVolumeInfo = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                j2 = pfVar.serializer;
            } else {
                long j3 = pfVar.serializer;
                throw null;
            }
        } else {
            j2 = j;
        }
        boolean z3 = (i & 4) != 0 ? pfVar.IconCompatParcelizer : z;
        boolean z4 = (i & 8) != 0 ? pfVar.MediaSessionCompatQueueItem : z2;
        String str5 = pfVar.MediaMetadataCompat;
        String str6 = pfVar.read;
        String str7 = (i & 64) != 0 ? pfVar.write : str2;
        String str8 = pfVar.MediaDescriptionCompat;
        String str9 = pfVar.MediaBrowserCompatMediaItem;
        String str10 = pfVar.RemoteActionCompatParcelizer;
        String str11 = pfVar.RatingCompat;
        androidx.compose.ui.text.AnnotatedString annotatedString = pfVar.PlaybackStateCompat;
        pfVar.getClass();
        return new pf(str3, j2, z3, z4, str5, str6, str7, str8, str9, str10, str11, annotatedString);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 123;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.PlaybackStateCompat.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.MediaSessionCompatToken.hashCode() * 31, 31, this.serializer), 31, this.IconCompatParcelizer), 31, this.MediaSessionCompatQueueItem), 31, this.MediaMetadataCompat), 31, this.read), 31, this.write), 31, this.MediaDescriptionCompat), 31, this.MediaBrowserCompatMediaItem), 31, this.RemoteActionCompatParcelizer), 31, this.RatingCompat);
        int i4 = ParcelableVolumeInfo + 75;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 9;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("NafathModalUiState(verificationNumber=", this.MediaSessionCompatToken, this.serializer, ", expiresIn=");
        sbM.append(", isTimelessThanOneMinute=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", shouldShowConfirmationButton=");
        sbM.append(this.MediaSessionCompatQueueItem);
        c8$$ExternalSyntheticOutline0.m(sbM, ", title=", this.MediaMetadataCompat, ", instruction=", this.read);
        c8$$ExternalSyntheticOutline0.m(sbM, ", expiresText=", this.write, ", selectNumberLabel=", this.MediaDescriptionCompat);
        c8$$ExternalSyntheticOutline0.m(sbM, ", openAppButtonText=", this.MediaBrowserCompatMediaItem, ", confirmButtonText=", this.RemoteActionCompatParcelizer);
        sbM.append(", restrictionTitle=");
        sbM.append(this.RatingCompat);
        sbM.append(", warningBody=");
        sbM.append((Object) this.PlaybackStateCompat);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = PlaybackStateCompatCustomAction + 97;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        if (!this.MediaSessionCompatToken.equals(pfVar.MediaSessionCompatToken) || this.serializer != pfVar.serializer) {
            return false;
        }
        if (this.IconCompatParcelizer == pfVar.IconCompatParcelizer) {
            if (this.MediaSessionCompatQueueItem != pfVar.MediaSessionCompatQueueItem || !this.MediaMetadataCompat.equals(pfVar.MediaMetadataCompat)) {
                return false;
            }
            if (!this.read.equals(pfVar.read)) {
                i = PlaybackStateCompatCustomAction + 59;
            } else {
                if (!this.write.equals(pfVar.write) || !this.MediaDescriptionCompat.equals(pfVar.MediaDescriptionCompat)) {
                    return false;
                }
                if (this.MediaBrowserCompatMediaItem.equals(pfVar.MediaBrowserCompatMediaItem)) {
                    return this.RemoteActionCompatParcelizer.equals(pfVar.RemoteActionCompatParcelizer) && this.RatingCompat.equals(pfVar.RatingCompat) && this.PlaybackStateCompat.equals(pfVar.PlaybackStateCompat);
                }
                i = ParcelableVolumeInfo + 31;
                PlaybackStateCompatCustomAction = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i % 2;
            return false;
        }
        i = PlaybackStateCompatCustomAction + 113;
        ParcelableVolumeInfo = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i % 2;
        return false;
    }
}
