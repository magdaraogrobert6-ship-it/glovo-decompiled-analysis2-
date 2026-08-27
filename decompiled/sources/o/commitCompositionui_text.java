package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class commitCompositionui_text implements getMBufferStateui_text {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final long IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaSessionCompatQueueItem;
    public final List RemoteActionCompatParcelizer;
    public final String read;
    public final long serializer;
    public final String write;

    @Override // o.getMBufferStateui_text
    public final long IconCompatParcelizer() {
        long j;
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 101;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            j = this.serializer;
            int i4 = 17 / 0;
        } else {
            j = this.serializer;
        }
        int i5 = i2 + 117;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = RatingCompat + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        String str = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 25;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    @Override // o.getMBufferStateui_text
    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 71;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        int i3 = 44 / 0;
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getMBufferStateui_text
    public final String read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 71;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 31;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 33;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List list = this.MediaBrowserCompatMediaItem;
        int i4 = i3 + 5;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public commitCompositionui_text(String str, long j, List list, long j2, String str2, String str3, String str4, List list2) {
        str.getClass();
        str3.getClass();
        this.read = str;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = list;
        this.serializer = j2;
        this.write = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaSessionCompatQueueItem = str4;
        this.MediaBrowserCompatMediaItem = list2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 17;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, d$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer), 31), 31, this.serializer), 31, this.write), 31, this.MediaDescriptionCompat);
        String str = this.MediaSessionCompatQueueItem;
        if (str == null) {
            int i4 = RatingCompat + 113;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.MediaBrowserCompatMediaItem.hashCode() + ((iM + iHashCode) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 13;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Customer(channelId=", this.read, this.IconCompatParcelizer, ", deliveryId=");
        sbM.append(", messages=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", lastUpdated=");
        sbM.append(this.serializer);
        sbM.append(", customerName=");
        sbM.append(this.write);
        c8$$ExternalSyntheticOutline0.m(sbM, ", orderCode=", this.MediaDescriptionCompat, ", vendorOrderNumber=", this.MediaSessionCompatQueueItem);
        sbM.append(", quickReplies=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 103;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof commitCompositionui_text)) {
                return false;
            }
            commitCompositionui_text commitcompositionui_text = (commitCompositionui_text) obj;
            Object[] objArr = {this.read, commitcompositionui_text.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != commitcompositionui_text.IconCompatParcelizer) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer.equals(commitcompositionui_text.RemoteActionCompatParcelizer)) {
                if (this.serializer != commitcompositionui_text.serializer || !this.write.equals(commitcompositionui_text.write)) {
                    return false;
                }
                Object[] objArr2 = {this.MediaDescriptionCompat, commitcompositionui_text.MediaDescriptionCompat};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr3 = {this.MediaSessionCompatQueueItem, commitcompositionui_text.MediaSessionCompatQueueItem};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue() || !this.MediaBrowserCompatMediaItem.equals(commitcompositionui_text.MediaBrowserCompatMediaItem)) {
                    return false;
                }
            } else {
                int i2 = MediaMetadataCompat + 107;
                RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = MediaMetadataCompat + 27;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
