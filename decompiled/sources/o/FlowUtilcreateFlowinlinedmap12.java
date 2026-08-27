package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowUtilcreateFlowinlinedmap12 {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public FlowUtilcreateFlowinlinedmap12(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.RatingCompat = str;
        this.MediaDescriptionCompat = str2;
        this.MediaSessionCompatResultReceiverWrapper = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.MediaMetadataCompat = str5;
        this.MediaSessionCompatQueueItem = str6;
        this.IconCompatParcelizer = str7;
        this.serializer = str8;
        this.write = str9;
        this.PlaybackStateCompatCustomAction = str10;
        this.RemoteActionCompatParcelizer = str11;
        this.read = str12;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 33;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("InstructionUiStringResources(privacyPolicyText=", this.RatingCompat, ", privacyPolicyHyperLinkText=", this.MediaDescriptionCompat, ", startCameraText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatResultReceiverWrapper, ", instructionTitle=", this.MediaBrowserCompatMediaItem, ", instructionSubTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaMetadataCompat, ", instructionRequirementTitle=", this.MediaSessionCompatQueueItem, ", instructionRequirementMask=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", instructionRequirementHelmet=", this.serializer, ", instructionRequirementGlasses=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.write, ", videoPrivacyTitle=", this.PlaybackStateCompatCustomAction, ", headerTitle=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", headerSubTitle=", this.read, ")");
        int i4 = ParcelableVolumeInfo + 105;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 103;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RatingCompat.hashCode() * 31, 31, this.MediaDescriptionCompat), 31, this.MediaSessionCompatResultReceiverWrapper), 31, this.MediaBrowserCompatMediaItem), 31, this.MediaMetadataCompat), 31, this.MediaSessionCompatQueueItem), 31, this.IconCompatParcelizer), 31, this.serializer), 31, this.write), 31, this.PlaybackStateCompatCustomAction), 31, this.RemoteActionCompatParcelizer);
        int i4 = PlaybackStateCompat + 39;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = PlaybackStateCompat + 67;
            ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            int i3 = 3 / 4;
            return true;
        }
        if (!(obj instanceof FlowUtilcreateFlowinlinedmap12)) {
            return false;
        }
        FlowUtilcreateFlowinlinedmap12 flowUtilcreateFlowinlinedmap12 = (FlowUtilcreateFlowinlinedmap12) obj;
        if (!this.RatingCompat.equals(flowUtilcreateFlowinlinedmap12.RatingCompat) || !this.MediaDescriptionCompat.equals(flowUtilcreateFlowinlinedmap12.MediaDescriptionCompat) || !this.MediaSessionCompatResultReceiverWrapper.equals(flowUtilcreateFlowinlinedmap12.MediaSessionCompatResultReceiverWrapper) || !this.MediaBrowserCompatMediaItem.equals(flowUtilcreateFlowinlinedmap12.MediaBrowserCompatMediaItem) || !this.MediaMetadataCompat.equals(flowUtilcreateFlowinlinedmap12.MediaMetadataCompat) || !this.MediaSessionCompatQueueItem.equals(flowUtilcreateFlowinlinedmap12.MediaSessionCompatQueueItem) || !this.IconCompatParcelizer.equals(flowUtilcreateFlowinlinedmap12.IconCompatParcelizer) || !this.serializer.equals(flowUtilcreateFlowinlinedmap12.serializer) || !this.write.equals(flowUtilcreateFlowinlinedmap12.write)) {
            return false;
        }
        if (this.PlaybackStateCompatCustomAction.equals(flowUtilcreateFlowinlinedmap12.PlaybackStateCompatCustomAction)) {
            return this.RemoteActionCompatParcelizer.equals(flowUtilcreateFlowinlinedmap12.RemoteActionCompatParcelizer) && this.read.equals(flowUtilcreateFlowinlinedmap12.read);
        }
        int i4 = PlaybackStateCompat + 91;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        int i5 = 3 / 2;
        return false;
    }
}
