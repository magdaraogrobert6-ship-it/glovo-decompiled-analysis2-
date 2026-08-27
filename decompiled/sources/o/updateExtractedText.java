package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class updateExtractedText implements onRequestCursorAnchorInfo {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public final boolean IconCompatParcelizer;
    public final showSoftInput MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final hideSoftInput ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final boolean RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public updateExtractedText(String str, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, showSoftInput showsoftinput, boolean z3, hideSoftInput hidesoftinput, boolean z4) {
        str.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        str3.getClass();
        this.PlaybackStateCompat = str;
        this.MediaSessionCompatQueueItem = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.serializer = str2;
        this.write = str3;
        this.read = str4;
        this.RatingCompat = z;
        this.MediaSessionCompatResultReceiverWrapper = str5;
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = str6;
        this.MediaBrowserCompatMediaItem = showsoftinput;
        this.MediaMetadataCompat = z3;
        this.ParcelableVolumeInfo = hidesoftinput;
        this.MediaDescriptionCompat = z4;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.MediaSessionCompatQueueItem.hashCode() + (this.PlaybackStateCompat.hashCode() * 31)) * 31, 31, this.serializer), 31, this.write);
        String str = this.read;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = PlaybackStateCompatCustomAction + 51;
            MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.RatingCompat), 31, this.MediaSessionCompatResultReceiverWrapper), 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer);
        showSoftInput showsoftinput = this.MediaBrowserCompatMediaItem;
        int iM3 = d$$ExternalSyntheticOutline0.m((iM2 + (showsoftinput == null ? 0 : showsoftinput.hashCode())) * 31, 31, this.MediaMetadataCompat);
        hideSoftInput hidesoftinput = this.ParcelableVolumeInfo;
        if (hidesoftinput == null) {
            int i4 = PlaybackStateCompatCustomAction + 103;
            MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 / 3;
            }
        } else {
            iHashCode2 = hidesoftinput.hashCode();
        }
        return Boolean.hashCode(this.MediaDescriptionCompat) + ((iM3 + iHashCode2) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Gallery(visibleImageId=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", images=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", destinationName=");
        c8$$ExternalSyntheticOutline0.m(sb, this.serializer, ", address=", this.write, ", deliveryNotes=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.read, ", isTranslationEnabled=", ", translationTitle=", sb, this.RatingCompat);
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, ", addPhotoEnabled=", ", addPhotoText=", sb, this.IconCompatParcelizer);
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", detailsExpanded=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", imageExpanded=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", reportSheet=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", isReportSubmitting=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.MediaDescriptionCompat, ")");
        int i2 = PlaybackStateCompatCustomAction + 17;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 69;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof updateExtractedText) {
            updateExtractedText updateextractedtext = (updateExtractedText) obj;
            Object[] objArr = {this.PlaybackStateCompat, updateextractedtext.PlaybackStateCompat};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.MediaSessionCompatQueueItem, updateextractedtext.MediaSessionCompatQueueItem};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && this.serializer.equals(updateextractedtext.serializer)) {
                    Object[] objArr3 = {this.write, updateextractedtext.write};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        Object[] objArr4 = {this.read, updateextractedtext.read};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue() && this.RatingCompat == updateextractedtext.RatingCompat && this.MediaSessionCompatResultReceiverWrapper.equals(updateextractedtext.MediaSessionCompatResultReceiverWrapper) && this.IconCompatParcelizer == updateextractedtext.IconCompatParcelizer && this.RemoteActionCompatParcelizer.equals(updateextractedtext.RemoteActionCompatParcelizer)) {
                            if (this.MediaBrowserCompatMediaItem != updateextractedtext.MediaBrowserCompatMediaItem) {
                                int i3 = MediaSessionCompatToken + 73;
                                PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i4 = i3 % 2;
                            } else if (this.MediaMetadataCompat == updateextractedtext.MediaMetadataCompat) {
                                Object[] objArr5 = {this.ParcelableVolumeInfo, updateextractedtext.ParcelableVolumeInfo};
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue() && this.MediaDescriptionCompat == updateextractedtext.MediaDescriptionCompat) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i5 = PlaybackStateCompatCustomAction + 81;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
