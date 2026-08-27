package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getIdentity {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final List MediaMetadataCompat;
    public final getUpdate MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final PartialGapBuffer read;
    public final String serializer;
    public final PartialGapBuffer write;

    public getIdentity(String str, String str2, boolean z, getUpdate getupdate, List list, String str3, String str4, PartialGapBuffer partialGapBuffer, PartialGapBuffer partialGapBuffer2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.RatingCompat = str2;
        this.MediaBrowserCompatMediaItem = z;
        this.MediaSessionCompatQueueItem = getupdate;
        this.MediaMetadataCompat = list;
        this.serializer = str3;
        this.IconCompatParcelizer = str4;
        this.read = partialGapBuffer;
        this.write = partialGapBuffer2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 125;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.RatingCompat), 31, this.MediaBrowserCompatMediaItem);
        getUpdate getupdate = this.MediaSessionCompatQueueItem;
        int iHashCode2 = 1;
        if (getupdate == null) {
            int i4 = MediaSessionCompatResultReceiverWrapper + 11;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = getupdate.hashCode();
        }
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat, (iM + iHashCode) * 31, 31);
        String str = this.serializer;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.IconCompatParcelizer;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        PartialGapBuffer partialGapBuffer = this.read;
        if (partialGapBuffer == null) {
            int i5 = MediaDescriptionCompat + 71;
            MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                iHashCode2 = 0;
            }
        } else {
            iHashCode2 = partialGapBuffer.hashCode();
        }
        PartialGapBuffer partialGapBuffer2 = this.write;
        return ((((((iM2 + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + (partialGapBuffer2 != null ? partialGapBuffer2.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RemoteImage(id=", this.RemoteActionCompatParcelizer, ", url=", this.RatingCompat, ", reportEnabled=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", reportRequest=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", tags=");
        sbM.append(this.MediaMetadataCompat);
        sbM.append(", ownerName=");
        sbM.append(this.serializer);
        sbM.append(", datePosted=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", likes=");
        sbM.append(this.read);
        sbM.append(", dislikes=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 107;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof getIdentity))) {
            getIdentity getidentity = (getIdentity) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getidentity.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, getidentity.RatingCompat}, getCieXyz.write())).booleanValue()) {
                    if (this.MediaBrowserCompatMediaItem != getidentity.MediaBrowserCompatMediaItem) {
                        int i2 = MediaDescriptionCompat + 9;
                        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getidentity.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, getidentity.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getidentity.serializer}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getidentity.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                                int i4 = MediaSessionCompatResultReceiverWrapper + 43;
                                MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i5 = i4 % 2;
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getidentity.read}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getidentity.write}, getCieXyz.write())).booleanValue();
                        }
                        int i6 = MediaSessionCompatResultReceiverWrapper + 47;
                        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        return false;
                    }
                    int i8 = MediaDescriptionCompat + 109;
                    MediaSessionCompatResultReceiverWrapper = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i8 % 2 == 0;
                }
                int i9 = MediaSessionCompatResultReceiverWrapper + 109;
                MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i9 % 2 != 0;
            }
        }
        return false;
    }
}
