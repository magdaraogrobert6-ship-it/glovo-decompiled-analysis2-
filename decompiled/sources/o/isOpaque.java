package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class isOpaque {
    private static int MediaSessionCompatToken = 1;
    private static int RatingCompat;
    public final setDrawFilter IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RemoteActionCompatParcelizer;
    public final String read;
    public final saveLayerAlpha serializer;
    public final String write;

    public isOpaque(String str, String str2, setDrawFilter setdrawfilter, saveLayerAlpha savelayeralpha, String str3, String str4, String str5, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
        this.MediaBrowserCompatMediaItem = str;
        this.MediaDescriptionCompat = str2;
        this.IconCompatParcelizer = setdrawfilter;
        this.serializer = savelayeralpha;
        this.write = str3;
        this.MediaSessionCompatQueueItem = str4;
        this.read = str5;
        this.RemoteActionCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.MediaMetadataCompat = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2;
    }

    public static isOpaque write(isOpaque isopaque, setDrawFilter setdrawfilter) {
        int i = 2 % 2;
        String str = isopaque.MediaBrowserCompatMediaItem;
        String str2 = isopaque.MediaDescriptionCompat;
        saveLayerAlpha savelayeralpha = isopaque.serializer;
        String str3 = isopaque.write;
        String str4 = isopaque.MediaSessionCompatQueueItem;
        String str5 = isopaque.read;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = isopaque.RemoteActionCompatParcelizer;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = isopaque.MediaMetadataCompat;
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
        isOpaque isopaque2 = new isOpaque(str, str2, setdrawfilter, savelayeralpha, str3, str4, str5, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2);
        int i2 = MediaSessionCompatToken + 83;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return isopaque2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 19;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem.hashCode() * 31, 31, this.MediaDescriptionCompat);
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + ((iHashCode + iM) * 31)) * 31, 31, this.write), 31, this.MediaSessionCompatQueueItem), 31, this.read);
        int iHashCode2 = this.MediaMetadataCompat.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + iM2) * 31);
        int i4 = RatingCompat + 111;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 69;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("LastStopSelectionBottomSheetState(title=", this.MediaBrowserCompatMediaItem, ", subtitle=", this.MediaDescriptionCompat, ", buttonState=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", locationState=");
        sbM.append(this.serializer);
        sbM.append(", setLastStopUrl=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.write, ", successMessage=", this.MediaSessionCompatQueueItem, ", failureMessage=");
        sbM.append(this.read);
        sbM.append(", recentLocations=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", trackingEvents=");
        sbM.append(this.MediaMetadataCompat);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RatingCompat + 109;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 33;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof isOpaque)) {
                return false;
            }
            isOpaque isopaque = (isOpaque) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, isopaque.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, isopaque.MediaDescriptionCompat}, getCieXyz.write())).booleanValue() || !this.IconCompatParcelizer.equals(isopaque.IconCompatParcelizer)) {
                return false;
            }
            if (!this.serializer.equals(isopaque.serializer)) {
                int i3 = MediaSessionCompatToken + 103;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, isopaque.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, isopaque.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, isopaque.read}, getCieXyz.write())).booleanValue()) {
                int i5 = RatingCompat + 41;
                MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return false;
                }
                int i6 = 3 % 4;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, isopaque.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, isopaque.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
