package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class originalToTransformed {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final boolean IconCompatParcelizer;
    public final PartialGapBufferCompanion MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public originalToTransformed(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, String str2, String str3, boolean z, String str4, boolean z2, PartialGapBufferCompanion partialGapBufferCompanion) {
        str2.getClass();
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = str3;
        this.MediaSessionCompatQueueItem = z;
        this.MediaDescriptionCompat = str4;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompatMediaItem = partialGapBufferCompanion;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.serializer), 31, this.RemoteActionCompatParcelizer);
        String str = this.read;
        int iHashCode2 = 0;
        if (str == null) {
            int i4 = RatingCompat + 103;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.MediaSessionCompatQueueItem), 31, this.MediaDescriptionCompat), 31, this.IconCompatParcelizer);
        PartialGapBufferCompanion partialGapBufferCompanion = this.MediaBrowserCompatMediaItem;
        if (partialGapBufferCompanion != null) {
            iHashCode2 = partialGapBufferCompanion.hashCode();
            int i6 = RatingCompat + 17;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 5 / 3;
            }
        }
        return iM2 + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("GalleryRemoteData(images=");
        sb.append(this.write);
        sb.append(", destinationName=");
        sb.append(this.serializer);
        sb.append(", address=");
        c8$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ", deliveryNotes=", this.read, ", isTranslationEnabled=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", translationTitle=", this.MediaDescriptionCompat, ", addPhotoEnabled=", sb, this.MediaSessionCompatQueueItem);
        sb.append(this.IconCompatParcelizer);
        sb.append(", reportSheet=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(")");
        String string = sb.toString();
        int i2 = RatingCompat + 59;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 95;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            if (!(obj instanceof originalToTransformed)) {
                return false;
            }
            originalToTransformed originaltotransformed = (originalToTransformed) obj;
            if (!this.write.equals(originaltotransformed.write) || !this.serializer.equals(originaltotransformed.serializer)) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, originaltotransformed.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, originaltotransformed.read}, getCieXyz.write())).booleanValue() || this.MediaSessionCompatQueueItem != originaltotransformed.MediaSessionCompatQueueItem || !this.MediaDescriptionCompat.equals(originaltotransformed.MediaDescriptionCompat) || this.IconCompatParcelizer != originaltotransformed.IconCompatParcelizer) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, originaltotransformed.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i7 = MediaMetadataCompat + 95;
                RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return false;
                }
                int i8 = 5 % 3;
                return false;
            }
        }
        return true;
    }
}
