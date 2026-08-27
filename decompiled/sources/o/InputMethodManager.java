package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class InputMethodManager {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final getImm IconCompatParcelizer;
    public final boolean MediaDescriptionCompat;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final getImm serializer;
    public final String write;

    public InputMethodManager(String str, String str2, boolean z, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str3, String str4, getImm getimm, getImm getimm2) {
        str.getClass();
        str2.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.RatingCompat = str2;
        this.MediaDescriptionCompat = z;
        this.MediaSessionCompatQueueItem = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.write = str3;
        this.read = str4;
        this.IconCompatParcelizer = getimm;
        this.serializer = getimm2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 3;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Image(id=", this.RemoteActionCompatParcelizer, ", url=", this.RatingCompat, ", reportEnabled=");
        sbM.append(this.MediaDescriptionCompat);
        sbM.append(", tags=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", ownerName=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.write, ", datePosted=", this.read, ", likes=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", dislikes=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 83;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 115;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.RatingCompat), 31, this.MediaDescriptionCompat);
        int iHashCode2 = this.MediaSessionCompatQueueItem.hashCode();
        String str = this.write;
        if (str == null) {
            int i4 = MediaBrowserCompatMediaItem + 105;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.read;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        getImm getimm = this.IconCompatParcelizer;
        int iHashCode4 = getimm == null ? 0 : getimm.hashCode();
        getImm getimm2 = this.serializer;
        return ((((((((iHashCode2 + iM) * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (getimm2 != null ? getimm2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, inputMethodManager.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, inputMethodManager.RatingCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.MediaDescriptionCompat != inputMethodManager.MediaDescriptionCompat) {
                int i2 = MediaBrowserCompatMediaItem + 31;
                MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, inputMethodManager.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                int i3 = MediaMetadataCompat + 61;
                MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i3 % 2 == 0;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, inputMethodManager.write}, getCieXyz.write())).booleanValue()) {
                int i4 = MediaBrowserCompatMediaItem + 35;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, inputMethodManager.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, inputMethodManager.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i6 = MediaMetadataCompat + 63;
                MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, inputMethodManager.serializer}, getCieXyz.write())).booleanValue();
        }
        int i8 = MediaBrowserCompatMediaItem + 33;
        MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 != 0;
    }
}
