package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class teardownAllGlobalParametersS {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int ParcelableVolumeInfo;
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final startFirstSessionI MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final startFirstSessionI serializer;
    public final List write;

    public teardownAllGlobalParametersS(long j, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, List list, startFirstSessionI startfirstsessioni, startFirstSessionI startfirstsessioni2) {
        str2.getClass();
        str4.getClass();
        this.RemoteActionCompatParcelizer = j;
        this.read = str;
        this.PlaybackStateCompatCustomAction = str2;
        this.RatingCompat = str3;
        this.MediaDescriptionCompat = str4;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatMediaItem = str5;
        this.MediaSessionCompatQueueItem = z2;
        this.write = list;
        this.MediaMetadataCompat = startfirstsessioni;
        this.serializer = startfirstsessioni2;
    }

    public static teardownAllGlobalParametersS write(teardownAllGlobalParametersS teardownallglobalparameterss, boolean z, boolean z2, int i) {
        boolean z3;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatResultReceiverWrapper + 75;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i4;
        int i5 = i3 % 2;
        long j = teardownallglobalparameterss.RemoteActionCompatParcelizer;
        String str = teardownallglobalparameterss.read;
        String str2 = teardownallglobalparameterss.PlaybackStateCompatCustomAction;
        String str3 = teardownallglobalparameterss.RatingCompat;
        String str4 = teardownallglobalparameterss.MediaDescriptionCompat;
        if ((i & 32) != 0) {
            boolean z4 = teardownallglobalparameterss.IconCompatParcelizer;
            int i6 = i4 + 93;
            MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
            z3 = z4;
        } else {
            z3 = z;
        }
        String str5 = teardownallglobalparameterss.MediaBrowserCompatMediaItem;
        boolean z5 = (i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? teardownallglobalparameterss.MediaSessionCompatQueueItem : z2;
        List list = teardownallglobalparameterss.write;
        startFirstSessionI startfirstsessioni = teardownallglobalparameterss.MediaMetadataCompat;
        startFirstSessionI startfirstsessioni2 = teardownallglobalparameterss.serializer;
        teardownallglobalparameterss.getClass();
        str2.getClass();
        str4.getClass();
        return new teardownAllGlobalParametersS(j, str, str2, str3, str4, z3, str5, z5, list, startfirstsessioni, startfirstsessioni2);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 37;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.write, d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.read), 31, this.PlaybackStateCompatCustomAction), 31, this.RatingCompat), 31, this.MediaDescriptionCompat), 31, this.IconCompatParcelizer), 31, this.MediaBrowserCompatMediaItem), 31, this.MediaSessionCompatQueueItem), 31);
        int iHashCode = this.serializer.hashCode() + ((this.MediaMetadataCompat.hashCode() + iM) * 31);
        int i4 = MediaSessionCompatResultReceiverWrapper + 93;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 73;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("DeliveryViewEntity(id=", ", itemUniqueId=", this.RemoteActionCompatParcelizer, this.read);
        c8$$ExternalSyntheticOutline0.m(sb, ", title=", this.PlaybackStateCompatCustomAction, ", subtitle=", this.RatingCompat);
        sb.append(", orderCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isExpanded=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", itemsLabel=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", showItems=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", items=");
        sb.append(this.write);
        sb.append(", pickup=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", dropoff=");
        sb.append(this.serializer);
        sb.append(")");
        String string = sb.toString();
        int i4 = ParcelableVolumeInfo + 67;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 105;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 113;
            MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof teardownAllGlobalParametersS) {
            teardownAllGlobalParametersS teardownallglobalparameterss = (teardownAllGlobalParametersS) obj;
            if (this.RemoteActionCompatParcelizer == teardownallglobalparameterss.RemoteActionCompatParcelizer && this.read.equals(teardownallglobalparameterss.read)) {
                Object[] objArr = {this.PlaybackStateCompatCustomAction, teardownallglobalparameterss.PlaybackStateCompatCustomAction};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.RatingCompat.equals(teardownallglobalparameterss.RatingCompat)) {
                    Object[] objArr2 = {this.MediaDescriptionCompat, teardownallglobalparameterss.MediaDescriptionCompat};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == teardownallglobalparameterss.IconCompatParcelizer && this.MediaBrowserCompatMediaItem.equals(teardownallglobalparameterss.MediaBrowserCompatMediaItem) && this.MediaSessionCompatQueueItem == teardownallglobalparameterss.MediaSessionCompatQueueItem) {
                        if (!this.write.equals(teardownallglobalparameterss.write)) {
                            int i6 = MediaSessionCompatResultReceiverWrapper + 103;
                            ParcelableVolumeInfo = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i6 % 2 != 0) {
                                int i7 = 3 % 2;
                            }
                        } else if (this.MediaMetadataCompat.equals(teardownallglobalparameterss.MediaMetadataCompat) && this.serializer.equals(teardownallglobalparameterss.serializer)) {
                            return true;
                        }
                    }
                }
            }
        }
        int i8 = MediaSessionCompatResultReceiverWrapper + 43;
        ParcelableVolumeInfo = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            int i9 = 61 / 0;
        }
        return false;
    }
}
