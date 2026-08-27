package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class addJsonObject {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final long IconCompatParcelizer;
    public final float MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final int RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;
    public final String write;

    public addJsonObject(float f, int i, long j, long j2, long j3, long j4, String str) {
        str.getClass();
        this.MediaDescriptionCompat = f;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = j;
        this.read = j2;
        this.MediaMetadataCompat = j3;
        this.IconCompatParcelizer = j4;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 39;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, Float.hashCode(this.MediaDescriptionCompat) * 31, 31), 31, this.serializer), 31, this.read), 31, this.MediaMetadataCompat), 31, this.IconCompatParcelizer);
        int i4 = MediaSessionCompatQueueItem + 39;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String strM730toStringimpl = androidx.compose.ui.graphics.Color.m730toStringimpl(this.serializer);
        String strM730toStringimpl2 = androidx.compose.ui.graphics.Color.m730toStringimpl(this.read);
        String strM730toStringimpl3 = androidx.compose.ui.graphics.Color.m730toStringimpl(this.MediaMetadataCompat);
        String strM730toStringimpl4 = androidx.compose.ui.graphics.Color.m730toStringimpl(this.IconCompatParcelizer);
        StringBuilder sb = new StringBuilder("Progress(percentage=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", goalCount=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", color=");
        c8$$ExternalSyntheticOutline0.m(sb, strM730toStringimpl, ", backgroundColor=", strM730toStringimpl2, ", indicatorBackgroundColor=");
        c8$$ExternalSyntheticOutline0.m(sb, strM730toStringimpl3, ", iconColor=", strM730toStringimpl4, ", iconUrl=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.write, ")");
        int i2 = MediaSessionCompatQueueItem + 39;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof addJsonObject) {
                addJsonObject addjsonobject = (addJsonObject) obj;
                if (Float.compare(this.MediaDescriptionCompat, addjsonobject.MediaDescriptionCompat) != 0) {
                    return false;
                }
                if (this.RemoteActionCompatParcelizer == addjsonobject.RemoteActionCompatParcelizer) {
                    if (!androidx.compose.ui.graphics.Color.m723equalsimpl0(this.serializer, addjsonobject.serializer)) {
                        int i2 = MediaSessionCompatQueueItem + 57;
                        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    if (!androidx.compose.ui.graphics.Color.m723equalsimpl0(this.read, addjsonobject.read)) {
                        int i4 = RatingCompat + 11;
                        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        return false;
                    }
                    if (androidx.compose.ui.graphics.Color.m723equalsimpl0(this.MediaMetadataCompat, addjsonobject.MediaMetadataCompat) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.IconCompatParcelizer, addjsonobject.IconCompatParcelizer)) {
                        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, addjsonobject.write}, getCieXyz.write())).booleanValue())) {
                            return true;
                        }
                    }
                    return false;
                }
                int i6 = MediaSessionCompatQueueItem + 27;
                RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i6 % 2 == 0;
            }
            int i7 = RatingCompat + 113;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = RatingCompat + 119;
        MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
